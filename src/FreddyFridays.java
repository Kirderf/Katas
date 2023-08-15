import java.time.*;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class FreddyFridays {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 2023; i < 3000; i++) {
            if (countFridays(i) == 3) ints.add(i);
        }
        System.out.println(ints);
    }
    public static int countFridays(int year){
        AtomicInteger counter = new AtomicInteger(0);
        LocalDate.of(year,1,1).datesUntil(LocalDate.of(year,12,31)).forEach(s -> {
                if ((s.getDayOfMonth() == 13) && (s.getDayOfWeek() == DayOfWeek.FRIDAY)){
                counter.getAndIncrement();
            }
        });
        return counter.get();
    }

}
