package pl.migibud.localdatesord;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MyClassOfDates {

    List<LocalDate> localDateList = new ArrayList<>();

    public void addDateToRepo(LocalDate localDate){
        localDateList.add(localDate);
    }

}
