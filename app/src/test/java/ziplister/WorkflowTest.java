package ziplister;

import org.junit.Test;
import static org.junit.Assert.*;

public class WorkflowTest {
    @Test public void canProcessSingleItemList() {
        String[] todos = { "Go do task X" };

        Workflow classUnderTest = new Workflow(todos);

        assertFalse(classUnderTest.isFinished());
        assertEquals(classUnderTest.currentItem(), "Go do task X");

        classUnderTest.currentItemDone();

        assertTrue(classUnderTest.isFinished());
    }

    @Test public void givesCurrentProgressPercentage() {
        String[] todos = { 
            "Go do task X",
            "And then task Y"
        };

        Workflow classUnderTest = new Workflow(todos);
        assertEquals(0.0, classUnderTest.currentProgressPercentage(), 0.0);

        classUnderTest.currentItemDone();
        assertEquals(50.0, classUnderTest.currentProgressPercentage(), 0.0);

        classUnderTest.currentItemDone();
        assertEquals(100.0, classUnderTest.currentProgressPercentage(), 0.0);
    }
}
