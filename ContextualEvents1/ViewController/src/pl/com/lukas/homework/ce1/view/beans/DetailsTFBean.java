package pl.com.lukas.homework.ce1.view.beans;

import pl.com.lukas.homework.ce1.view.util.GenericEventHandler;

public class DetailsTFBean implements GenericEventHandler {
    public DetailsTFBean() {
        super();
    }
    
    private String detail1;

    public void setDetail1(String detail1) {
        this.detail1 = detail1;
    }

    public String getDetail1() {
        return detail1;
    }
    
//    public void processEvent(Object payload) {
//        System.out.println("Processing event.. Payload: " + payload);
//        setDetail1(payload.toString());
//    }

    public void handleEvent(String eventName, Object payload) {
        System.out.println("Generic processing event " + eventName + ".. Payload: " + payload);
        setDetail1(payload.toString());
    }
}
