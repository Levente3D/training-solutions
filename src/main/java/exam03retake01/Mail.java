package exam03retake01;

import classstructureintegrate.Products;
import java.util.List;
import java.util.Map;

public class Mail {

    private Contact from;
    private List<Contact> to;
    private String subject;
    private String message;


    public Contact getFrom() {
        return from;
    }

    public List<Contact> getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }
}
