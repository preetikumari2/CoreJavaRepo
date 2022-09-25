import java.util.Scanner;
class Library{
    public String Book;
    public String Video;
    public String NewsPaper;

    public Library(String Book, String Video, String NewsPaper) {
        this.Book = Book;
        this.Video = Video;
        this.NewsPaper = NewsPaper;
    }
    public void displayLibrary() {
        System.out.println("Book name is : " + Book);
        System.out.println("Video is : " + Video);
        System.out.println("Newspaper is : " + NewsPaper);
    }
}

class GenericLib <T> {
    T book, video, newsPaper;

    public GenericLib(T book, T video, T newsPaper) {
        this.book = book;
        this.video = video;
        this.newsPaper = newsPaper;
    }
    public void printGenericLibrary()
    {
        System.out.println("Book name is : " + book);
        System.out.println("Video is : " + video);
        System.out.println("NewsPaper is : " + newsPaper);
    }
}
public class GenericLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the media for Library: ");
        String Video = sc.nextLine();
        String Book = sc.nextLine();
        String NewsPaper = sc.nextLine();
        Library media1 = new Library(Video, Book, NewsPaper);
        System.out.println("Library has:");
        media1.displayLibrary();
        System.out.println("--------------------");
        System.out.println("Enter the media for Generic Library");
        String video = sc.nextLine();
        String book = sc.nextLine();
        String newsPaper = sc.nextLine();
        GenericLib<String> genericMedia = new GenericLib<>(video, book, newsPaper);
        System.out.println("GenericLibrary has:");
        genericMedia.printGenericLibrary();
    }
}