package net.kiranatos.k8.e002;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReversedWordsTest {
    
    @Test
    public void testSomething() {
        assertEquals(ReversedWords.reverseWords("I like eating"), "eating like I");
        assertEquals(ReversedWords.reverseWords("I like flying"), "flying like I");
        assertEquals(ReversedWords.reverseWords("The world is nice"), "nice is world The");
    }    
    
//    public static void main(String[] args) {
//        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
//                .selectors(
//                        selectPackage("net.kiranatos.k8.e002"),
//                        selectClass(ReversedWords.class)
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
//        try {
//            failures.forEach(failure -> System.out.println("Failure - " + failure.getException()));
//        } catch (java.lang.RuntimeException ex) { 
//            Logger.getLogger(K8T_ReversedWords.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        /* JUnit 4 2017
//        JUnitCore runner = new JUnitCore();
//        Result result = runner.run(Kata60002_ReverseWordsTest.class);
//        System.out.println("run tests: " + result.getRunCount());
//        System.out.println("failed tests: " + result.getFailureCount());
//        System.out.println("ignored tests: " + result.getIgnoreCount());
//        System.out.println("success: " + result.wasSuccessful());
//        System.out.println(result.getFailures()); */
//    }    
}
