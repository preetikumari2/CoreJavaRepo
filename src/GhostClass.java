import java.util.Random;

class Ghost{
    String[] colors = {"white", "yellow","purple","red"};
    public String getColor()
    {
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
public class GhostClass {
    public static void main(String[] args) {
        Ghost ghost1 = new Ghost();
        Ghost ghost2 = new Ghost();
        Ghost ghost3 = new Ghost();
        System.out.println(ghost1.getColor());
        System.out.println(ghost2.getColor());
        System.out.println(ghost3.getColor());
    }

}


