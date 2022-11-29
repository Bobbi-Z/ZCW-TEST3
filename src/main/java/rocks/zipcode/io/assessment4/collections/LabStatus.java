package rocks.zipcode.io.assessment4.collections;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * @author leon on 10/12/2018.
 * Ensure there are enumerations for, `COMPLETED`, `INCOMPLETE`, `PENDING`
 */
public enum LabStatus {
    COMPLETED("COMPLETED"),
    INCOMPLETE("INCOMPLETE"),
    PENDING("PENDING");

    private final String status;

    LabStatus(String status) {
        this.status = status;
    }

    public LabStatus usingStringValue(String status){
        switch (status){
            case "COMPLETED":
                return COMPLETED;
            case "INCOMPLETE":
                return INCOMPLETE;
            case "PENDING":
                return PENDING;
        }
        return null;
    }
}
