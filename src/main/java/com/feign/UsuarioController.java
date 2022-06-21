package com.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    UsuarioEndpoint usuarioEndpoint;

    @GetMapping
    public Usuario getUsuario() {
        return usuarioEndpoint.getUsuario();
    }
}
