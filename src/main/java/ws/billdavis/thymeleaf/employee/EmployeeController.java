package ws.billdavis.thymeleaf.employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

    @RequestMapping(value = "/employeeList", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		return "employeeList";
	}
}
