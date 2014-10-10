package pl.com.lukas.homework.ce1.view.beans;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class MasterBackingBean {
    public MasterBackingBean() {
        super();
    }


    public void onPublish(ActionEvent actionEvent) {
        System.out.println("onPublish..");
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding oper = bindings.getOperationBinding("publishEvent");
        oper.getParamsMap().put("payload", "PAYLOAD DATA");
        oper.execute();
    }
}
