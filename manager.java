public class manager extends employee{
    private String districtLocation;
    private String AdminID;
    
    public manager(int age, String employeeID, String employeeRole, String districtLocation, String adminID) {
        super(age, employeeID, employeeRole);
        this.districtLocation = districtLocation;
        AdminID = adminID;
    }
    public String getDistrictLocation() {
        return districtLocation;
    }
    public void setDistrictLocation(String districtLocation) {
        this.districtLocation = districtLocation;
    }
    public String getAdminID() {
        return AdminID;
    }
    public void setAdminID(String adminID) {
        AdminID = adminID;
    }
    public String toString() {
        return "manager [districtLocation=" + districtLocation + ", AdminID=" + AdminID + "]";
    }
    
}
