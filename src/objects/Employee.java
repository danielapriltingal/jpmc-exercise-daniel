package objects;

/**
 * Created by nxtlvl on 9/28/2016.
 */
public class Employee extends Person{

    private String departmentName;
    private double payGrade;
    private int employeeId;
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(double payGrade) {
        this.payGrade = payGrade;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String introduceYourself(){
        return "Hi my name is " + getFirstName() + " " + getLastName() + " and i work for "+ companyName + "";
    }
}
