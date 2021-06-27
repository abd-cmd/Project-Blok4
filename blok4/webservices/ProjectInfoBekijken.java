package blok4.webservices;


import blok4.domien.FileDataSysteem;
import blok4.domien.Project;

import javax.annotation.security.RolesAllowed;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

//@RolesAllowed("projectmanager")// de gevraagde role om machtiging te hebben
@Path("/lijst") // dit is de path van de methode dus het wordt gezien als ("restservices/lijst")
public class ProjectInfoBekijken{


      @GET// de Get methode
      @Produces("application/json")
      public String LijstVanProjecten(){
          // dit methode zorgt dat er projecct worden gezien in de jsonfile
          JsonArrayBuilder jsonfile = Json.createArrayBuilder();
          for (Project project:  FileDataSysteem.getMyFileDataSysteem().listVanProjects()){
              JsonObjectBuilder job = Json.createObjectBuilder();
              job.add("projectnaam",project.getProjectnaam());
              job.add("projecttypr",project.getProjecttype());
              job.add("projectnummer",project.getProjectnummer());
              job.add("projectdatum",project.getProjectdatum().toString());
              job.add("projectbudget",project.getProjectbudget());
              jsonfile.add(job);
          }
          return jsonfile.build().toString();
      }
}