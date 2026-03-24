package Liam.AulasPUC.CarSoftware;

import static Liam.AulasPUC.CarSoftware.teste01.total_time;

public class car extends Vehicle{
    final int hour = 3600;

    // temp var total_time;


    car(float speed, float x_coordinates, float y_coordinates, DIRECTIONS directions) {
        super(speed, x_coordinates, y_coordinates, directions);
    }

    @Override
    public void UpdateSpeed(float x_axis, float y_axis) {

        float delta_x = Math.abs(x_axis - x_cord);
        float delta_y = Math.abs(y_axis - y_cord);
        float total_displacement = delta_x + delta_y;
        speed = (total_displacement/ total_time) * hour;
    }


    public void UpdateDirection(float x_axis, float y_axis) {
        switch (directions) {
            case EAST,WEST -> {
                if (y_axis < y_cord) directions = DIRECTIONS.SOUTH;
                else if (y_axis > y_cord) directions = DIRECTIONS.NORTH;
            }
            case NORTH,SOUTH -> {
                if (x_axis < x_cord) directions = DIRECTIONS.WEST;
                else if (x_axis > x_cord) directions = DIRECTIONS.EAST;
            }
        }

    }


    public void UpdateCoords(float x_axis_position, float y_axis_position) {
        UpdateSpeed(x_axis_position,y_axis_position);
        UpdateDirection(x_axis_position,y_axis_position);
        x_cord = x_axis_position;
        y_cord = y_axis_position;

    }
}
