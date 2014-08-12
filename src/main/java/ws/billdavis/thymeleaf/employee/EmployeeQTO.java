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
    private EmployeeRating employeeRating;

    public EmployeeQTO() {
    }

    public EmployeeQTO( final UUID id, final String name, final String title, final EmployeeQTO manager,
        final BigDecimal salary, final DateTime hireDate, final EmployeeRating employeeRating ) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.managerOptional = Optional.ofNullable( manager );
        this.salary = salary;
        this.hireDate = hireDate;
        this.employeeRating = employeeRating;
    }

    public Optional<EmployeeQTO> getManagerOptional() { return managerOptional; }
    public void setManagerOptional( final EmployeeQTO managerOptional ) { this.managerOptional = Optional.ofNullable( managerOptional ); }
    public boolean getHasManager() { return managerOptional.isPresent(); }

    // defeats the purpose of having the Optional above, but used to illustrate the Elvis operator...
    public EmployeeQTO getManager() { return managerOptional.isPresent() ? managerOptional.get() : null; }

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
