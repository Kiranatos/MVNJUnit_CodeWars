package net.kiranatos.k6.e004;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Random;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Test;
//import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;
//import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;
//import org.junit.platform.launcher.Launcher;
//import org.junit.platform.launcher.LauncherDiscoveryRequest;
//import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
//import org.junit.platform.launcher.core.LauncherFactory;
//import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
//import org.junit.platform.launcher.listeners.TestExecutionSummary;
//
//
//public class K6T_SortableShapes {
//    @Test
//    public void ShapesAreSortableOnArea()
//    {
//        // Arrange
//        double area, side, radius, base, height, width;
//        ArrayList<Shape> expected = new ArrayList<Shape>();
//
//        area = 1.1234;
//        expected.add(new CustomShape(area));
//
//        side = 1.1234;
//        expected.add(new Square(side));
//
//        radius = 1.1234;
//        expected.add(new Circle(radius));
//
//        height = 2.;
//        base = 5.;
//        expected.add(new Triangle(base, height));
//
//        height = 3.;
//        base = 4.;
//        expected.add(new Triangle(base, height));
//
//        width = 4.;
//        expected.add(new Rectangle(width, height));
//
//        area = 16.1;
//        expected.add(new CustomShape(area));
//
//        Random random = new Random();
//        ArrayList<Shape> actual = createRandomOrderedList(random, expected);
//
//        // Act
//        Collections.sort(actual);
//
//        // Assert
//        Iterator a = actual.iterator();
//        for (Shape e : expected) {
//            assertEquals(e, a.next());
//        }
//    }
//
//    private ArrayList<Shape> createRandomOrderedList(Random random, ArrayList<Shape> expected){
//        ArrayList<Shape> actual = new ArrayList<Shape>();
//        for (Shape shape : expected) {
//            int j = random.nextInt(actual.size()+1);
//            actual.add(j, shape);
//        }
//        return actual;
//    }
//    
//    public static void main(String[] args) {
//        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
//                .selectors(
//                        selectPackage("net.kiranatos.k6.e004"),
//                        selectClass(SortableShapes.class) 
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
//        List<TestExecutionSummary.Failure> failures = summary.getFailures();        
//        failures.forEach(failure -> System.out.println("Failure - " + failure.getException()));        
//    }
//}