public class Tuple<T, S> {
    private T value1;
    private S value2;

    public Tuple(T v1, S v2) {
        value1 = v1;
        value2 = v2;
    }

    public T getValue1() {
        return value1;
    }

    public S getValue2() {
        return value2;
    }
}
