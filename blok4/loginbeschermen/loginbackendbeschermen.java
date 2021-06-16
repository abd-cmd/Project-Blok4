package blok4.loginbeschermen;


import blok4.domien.Account;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;

import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;
import java.security.Key;
import java.util.AbstractMap;
import java.util.Calendar;

@Path("login")
public class loginbackendbeschermen {

     public static final Key key = MacProvider.generateKey();


     @POST
     @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
     @Produces("application/json")
     public Response LoginUser(@FormParam("Username") String username,
                               @FormParam("Password") String Password){

          String access = Account.validateLogin(Password,username);
          if (access == null) throw new IllegalArgumentException("No user found");


          String token = createToken(username,access);
          return Response.ok(new AbstractMap.SimpleEntry<>("JWT",token)).build();
     }

     private String createToken(String username, String access) throws JwtException {
          Calendar expiration = Calendar.getInstance();
          expiration.add(Calendar.MINUTE,30);

          return Jwts.builder()
                  .setSubject(username)
                  .setExpiration(expiration.getTime())
                  .claim(username,access)
                  .signWith(SignatureAlgorithm.HS512,key)
                  .compact();
     }

}
