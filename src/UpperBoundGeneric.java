import java.util.ArrayList;
import java.util.List;

public class UpperBoundGeneric {
    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        double sum = sum(numberList);
        System.out.println("sum = " + sum);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(45);
        integerList.add(46);
        integerList.add(48);
        sum = sum(integerList);
        System.out.println("sum = " + sum);

    }
    public static double sum(List<? extends Number> list){
        double sum = 0;
        for(Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }
}