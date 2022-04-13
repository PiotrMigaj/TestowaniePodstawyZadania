package pl.migibud.testowanieZadaniaSDA.ex3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArrayExampleTest {

    @Test
    void countNumberOfAppearances() {

        //given
        String[] strArray={"Jola","Ania","Ania"};
        int[] counterArray={1,2,2};

        //then
        assertArrayEquals(counterArray,ArrayExample.countNumberOfAppearances(strArray));
    }

    @Test
    void nullDuplicates() {
        //given
        String[] strArray=null;

        //then
        assertArrayEquals(null,ArrayExample.nullDuplicates(strArray));
    }

    @Test
    void nullDuplicates2() {
        //given
        String[] strArray= {"Ania"};

        //then
        assertArrayEquals(strArray,ArrayExample.nullDuplicates(strArray));
    }

    @Test
    void isArrayElementDuplicate() {
        //given
        String iString = "Ania";
        String jString = "Piotr";
        int i=0;
        int j=0;

        //then
        assertThat(ArrayExample.isArrayElementDuplicate(iString,jString, i,j)).isFalse();

    }

    @Test
    void isArrayElementDuplicate2() {
        //given
        String iString = "Ania";
        String jString = "Ania";
        int i=0;
        int j=0;

        //then
        assertThat(ArrayExample.isArrayElementDuplicate(iString,jString, i,j)).isFalse();

    }

    @Test
    void isArrayElementDuplicate3() {
        //given
        String iString = "Ania";
        String jString = "Ania";
        int i=0;
        int j=1;

        //then
        assertThat(ArrayExample.isArrayElementDuplicate(iString,jString, i,j)).isTrue();
    }

    @Test
    void isArrayElementDuplicate4() {
        //given
        String iString = null;
        String jString = "Ania";
        int i=0;
        int j=1;

        //then
        assertThat(ArrayExample.isArrayElementDuplicate(iString,jString, i,j)).isFalse();
    }

    @Test
    void isArrayElementDuplicate5() {
        //given
        String iString = "Ania";
        String jString = null;
        int i=0;
        int j=1;

        //then
        assertThat(ArrayExample.isArrayElementDuplicate(iString,jString, i,j)).isFalse();
    }

    @Test
    void isArrayElementDuplicate6() {
        //given
        String iString = null;
        String jString = null;
        int i=0;
        int j=1;

        //then
        assertThat(ArrayExample.isArrayElementDuplicate(iString,jString, i,j)).isFalse();
    }

    @Test
    void copyArrayOfStrings() {

        //given
        String[] strings = {"Ania","Piotr"};

        //when
        String[] strings1 = ArrayExample.copyArrayOfStrings(strings);
        strings1[1]="TOMEK";

        //then
        assertThat(strings).isNotEqualTo(strings1);

    }

    @Test
    void removeDuplicates() {

        //given

        String[] arr = {"Piotr","Ania","Piotr"};
        String[] arrTest = {"Piotr","Ania"};

        //when
        String[] arr2 = ArrayExample.removeDuplicates(arr);

        //then
        assertThat(arr2).isEqualTo(arrTest);

    }
}