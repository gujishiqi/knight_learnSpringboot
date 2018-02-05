package com.zc.knight.knight.start.entity;


import javax.persistence.*;

@Entity
@Table(name = "sys_user")
public class UserEntity {

    @Id
    @GeneratedValue
    @Column(name = "uid")
    private Long id;

    @Column(name = "userName")
    private String name;

    @Column(name = "passWord")
    private String passWord;

    @Column(name = "emailAddr")
    private String emailAddr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }
}
