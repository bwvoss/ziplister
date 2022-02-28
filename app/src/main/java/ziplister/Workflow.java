package ziplister;

public class Workflow {
    private String[] todos;
    private Integer currentIndex = 0;

    public Workflow(String[] _todos) {
        todos = _todos;
    }

    public String currentItem() {
        return todos[currentIndex];
    }

    public void currentItemDone() {
        currentIndex++;
    }

    public boolean isFinished() {
        // A little confusing, but due to arrays being 0 indexed vs. when length is called
        return currentIndex == todos.length;
    }

    public double currentProgressPercentage() {
        return (double)currentIndex / (double)todos.length * 100;
    }
}
