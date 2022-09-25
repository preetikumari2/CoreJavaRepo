interface CheckLength
{
    void test(int num1, int num2);
}
public class LambdaExpressionDemo {
    public static void main(String[] args) {
        CheckLength l=(int num1, int num2)->
                System.out.println(num1 + num2);

        l.test(4, 8);
        l.test(2,6);

    }
}
