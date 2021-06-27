package blok4.webservices;


import blok4.domien.FileDataSysteem;
import blok4.domien.Project;

import javax.annotation.security.RolesAllowed;
import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Date;

@Path("/filedatasysteemVerwijderen")
public class Projectverwijderen {

    @DELETE
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//    @RolesAllowed("projectmanager")
    @Produces("application/json")
    public Response DeleteProject(@FormParam("projectnaam") String projectnaam){

        // dit methode zorgt dat een project wordt verwijdert
        ArrayList<Project> fileDataSysteemProjects = FileDataSysteem.getMyFileDataSysteem().listVanProjects();
        for (Project project1 : fileDataSysteemProjects ) {
            if (project1.getProjectnaam().equals(projectnaam))
            FileDataSysteem.getMyFileDataSysteem().listVanProjects().remove(project1);
            return Response.ok().build();
        }
        return Response.ok().build();

    }

}
