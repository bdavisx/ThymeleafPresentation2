package ws.billdavis.thymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome( Model model ) {
        model.addAttribute( "userName", "Fake User Name" );
        return "home";
    }

    @RequestMapping(value = "/expressionExamples", method = RequestMethod.GET)
    public String expressionExamples( Model model ) {

        model.addAttribute( "someText", "Expression Example" );


        ExpressionPO expressionPO = new ExpressionPO();

        expressionPO.setIntegerValue( 5 );
        expressionPO.setIntegerArray( new int[] {0, 1, 2, 3, 4, 5} );

        expressionPO.setShowSensitiveInformation( false );

        expressionPO.setValueThatExists( "Value is here" );

        model.addAttribute( "expressionPO", expressionPO );


        return "expressionExamples";
    }


}
