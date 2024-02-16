package question4;

public class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("File: " + name);
    }

    public void delete() {
        System.out.println("File " + name + " deleted.");
    }
}
