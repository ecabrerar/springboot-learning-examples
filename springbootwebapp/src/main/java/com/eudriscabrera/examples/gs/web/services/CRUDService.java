/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.examples.gs.web.services;

import java.util.List;

/**
 *
 * @author ecabrerar
 */
public interface CRUDService<T> {
    List<?> listAll();
 
    T getById(Integer id);
 
    T saveOrUpdate(T domainObject);
 
    void delete(Integer id); 
}
