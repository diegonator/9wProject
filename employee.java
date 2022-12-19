public class employee{
    private int age;
    private String EmployeeID;
    private String EmployeeRole;
    
    public employee(int age, String employeeID, String employeeRole) {
        age = 0;
        EmployeeID = "";
        EmployeeRole = "";

    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmployeeID() {
        return EmployeeID;
    }
    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }
    public String getEmployeeRole() {
        return EmployeeRole;
    }
    public void setEmployeeRole(String employeeRole) {
        EmployeeRole = employeeRole;
    }
    public String toString() {
        return "employee [age=" + age + ", EmployeeID=" + EmployeeID + ", EmployeeRole=" + EmployeeRole + "]";
    }
    
}