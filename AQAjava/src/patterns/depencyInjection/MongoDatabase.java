package patterns.depencyInjection;

public class MongoDatabase implements IDataBase {


    public User[] getUsers(){
        System.out.println("connection to Mongo db");
        User user = new User("Ivan", "Ivanov", "Ivanovich");
        User user2 = new User("Ivan", "Ivanov", "Pertovich");
        return new User[] {user, user2};
    }
}
