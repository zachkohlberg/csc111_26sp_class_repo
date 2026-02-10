public class Throw {
    public static void main(String[] args) {
        maybeError();
    }

    public static void maybeError() throws Exception {
        if (Math.random() < 0.5) {
            System.out.println("Uh oh...");
            throw new Exception("random error");
        } else {
            System.out.println("Lucky you, there was no error.");
        }
    }
}
