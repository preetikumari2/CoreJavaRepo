import java.util.ArrayList;
import java.util.List;

public class LowerBoundGeneric {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(45);
        integerList.add(46);
        integerList.add(48);
        print(integerList);


        List<Number> numberList = new ArrayList<>();
        numberList.add(23.4);
        numberList.add(25.4f);
        numberList.add(26);
        print(numberList);
    }
    public static void print(List<? super Integer> list){
        System.out.println(list);
    }
}
