package exam03retake02;

public class Todo {

    private String text;
    private State state;
    private int priority;


    public Todo(String text, int priority) {
        this.text = text;
        this.priority = priority;
    }

    public int getPriority() {
        return 0;
    }

    public void complete() {

    }

    public short getState() {
        return 0;
    }


    public String getText() {
        return null;
    }
}
