package Request;


/** This class is meant to fulfill the Fill Request*/

public class FillRequest {
    private Integer generations;
    private String userName;
    public FillRequest(Integer generations, String userName) {
        this.generations = generations;
        this.userName = userName;
    }
    public FillRequest(){

    }
}
