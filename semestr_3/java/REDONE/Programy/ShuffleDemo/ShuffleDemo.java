// Na podstawie książki Cay Horstmann, Gary Cornell.
// "Java (TM). Podstawy." Wydanie VIII
// Program demonstruje algorytmy tasowania i sortowania.

import java.util.*;

public class ShuffleDemo
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<Integer>();

        for (int j = 1; j <= 49; ++j) {
            numbers.add(j);
        }
	System.out.println(numbers);

        Collections.shuffle(numbers);
        System.out.println(numbers);
	List<Integer> winningCombination = numbers.subList(0, 6);
        System.out.println(winningCombination);
	Collections.sort(winningCombination);
        System.out.println(winningCombination);
    }

}

