import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



class FindMysteryColor implements MysteryColorAnalyzer {
    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors){
        boolean color1 = false, color2 = false, color3 = false;
        for(Color c : mysteryColors){
            if(c.equals(Color.RED))
                color1 = true;
            else if( c.equals(Color.GREEN))
                color2 = true;
            else if(c.equals(Color.BLUE))
                color3 = true;
        }

        int distColor = 0;

        if(color1 || color2 && color3)
            distColor++;
        return distColor;
    }

    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {

        int count = 0;
        for (Color c : mysteryColors) {
            if (c.equals(color))
                count++;
        }
        return count;
    }
}

public class MysteryColor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<Color> mysteryColors = new ArrayList<>();
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            String colors = sc.next();
            if(colors.equals("RED"))
                mysteryColors.add(Color.RED);
            else if (colors.equals("GREEN"))
                mysteryColors.add(Color.GREEN);
            else
                mysteryColors.add(Color.BLUE);
        }
        FindMysteryColor findColor = new FindMysteryColor();
        System.out.println(findColor.numberOfDistinctColors(mysteryColors));
        System.out.println(findColor.colorOccurrence(mysteryColors, Color.RED));
        System.out.println(findColor.colorOccurrence(mysteryColors, Color.GREEN));
        System.out.println(findColor.colorOccurrence(mysteryColors, Color.BLUE));
    }
}

