package qa;

import java.util.ArrayList;
import java.util.Random;

public class DataGenerator {
    public DataGenerator() {
    }

    public static ArrayList<Employer> generateEmployers() {
        Random rnd = new Random();
        int rnd2 = rnd.nextInt(1, 10);
        System.out.println(rnd2);
        ArrayList<Employer> list = new ArrayList();

        for(int i = 0; i < rnd2; ++i) {
            LevelEnum level = LevelEnum.randomLevel();
            PositionsEnum position = PositionsEnum.randomPosition();
            switch (position) {
                case Devops:
                    Devops d = new Devops();
                    d.setLevel(level);
                    d.setPosition(position);
                    list.add(d);
                    break;
                case QA:
                    QA qa = new QA();
                    qa.setLevel(level);
                    qa.setPosition(position);
                    list.add(qa);
                    break;
                case AQA:
                    AQA aqa = new AQA();
                    aqa.setLevel(level);
                    aqa.setPosition(position);
                    list.add(aqa);
            }
        }

        return list;
    }
}