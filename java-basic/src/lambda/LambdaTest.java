package lambda;

public class LambdaTest {

    public interface MyAdd {
        int add(int x, int y);
    }


    public static void main(String[] args) {
        MyAdd a = (x,y) -> { return x+y; };

        int result = a.add(1, 2);
        System.out.println(result);

    }






}
