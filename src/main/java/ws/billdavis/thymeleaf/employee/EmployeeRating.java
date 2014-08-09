package ws.billdavis.thymeleaf.employee;

public enum EmployeeRating {
    Poor( "Poor" ),
    Average( "Average" ),
    Good( "Good "),
    Great( "Great" ),
    BillDavisLevel( "Bill Davis Level" );

    private final String description;

    EmployeeRating( final String description ) {
        this.description = description;
    }

    public String getDescription() { return description; }
}
