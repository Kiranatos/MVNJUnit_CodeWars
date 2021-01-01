package net.kiranatos;

import java.util.List;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

public class KataTemplate {
   
    public static void main(String[] args) {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(
                        selectPackage("net.kiranatos.k___.e0___"),
                        selectClass(String.class)  // ПОДСТАВИТЬ КЛАСС УПРАЖНЕНИЯ
                )
//                .filters(includeClassNamePatterns(".*Test"))
                .build();
        
        Launcher launcher = LauncherFactory.create(); 
        
        // Register a listener of your choice
        SummaryGeneratingListener listener = new SummaryGeneratingListener();
        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);
        
        TestExecutionSummary summary = listener.getSummary();
        
        // Do something with the TestExecutionSummary.        
        System.out.println("The number of containers aborted: \t"           + summary.getContainersAbortedCount());
        System.out.println("The number of containers that failed: \t"       + summary.getContainersFailedCount());
        System.out.println("The number of containers found: \t"             + summary.getContainersFoundCount());
        System.out.println("The number of containers skipped: \t"           + summary.getContainersSkippedCount());
        System.out.println("The number of containers started: \t"           + summary.getContainersStartedCount());
        System.out.println("The number of containers that succeeded: "      + summary.getContainersSucceededCount());
        System.out.println("The number of tests aborted: \t\t"              + summary.getTestsAbortedCount());
        System.out.println("The number of tests that failed: \t"            + summary.getTestsFailedCount());
        System.out.println("The number of tests found: \t\t"                + summary.getTestsFoundCount());
        System.out.println("The number of tests skipped: \t\t"              + summary.getTestsSkippedCount());
        System.out.println("The number of tests started: \t\t"              + summary.getTestsStartedCount());
        System.out.println("The number of tests that succeeded: \t"         + summary.getTestsSucceededCount());        
        System.out.println("The total number of failed containers and failed tests: \t" + summary.getTotalFailureCount());
        System.out.println("The timestamp when the test plan started: \t"   + summary.getTimeStarted() + " milliseconds ");
        System.out.println("The timestamp when the test plan finished: \t"  + summary.getTimeFinished() + " milliseconds \n");
        
        // Get an immutable list of the failures of the test plan execution^        
        List<TestExecutionSummary.Failure> failures = summary.getFailures();        
        failures.forEach(failure -> System.out.println("Failure - " + failure.getException()));        
    } 
}





/*
====================================================== JUNIT 4 (стрий вариант, який використовував в 2017)
//import static org.junit.Assert.assertEquals;
//import org.junit.Test;
//import org.junit.runner.JUnitCore;
//import org.junit.runner.Result;

public static void main(String[] args) throws Exception {
        new _________________().testSomething();
        
        System.out.println(" === JUnitCore === ");
        JUnitCore runner = new JUnitCore();
        Result result = runner.run(______________.class);
        System.out.println("run tests: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("ignored tests: " + result.getIgnoreCount());
        System.out.println("success: " + result.wasSuccessful());
        System.out.println(result.getFailures());    
    }
*/

/*
import java.time.Duration;
public static int Past(int h, int m, int s) {
    return (int)Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
  }
*/