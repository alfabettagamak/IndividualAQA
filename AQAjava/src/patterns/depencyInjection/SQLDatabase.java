package patterns.depencyInjection;

public class SQLDatabase implements IDataBase {


    public User[] getUsers(){
        System.out.println("connection to SQL db");
        User user = new User("Ivan", "Ivanov", "Ivanovich");
        User user2 = new User("Ivan", "Ivanov", "Pertovich");
        return new User[] {user, user2};
    }
}
