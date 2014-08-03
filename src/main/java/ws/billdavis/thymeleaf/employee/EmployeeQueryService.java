package ws.billdavis.thymeleaf.employee;

import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class EmployeeQueryService {

    private List<EmployeeQTO> employees = createEmployeeQueryTOs();

    public List<EmployeeListQTO> getEmployeeList() {
        final List<EmployeeListQTO> employeeList = new ArrayList<>( employees.size() );
        for( EmployeeQTO employee : employees ) {
            employeeList.add( new EmployeeListQTO( employee.getId(), employee.getName() ) );
        }
        return employeeList;
    }

    public Optional<EmployeeQTO> getEmployee( UUID employeeId ) {
        return employees.stream().filter( employee -> employee.getId().equals( employeeId ) ).findFirst();
    }

    private List<EmployeeQTO> createEmployeeQueryTOs() {
        final EmployeeQTO president = new EmployeeQTO( UUID.randomUUID(), "Bradshaw, Xena Y.", "Semper Company", null,
                new BigDecimal( "1449.46" ), new DateTime( 2003, 9, 12, 0, 0 ) );
        final EmployeeQTO vicePresident = new EmployeeQTO( UUID.randomUUID(), "Goodwin, Martena W.", "Ipsum Non Incorporated", president,
            new BigDecimal( "1851.04" ), new DateTime( 2004, 3, 30, 0, 0 ) );
        final EmployeeQTO manager = new EmployeeQTO( UUID.randomUUID(), "Mcbride, Paula E.", "Enim Mauris LLC", vicePresident,
            new BigDecimal( "599.57" ), new DateTime( 2003, 9, 17, 0, 0 ) );

        return Arrays.asList( new EmployeeQTO[]{
            president,
            vicePresident,
            manager,
            new EmployeeQTO( UUID.randomUUID(), "Dalton, Silas U.",
                "Quisque Fringilla Incorporated", manager, new BigDecimal( "2402.09" ), new DateTime( 2008, 7, 17, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Anderson, Britanney Y.", "Enim Condimentum PC",
                manager, new BigDecimal( "2082.40" ), new DateTime( 2010, 9, 3, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Tanner, Lawrence S.", "Enim Sit Corporation", null,
                new BigDecimal( "910.60" ), new DateTime( 1995, 9, 7, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Herman, Jade J.", "Egestas Aliquam PC", null,
                new BigDecimal( "1514.96" ), new DateTime( 1993, 11, 14, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Simmons, Ivory L.", "Vulputate Nisi Corporation",
                manager, new BigDecimal( "899.03" ), new DateTime( 1996, 3, 20, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Mccormick, Yardley V.",
                "Ultrices Duis Volutpat Foundation", manager, new BigDecimal( "536.60" ), new DateTime( 2011, 9, 2, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Pena, Ferdinand R.", "Morbi Inc.", null,
                new BigDecimal( "812.85" ), new DateTime( 2009, 4, 29, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Sexton, Chadwick Z.", "Volutpat Nulla Foundation",
                manager, new BigDecimal( "1600.43" ), new DateTime( 2013, 7, 12, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Schroeder, Brody C.", "Eu PC", null,
                new BigDecimal( "625.13" ), new DateTime( 2013, 7, 19, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Wright, Karleigh H.", "Venenatis A Company", null,
                new BigDecimal( "1786.72" ), new DateTime( 2006, 8, 8, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Charles, Ignatius Y.", "In Tincidunt LLC", null,
                new BigDecimal( "1780.06" ), new DateTime( 2002, 5, 16, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Richard, Kennan L.", "Mauris Ltd", null,
                new BigDecimal( "1708.04" ), new DateTime( 1994, 8, 9, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Dotson, Lester D.", "Vivamus Molestie LLC", null,
                new BigDecimal( "2360.67" ), new DateTime( 2008, 8, 16, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Avila, Marvin L.", "Ipsum Non LLP", null,
                new BigDecimal( "2220.69" ), new DateTime( 2005, 2, 27, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Olson, Jacqueline U.", "Nonummy Corporation", null,
                new BigDecimal( "646.69" ), new DateTime( 2015, 5, 29, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Sargent, Ariel Q.",
                "Commodo Tincidunt Nibh Foundation", manager, new BigDecimal( "2023.57" ), new DateTime( 2007, 10, 5, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Oneal, Emmanuel I.", "Non Enim Corporation", null,
                new BigDecimal( "2337.77" ), new DateTime( 2013, 8, 13, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Whitney, Burke F.", "Donec LLC", null,
                new BigDecimal( "1727.98" ), new DateTime( 1998, 7, 6, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Fuentes, Graiden J.", "Ultrices Mauris Corp.",
                manager, new BigDecimal( "1009.92" ), new DateTime( 2013, 6, 6, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Atkins, Lamar L.", "Mauris Non Dui LLC", null,
                new BigDecimal( "714.36" ), new DateTime( 2010, 8, 3, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Lindsay, Cailin F.", "Quis Turpis Incorporated",
                manager, new BigDecimal( "1769.20" ), new DateTime( 2006, 5, 19, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Leblanc, Magee I.", "Enim Mauris Quis Institute",
                manager, new BigDecimal( "1933.93" ), new DateTime( 2007, 9, 11, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "White, Jelani C.", "Ipsum Dolor Sit Corp.", null,
                new BigDecimal( "1999.53" ), new DateTime( 2001, 4, 30, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Hale, Paloma L.", "Mauris Molestie Pharetra PC",
                manager, new BigDecimal( "702.44" ), new DateTime( 2004, 10, 9, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Battle, Penelope I.", "Lectus Sit PC", null,
                new BigDecimal( "932.77" ), new DateTime( 2015, 5, 9, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Wilder, Stephen U.", "Id Company", null,
                new BigDecimal( "2457.31" ), new DateTime( 2010, 7, 24, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Goodwin, Kevin A.", "Imperdiet Incorporated", null,
                new BigDecimal( "870.54" ), new DateTime( 2014, 8, 30, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Yang, Warren B.",
                "Dolor Fusce Feugiat Incorporated", manager, new BigDecimal( "1086.01" ), new DateTime( 1994, 10, 21, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Munoz, Hyatt E.", "Facilisis Facilisis Magna PC",
                manager, new BigDecimal( "561.42" ), new DateTime( 1997, 5, 7, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Justice, Chandler I.", "Eros Nec Ltd", null,
                new BigDecimal( "1966.14" ), new DateTime( 2014, 7, 23, 0, 0 ) ),
            new EmployeeQTO( UUID.randomUUID(), "Barton, Abdul Q.", "Facilisis Magna Tellus Ltd",
                manager, new BigDecimal( "2130.83" ), new DateTime( 2006, 5, 4, 0, 0 ) )
        } );
    }
}
