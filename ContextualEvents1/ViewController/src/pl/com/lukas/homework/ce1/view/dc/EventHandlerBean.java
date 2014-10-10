package pl.com.lukas.homework.ce1.view.dc;

import javax.el.ELContext;

import javax.el.ExpressionFactory;

import javax.el.ValueExpression;

import javax.faces.context.FacesContext;

import pl.com.lukas.homework.ce1.view.beans.DetailsTFBean;
import pl.com.lukas.homework.ce1.view.util.GenericEventHandler;

public class EventHandlerBean {
    public EventHandlerBean() {
        super();
    }
    
    public void handleEvent(Object payload) {
        System.out.println("handling event.. Payload: " + payload);
        DetailsTFBean detailsTFBean =  (DetailsTFBean) evaluateEL("#{pageFlowScope.detailsTFBean}");
        
        detailsTFBean.processEvent(payload);
    }
    
    public void genericHandleEvent(String eventName, Object payload, GenericEventHandler eventHandler) {
        eventHandler.handleEvent(eventName, payload);
    }
            
    private Object evaluateEL(String expression) {
        FacesContext fc = FacesContext.getCurrentInstance();
        ELContext elContext = fc.getELContext();
        ExpressionFactory eFactory = fc.getApplication().getExpressionFactory();
        
        ValueExpression ve = eFactory.createValueExpression(elContext, expression, Object.class);
        
        return ve.getValue(elContext);
    }
    
}
