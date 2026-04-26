package com.netbook.bff.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.netbook.bff.models.entities.Usuario;
import com.netbook.bff.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    //inyectamos el repo para manejar la BD sin tocar SQL
    @Autowired
    private UsuarioRepository usuarioRepository;

    //metodo para obtener todos los usuarios de la tabla
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }
    
    //buscar usuario por id
    public Usuario obtenerUsuarioPorId(Integer id) {
        return usuarioRepository.findById(id).orElseThrow( () ->  new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado"));
    }
    
    //guardar usuario en la BD
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

}