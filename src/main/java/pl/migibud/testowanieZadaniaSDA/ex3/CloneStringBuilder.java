package pl.migibud.testowanieZadaniaSDA.ex3;

import org.jetbrains.annotations.NotNull;

public interface CloneStringBuilder {

    static @NotNull StringBuilder cloneSb(StringBuilder stringBuilder){
        StringBuilder newSb = new StringBuilder(stringBuilder);
        return newSb;
    }

}
