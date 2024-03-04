package start.adzennik;

public class User {

    private String firstName;
    private String secondName;
    private String thirdName;
    private String login;
    private String password;
    private String nameOfSchool;
    private String grade;

    public User(String firstName, String secondName, String thirdName, String login, String password, String nameOfSchool, String grade) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.login = login;
        this.password = password;
        this.nameOfSchool = nameOfSchool;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
