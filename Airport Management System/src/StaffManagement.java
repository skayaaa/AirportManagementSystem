import java.util.ArrayList;
import java.util.List;

public class StaffManagement {
public static List<Staff> staffList;
    public StaffManagement() {
        this.staffList = new ArrayList<Staff>();
    }
    public void addStaff(Staff staff) {
        staffList.add(staff);
    }
public void updateStaff(Staff staffid,
                        Staff updatedStaff) {
        for (Staff staff : staffList) {
            if (staff.getStaffid().equals(staffid)) {
                staff.setName(updatedStaff.getName());
                staff.setRole(updatedStaff.getRole());
                break;
            }
        }
}

public static void assignShift(String staffid, String shift) {
        for (Staff staff : staffList) {
            if (staff.getStaffid().equals(staffid)) {
            System.out.println("Assigned" + staff.getName() + " to " + shift + "shift.");
            break;
            }
        }
}

public List<Staff> viewStaff() {
        return staffList;
}

}
