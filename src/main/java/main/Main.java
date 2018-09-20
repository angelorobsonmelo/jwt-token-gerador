package main;

import main.service.LoginService;
import main.model.Usuario;
import security.controllers.AuthenticationController;
import security.dto.TokenDto;

public class Main {

    public static void main(String[] args) {
        AuthenticationController authenticationController = new AuthenticationController();
        LoginService loginService = new LoginService();
        Usuario usuario = new Usuario("José", "123");

        Usuario usuarioLogado = loginService.login(usuario);
        TokenDto tokenDto = authenticationController.generateTokenJwt(usuarioLogado);
        authenticationController.validarApiSecretJWT(tokenDto.getToken());

    }
}
