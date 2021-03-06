package edu.wallcloud.backend;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "uservs")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @NotEmpty
    @Column(name="name", nullable=false)
    private String name;
    @Column(name="email", nullable=false)
    private String email;
    @Column(name="password", nullable=false)
    private String password;

    public User() {}

    public User(String name, String email, String password){
        this.setname(name);
        this.setEMail(email);
        this.setPassword(password);
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setname(String name){
        this.name = name;
    }

    public String getEMail(){
        return this.email;
    }

    public void setEMail(String email){
        this.email = email;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String toString(){
        return "{\n" + " \"id\": " + this.getId() +",\n" + " \"name\": " + this.getName() +",\n" + " \"email\": " + this.getEMail() +",\n" + " \"password\": " + this.getPassword() +",\n" + "}";
    }
}