package ws.billdavis.thymeleaf.web;

import org.thymeleaf.Arguments;
import org.thymeleaf.Configuration;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.attr.AbstractAttributeModifierAttrProcessor;
import org.thymeleaf.standard.expression.IStandardExpression;
import org.thymeleaf.standard.expression.IStandardExpressionParser;
import org.thymeleaf.standard.expression.StandardExpressions;
import ws.billdavis.thymeleaf.employee.EmployeeRating;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRatingProcessor extends AbstractAttributeModifierAttrProcessor {

    public static final String AttributeName = "setBackgroundByEmployeeRating";

    public EmployeeRatingProcessor() {
        super( AttributeName );
    }

    @Override
    public int getPrecedence() {
        return 12000;
    }

    @Override
    protected ModificationType getModificationType( final Arguments arguments,
        final Element element, final String attributeName, final String newAttributeName ) {

        return ModificationType.APPEND_WITH_SPACE;
    }

    @Override
    protected boolean removeAttributeIfEmpty( final Arguments arguments, final Element element,
        final String attributeName, final String newAttributeName ) {

        return true;
    }

    @Override
    protected boolean recomputeProcessorsAfterExecution( final Arguments arguments, final Element element,
        final String attributeName ) {

        return false;
    }

    @Override
    protected Map<String, String> getModifiedAttributeValues( final Arguments arguments, final Element element,
        final String attributeName ) {

        final Configuration configuration = arguments.getConfiguration();
        final String attributeValue = element.getAttributeValue( attributeName );
        final IStandardExpressionParser parser = StandardExpressions.getExpressionParser( configuration );
        final IStandardExpression expression = parser.parseExpression( configuration, arguments, attributeValue );
        final EmployeeRating employeeRating = (EmployeeRating) expression.execute( configuration, arguments );

        final Map<String, String> values = new HashMap<String, String>();

        switch( employeeRating ) {
            case Poor:
                values.put( "class", "alert alert-danger" );
                break;
            case Average:
                values.put( "class", "alert alert-warning" );
                break;
            case Good:
                values.put( "class", "alert alert-info" );
                break;
            case Great:
                values.put( "class", "alert alert-primary" );
                break;
            case BillDavisLevel:
                values.put( "class", "alert alert-success" );
                break;
        }

        return values;
    }

}
