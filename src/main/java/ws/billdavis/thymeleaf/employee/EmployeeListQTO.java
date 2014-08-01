package ws.billdavis.thymeleaf.employee;

import java.util.UUID;

public class EmployeeListQTO {
    private final UUID id;
    private final String name;

    public EmployeeListQTO( final UUID id, final String name ) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() { return id; }
    public String getName() { return name; }
}
