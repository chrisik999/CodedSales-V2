package codedsales.filters;

import codedsales.exceptions.NotAuthorizedException;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.logging.Level;
import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import java.util.logging.Logger;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import codedsales.annotations.JwtAuthentication;
import codedsales.resources.AuthResource;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import java.security.Key;

/**
 *
 * @author Christian
 */
@JwtAuthentication
@Provider
@Priority(Priorities.AUTHENTICATION)
public class JwtAuthFilter implements ContainerRequestFilter {
    
    
    
    private String authString;
    
    private Key key;
    
    SecureRandom secRandom = new SecureRandom();
    
    private Logger logger = Logger.getLogger(JwtAuthFilter.class.getName());
    
    public static final String BEARER = "Bearer";

    @Override
    public void filter(ContainerRequestContext requestContext) {
        
        // Get the HTTP Authorization header from the request
        authString = requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);
        
        if(authString == null || authString.isEmpty() || !authString.startsWith(BEARER)){
            Logger.getLogger(JwtAuthFilter.class.getName()).log(Level.WARNING, "No valid string token found");
            Response response = Response.status(401).entity(new NotAuthorizedException("No valid string token found")).build();
            requestContext.abortWith(response);
        } else {
            // Extract the token from the HTTP Authorization header
            String token = authString.substring(BEARER.length()).trim();
            try {
                Jws<Claims> parseClaims = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
                logger.log(Level.INFO,parseClaims.toString());
                logger.log(Level.INFO, "#### valid token : {0}", token);
            } catch(ExpiredJwtException | MalformedJwtException | SignatureException | UnsupportedJwtException | IllegalArgumentException e){
                java.util.logging.Logger.getLogger(AuthResource.class.getName()).log(Level.INFO, e.getMessage(), token);
                logger.log(Level.SEVERE, e.getMessage());
                logger.log(Level.SEVERE, "### invalid token : {0}", token);
                Response response = Response.status(500).entity(new NotAuthorizedException("No valid string token found")).build();
                requestContext.abortWith(response);
            }
            
        }
         
    }
    
}
