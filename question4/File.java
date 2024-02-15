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
        // Additional code to actually delete the file from the file system goes here
        // For simplicity, let's just print a message indicating deletion
        System.out.println("File " + name + " deleted.");
    }
}
