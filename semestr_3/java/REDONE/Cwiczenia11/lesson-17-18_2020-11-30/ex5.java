import java.util.Stack;
import java.util.*;

public class ex5{
    public static void main(String[] args) {
        Stack<String> zdanie = new Stack<String>();
        // zdanie.add("Ala ma kota. Jej kot lubi myszy.");
        zdanie.add("Ala ");
        zdanie.add("ma ");
        zdanie.add("kota ");
        zdanie.add(". ");
        zdanie.add("Jej ");
        zdanie.add("kot ");
        zdanie.add("lubi ");
        zdanie.add("myszy ");
        zdanie.add(". ");

        // System.out.println(zdanie.size());
        // for(String elem: zdanie)
        //     System.out.print(elem);

        // System.out.println(zdanie.pop());

        // for(String elem: zdanie)
        //     System.out.print(elem);
        reverseStack(zdanie);
        printStack(zdanie);
    }
    // public static void odwroc(Stack<String> zdanie){

    // }

    public static <T> void reverseStack(Stack<T> stack) {
        if (stack.isEmpty()) {
            return;
        }
        // Remove bottom element from stack
        T bottom = popBottom(stack);

        // Reverse everything else in stack
        reverseStack(stack);

        // Add original bottom element to top of stack
        stack.push(bottom);
    }
    private static <T> T popBottom(Stack<T> stack) {
        T top = stack.pop();
        if (stack.isEmpty()) {
            // If we removed the last element, return it
            return top;
        } else {
            // We didn't remove the last element, so remove the last element from what remains
            T bottom = popBottom(stack);
            // Since the element we removed in this function call isn't the bottom element,
            // add it back onto the top of the stack where it came from
            stack.push(top);
            return bottom;
        }
    }

    private static <T> void printStack(Stack<T> stack){
        Iterator<T> iterator = stack.iterator();
        while (iterator.hasNext()) {
            T t = (T) iterator.next();
            System.out.print(t);
        }
    }
}
