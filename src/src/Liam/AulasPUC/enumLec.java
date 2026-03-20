package Liam.AulasPUC;

public class enumLec {
    public static void main(String[] args) {
        // Enums are a new data type created by the APPLICATION!
        /* You would create a new data type because:
        -- the code's readability is improved
        -- the code's maintenance is eased
        -- Security reasons!
         */

        enum Week_Days {
            MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
        };

        // instantiate the recently created ENUM
        Week_Days day = Week_Days.MONDAY;

        String Weekday_in_Japanese ="";
        // let's say we want to make the code return the respective day of the week in japanese!
        switch (day) {
            case MONDAY -> Weekday_in_Japanese = "月曜日";
            case TUESDAY -> Weekday_in_Japanese = "火曜日";
            case WEDNESDAY -> Weekday_in_Japanese = "水曜日";
            case THURSDAY -> Weekday_in_Japanese = "木曜日";
            case FRIDAY -> Weekday_in_Japanese = "金曜日";
            case SATURDAY -> Weekday_in_Japanese = "土曜日";
            case SUNDAY-> Weekday_in_Japanese = "日曜日";
        };
        System.out.println("the day of the week: " + day + " in Japanese is: " + Weekday_in_Japanese);


    }
}
