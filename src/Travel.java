public class Travel {
    String Booking = "Bangalore";
}

class Ola extends Travel{
    int olaNumber = 123;
}

class SharingOla extends Ola{
    public static void main(String[] args) {
        SharingOla SO = new SharingOla();
        System.out.println(SO.Booking);
        System.out.println(SO.olaNumber);
    }
}

