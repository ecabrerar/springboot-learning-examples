/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.examples.gs.web.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author ecabrerar
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.eudriscabrera.examples.gs.web.domain"})
@EnableJpaRepositories(basePackages = {"com.eudriscabrera.examples.gs.web.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
    
}
