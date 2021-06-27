package blok4.webservices;


import blok4.domien.FileDataSysteem;
import blok4.domien.Project;

import javax.annotation.security.RolesAllowed;
import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.FormParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.Date;

@Path("/restservices")
public class ProjectInfobewerken {

    @PUT
//    @RolesAllowed("projectmanager")
    @Produces("application/json")
    public Response updateProject(@FormParam("projectnaam") String projectnaam ,
                                  @FormParam("projecttype") String projecttype,
                                  @FormParam("projectnummer") int projectnummer,
                                  @FormParam("projectdatum") Date projectdatum,
                                  @FormParam("projectbudget") int projectbudget,
                                  @FormParam("Werkurenregisteren") int projectwerkurenregisteren,
                                  @FormParam("opties") String projectbeoordelen){

        Project project = new Project(projectnaam,projecttype,projectbudget,projectnummer,projectdatum);
        JsonObjectBuilder job = Json.createObjectBuilder();
        if (project.getProjectnaam().equals(projectnaam)){
            project.SetNewProjectBudget(projectbudget);
            project.SetNewProjectNummer(projectnummer);
            project.SetNewProjectType(projecttype);
            project.SetNewProjectDatum(projectdatum);
            return Response.ok().build();
        }else {
            job.add("error","project is niet geupdated");
            return Response.status(404).build();
        }

    }
}
