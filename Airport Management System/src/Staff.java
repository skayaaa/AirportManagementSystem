public class Staff {
    public String name;
    public String role;
    public String staffid;


public Staff(String name,
             String role,
             String staffid) {
    this.name = name;
    this.role = role;
    this.staffid = staffid;
}
public String getName() {
    return name;
}
public String getRole() {
    return role;
}
public String getStaffid() {
    return staffid;
}
public void setName(String name) {
    this.name = name;
}
public void setRole(String role) {
    this.role = role;
}
public void setStaffid(String staffid) {
    this.staffid = staffid;
}

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", staffid='" + staffid + '\'' +
                '}';
    }
}
