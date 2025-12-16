import java.util.EnumSet;
import java.util.EnumMap;
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}


class Enum_map_set_07{
    public static void main(String[] args) {
        EnumSet<Day> workingDays = EnumSet.of(
            Day.MONDAY, Day.TUESDAY
        );

        for (Day d : workingDays) {
            System.out.println(d);
        }


        // EnumMap
        EnumMap<Day,String> schedule = new EnumMap<>(Day.class);

        schedule.put(Day.MONDAY,"Office");
        schedule.put(Day.TUESDAY,"Gym");
        schedule.put(Day.THURSDAY,"Study");

        System.out.println(schedule.get(Day.TUESDAY));
    }
}