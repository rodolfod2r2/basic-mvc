package org.framework.rodolfo.freire.git.basic.model;

import java.util.List;

public class Business extends AbstractModel {

    private Long id;
    private String idNational;
    private String name;
    private List<Address> addresses;
    private List<Phone> phones;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdNational() {
        return idNational;
    }

    public void setIdNational(String idNational) {
        this.idNational = idNational;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
}
