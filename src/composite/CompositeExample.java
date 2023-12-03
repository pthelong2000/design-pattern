package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeExample {

    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        Directory directory1 = new Directory("Folder 1");
        directory1.addComponent(file1);
        directory1.addComponent(file2);

        Directory directory2 = new Directory("Folder 2");
        directory2.addComponent(file3);
        directory2.addComponent(directory1);

        directory2.showInfo();
    }
}

// Component
interface FileSystemComponent {
    void showInfo();
}

// Leaf
class File implements FileSystemComponent {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("File: " + name);
    }
}

class Directory implements FileSystemComponent {

    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void showInfo() {
        System.out.println("Directory: " + name);
        components.forEach(FileSystemComponent::showInfo);
    }
}
