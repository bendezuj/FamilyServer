package DataAccess;

import Models.Person;
import Models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/** We use this to access the specified Database */

public class PersonDAO {
    private final Connection conn;

    public PersonDAO(Connection conn)
    {
        this.conn = conn;
    }

    /** Insertion in the database */
    public void insert(Person person) throws DataAccessException {
        //We can structure our string to be similar to a sql command, but if we insert question
        //marks we can change them later with help from the statement
        String sql = "INSERT INTO Person (personID, associatedUsername, firstName, lastName, gender, fatherID, motherID, spouseID) VALUES(?,?,?,?,?,?,?,?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            //Using the statements built-in set(type) functions we can pick the question mark we want
            //to fill in and give it a proper value. The first argument corresponds to the first
            //question mark found in our sql String
            stmt.setString(1, person.getPersonID());
            stmt.setString(2, person.getUserName());
            stmt.setString(3, person.getFirstName());
            stmt.setString(3, person.getLastName());
            stmt.setString(3, person.getGender());
            stmt.setString(1, person.getFatherID());
            stmt.setString(1, person.getMotherID());
            stmt.setString(1, person.getSpouseID());


            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new DataAccessException("Error encountered while inserting into the database");
        }
    }
    /** Finding in the database */
    public Person find(String personID) throws DataAccessException {
        Person person;
        ResultSet rs = null;
        String sql = "SELECT * FROM Person WHERE PersonID = ?;";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, personID);
            rs = stmt.executeQuery();
            if (rs.next()) {
                person = new Person(rs.getString("personID"), rs.getString("associatedUsername"), rs.getString("firstName"),
                        rs.getString("lastName"), rs.getString("gender"), rs.getString("fatherID"),
                        rs.getString("motherID") , rs.getString("spouseID"));
                return person;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException("Error encountered while finding event");
        } finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return null;
    }
    //Added
    /** Clear */
    public void clear(){
    }
    /** Find all Persons for a specific user */
    public void findPersons(User user){

    }

}
