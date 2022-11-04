package sqizzo.java.learning.data;

public class Customer {
    private Level level;
    private String name;

    public Level getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String customerGetLevelDescription() {
        return level.getDescription();
    }
}
