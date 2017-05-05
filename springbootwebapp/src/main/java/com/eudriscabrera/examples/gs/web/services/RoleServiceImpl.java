/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.examples.gs.web.services;

import com.eudriscabrera.examples.gs.web.domain.UserRole;
import com.eudriscabrera.examples.gs.web.repositories.RoleRepository;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 *
 * @author ecabrerar
 */
@Profile("springdatajpa")
@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public void setRoleRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<UserRole> listAll() {
        return StreamSupport.stream(roleRepository.findAll().spliterator(),false)
                .collect(Collectors.toList());
    }

    @Override
    public UserRole getById(Integer id) {
        return roleRepository.findOne(id);
    }

    @Override
    public UserRole saveOrUpdate(UserRole domainObject) {
        return roleRepository.save(domainObject);
    }

    @Override
    public void delete(Integer id) {
        roleRepository.delete(id);
    }

}
