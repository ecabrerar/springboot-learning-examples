/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.examples.gs.web.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author ecabrerar
 */
@Entity
public class UserRole extends AbstractDomainClass{
    private String userRole;
 
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable
    // ~ defaults to @JoinTable(name = "USER_ROLE", joinColumns = @JoinColumn(name = "role_id"),
    //     inverseJoinColumns = @joinColumn(name = "user_id"))
    private List<User> users = new ArrayList<>();
 
    public String getRole() {
        return userRole;
    }
 
    public void setRole(String role) {
        this.userRole = role;
    }
 
    public List<User> getUsers() {
        return users;
    }
 
    public void setUsers(List<User> users) {
        this.users = users;
    }
 
    public void addUser(User user){
        if(!this.users.contains(user)){
            this.users.add(user);
        }
 
        if(!user.getRoles().contains(this)){
            user.getRoles().add(this);
        }
    }
 
    public void removeUser(User user){
        this.users.remove(user);
        user.getRoles().remove(this);
    }
}
