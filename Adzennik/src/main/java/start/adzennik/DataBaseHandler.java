package start.adzennik;

import java.sql.*;
import java.util.ArrayList;

public class DataBaseHandler extends Configs {
    Connection dbConnection;

    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":"
                + dbPort + "/" + dbName;

        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString,
                dbUser, dbPass);
        return dbConnection;
    }

    public void signUpUser(String firstName, String secondName, String thirdName, String grade, String login, String password, String nameOfSchool) {
//        String insert = "INSERT INTO "+ Const.USER_TABLE + "(" +
//                Const.USERS_FIRSTNAME + "," + Const.USERS_LASTNAME + "," +
//                Const.USERS_PATRONYMIC  + "," + Const.USERS_SCHOOL  + "," +
//                Const.USERS_GRADE + "," + Const.USERS_USERNAME + "," + Const.USERS_PASSWORD + ")" +
//                "VALUES(" +AlinaController.getFirstName()  + "," + AlinaController.getSecondName()  + "," +
//                AlinaController.getThirdName()  + "," + AlinaController.getNameOfSchool() + "," +
//                AlinaController.getGrade()  + "," + AlinaController.getLogin() + "," + AlinaController.getPassword() + ")";
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" +
                Const.USERS_FIRSTNAME + "," + Const.USERS_LASTNAME + "," + Const.USERS_PATRONYMIC + "," + Const.USERS_GRADE
                + "," +
                Const.USERS_SCHOOL + "," + Const.USERS_USERNAME + "," + Const.USERS_PASSWORD + ")" +
                "VALUES(?,?,?,?,?,?,?)";
        // System.out.println(AlinaController.getFirstName());
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, firstName);
            prSt.setString(2, secondName);
            prSt.setString(3, thirdName);
            prSt.setString(4, grade);
            prSt.setString(5, nameOfSchool);
            prSt.setString(6, login);
            prSt.setString(7, password);


            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


  public ArrayList<Const> getStudents(String username) throws SQLException, ClassNotFoundException {

      // public void getStudents(String id) throws SQLException, ClassNotFoundException {
      String select = "SELECT " +Const.USERS_ID +","+ Const.USERS_FIRSTNAME + "," + Const.USERS_LASTNAME + "," + Const.USERS_PATRONYMIC + "," +
              Const.USERS_GRADE + "," + Const.USERS_SCHOOL +  "," + Const.USERS_PASSWORD +
              " FROM " + Const.USER_TABLE + " WHERE " + Const.USERS_USERNAME + " = '" + username + "';";
      PreparedStatement prSt = getDbConnection().prepareStatement(select);
      ResultSet rs = prSt.executeQuery();
      ArrayList<Const> users = new ArrayList<>();
      while (rs.next()) {

          String id = rs.getString("id");
          String firstName = rs.getString("firstName");
          String lastName = rs.getString("lastName");
          String patronymic = rs.getString("patronymic");
          String grade = rs.getString("grade");
          String school = rs.getString("school");
        //  String username = rs.getString("username");
          String password = rs.getString("password");
          Const user = new Const(firstName, lastName, patronymic, grade, school,  password);
          users.add(user);


          System.out.println("Id: " + id + "Name: " + firstName + ", Second name: " + lastName +
                  ", Patronymic: " + patronymic + ", Grade: " + grade +
                  ", School: " + school + ", Username: " + username +
                  ", Password: " + password );
      }return users;

  }
}


            //   try {

          /*  prSt.setString(1, firstName);
            prSt.setString(2, secondName);
            prSt.setString(3, thirdName);
            prSt.setString(4, grade);
            prSt.setString(5, nameOfSchool);
            prSt.setString(6, login);
            prSt.setString(7, password);


            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

            // }}}



