/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.examples.gs.web.services;

import com.eudriscabrera.examples.gs.web.domain.User;

/**
 *
 * @author ecabrerar
 */
public interface UserService extends CRUDService<User>{
    User findByUsername(String username);
}
