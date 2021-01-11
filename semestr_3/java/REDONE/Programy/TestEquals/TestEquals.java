// Na podstawie książki Cay Horstmann, Gary Cornell. Java 2. Podstawy.

import java.util.*;

public class TestEquals
{
    public static void main(String[] args)
    {
        Pracownik alice1 = new Pracownik("Alice Adams", 75000, 1987, 12, 15);
        Pracownik alice2 = alice1;
        Pracownik alice3 = new Pracownik("Alice Adams", 75000, 1987, 12, 15);
        Pracownik bob = new Pracownik("Bob Brandson", 50000, 1989, 10, 1);

        System.out.println("alice1 == alice2: " + (alice1 == alice2));

        System.out.println("alice1 == alice3: " + (alice1 == alice3));

        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));

        System.out.println("alice1.equals(bob): " + alice1.equals(bob));

        System.out.println("bob.toString(): " + bob);

        Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        Manager szef = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        szef.setPremia(5000);
        System.out.println("szef.toString(): " + szef);
        System.out.println("carl.equals(szef): "  + carl.equals(szef));
        System.out.println("alice1.hashCode(): " + alice1.hashCode());
        System.out.println("alice3.hashCode(): " + alice3.hashCode());
        System.out.println("bob.hashCode(): " + bob.hashCode());
        System.out.println("carl.hashCode(): " + carl.hashCode());
    }
}

