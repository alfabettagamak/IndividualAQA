package patterns.depencyInjection;

public class UserService {

    public IDataBase db;

    public UserService(IDataBase db) {
        this.db = db;
    }

    public User findUserById(int id){
        User[] users = db.getUsers();
        return users[id];
    }
}
