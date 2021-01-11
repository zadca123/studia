import java.util.*;

public class IntegerSet{
    IntegerSet(){
        this.bolArr = bolArr;
    }
    boolean[] bolArr = new boolean[100];

    public static void writeSet(boolean[] bolArr){
        for (int i = 0; i < 100; i++)
            if (bolArr[i] == true)
                System.out.print(i+1 +", ");
        System.out.println();
    }

    public static boolean[] union(boolean[] s1, boolean[] s2){
        boolean[] result = new boolean[100];
        for (int i = 0; i<100; i++)
            if (s1[i] == true || s2[i] == true)
                result[i] = true;
            else
                result[i] = false;
        return result;
    }

    public static boolean[] intersection(boolean[] s1, boolean[] s2){
        boolean[] result = new boolean[100];
        for (int i = 0; i<100; i++)
            if (s1[i] == false || s2[i] == false)
                result[i] = false;
            else
                result[i] = true;
        return result;
    }

    public void insertElement(int index){
        bolArr[index] = true;
    }

    public void deleteElement(int index){
        bolArr[index] = false;
    }

    public String toString(){
        String result = "";
        for (int i = 0; i<bolArr.length; i++)
            if(bolArr[i] == true)
                result = result.concat(String.valueOf(i+1) + " ");
        return result;
    }

    public boolean equals(boolean[] barr){
        for (int i = 0; i<bolArr.length; i++)
            if(bolArr[i] != barr[i]){
                System.out.println("false");
                return false;
            }
        System.out.println("true");
        return true;
    }
}
