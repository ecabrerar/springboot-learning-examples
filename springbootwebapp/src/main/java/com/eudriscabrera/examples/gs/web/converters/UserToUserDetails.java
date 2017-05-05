/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.examples.gs.web.converters;

import com.eudriscabrera.examples.gs.web.domain.User;
import com.eudriscabrera.examples.gs.web.services.security.UserDetailsImpl;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.core.convert.converter.Converter;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

/**
 *
 * @author ecabrerar
 */
@Component
public class UserToUserDetails implements Converter<User, UserDetails> {

    @Override
    public UserDetails convert(User user) {
        UserDetailsImpl userDetails = new UserDetailsImpl();

        if (user != null) {
            userDetails.setUsername(user.getUsername());
            userDetails.setPassword(user.getEncryptedPassword());
            userDetails.setEnabled(user.getEnabled());

            Collection<SimpleGrantedAuthority> authorities = user.getRoles()
                                                                .stream()
                                                                .map(role -> new SimpleGrantedAuthority(role.getRole()))
                                                                .collect(Collectors.toList());

            userDetails.setAuthorities(authorities);
        }

        return userDetails;
    }

}
