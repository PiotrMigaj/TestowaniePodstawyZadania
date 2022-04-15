package pl.migibud.workexamples.funcinter.accounttest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class AccountOpp {

    private String oppName;
    private int ammount;
    private LocalDateTime localDateTime;

    public AccountOpp(String oppName, int ammount ) {
        this.oppName = oppName;
        this.ammount = ammount;
        this.localDateTime  = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "AccountOpp{" +
                "oppName='" + oppName + '\'' +
                ", ammount=" + ammount +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
