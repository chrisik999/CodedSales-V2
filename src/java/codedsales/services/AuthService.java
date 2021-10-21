/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codedsales.services;

import codedsales.models.User;
import codedsales.resources.AuthResource;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Date;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author Christian
 */
public class AuthService {
    private UserService userService = new UserService();
    //SecretKey key = Keys.hmacShaKeyFor("SECRET".getBytes(StandardCharsets.UTF_8));
    private Key key = Keys.secretKeyFor(SignatureAlgorithm.HS512);

    Logger logger = Logger.getLogger(AuthResource.class.getName());
    
    public String AuthenticateUser(String username, String password){
        //User user = userService.getUser(username);
        //check stored password against passed password
        //if dosen't match return msg
        //if it matches
        String token = issueToken(username);
        return token;
    }

    private String issueToken(String username) {
        //encode Secret key to save.
//            String secretString = Encoders.BASE64.encode(key.getEncoded());
        //update userSecretKey

        //Issue a token for the user
        String jws = Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 3600000))
                .signWith(SignatureAlgorithm.HS512, key)
                .compact();

        Jws<Claims> parseClaims = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(jws);
        logger.log(Level.INFO, parseClaims.toString());
        return jws;
    }
}
