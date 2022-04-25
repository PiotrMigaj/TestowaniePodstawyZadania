package pl.migibud.enums.ex1;

public enum Weekday {

    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    boolean isWeekDay(){
        return !this.isHoliday();
    }

    boolean isHoliday(){
        return this==SATURDAY||this==SUNDAY;
    }

    void whichIsGreater(Weekday weekday){

        if (this.ordinal()<weekday.ordinal()){
            System.out.println("Before: " + weekday);
        }else if (this.ordinal() == weekday.ordinal()){
            System.out.println("This is the same day");
        }else {
            System.out.println("After: "+ weekday);
        }

//        int comparator = this.compareTo(weekday);
//        System.out.println(comparator);
//
//        switch (comparator){
//            case -1:
//                System.out.println("Before: " + weekday);
//                break;
//            case 0:
//                System.out.println("This is the same day");
//                break;
//            case 1:
//                System.out.println("After: "+ weekday);
//                break;
//        }
    }

}
