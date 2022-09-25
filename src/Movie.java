public class Movie{
    private final String title;
    private final String studio;
    private final String rating;

    public String getStudio() {
        return studio;
    }
    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio=studio;
        this.rating=rating;
    }
    public Movie(String title, String studio) {
        this.title = title;
        this.studio=studio;
        this.rating="PG";
    }
    public String getName(){
        return title;
    }
    public Movie[] getPG(Movie[] movies){
        Movie[] PGMovie=new Movie[movies.length];
        int arrayindex=0;
        for (Movie m: movies){
            if (m.rating.equals("PG")) {
                PGMovie[arrayindex]=m;
                arrayindex++;
            }
        }
        return PGMovie;
    }


    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG-13");
        Movie movie2 = new Movie("Avatar", "lightstrom Entertainments");
        Movie movie3 = new Movie("Death Note", "Eon Productions");
        Movie[] mov = new Movie[3];
        mov[0] = movie1;
        mov[1] = movie2;
        mov[2] = movie3;
        for (Movie m: (mov[0].getPG(mov))){
            if (m!=null)
                System.out.print(m.getName()+" ");
        }
    }
}
