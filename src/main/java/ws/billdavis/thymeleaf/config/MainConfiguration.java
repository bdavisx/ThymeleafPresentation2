package ws.billdavis.thymeleaf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import ws.billdavis.thymeleaf.employee.EmployeeQueryService;

@Configuration
@Profile("default")
public class MainConfiguration {

    @Bean
    public EmployeeQueryService employeeQueryService() {
        return new EmployeeQueryService();
    }

}












