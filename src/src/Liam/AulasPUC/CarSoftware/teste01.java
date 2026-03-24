package Liam.AulasPUC.CarSoftware;

public class teste01 {
    public static final int MAX_X = 20;
    public static final int MAX_Y = 10;
    public static final int total_time = 1200;
    public static final int simulation_factor = 60;

    public static void main(String[] args) {
        car car1 = new car(10,0,0, Vehicle.DIRECTIONS.NORTH);
        car car2 = new car(30,0,0, Vehicle.DIRECTIONS.NORTH);
        car car3 = new car(20,0,0, Vehicle.DIRECTIONS.NORTH);

        car3.DisplayInfo();
        car1.DisplayInfo();
        car2.DisplayInfo();
    };

}
