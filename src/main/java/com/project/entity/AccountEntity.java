package com.project.entity;

import org.springframework.stereotype.Indexed;
import jakarta.persistence.*;

@Entity
@Table(name="account")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;

    private String username;
    private String password;

    public AccountEntity(){}
    
    public Integer GetAccountId(){
        return accountId;
    }
    public String GetUsername(){
        return username;
    }

    public void SetUsername(String username){
        this.username = username;
    }

    public String GetPassword(){
        return password;
    }

    public void SetPassword(String password){
        this.password = password;
    }


}
