package main.dao;

import main.model.Usuario;

public class LoginDAO {

    public Usuario login(Usuario usuario) {
         if (usuario != null) {
             usuario.setId(1L);
             usuario.setSobrenome("Silva");
         }

         return usuario;
    }
}
