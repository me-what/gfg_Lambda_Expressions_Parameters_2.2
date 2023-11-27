public class Main {
    public static void main(String[] args) {
        fun2(p -> System.out.println(p), 10);
    }

    static void fun2(Test2 t, Integer p) {
        t.print(p);
    }
}