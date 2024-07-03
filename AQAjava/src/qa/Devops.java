//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package qa;

import java.util.Objects;

public class Devops implements Employer {
    private final float koeff = 1.7F;
    private LevelEnum level = null;
    private PositionsEnum position = null;

    public Devops() {
    }

    public LevelEnum getLevel() {
        return this.level;
    }

    public PositionsEnum getPosition() {
        return this.position;
    }

    public float getKoeff() {
        Objects.requireNonNull(this);
        return 1.7F;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    public void setPosition(PositionsEnum position) {
        this.position = position;
    }

    public void doWork() {
        switch (this.level) {
            case JUNIOR:
                this.editYaml();
                break;
            case MIDDLE:
                this.deploy();
                this.editYaml();
                break;
            case SENIOR:
                this.deploy();
                this.editYaml();
                this.huntNewDevopses();
        }

    }

    private void deploy() {
        System.out.println("Deploy");
    }

    private void editYaml() {
        System.out.println("EditYaml");
    }

    private void huntNewDevopses() {
        System.out.println("hunting");
    }
}
