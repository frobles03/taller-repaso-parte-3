import java.util.ArrayList;

public class Departament {

    private String name;
    public Employee managedBy;
    private ArrayList<Employee>employeeArrayList;
    private ArrayList<Office>officeArrayList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
