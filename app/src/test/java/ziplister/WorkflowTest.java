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
}
