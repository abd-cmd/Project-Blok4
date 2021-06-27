package blok4.webservices;


import blok4.domien.FileDataSysteem;
import blok4.domien.Project;

import javax.annotation.security.RolesAllowed;
import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;

@Path("/filedatasysteem")
public class ProjectToevoegen {


    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//    @RolesAllowed("projectmanager")
    @Produces("application/json")
    public Response VoegEenProjectToe(@FormParam("projectnaam") String projectnaam ,
                                    @FormParam("projecttype") String projecttype,
                                    @FormParam("projectnummer") int projectnummer,
                                    @FormParam("projectdatum") String projectdatum,
                                    @FormParam("projectbudget") int projectbudget,
                                    @FormParam("Werkurenregisteren") int projectwerkurenregisteren,
                                    @FormParam("opties") String projectbeoordelen){

        // dit methode zorgt dat een project wort toegevoegd aan de jsonfile
        Project project = new Project(projectnaam,projecttype,projectbudget,projectnummer,new Date());
        JsonObjectBuilder job = Json.createObjectBuilder();
        if (project.getProjectnaam() != null && project.getProjectnummer() != 0){
             FileDataSysteem.getMyFileDataSysteem().listVanProjects().add(project);

             return Response.ok().build();
        }else {
            job.add("error","project is niet toegevoegd");
            return Response.status(404).build();
        }
    }
}
