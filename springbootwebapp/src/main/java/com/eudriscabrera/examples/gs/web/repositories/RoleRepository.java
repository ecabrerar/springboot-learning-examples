/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.examples.gs.web.repositories;

import com.eudriscabrera.examples.gs.web.domain.UserRole;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ecabrerar
 */
public interface RoleRepository extends CrudRepository<UserRole, Integer>{
    
}
