public class TravelAgency {
    public static void main(String[] args) {
        OlaCab olacab = new UberCab();
        olacab.Transport();
    }
}

class OlaCab{
    void Transport(){
        System.out.println("My service is Fast");
    }
}

class UberCab extends OlaCab{
    void Transport(){
        System.out.println("My Service is faster than Ola");
    }
}
