// package IntegerSet;

public class IntegerSet {
    IntegerSet(){
        this.bolArr = bolArr;
    }
    boolean[] bolArr = new boolean[100];

    public static void writeSet(boolean[] set) {
        for (int i = 0; i < 100; i++)
            if(set[i] == true)
                System.out.print(i+1 + ", ");
        System.out.println();
    }

    public static boolean[] union(boolean[] s1, boolean[] s2){
        boolean[] result = new boolean[100];
        for(int i = 0; i< 100; i++)
            result[i] = s1[i] || s2[i];
        return result;
    }

    public static boolean[] intersection(boolean[] s1, boolean[] s2){
        boolean[] result = new boolean[100];
        for(int i = 0; i< 100; i++)
            result[i] = s1[i] && s2[i];
        return result;
    }

    public void insertElement(int x){
        this.bolArr[x-1] = true;
    }

    public void deleteElement(int x){
        this.bolArr[x-1] = false;
    }

    public String toString(){
        String result = "";
        for (int i = 0; i<100; i++)
            if(this.bolArr[i] == true)
                result = result.concat(String.valueOf(i+1) + " ");
        return result;
    }

    public boolean equals(boolean[] newArr){
        for (int i = 0; i< 100; i++)
            if(this.bolArr[i] != newArr[i])
                return false;
        return true;
    }

}
