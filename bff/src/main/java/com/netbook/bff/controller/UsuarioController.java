package com.netbook.bff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netbook.bff.models.entities.Usuario;
import com.netbook.bff.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    //inyectamos el servicio
    @Autowired
    private UsuarioService usuarioService;
   
    //vacío para atender la ruta base (/usuarios)
    @GetMapping
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioService.obtenerTodosLosUsuarios();
    }

    //buscar usuario por id espesifica
    @GetMapping("/{id}")
    public Usuario obtenerUsuarioPorId(@PathVariable("id") Integer id) {
        return usuarioService.obtenerUsuarioPorId(id);
    }
    
    //guardar usuario
    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioService.guardarUsuario(usuario); 
    }
}