package blok4.setup;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("restservices")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("blok4.webservices", "blok4.security");// dit zorgt dat er bepaalde packges de ApplicationPath krijgen
        register(RolesAllowedDynamicFeature.class);// dit zorgt dat de gebruiker een bepaalde role moet hebben om machtiging te krijgen
    }
}

