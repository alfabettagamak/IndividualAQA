package patterns.depencyInjection;

public class User {
    public String firstName;
    public String secondName;
    public String middleName;

    public User(String firstName, String secondName, String middleName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
    }
}
