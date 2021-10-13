package Results;

/** This class is meant to respond to the IDResult Request*/
public class PersonIDResult extends ErrorResult{
    private String username;
    private String personID;
    private String firstName;
    private String lastName;
    private String gender;
    private String fatherID;
    private String motherID;
    private String spouseID;

    public PersonIDResult(String username, String personID, String firstName, String lastName, String gender) {
        this.username = username;
        this.personID = personID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

}
