package security.filters;


import security.utils.JwtTokenUtil;

public class JwtAuthenticationTokenFilter {

	private static final String AUTH_HEADER = "Authorization";
	private static final String BEARER_PREFIX = "Bearer ";

    private JwtTokenUtil jwtTokenUtil;

   /* protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
        String token = request.getHeader(AUTH_HEADER);
        if (token != null && token.startsWith(BEARER_PREFIX)) {
        	token = token.substring(7);
        }

        String username = jwtTokenUtil.getUsernameFromToken(token);

        if (username != null) {
//            Usuario userDetails = this.userDetailsService.loadUserByUsername(username);

            if (jwtTokenUtil.validToken(token)) {

            }
        }

        chain.doFilter(request, response);
    }*/

}
