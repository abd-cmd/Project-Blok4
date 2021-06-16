package blok4.backend;



import blok4.domien.Project;

import java.io.StringReader;
import java.sql.*;
import javax.json.*;
import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("filedatasysteem")
public class BackendAndSQL {

    String url = "jdbc:postgresql://localhost:5432/JavaEnSql";
    String user = "postgres";
    String password = "Pass.123%";

    private static final String sql = "INSERT INTO FileDataSysteemTable (projectnaam,projectType,projectnummer,projectdatum,projectbudget,Werkurenregisteren,beoordelen) VALUES (?,?,?,?,?,?,?)";

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces("application/json")
    public String VoegAanDeDataBaseToe(@FormParam("projectnaam") String projectnaam ,
                                         @FormParam("projecttype") String projecttype,
                                         @FormParam("projectnummer") int projectnummer,
                                         @FormParam("projectdatum") Date projectdatum,
                                         @FormParam("projectbudget") int projectbudget,
                                         @FormParam("Werkurenregisteren") int projectwerkurenregisteren,
                                         @FormParam("opties") String projectbeoordelen){


        JsonObjectBuilder responseobject = Json.createObjectBuilder();
//
//        StringReader reader = new StringReader(naam);
//        JsonReader jsonReader = Json.createReader(reader);
//        JsonObject jsonObject = jsonReader.readObject();


        try ( Connection Mycon = DriverManager.getConnection( url, user, password);
             PreparedStatement Mysta = Mycon.prepareStatement(sql)){

            Project project = new Project(projectnaam,projecttype,projectbudget,projectnummer,projectdatum);


//
//           String projectnaam = jsonObject.getString("projectnaam");
//           String projectType = jsonObject.getString("projectType");
//           int projectnummer = jsonObject.getInt("projectnummer");
//           String projectdatum = jsonObject.getString("projectdatum");
//           int projectbudget = jsonObject.getInt("projectbudget");
//           int Werkurenregisteren = jsonObject.getInt("Werkurenregisteren");
//           String beoordelen = jsonObject.getString("beoordelen");

//           ArrayList waarden = new ArrayList(projectnaam,projectType,projectnummer,projectdatum,projectbudget,Werkurenregisteren,beoordelen);

           Mysta.setString(1,projectnaam);
           Mysta.setString(2,projecttype);
           Mysta.setInt(3,projectnummer);
           Mysta.setDate(4,projectdatum);
           Mysta.setInt(5,projectbudget);
           Mysta.setInt(6,projectwerkurenregisteren);
           Mysta.setString(7,projectbeoordelen);


           Statement statement = Mycon.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            int row = Mysta.executeUpdate();
            System.out.println(row); //1

            while (resultSet.next()) {

                System.out.println("het is gelukt");
            }
//             Response.ok().build();

            responseobject.add(String.valueOf(Response.ok().build()), "een nieuwe project wordt toegevoegd");
            Mycon.close();
        }catch (SQLException throwables) {
            responseobject.add(String.valueOf(Response.status(409).build()), "geen project wordt toegevoegd");
//            Response.status(409).build();

        }
        return  responseobject.build().toString()  ;
    }


}





