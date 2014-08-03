package ws.billdavis.thymeleaf.employee;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Controller
public class EmployeeController {
    private final Logger log = Logger.getLogger( this.getClass() );

    @Autowired
    private EmployeeQueryService employeeQueryService;

    @RequestMapping(value = "/employeeList", method = RequestMethod.GET)
	public String list( Model model ) {
        prepareForEmployeeList( model );
        return "employees/list";
	}

    @RequestMapping(value = "/employeeListWithSelection", method = RequestMethod.GET)
	public String listWithSelection( Model model ) {
        prepareForEmployeeList( model );
        return "employees/listWithSelection";
	}

    private void prepareForEmployeeList( final Model model ) {
        final List<EmployeeListQTO> employeeList = employeeQueryService.getEmployeeList();
        model.addAttribute( "employees", employeeList );
    }

    @RequestMapping(value = "/employee/{employeeId}/details", method = RequestMethod.GET)
	public String details( @PathVariable String employeeId, Model model ) {
        log.debug( "Loading employee with id: " + employeeId );

        try {
            final Optional<EmployeeQTO> employeeOptional = employeeQueryService.getEmployee( UUID.fromString( employeeId ) );
            if( employeeOptional.isPresent() ) {
                model.addAttribute( "employee", employeeOptional.get() );
                return "employees/details";
            } else {
                return "employees/detailsUnableToFind";
            }
        } catch( IllegalArgumentException ex ) {
            log.info( "Unable to parse an employeeId: '" + employeeId + "'." );
            // TODO: make this goto error page...
            return "error";
        }

	}
}
