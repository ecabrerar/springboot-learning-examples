/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.examples.gs.web.services;

import com.eudriscabrera.examples.gs.web.domain.Product;

/**
 *
 * @author ecabrerar
 */
public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);
    void deleteProduct(Integer id);
}
