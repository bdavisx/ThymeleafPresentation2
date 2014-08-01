package ws.billdavis.thymeleaf.employee;

import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.UUID;

public class EmployeeQTO {
    private UUID id;
    private String name;
    private String title;
    private EmployeeQTO manager;
    private BigDecimal salary;
    private DateTime hireDate;

    public EmployeeQTO() {
    }

    public EmployeeQTO( final UUID id, final String name, final String title, final EmployeeQTO manager,
        final BigDecimal salary,
        final DateTime hireDate ) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.manager = manager;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public UUID getId() { return id; }
    public void setId( final UUID id ) { this.id = id; }
    public String getName() { return name; }
    public void setName( final String name ) { this.name = name; }
    public String getTitle() { return title; }
    public void setTitle( final String title ) { this.title = title; }
    public EmployeeQTO getManager() { return manager; }
    public void setManager( final EmployeeQTO manager ) { this.manager = manager; }
    public BigDecimal getSalary() { return salary; }
    public void setSalary( final BigDecimal salary ) { this.salary = salary; }
    public DateTime getHireDate() { return hireDate; }
    public void setHireDate( final DateTime hireDate ) { this.hireDate = hireDate; }
}
