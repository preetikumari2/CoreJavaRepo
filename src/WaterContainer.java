class SolContainer {
    public int maxArea(int[] height){
        int leftPointer = 0;
        int rightPointer = height.length-1;
        int max = 0;
        while(leftPointer < rightPointer){
            int leftPointerHeight = height[leftPointer];
            int rightPointerHeight = height[rightPointer];
            int min_height = Math.min(leftPointerHeight, rightPointerHeight);
            max = Math.max(max, min_height * (rightPointer - 1));
            if(leftPointerHeight < rightPointerHeight)
                leftPointer++;
            else
                rightPointer--;
        }
        return max;
    }
}
public class WaterContainer{
    public static void main(String[] args) {
        SolContainer container = new SolContainer();
        int a[] = { 1, 5, 4, 3 };
        int b[] = { 3, 1, 2, 4, 5 };
        System.out.println(container.maxArea(a));
        System.out.println(container.maxArea(b));
    }
}

