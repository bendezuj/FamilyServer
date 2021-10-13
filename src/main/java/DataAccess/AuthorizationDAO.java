package DataAccess;
import Models.Authorization;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/** We access the Authorization Database using this class */

public class AuthorizationDAO {
    private final Connection conn;

    public AuthorizationDAO(Connection conn)
    {
        this.conn = conn;
    }
    /** we use this function to authetincate access to a user */
    public void loginAccess(){

    }

}
