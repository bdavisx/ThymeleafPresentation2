package ws.billdavis.thymeleaf.employee;

import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

public class EmployeeQTO {
    private UUID id;
    private String name;
    private String title;
    private Optional<EmployeeQTO> managerOptional;
    private BigDecimal salary;
    private DateTime hireDate;
    private EmployeeRating employeeRating = EmployeeRating.Average;

    public EmployeeQTO() {
    }

    public EmployeeQTO( final UUID id, final String name, final String title, final EmployeeQTO manager,
        final BigDecimal salary,
        final DateTime hireDate ) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.managerOptional = Optional.ofNullable( manager );
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public Optional<EmployeeQTO> getManagerOptional() { return managerOptional; }
    public void setManagerOptional( final EmployeeQTO managerOptional ) { this.managerOptional = Optional.ofNullable( managerOptional ); }
    public boolean getHasManager() { return managerOptional.isPresent(); }

    public EmployeeRating getEmployeeRating() { return employeeRating; }
    public void setEmployeeRating( final EmployeeRating employeeRating ) { this.employeeRating = employeeRating; }
    public UUID getId() { return id; }
    public void setId( final UUID id ) { this.id = id; }
    public String getName() { return name; }
    public void setName( final String name ) { this.name = name; }
    public String getTitle() { return title; }
    public void setTitle( final String title ) { this.title = title; }
    public BigDecimal getSalary() { return salary; }
    public void setSalary( final BigDecimal salary ) { this.salary = salary; }
    public DateTime getHireDate() { return hireDate; }
    public void setHireDate( final DateTime hireDate ) { this.hireDate = hireDate; }
}
