
public class Holiday {
    private String name;
    private int day;
    private String month;

    public int getDay() {

        return day;
    }

    public String getMonth() {
        return month;
    }

    public Holiday(String name, int day, String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public static Boolean inSameMonth(Holiday holiday, Holiday holiday1) {
        if (holiday1.getMonth() == (holiday.getMonth())) {
            return true;
        } else {
            return false;
        }

    }

    public static double avgDate(Holiday[] holiday)
    {
        int sum=0;
        for (Holiday h : holiday)
        {
            sum += h.getDay();
        }

        return (sum/(holiday.length));
    }


    public static void main(String[] args){
        Holiday[] holiday = new Holiday[2];
        Holiday Holi = new Holiday("Independence Day", 4, "july");
        Holiday Holi2 = new Holiday("Holiday", 4, "july");
        holiday[0] = Holi;
        holiday[1] = Holi2;
        System.out.println(inSameMonth(Holi, Holi2));
        System.out.println(avgDate(holiday));

    }

}
