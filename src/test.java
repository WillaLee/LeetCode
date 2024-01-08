public class test {

    public static void plus(Integer a, Integer b) {
        a = a + b;
    }
    public static void main(String[] args) {
        Integer a = 2;
        Integer b = 3;

        plus(a, b);

        System.out.println(a);
    }
}
