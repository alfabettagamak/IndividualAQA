//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package qa;

import java.util.Random;

public enum PositionsEnum {
    Devops("девопс", 1),
    QA("инженер по обеспечению качества", 2),
    AQA("автоматизатор", 3);

    public String value;
    public int koef;
    private static final Random PRNG = new Random();

    private PositionsEnum(String value, int koef) {
        this.value = value;
        this.koef = koef;
    }

    public static PositionsEnum randomPosition() {
        PositionsEnum[] position = values();
        return position[PRNG.nextInt(position.length)];
    }
}
