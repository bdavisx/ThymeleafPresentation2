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
        final EmployeeQTO president =
            new EmployeeQTO( UUID.fromString( "8DC0474B-16FE-4319-FE8B-985FF81DF614" ), "Bradshaw, Xena Y.", "Semper Company", null,
                new BigDecimal( "1449.46" ), new DateTime( 2003, 9, 12, 0, 0 ) );
        final EmployeeQTO vicePresident =
            new EmployeeQTO( UUID.fromString( "BFEA3447-8338-2507-EF74-886390614F69" ), "Goodwin, Martena W.", "Ipsum Non Incorporated",
                president, new BigDecimal( "1851.04" ), new DateTime( 2004, 3, 30, 0, 0 ) );
        final EmployeeQTO manager =
            new EmployeeQTO( UUID.fromString( "3D210FD1-6167-0CE3-07F3-48584B1FD31D" ), "Mcbride, Paula E.", "Enim Mauris LLC",
                vicePresident, new BigDecimal( "599.57" ), new DateTime( 2003, 9, 17, 0, 0 ) );

        return Arrays.asList( new EmployeeQTO[]{
            president,
            vicePresident,
            manager,
            new EmployeeQTO( UUID.fromString( "C94C25F5-A2D9-9DEF-E70B-E2311FEAC4C9" ), "Dalton, Silas U.",
                "Quisque Fringilla Incorporated", manager, new BigDecimal( "2402.09" ), new DateTime( 2008, 7, 17, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "F2D12865-B017-1520-B308-27351681D6CF" ), "Anderson, Britanney Y.", "Enim Condimentum PC",
                manager, new BigDecimal( "2082.40" ), new DateTime( 2010, 9, 3, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "C5391F18-A696-D59C-CE0E-BAC458D745DF" ), "Tanner, Lawrence S.", "Enim Sit Corporation", null,
                new BigDecimal( "910.60" ), new DateTime( 1995, 9, 7, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "9B1A8CE8-BE0B-C4DE-95CD-CA094601D49C" ), "Herman, Jade J.", "Egestas Aliquam PC", null,
                new BigDecimal( "1514.96" ), new DateTime( 1993, 11, 14, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "04406306-AE76-1714-01DD-879058EDB72D" ), "Simmons, Ivory L.", "Vulputate Nisi Corporation",
                manager, new BigDecimal( "899.03" ), new DateTime( 1996, 3, 20, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "16FBC936-A8D9-A4C9-69B4-6ED5DE1D5524" ), "Mccormick, Yardley V.",
                "Ultrices Duis Volutpat Foundation", manager, new BigDecimal( "536.60" ), new DateTime( 2011, 9, 2, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "62F5C3E3-C6C1-1E39-C406-314A28195814" ), "Pena, Ferdinand R.", "Morbi Inc.", null,
                new BigDecimal( "812.85" ), new DateTime( 2009, 4, 29, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "D702F9B2-6458-8480-AE0D-C54645501926" ), "Sexton, Chadwick Z.", "Volutpat Nulla Foundation",
                manager, new BigDecimal( "1600.43" ), new DateTime( 2013, 7, 12, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "8393FE29-9E39-529B-8466-2A8A2B7962F4" ), "Schroeder, Brody C.", "Eu PC", null,
                new BigDecimal( "625.13" ), new DateTime( 2013, 7, 19, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "3A00EF04-7B7E-75ED-3A50-7272A0263686" ), "Wright, Karleigh H.", "Venenatis A Company", null,
                new BigDecimal( "1786.72" ), new DateTime( 2006, 8, 8, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "9E5BEE0D-3EB1-3CF4-2930-2DE92441010A" ), "Charles, Ignatius Y.", "In Tincidunt LLC", null,
                new BigDecimal( "1780.06" ), new DateTime( 2002, 5, 16, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "A3ADF71C-0B8E-A799-100F-25DF157F8375" ), "Richard, Kennan L.", "Mauris Ltd", null,
                new BigDecimal( "1708.04" ), new DateTime( 1994, 8, 9, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "BB0FF8A5-D30A-A974-3171-E8FFF614D3E1" ), "Dotson, Lester D.", "Vivamus Molestie LLC", null,
                new BigDecimal( "2360.67" ), new DateTime( 2008, 8, 16, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "3CE4CC18-31B1-82D3-D0CC-A525D0D69809" ), "Avila, Marvin L.", "Ipsum Non LLP", null,
                new BigDecimal( "2220.69" ), new DateTime( 2005, 2, 27, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "380647CE-1E77-FF2D-47A4-ED331E8FF44A" ), "Olson, Jacqueline U.", "Nonummy Corporation", null,
                new BigDecimal( "646.69" ), new DateTime( 2015, 5, 29, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "ABA531ED-E0AA-B440-A854-A51DF57CBDD7" ), "Sargent, Ariel Q.",
                "Commodo Tincidunt Nibh Foundation", manager, new BigDecimal( "2023.57" ), new DateTime( 2007, 10, 5, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "D875A1E4-613A-D960-9BD6-8F6E17C32FE7" ), "Oneal, Emmanuel I.", "Non Enim Corporation", null,
                new BigDecimal( "2337.77" ), new DateTime( 2013, 8, 13, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "8B961124-A1BB-8965-65B7-C2EB2F781E04" ), "Whitney, Burke F.", "Donec LLC", null,
                new BigDecimal( "1727.98" ), new DateTime( 1998, 7, 6, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "50EB7574-CCFE-D06D-BBC3-9FBF32A1118B" ), "Fuentes, Graiden J.", "Ultrices Mauris Corp.",
                manager, new BigDecimal( "1009.92" ), new DateTime( 2013, 6, 6, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "14AD1504-3797-C78C-4039-45EBF588D6B6" ), "Atkins, Lamar L.", "Mauris Non Dui LLC", null,
                new BigDecimal( "714.36" ), new DateTime( 2010, 8, 3, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "4E5E980A-82D3-0615-71DD-5E0E5BDFF87B" ), "Lindsay, Cailin F.", "Quis Turpis Incorporated",
                manager, new BigDecimal( "1769.20" ), new DateTime( 2006, 5, 19, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "1505EE03-83D2-47F5-4D82-45E588F1437A" ), "Leblanc, Magee I.", "Enim Mauris Quis Institute",
                manager, new BigDecimal( "1933.93" ), new DateTime( 2007, 9, 11, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "54B775FD-F73A-73C4-7090-40FF68B02ED7" ), "White, Jelani C.", "Ipsum Dolor Sit Corp.", null,
                new BigDecimal( "1999.53" ), new DateTime( 2001, 4, 30, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "CBDC146A-2BE6-DE95-768A-64993D970423" ), "Hale, Paloma L.", "Mauris Molestie Pharetra PC",
                manager, new BigDecimal( "702.44" ), new DateTime( 2004, 10, 9, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "A78757EB-6AF7-5676-4B19-4A86B77BEEFA" ), "Battle, Penelope I.", "Lectus Sit PC", null,
                new BigDecimal( "932.77" ), new DateTime( 2015, 5, 9, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "819882FB-4668-0401-8D81-81849EE15ED9" ), "Wilder, Stephen U.", "Id Company", null,
                new BigDecimal( "2457.31" ), new DateTime( 2010, 7, 24, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "48EFAED5-CC84-0DA6-BD75-14725BC2B25A" ), "Goodwin, Kevin A.", "Imperdiet Incorporated", null,
                new BigDecimal( "870.54" ), new DateTime( 2014, 8, 30, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "01745910-E2B9-FD2F-FEB9-0AF3497B2F08" ), "Yang, Warren B.",
                "Dolor Fusce Feugiat Incorporated", manager, new BigDecimal( "1086.01" ), new DateTime( 1994, 10, 21, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "35CE2458-BB7A-588D-57FC-D90CB87EB8A3" ), "Munoz, Hyatt E.", "Facilisis Facilisis Magna PC",
                manager, new BigDecimal( "561.42" ), new DateTime( 1997, 5, 7, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "AB3AEE5F-DC31-6DE1-8EE5-31A4140376EA" ), "Justice, Chandler I.", "Eros Nec Ltd", null,
                new BigDecimal( "1966.14" ), new DateTime( 2014, 7, 23, 0, 0 ) ),
            new EmployeeQTO( UUID.fromString( "08A268F7-9634-1C08-BB58-097F9C186A87" ), "Barton, Abdul Q.", "Facilisis Magna Tellus Ltd",
                manager, new BigDecimal( "2130.83" ), new DateTime( 2006, 5, 4, 0, 0 ) )
        } );
    }
}
