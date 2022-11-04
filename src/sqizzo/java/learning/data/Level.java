package sqizzo.java.learning.data;

public enum Level {
    STANDARD("Standard level"),
    PREMIUM("Premium level"),
    VIP("VIP level"),;


    private final String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
