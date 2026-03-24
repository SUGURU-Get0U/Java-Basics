package Liam.AulasPUC.CarSoftware;

public abstract class Vehicle{
    private int count = 0;
    private static int id;
    protected float speed;
    protected float x_cord;
    protected float y_cord;
    enum DIRECTIONS {
        NORTH,SOUTH,EAST,WEST
    };
    protected DIRECTIONS directions;

    // Class Constructor
    Vehicle(float speed, float x_coordinates, float y_coordinates, DIRECTIONS directions){
        this.speed = speed;
        this.x_cord = x_coordinates;
        this.y_cord = y_coordinates;
        this.directions = directions;
        id = count;
        count++;
    };

   public abstract void UpdateSpeed(float total_displacement, float time);
   public abstract void UpdateDirection(float x_axis, float y_axis);
   public abstract void UpdateCoords(float x_axis_position, float y_axis_position);

   public void DisplayInfo() {
       System.out.println("Car number: " + id + ": ");
       System.out.printf("Live coords: x = %.2f, y = %.2f%n", x_cord, y_cord);
       System.out.printf("Live speed: %.2f%n", speed);
       System.out.printf(String.format("Heading direction: " + directions));
       System.out.println("----------------------------------------------");
   }

;}
