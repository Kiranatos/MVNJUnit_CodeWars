package net.kiranatos.k8.e001;

import java.util.Locale;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PolygonTest {
    @Test
    public void test1(){
        //Square with sides of 5 units
        Polygon poly=new Polygon(4, 5);
        // добавил Locale.US, потому-что в Укр коми, а не крапки:
        assertEquals("5.000", String.format(Locale.US ,"%.3f", poly.circleDiameter()));        
    }
    
    @Test
    public void test2() {
        //Octogon with sides of 9 units
        Polygon poly=new Polygon(8, 9);        
        // добавил Locale.US, потому-что в Укр коми, а не крапки:
        assertEquals("21.728", String.format(Locale.US ,"%.3f", poly.circleDiameter())); 
    }
    
    @Test
    public void test3() {
        //Triangle with sides of 4 units
        Polygon poly=new Polygon(3, 4);
        assertEquals("2,309", String.format("%.3f", poly.circleDiameter()));
    }
    
//    public static void main(String[] args) {
//        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
//                .selectors(
//                        selectPackage("net.kiranatos.k8.e001"),
//                        selectClass(Polygon.class)
//                )
////                .filters(includeClassNamePatterns(".*Test"))
//                .build();
//        
//        Launcher launcher = LauncherFactory.create(); 
//        
//        // Register a listener of your choice
//        SummaryGeneratingListener listener = new SummaryGeneratingListener();
//        launcher.registerTestExecutionListeners(listener);
//        launcher.execute(request);
//        
//        TestExecutionSummary summary = listener.getSummary();
//        
//        // Do something with the TestExecutionSummary.        
//        System.out.println("The number of containers aborted: \t"           + summary.getContainersAbortedCount());
//        System.out.println("The number of containers that failed: \t"       + summary.getContainersFailedCount());
//        System.out.println("The number of containers found: \t"             + summary.getContainersFoundCount());
//        System.out.println("The number of containers skipped: \t"           + summary.getContainersSkippedCount());
//        System.out.println("The number of containers started: \t"           + summary.getContainersStartedCount());
//        System.out.println("The number of containers that succeeded: "      + summary.getContainersSucceededCount());
//        System.out.println("The number of tests aborted: \t\t"              + summary.getTestsAbortedCount());
//        System.out.println("The number of tests that failed: \t"            + summary.getTestsFailedCount());
//        System.out.println("The number of tests found: \t\t"                + summary.getTestsFoundCount());
//        System.out.println("The number of tests skipped: \t\t"              + summary.getTestsSkippedCount());
//        System.out.println("The number of tests started: \t\t"              + summary.getTestsStartedCount());
//        System.out.println("The number of tests that succeeded: \t"         + summary.getTestsSucceededCount());        
//        System.out.println("The total number of failed containers and failed tests: \t" + summary.getTotalFailureCount());
//        System.out.println("The timestamp when the test plan started: \t"   + summary.getTimeStarted() + " milliseconds ");
//        System.out.println("The timestamp when the test plan finished: \t"  + summary.getTimeFinished() + " milliseconds \n");
//        
//        // Get an immutable list of the failures of the test plan execution^        
//        List<Failure> failures = summary.getFailures();        
//        failures.forEach(failure -> System.out.println("Failure - " + failure.getException()));
//        
//        /* JUnit 4 (2017)
//        new _________________().testSomething();        
//        System.out.println(" === JUnitCore === ");
//        JUnitCore runner = new JUnitCore();
//        Result result = runner.run(Kata80001_PolygonTest.class);
//        System.out.println("run tests: " + result.getRunCount());
//        System.out.println("failed tests: " + result.getFailureCount());
//        System.out.println("ignored tests: " + result.getIgnoreCount());
//        System.out.println("success: " + result.wasSuccessful());
//        System.out.println(result.getFailures()); */
//    }
}
