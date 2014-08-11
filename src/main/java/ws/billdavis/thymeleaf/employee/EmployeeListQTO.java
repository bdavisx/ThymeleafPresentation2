package ws.billdavis.thymeleaf.employee;

import java.util.UUID;

public class EmployeeListQTO {
    private final UUID id;
    private final String name;
    private final EmployeeRating employeeRating;

    public EmployeeListQTO( final UUID id, final String name, final EmployeeRating employeeRating ) {
        this.id = id;
        this.name = name;
        this.employeeRating = employeeRating;
    }

    public UUID getId() { return id; }
    public String getName() { return name; }
    public EmployeeRating getEmployeeRating() { return employeeRating; }
}
