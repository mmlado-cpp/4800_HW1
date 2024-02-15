package question4;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<File> files;
    private List<Folder> subFolders;

    public Folder(String name) {
        this.name = name;
        files = new ArrayList<>();
        subFolders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void print() {
        System.out.println("Folder: " + name);
        System.out.println("Files:");
        for (File file : files) {
            System.out.println("- " + file.getName());
        }
        System.out.println("Sub-folders:");
        for (Folder folder : subFolders) {
            folder.print();
        }
    }

    public void delete() {

        for (File file : files) {
            file.delete();
        }

        for (Folder folder : subFolders) {
            folder.delete();
        }

        System.out.println("Folder " + name + " deleted.");
    }
}
