package com.example.contact_manager;

public class Contact {

    private String name;
    private String phone;
    private String email;


    public Contact(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // Setter for info
    public void setName(String name){
        this.name = name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setEmail(String email){
        this.email = email;
    }




    // Getter for info
    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }



    @Override
    public String toString(){
        return name + "(" + phone + "," + email+")";
    }






}
