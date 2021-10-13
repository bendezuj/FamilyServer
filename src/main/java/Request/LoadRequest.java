package Request;

import Models.Event;
import Models.Person;
import Models.User;

/** This class is meant to fulfill the Load Request*/
public class LoadRequest {
    private User[] users;
    private Person[] persons;
    private Event[] events;

    public LoadRequest(User[] users, Person[] persons, Event[] events) {
        this.users = users;
        this.persons = persons;
        this.events = events;
    }
}

