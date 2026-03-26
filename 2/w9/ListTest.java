public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (String a : args) {
            list.insert(0, a);
        }
        while (!list.isEmpty()) {
            System.out.println(list.removeAt(0));
        }
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i));
        // }
    }
}
