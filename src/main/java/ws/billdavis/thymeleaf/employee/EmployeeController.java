package ws.billdavis.thymeleaf.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeQueryService employeeQueryService;

    @RequestMapping(value = "/employeeList", method = RequestMethod.GET)
	public String get( Model model ) {
        final List<EmployeeListQTO> employeeList = employeeQueryService.getEmployeeList();
        model.addAttribute( "employees", employeeList );
        return "employeeList";
	}
}
