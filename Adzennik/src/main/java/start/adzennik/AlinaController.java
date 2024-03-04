package start.adzennik;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class AlinaController {
    @FXML
    private Button profile;
    @FXML
    private Button schedule;
    @FXML
    private Button grades;
    @FXML
    private Button schedule11;
    @FXML
    private Button schedule12;
    @FXML
    private Button miniLogin;
    @FXML
    private Button signOnButton1;
    @FXML
    private Button chat;
    @FXML
    private PasswordField pass_field;
    @FXML
    private PasswordField singOnPasswordField;
    @FXML
    private TextField singOnLoginField;
    @FXML
    private TextField singOnGradeField;
    @FXML
    private TextField singOnNameField;
    @FXML
    private TextField singOnNameOfSchoolField;
    @FXML
    private TextField loginText;
    @FXML
    private Label nameOfPerson;

    private static String firstName;
    private static String secondName;
    private static String thirdName;
    private static String name;
    private static String nameOfSchool;
    private static String grade;
    private static String password;
    private static String login;


    public void setPassword(String password) {
        this.password = password;
    }
    public static String getPassword() {
        return password;
    }
    public static void setLogin(String login) {
        AlinaController.login = login;
    }
    public static String getLogin() {
        return login;
    }
    public static void setFullName(String name) {
        AlinaController.name = name;
    }
    public static String getName() {
        return name;
    }
    public static void setNameOfSchool(String nameOfSchool) {
        AlinaController.nameOfSchool = nameOfSchool;
    }
    public static String getNameOfSchool() {
        return nameOfSchool;
    }
    public static void setGrade(String grade) {
        AlinaController.grade = grade;
    }
    public static String getGrade() {
        return grade;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        AlinaController.firstName = firstName;
    }

    public static String getSecondName() {
        return secondName;
    }

    public static void setSecondName(String secondName) {
        AlinaController.secondName = secondName;
    }

    public static String getThirdName() {
        return thirdName;
    }

    public static void setThirdName(String thirdName) {
        AlinaController.thirdName = thirdName;
    }

    @FXML
    void initialize() {

    }
    @FXML
    void schedule_Click() {
        schedule.setOnAction(actionEvent -> {
            schedule.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("raspisaniee.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("ADzennik");
            stage.show();
        });

    }
    @FXML
    void profile_Click() {

        profile.setOnAction(actionEvent -> {
            profile.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("alina_fx.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            //stage.setWidth(i++);
            //stage.setHeight(j++);
            stage.setTitle("ADzennik");
            //stage.setResizable(false);
            stage.show();

        });
    }
    @FXML
    void chat_Click() {
        chat.setOnAction(actionEvent -> {

            chat.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("chat.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("ADzennik");
            stage.show();

        });
    }
    @FXML
    void grades_Click() {
        grades.setOnAction(actionEvent -> {

            grades.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("grades2.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("ADzennik");
            stage.show();

        });
    }

    @FXML
    void singOnMiniButt_Click() {        //кнопка "Зарегестрироваться" в окне login;
        schedule11.setOnAction(actionEvent -> {

            schedule11.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("singon_page.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("ADzennik");
            stage.show();

        });
    }

    @FXML
    void loginMiniButt_Click(){                      //кнопка регистрации на странице входа
        miniLogin.setOnAction(actionEvent -> {
            miniLogin.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("login_page.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("ADzennik");
            stage.show();
        });
    }

    @FXML
    void singOnButton_Click() throws SQLException, ClassNotFoundException {             //кнопка регистрации
            String name;
            //setFullName(this.name);
            setLogin(singOnLoginField.getText().trim());
            setPassword(singOnPasswordField.getText().trim());
          //  setName(singOnNameField.getText());
            setNameOfSchool(singOnNameOfSchoolField.getText());
            setGrade(singOnGradeField.getText().trim());
            name = singOnNameField.getText();

            //System.out.println(name);                       //делит name на ФИО
            String[] fullName = name.split(" ");
            setFirstName(fullName[0]);
            setSecondName(fullName[1]);
            setThirdName(fullName[2]);

        System.out.println(getFirstName());
        System.out.println(getSecondName());
        System.out.println(getThirdName());


            //System.out.println(getName());
            System.out.println(getGrade());
            System.out.println(getNameOfSchool());
            System.out.println(getLogin());
            System.out.println(getPassword());

        DataBaseHandler dbh = new DataBaseHandler();
        dbh.signUpUser(getFirstName(), getSecondName(), getThirdName(),getGrade(),getLogin(),getPassword(),getNameOfSchool());




       // dbh.logInUser(get);

      //  dbh.singUpUser()

        signOnButton1.setOnAction(actionEvent -> {

            signOnButton1.setOnAction(event -> {

            });
            signOnButton1.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("login_page.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("ADzennik");
            stage.show();
        });
    }

    private void signUpNewUser() {
        DataBaseHandler dbHandler = new DataBaseHandler();

        String firstName = getFirstName();
        String secondName = getSecondName();
        String thirdName = getThirdName();
        String login = getLogin();
        String password = getPassword();
        String nameOfSchool = getNameOfSchool();
        String grade = getGrade();




    }

    public void loginButton_Click(ActionEvent event) {  //кнопка "Войти" в окне login; Считывает и проверяет логин и пароль
        //тут что-то не так
        DataBaseHandler dbh = new DataBaseHandler();

        try {
            System.out.println(dbh.getStudents(getLogin()));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        if (loginText.getText().equals(getLogin()) && pass_field.getText().equals(getPassword())) {
            //setNameOfPerson(getName());
            schedule12.setOnAction(actionEvent -> {

                schedule12.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("alina_fx.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("ADzennik");

                stage.show();

            });
            System.out.println(nameOfPerson.getText());
        } else {
            System.out.println(getName());
            System.out.println(getNameOfSchool());

            System.out.println("Wrong password");

           // while (true){
            //    if
          //  }

        }
    }


}
//new ВАСЯ ПУПКИн: МАМКИН ХАЦКЕР




