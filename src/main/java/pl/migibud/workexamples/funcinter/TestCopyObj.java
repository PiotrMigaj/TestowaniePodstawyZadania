package pl.migibud.workexamples.funcinter;

import java.util.Arrays;

class Boss{

    private String name;

    public Boss(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                '}';
    }
}


public class TestCopyObj {
    public static void main(String[] args) {

        Boss[] bosses = new Boss[]{new Boss("Piotr"),new Boss("Ania")};

        Boss[] bosses1 = new Boss[2];

        for(int i =0;i<2;i++){
            bosses1[i]=bosses[i];
        }

        System.out.println(Arrays.toString(bosses));
        System.out.println(Arrays.toString(bosses1));

        //System.out.println(bosses[1]==bosses1[0]);
        bosses1[1].setName("Basia");
        System.out.println(bosses[1]==bosses1[1]);

        System.out.println(Arrays.toString(bosses));
        System.out.println(Arrays.toString(bosses1));
//
//        String[] arr = new String[]{"Piotr","Ania"};
//
//        String[] arr1 = new String[2];
//
//        for(int i =0;i<2;i++){
//            arr1[i]=arr[i];
//        }
//
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr1));
//
//
//        arr1[1]="Basia";
//
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr1));



    }
}
