package objects;

/**
 * Created by nxtlvl on 9/28/2016.
 */
public abstract class Person {

    private String firstName;
    private String lastName;
    private String userName;
    private String emailAcc;
    private String firstPass;
    private String secondPass;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAcc() {
        return emailAcc;
    }

    public void setEmailAcc(String emailAcc) {
        this.emailAcc = emailAcc;
    }

    public String getFirstPass() {
        return firstPass;
    }

    public void setFirstPass(String firstPass) {
        this.firstPass = firstPass;
    }

    public String getSecondPass() {
        return secondPass;
    }

    public void setSecondPass(String secondPass) {
        this.secondPass = secondPass;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String introduceYourself(){
        return "Hi I'm" + " " +firstName + " " + lastName + ".";
    }

    public Person(){

    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
