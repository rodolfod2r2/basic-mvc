package org.framework.rodolfo.freire.git.basic.model;

public class Person extends AbstractModel {

    private Long id;
    private String idNational;
    private String name;
    private String gender;
    private Address addresses;
    private Phone phones;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddresses() {
        return addresses;
    }

    public void setAddresses(Address addresses) {
        this.addresses = addresses;
    }

    public Phone getPhones() {
        return phones;
    }

    public void setPhones(Phone phones) {
        this.phones = phones;
    }
}
