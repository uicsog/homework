package nl.amis.parent;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class ParentClass {
    
    private String value;
    private String otherValue;    
    
    public void buttonPressedEvent(ActionEvent ae) {
        // find operation binding and execute in order to publish contextual event
        BindingContainer bindingContainer = BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding method = bindingContainer.getOperationBinding("publishEvent");
        method.getParamsMap().put("payload", otherValue);
        method.execute();
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setOtherValue(String otherValue) {
        this.otherValue = otherValue;
    }

    public String getOtherValue() {
        return otherValue;
    }
}
