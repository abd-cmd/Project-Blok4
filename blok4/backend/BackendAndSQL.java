package blok4.backend;



import java.io.StringReader;
import java.sql.*;
import javax.json.*;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("filedatasysteem")
public class BackendAndSQL {


    @POST
    @Produces("application/json")
    public String VoegAanDeDataBaseToe(String Jsonbody){


        JsonObjectBuilder responseobject = Json.createObjectBuilder();

        StringReader reader = new StringReader(Jsonbody);
        JsonReader jsonReader = Json.createReader(reader);
        JsonObject jsonObject = jsonReader.readObject();

        String url = "jdbc:postgresql://localhost:5432/JavaEnSql";
        String user = "postgres";
        String password = "Pass.123%";
       try {


           String sql = "INSERT INTO FileDataSysteemTable (projectnaam,projectType,projectnummer,projectdatum,projectbudget,Werkurenregisteren,beoordelen)"
                   +  " VALUES (?,?,?,?,?,?,?)";


           Connection Mycon = DriverManager.getConnection(url, user, password);
           PreparedStatement Mysta = Mycon.prepareStatement(sql);

           String projectnaam = jsonObject.getString("projectnaam");
           String projectType = jsonObject.getString("projectType");
           int projectnummer = jsonObject.getInt("projectnummer");
           String projectdatum = jsonObject.getString("projectdatum");
           int projectbudget = jsonObject.getInt("projectbudget");
           int Werkurenregisteren = jsonObject.getInt("Werkurenregisteren");
           String beoordelen = jsonObject.getString("beoordelen");


           Mysta.setString(1,projectnaam);
           Mysta.setString(2,projectType);
           Mysta.setInt(3,projectnummer);
           Mysta.setString(4,projectdatum);
           Mysta.setInt(5,projectbudget);
           Mysta.setInt(6,Werkurenregisteren);
           Mysta.setString(7,beoordelen);

           ResultSet resultSet = Mysta.executeQuery(sql);

           while (resultSet.next()) {

               System.out.println("het is gelukt");
           }

            responseobject.add("gelukt", "een nieuwe project wordt toegevoegd");
       }catch (SQLException throwables) {
            responseobject.add("niet gelukt", "geen project wordt toegevoegd");


       }
     return responseobject.build().toString();
    }



}











//
//
//
//    String SQL = "INSERT INTO FileDataSysteemTable (projectnaam,projectType,projectnummer,projectdatum,projectbudget,Werkurenregisteren,beoordelen)"
//            + " VALUES ('abd','Eng',787980,17-09-2021,200000,17,vol)";
//
//    ResultSet resultSet = null;
//
//
//        try( Connection con  = DriverManager.getConnection(url,user,password);
//                PreparedStatement prepsInsertProduct = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);){
//
//                prepsInsertProduct.execute();
//
//
//                resultSet = prepsInsertProduct.getGeneratedKeys();
//                while (resultSet.next()) {
//                System.out.println("Generated: " + resultSet.getString(1));
//                }
//
//                con.close();
//
//                System.out.println("gelukt");
//                }catch (SQLException e){
//                System.out.println("niet gelukt");
//                e.printStackTrace();
//
//                }

//    public static void main(String[] args)  {
//
//        String url = "jdbc:postgresql://localhost:5432/JavaEnSql";
//        String user = "postgres";
//        String password = "Pass.123%";
//
//        try {
////            Class.forName("org.postgresql.Driver");
//            Connection Mycon = DriverManager.getConnection(url,user,password);
//            Statement Mysta = Mycon.createStatement();
////            String sql = "INSERT INTO FileDataSysteemTable (projectnaam,projectType,projectnummer,projectdatum,projectbudget,Werkurenregisteren,beoordelen)"
////                 + " VALUES ('abd','Eng',787980,'2020-09-17',200000,17,'vol')";
////
////            ResultSet resultSet = Mysta.executeQuery(sql);
////
////            while (resultSet.next()){
////
////                System.out.println("het is gelukt");
////            }
//        } catch (SQLException  throwables) {
//            throwables.printStackTrace();
//
//        }
//
//    }


//
//    @POST
//    @Produces("application/json")
//    public Response VoegAanDeDataBaseToe(@FormParam("projectnaam") String naam ,
//                                         @FormParam("projecttype") String projecttype,
//                                         @FormParam("projectnummer") int nummer,
//                                         @FormParam("projectdatum") String datum,
//                                         @FormParam("projectbudget") int budget,
//                                         @FormParam("Werkurenregisteren") int werkuren,
//                                         @FormParam("opties") String optie){
//
//
////        JsonObjectBuilder responseobject = Json.createObjectBuilder();
////
////        StringReader reader = new StringReader(naam);
////        JsonReader jsonReader = Json.createReader(reader);
////        JsonObject jsonObject = jsonReader.readObject();
//
//        String url = "jdbc:postgresql://localhost:5432/JavaEnSql";
//        String user = "postgres";
//        String password = "Pass.123%";
//        try {
//
//            String sql = "INSERT INTO FileDataSysteemTable (projectnaam,projectType,projectnummer,projectdatum,projectbudget,Werkurenregisteren,beoordelen)"
//                    +  " VALUES (naam,projecttype,nummer,datum,budget,werkuren,optie)";
//
//
//            Connection Mycon = DriverManager.getConnection(url, user, password);
//            PreparedStatement Mysta = Mycon.prepareStatement(sql);
////
////           String projectnaam = jsonObject.getString("projectnaam");
////           String projectType = jsonObject.getString("projectType");
////           int projectnummer = jsonObject.getInt("projectnummer");
////           String projectdatum = jsonObject.getString("projectdatum");
////           int projectbudget = jsonObject.getInt("projectbudget");
////           int Werkurenregisteren = jsonObject.getInt("Werkurenregisteren");
////           String beoordelen = jsonObject.getString("beoordelen");
//
////           ArrayList waarden = new ArrayList(projectnaam,projectType,projectnummer,projectdatum,projectbudget,Werkurenregisteren,beoordelen);
//
////           Mysta.setString(1,projectnaam);
////           Mysta.setString(2,projectType);
////           Mysta.setInt(3,projectnummer);
////           Mysta.setString(4,projectdatum);
////           Mysta.setInt(5,projectbudget);
////           Mysta.setInt(6,Werkurenregisteren);
////           Mysta.setString(7,beoordelen);
//
//            ResultSet resultSet = Mysta.executeQuery(sql);
//
//            while (resultSet.next()) {
//
//                System.out.println("het is gelukt");
//            }
//            return Response.ok().build();
////            responseobject.add("gelukt", "een nieuwe project wordt toegevoegd");
//        }catch (SQLException throwables) {
////            responseobject.add("niet gelukt", "geen project wordt toegevoegd");
//            Response.status(409).build();
//
//        }
//        return    Response.status(409).build();
//    }
//
//
//
//}