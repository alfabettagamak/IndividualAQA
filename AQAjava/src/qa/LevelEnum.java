package qa;

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

}
