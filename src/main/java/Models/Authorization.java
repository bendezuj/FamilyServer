package Models;
/** This class represents the authorization model, it's basic constructor, and getter/setter methods.*/
public class Authorization {

    private String token;
    private String userName;
    private String personId;

    public Authorization() {
    }

    public Authorization(String token, String userName, String personId) {
        this.token = token;
        this.userName = userName;
        this.personId = personId;
    }

    public String getToken() { return token; }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }
}
//