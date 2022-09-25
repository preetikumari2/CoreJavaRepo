class Dishes {
    int menu(String name, int cost){
        return cost;
    }

    String menu(String taste){
        return taste;
    }
}

public class Hotel{
    public static void main(String[] args) {
        Dishes dishes = new Dishes();
        System.out.println("Taj Hotel");
        System.out.println(dishes.menu("Biriyani",1500));
        System.out.println("Dominos");
        System.out.println(dishes.menu("Pizza"));
    }
}