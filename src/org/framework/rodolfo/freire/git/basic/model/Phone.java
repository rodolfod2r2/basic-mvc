package org.framework.rodolfo.freire.git.basic.model;

public class Phone {

    private String phoneType;
    private boolean PhonePreferred;
    private String phone;

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public boolean isPhonePreferred() {
        return PhonePreferred;
    }

    public void setPhonePreferred(boolean phonePreferred) {
        PhonePreferred = phonePreferred;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
