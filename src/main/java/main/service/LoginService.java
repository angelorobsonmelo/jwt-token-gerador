package main.service;

import main.dao.LoginDAO;
import main.model.Usuario;

public class LoginService {

    private LoginDAO loginDAO;

    public LoginService() {
        this.loginDAO = new LoginDAO();
    }

    public Usuario login(Usuario usuario) {
        return loginDAO.login(usuario);
    }
}
