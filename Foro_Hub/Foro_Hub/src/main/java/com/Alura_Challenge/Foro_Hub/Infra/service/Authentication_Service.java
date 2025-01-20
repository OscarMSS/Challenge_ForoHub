package com.Alura_Challenge.Foro_Hub.Infra.service;

import com.Alura_Challenge.Foro_Hub.Domain.Usuario.Repositorio.Usuario_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class Authentication_Service implements UserDetailsService {

    @Autowired
    private Usuario_Repository usuario_Repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usuario_Repository.findByUsername(username);
    }
}
