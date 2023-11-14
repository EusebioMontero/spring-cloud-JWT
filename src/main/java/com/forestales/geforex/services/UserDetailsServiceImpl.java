package com.forestales.geforex.services;

import com.forestales.geforex.entities.UserEntity;
import com.forestales.geforex.configuration.UserDetailImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserService userService;
    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
//        UserEntity user = userService.getByUserName(username).get();
        UserEntity user = userService.getByUserLogin(login).get();
        return UserDetailImpl.build(user);
    }
}
