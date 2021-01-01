package net.kiranatos.k6.e002;

//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import org.hamcrest.CoreMatchers;
//import static org.hamcrest.MatcherAssert.assertThat;
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
////import static org.hamcrest.CoreMatchers.*;
////import static org.junit.Assert.assertThat;
////import org.junit.runner.JUnitCore;
////import org.junit.runner.Result;
////import org.junit.Test;
//
//public class K6T_MorseCodeDecoder {
//    @Test
//    public void testExampleFromDescription() {
//      assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), CoreMatchers.is("HEY JUDE"));      
//    }
//    
//    public static void main(String[] args) {
//        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
//                .selectors(
//                        selectPackage("net.kiranatos.k6.e002"),
//                        selectClass(MorseCodeDecoder.class)
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
//        } catch (Exception ex) {
//            System.out.println("Error!");
//            Logger.getLogger(K6T_MorseCodeDecoder.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        /* JUnit 4 2017
//        JUnitCore runner = new JUnitCore();
//        Result result = runner.run(Kata60005_MorseCodeDecoderTest.class);
//        System.out.println("run tests: " + result.getRunCount());
//        System.out.println("failed tests: " + result.getFailureCount());
//        System.out.println("ignored tests: " + result.getIgnoreCount());
//        System.out.println("success: " + result.wasSuccessful());
//        System.out.println(result.getFailures()); */    
//    }
//}
//    
//    
//
