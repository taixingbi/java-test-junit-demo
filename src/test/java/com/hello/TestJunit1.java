package com.hello;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit1 extends TestCase {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        //test getName
        String name = this.getName();
        System.out.println("Test Case Name = "+ name);

        assertEquals(message, messageUtil.printMessage());
    }
}
