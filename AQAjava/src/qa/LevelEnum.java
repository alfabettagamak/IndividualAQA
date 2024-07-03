package qa;

import java.util.Random;

public enum LevelEnum {
    JUNIOR("специалист", 1),
    MIDDLE("ст. специалист", 2),
    SENIOR("вед. специалист", 3);

    LevelEnum(String value, int koef){
        this.value = value;
        this.koef = koef;
    }

    public String value;
    public int koef;

    private static final Random PRNG = new Random();

    public static LevelEnum randomLevel()  {
        LevelEnum[] level = values();
        return level[PRNG.nextInt(level.length)];
    }
}

