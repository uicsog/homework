package nl.amis.taskflowrefresh.view;

import javax.el.ELContext;

import javax.faces.context.FacesContext;


public class DetailsBean {
    
    private String name;
    private String address;
    private String telephone;
                    
    public void process() {
        System.out.println("busy processing");
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }
}
