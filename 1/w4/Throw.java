public class Throw {
    public static void main(String[] args) {
        throwsAnException();
    }

    public static void throwsAnException() throws Exception {
        if (Math.random() < 0.5) {
            System.out.println("Error.");
            // this is a checked exception
            throw new Exception("random error message");
        } else {
            System.out.println("No error.");
        }
    }
}
