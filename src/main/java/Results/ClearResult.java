package Results;

import javax.naming.spi.DirStateFactory;

/** This class is meant to respond to the Clear Response */
public class ClearResult extends ErrorResult {
    private String message;
    private Boolean success;
    ClearResult(){
    }
}
