package generics;

public class ParametrizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("HI!");
        System.out.println(info1);
        String s = info1.getValue();
        System.out.println(s);

        Info<Integer> info2 = new Info<>(3);
        System.out.println(info2);
        Integer s1 = info2.getValue();
        System.out.println(s1);
    }
}
class Info<T> {
    private T value;
    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}

