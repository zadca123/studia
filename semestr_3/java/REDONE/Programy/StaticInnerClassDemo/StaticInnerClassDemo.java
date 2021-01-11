public class StaticInnerClassTest
{
    public static void main(String[] args)
    {
        double[] d = new double[20];

        for (int i = 0; i < d.length; i++) {
            d[i] = 100 * Math.random();
        }

        ArrayAlg.Pair p = ArrayAlg.minmax(d);
        System.out.println("min = " + p.getFirst());
        System.out.println("max = " + p.getSecond());
    }
}

class ArrayAlg
{
    public static class Pair
    {
        public Pair(double first, double second)
        {
            this.first = first;
            this.second = second;
        }

        public double getFirst()
        {
            return first;
        }

        public double getSecond()
        {
            return second;
        }

        private double first;
        private double second;
    }

    // Oblicza minimalną i maksymalną wartość z tablicy
    public static Pair minmax(double[] values)
    {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (double v : values) {
            if (v < min) {
                min = v;
            }

            if (v > max) {
                max = v;
            }
        }

        return new Pair(min, max);
    }
}

