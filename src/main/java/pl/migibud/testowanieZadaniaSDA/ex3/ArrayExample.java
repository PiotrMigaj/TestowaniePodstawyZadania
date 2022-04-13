package pl.migibud.testowanieZadaniaSDA.ex3;

public class ArrayExample {

    public static String[] nullDuplicates(String[] array) {

        if (array != null && array.length > 1) {
            String[] tmpArray = copyArrayOfStrings(array);
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (isArrayElementDuplicate(tmpArray[i],tmpArray[j],i,j )){
                        tmpArray[j]=null;
                    }
                }
            }
            return tmpArray;
        }
        return array;
    }

    public static String[] removeDuplicates(String[] array){

        String[] tmpStrArr1 = nullDuplicates(array);

        int counter = 0;
        for (String s:tmpStrArr1) {
            if (s!=null){

                counter++;
            }
        }

        String[] tmpStrArr2 = new String[counter];
        counter=0;
        for (String s:tmpStrArr1) {
            if (s!=null){
                tmpStrArr2[counter]=s;
                counter++;
            }
        }
        return tmpStrArr2;
    }


    public static int[] countNumberOfAppearances(String[] array) {

        int[] numberOfAppearances = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    counter++;
                }
            }
            numberOfAppearances[i] = counter;
        }
        return numberOfAppearances;
    }

    public static boolean isArrayElementDuplicate(String iString, String jString, int i, int j){

        if (iString==null||jString==null){
            return false;
        }
        if (iString.equals(jString)&&i!=j){
            return true;
        }
        return false;
    }

    public static String[] copyArrayOfStrings(String[] array){

        String[] strArr = new String[array.length];
        for (int i=0;i< array.length;i++){
            if (array[i]!=null){
                strArr[i]=new String(array[i]);
            }
        }
        return strArr;
    }

}
