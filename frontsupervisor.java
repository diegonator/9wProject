public class frontsupervisor extends employee{
    private String department;

    public frontsupervisor(int age, String employeeID, String employeeRole, String department) {
        super(age, employeeID, employeeRole);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
