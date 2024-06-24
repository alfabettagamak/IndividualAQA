package patterns.singleton;

public class DataBaseClient {

    private static DataBaseClient instance;

    private DataBaseClient() {
        System.out.println("connect to db");
    }

    public static DataBaseClient getInstance(){
        if (instance == null) {
            instance = new DataBaseClient();
        }
        return instance;
    }





}
