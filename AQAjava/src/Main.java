import patterns.adapter.Adapter;
import patterns.adapter.Fist;
import patterns.adapter.Second;
import patterns.depencyInjection.MongoDatabase;
import patterns.depencyInjection.SQLDatabase;
import patterns.depencyInjection.UserService;
import patterns.factory.qa.LevelEnum;
import patterns.factory.qa.SalaryAQA;
import patterns.singleton.DataBaseClient;
import patterns.builder.Builder;
import patterns.builder.User;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        String startPath = "/Users/alisa_school/java_lessons/IndividualAQA/AQAjava/src/ololo/";
        Path path = Path.of(startPath + "example.txt");
        Path path2 = Path.of(startPath + "example2.txt");
        if (!Files.exists(path)){
            Files.createFile(path);
        }

        //Files.createDirectory(Path.of("/Users/alisa_school/java_lessons/IndividualAQA/AQAjava/src/ololo"));
        //Files.deleteIfExists(path);
        String file = Files.readString(path);
        List<String> strListFile = Files.readAllLines(path);
        // System.out.println(file);

        byte[] arrayByte = Files.readAllBytes(path);
        for (byte item: arrayByte){
            System.out.println(item + " ");
        }
        Files.writeString( Path.of(startPath + "example2.txt"), "HGIUGGYUYGGUI \n jhfhgfkghfjh&nbsp \nsfsdf ");

        InputStream inputStream = Files.newInputStream(path);
        OutputStream outputStream = Files.newOutputStream(path2);
        while (true) {
            if (inputStream.available() > 0) {
                int data = inputStream.read();
                System.out.println(data);
                if (data == 76) break;
                outputStream.write(data);
            }
        }
            inputStream.close();
            outputStream.close();


//        SalaryAQA aqa = new SalaryAQA();
//        aqa.calculateSalary(LevelEnum.SENIOR);
//
//        Fist first = new Fist();
//        Adapter adapter = new Adapter(new Second());
//        adapter.printList(first.number);
//
//        UserService userService = new UserService(new MongoDatabase());
//        userService.findUserById(0);
//
//        DataBaseClient db = DataBaseClient.getInstance();
//        DataBaseClient db1 = DataBaseClient.getInstance();
//
//        Builder builder = new Builder();
//        User user = builder.withName("Alsu").withAge(25).withMiddleName("Ivanova").build();
    }

}

