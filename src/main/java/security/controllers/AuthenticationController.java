package security.controllers;

import main.model.Usuario;
import security.dto.TokenDto;
import security.utils.JwtTokenUtil;

public class AuthenticationController {

    private JwtTokenUtil jwtTokenUtil;

    public AuthenticationController() {
        this.jwtTokenUtil = new JwtTokenUtil();
    }

    public TokenDto generateTokenJwt(Usuario usuario) {
        String token = jwtTokenUtil.getToken(usuario);
        return new TokenDto(token);
    }

	public TokenDto generateRefreshTokenJwt(String token) {
		String refreshedToken = jwtTokenUtil.refreshToken(token);
		return new TokenDto(refreshedToken);
	}

	public void validarApiSecretJWT(String token) {
        jwtTokenUtil.validarApiSecretJWT(token);
	}

}
