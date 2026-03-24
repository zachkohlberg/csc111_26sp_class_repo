public class Tuple<T1, T2> {
    private T1 value1;
    private T2 value2;

    public Tuple(T1 v1, T2 v2) {
        value1 = v1;
        value2 = v2;
    }

    public T1 v1() {
        return value1;
    }

    public T2 v2() {
        return value2;
    }
}
