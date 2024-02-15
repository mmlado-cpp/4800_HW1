package question2;

public class Ship {
    private String name;
    private String buildDate;

    public Ship(String name, String buildDate) {
        this.name = name;
        this.buildDate = buildDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(String buildDate) {
        this.buildDate = buildDate;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Build Date: " + buildDate;
    }

}
