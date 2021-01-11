// $ time java TestStringBuffer

public class TestStringBuffer
{
    public static void main(String[] args)
    {

        StringBuffer msg = new StringBuffer("Witaj");

        msg.append(" ").append("świecie!");

        System.out.println(msg);

        System.out.println(msg.length());

        for (int k = 0; k < 10000000; ++k) {

            for (int j = 0; j < msg.length(); ++j) {
                msg.setCharAt(j, Character.toUpperCase(msg.charAt(j)));
            }

        }

        System.out.println(msg);
        System.out.println(msg.toString().toLowerCase());
    }
}

