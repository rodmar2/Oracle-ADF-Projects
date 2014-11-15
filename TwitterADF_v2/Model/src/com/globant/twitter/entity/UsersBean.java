package com.globant.twitter.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
  @NamedQuery(name = "UsersBean.findAll", query = "select o from UsersBean o")
})
@Table(name = "USERS")
public class UsersBean implements Serializable {
    @Column(length = 30)
    private String caption;
    @Column(nullable = false, length = 20)
    private String password;
    @Id
    @Column(name="USER_ID", nullable = false)
    private Long userId;
    @Column(name="USER_NAME", nullable = false, length = 20)
    private String userName;

    public UsersBean() {
    }

    public UsersBean(String caption, String password, Long userId,
                     String userName) {
        this.caption = caption;
        this.password = password;
        this.userId = userId;
        this.userName = userName;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
