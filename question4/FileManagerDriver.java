package question4;

public class FileManagerDriver {
    public static void main(String[] args) {
        // Create folders and files
        Folder root = new Folder("php_demo1");

        // level 1
        Folder sourceFiles = new Folder("Source Files");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");

        // level 2
        // source files
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");

        // level 3
        // app
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        // public
        File htaccess = new File("htaccess");
        File htrouter = new File("htrouter");
        File index = new File("index.html");

        root.addSubFolder(sourceFiles);
        root.addSubFolder(includePath);
        root.addSubFolder(remoteFiles);

        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);

        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(views);

        publicFolder.addFile(htaccess);
        publicFolder.addFile(htrouter);
        publicFolder.addFile(index);

        root.print();

        System.out.println();

        app.delete(); // delete app folder

        publicFolder.delete(); // delete public folder

        System.out.println();
        
        root.print();

    }

}
