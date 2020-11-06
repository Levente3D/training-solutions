package classstructureconstructors;

public class Book {
    private String author;
    private String title;
    private String regnumber;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getRegnumber() {
        return regnumber;
    }

    public void register(String regnumber){

    }
}
