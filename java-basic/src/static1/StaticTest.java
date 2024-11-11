package static1;

public class StaticTest {

    class Math1 {
        int a,b;
        int add() {
            return a + b;
        }

        static int add(int a, int b) {
            return a+b;
        }
    }

    public static void main(String[] args) {
        System.out.println(Math1.add(1,2));
    }
}
