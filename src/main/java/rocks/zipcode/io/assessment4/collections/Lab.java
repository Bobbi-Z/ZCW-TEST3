package rocks.zipcode.io.assessment4.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {

    private static String name;
    private LabStatus status;

    public Lab() {
        this(null);
    }

    public Lab (String name){
        this.name = name;
    }


//    public Lab(String name, LabStatus status) {
//        setName(name);
//        setStatus(status);
//    }
//    public void setName(String name){
//        this.name = name;
//    }

    public static String getName() {
        return name;
    }

    public void setStatus(LabStatus status) {
        this.status = status;
    }

    public LabStatus getStatus() {
        return status;
    }
}
