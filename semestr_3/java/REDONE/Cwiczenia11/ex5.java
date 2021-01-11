// import java.util.LinkedList;

// public class ex5 {
//     public static void main(String[] args) {
//         LinkedList<String> ll1 = new LinkedList<>();
//         LinkedList<Integer> ll2 = new LinkedList<>();
//         LinkedList<Character> ll3 = new LinkedList<>();
//         ll1.add("Pracownik 1");
//         ll1.add("Pracownik 2");
//         ll1.add("Pracownik 3");
//         ll2.add(1);
//         ll2.add(2);
//         ll2.add(3);
//         ll3.add('A');
//         ll3.add('B');
//         ll3.add('C');

//         System.out.println(ll1);
//         System.out.println(ll2);
//         System.out.println(ll3);
//         odwroc(ll1);
//         odwroc(ll2);
//         odwroc(ll3);
//         System.out.println(ll1);
//         System.out.println(ll2);
//         System.out.println(ll3);
//     }

//     public static<T> void odwroc(LinkedList<T> tab){
//         T tmp;
//         for (int i = 0; i < tab.size()/2; i++){
//             tmp = tab.get(i);
//             tab.set(i, tab.get(tab.size() - i - 1));
//             tab.set(tab.size() - i - 1, tmp);
//         }
//     }
// }
