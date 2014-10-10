package pl.com.lukas.homework.ce1.view.dc;

public class EventPublisherBean {
    public EventPublisherBean() {
        super();
    }
    
    public Object publishEvent(Object payload) {
        System.out.println("Publishing event.. Payload: " + payload);
        
        return payload;
    }
    
}
