abstract class Staff {
    protected int id;
    protected String name;

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void displayDetails();
}

class OfficeStaff extends Staff {
    private String department;

    public OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class SetA2 {
    public static void main(String[] args) {
        int n = 3;  

        OfficeStaff[] officeStaffArray = new OfficeStaff[n];
        officeStaffArray[0] = new OfficeStaff(101, "John Doe", "HR");
        officeStaffArray[1] = new OfficeStaff(102, "Jane Smith", "Finance");
        officeStaffArray[2] = new OfficeStaff(103, "Michael Johnson", "IT");

        for (int i = 0; i < n; i++) {
            System.out.println("Details for Office Staff " + (i + 1) + ":");
            officeStaffArray[i].displayDetails();
            System.out.println();  
        }
    }
}

