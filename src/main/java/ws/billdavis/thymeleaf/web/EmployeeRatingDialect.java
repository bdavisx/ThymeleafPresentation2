package ws.billdavis.thymeleaf.web;

import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.processor.IProcessor;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRatingDialect extends AbstractDialect {
    @Override
    public String getPrefix() {
        return "rating";
    }

    @Override
    public Set<IProcessor> getProcessors() {
        final Set<IProcessor> processors = new HashSet<>();
        processors.add( new EmployeeRatingProcessor() );
        return processors;
    }
}
