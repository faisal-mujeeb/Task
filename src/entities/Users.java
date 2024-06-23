package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "users")

public class Users {
    private Long id;
    private String name;
    private String address;
    private String userType;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String setAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getUsertype(){
        return userType;
    }
    public void setUsertype(String userType) {
        this.userType = userType;
    }
}







