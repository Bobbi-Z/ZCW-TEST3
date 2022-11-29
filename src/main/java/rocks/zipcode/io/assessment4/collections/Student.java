package rocks.zipcode.io.assessment4.collections;


import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    List<Lab> labsList;

    public Student() {
        this(null);
        labsList = new LinkedList<>();
    }

    public Student(List<Lab> labsList) {
        this.labsList = labsList;
    }

    public Lab getLab(String labName) {
        for (Lab lab : labsList){
            if (Objects.equals(lab.getName(), labName)){
                return lab;
            }
        }
        System.out.println("There are no labs by that name!");
       return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
       Lab lab = getLab(labName);
      try {
          lab.setStatus(labStatus);
      }catch (Exception UnsupportedOperationException){
          throw new UnsupportedOperationException();
      }
    }

    public void forkLab(Lab lab) {
        labsList.add(lab);
        lab.setStatus(LabStatus.PENDING);

    }

    public LabStatus getLabStatus(String labName) {
       Lab lab = getLab(labName);
        return lab.getStatus();
    }

    @Override
    public String toString() {
        String completeList = "";
        for (int index = labsList.size()-1; index >= 0; index--){
            String output = labsList.get(index).getName() + " > " + labsList.get(index).getStatus().toString() + "\n";
            completeList += output;
        }
        return completeList;
    }
}
