import java.io.File;

public class Tree {
    public static void main(String[] args) {
        printFiles(new File(args[0]));
    }

    public static void printFiles(File dir) {
        for (File f : dir.listFiles()) {
            if (f.isDirectory()) {
                printFiles(f);
            } else {
                System.out.println(f);
            }
        }
    }
}
