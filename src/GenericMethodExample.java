class General{
    public <T, U> void information(T Var1, U Var2){
        System.out.println("Value of Var1: " + Var1);
        System.out.println("Value of Var2: " + Var2);
    }
}
public class GenericMethodExample {
    public static void main(String[] args) {
        General generalInformation = new General();
        generalInformation.information(30, 13.56);
    }

}
