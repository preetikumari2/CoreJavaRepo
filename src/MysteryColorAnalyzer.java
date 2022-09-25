import java.util.List;

interface MysteryColorAnalyzer {
    int numberOfDistinctColors(List<Color> mysteryColors);
    int colorOccurrence(List<Color> mysteryColors, Color color);
}
enum Color{
    RED,GREEN,BLUE;
}
