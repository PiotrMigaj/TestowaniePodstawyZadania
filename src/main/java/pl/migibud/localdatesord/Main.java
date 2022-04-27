package pl.migibud.localdatesord;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {


        MyClassOfDates myClassOfDates = new MyClassOfDates();
        myClassOfDates.addDateToRepo(LocalDate.of(1992,4,12));
        myClassOfDates.addDateToRepo(LocalDate.of(1994,4,12));
        myClassOfDates.addDateToRepo(LocalDate.of(1992,3,12));

        System.out.println(myClassOfDates.localDateList);

//        Comparator<LocalDate> localDateComparator = new Comparator<LocalDate>() {
//            @Override
//            public int compare(LocalDate o1, LocalDate o2) {
//                LocalDate now = LocalDate.now();
//                long diffO1 = ChronoUnit.DAYS.between(now,o1);
//                long diffO2 = ChronoUnit.DAYS.between(now,o2);
//                return (int)(diffO1-diffO2);
//            }
//        };

        Comparator<LocalDate> localDateComparator = (o1, o2) ->  {
                LocalDate now = LocalDate.now();
                long diffO1 = ChronoUnit.DAYS.between(now,o1);
                long diffO2 = ChronoUnit.DAYS.between(now,o2);
                return (int)(diffO1-diffO2);
        };

        myClassOfDates.localDateList.sort(localDateComparator);
        System.out.println(myClassOfDates.localDateList);



    }

}
