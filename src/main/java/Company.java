import java.util.ArrayList;

public class Company {

    protected String name;
    protected ArrayList<Departament>departamentArrayList;

    protected void company(){
        getName();
        setName(name);
    }
    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
