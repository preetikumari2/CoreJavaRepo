public class GenericPractice<T>{
    T value;
    public GenericPractice(T value){
        this.value = value;
    }
    public void printValue(){
        System.out.println(value);
    }

    public static void main(String[] args) {
        GenericPractice<Integer> obj = new GenericPractice<>(12);
        GenericPractice<String> obj2 = new GenericPractice<>("hello");
        obj.printValue();
        obj2.printValue();
    }

}

