package com.hello;

import org.junit.Test;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

import static org.junit.Assert.assertEquals;

public class TestJunit3 extends TestResult {
    // add the error
    public synchronized void addError(Test test, Throwable t) {
        super.addError((junit.framework.Test) test, t);
    }

    // add the failure
    public synchronized void addFailure(Test test, AssertionFailedError t) {
        super.addFailure((junit.framework.Test) test, t);
    }

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testAdd() {
        assertEquals(message, messageUtil.printMessage());
    }

    // Marks that the test run should stop.
    public synchronized void stop() {
        //stop the test here
    }
}
