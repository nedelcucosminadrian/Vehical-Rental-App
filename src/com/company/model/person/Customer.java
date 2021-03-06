package com.company.model.person;


import com.company.model.person.Person;

public class Customer extends Person {

    protected String address;
    protected String phone;


    public String getAddress(){return address;}
    public String getPhone(){return phone;}

    public void setAddress(String adr){address = adr;}
    public void setPhone(String ph){phone = ph;}


    public Customer(int id, String name, int age, double h, String type, String password, String address, String phone){

        super(id,name,age,h, "Customer", password);
        this.address = address;
        this.phone = phone;
    }

    public Customer(){

        super();
        setType("Customer");
        this.address = "None";
        this.phone = "0000000000";
    }

    public Customer(String prp){

        String [] v = prp.split(",");

        setId(Integer.parseInt(v[0]));
        setName(v[1]);
        setAge(Integer.parseInt(v[2]));
        setHeight(Double.parseDouble(v[3]));
        setType("Customer");
        setPassword(v[5]);
        address = v[6];
        phone = v[7];
    }

    @Override
    public String toString(){

        return (getId() + "," + getName() + "," + getAge() + "," + getHeight() + "," + getType() + "," + getPassword() + "," + address + "," + phone);
    }

    @Override
    public String describe(){

        String text = "";
        text += "\nID : " + getId();
        text += "\nName : " + getName();
        text += "\nAge : " + getAge();
        text += "\nHeight : " + getHeight();
        text += "\nAddress : " + address;
        text += "\nPhone : " + phone;
        text += "\nType : Customer";

        return text;
    }
}
