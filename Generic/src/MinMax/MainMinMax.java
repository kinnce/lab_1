package MinMax;

public class MainMinMax {
    public static void main(String[] args) {
        Double double1 = 16.0;
        Double double2 = 7.0;
        Double double3 = 20.0;
        Double double4 = -5.0;
        Double[] mas1 = {double1, double2, double3, double4};
        Integer integer1 = 3;
        Integer integer2 = 0;
        Integer integer3 = -2;
        Integer[] mas2 = {integer1, integer2, integer3};
        MinMax<Double> minMax1 = new MinMax<>(mas1);
        System.out.println(minMax1.minSearch() + " " + minMax1.maxSearch());
        MinMax<Integer> minMax2 = new MinMax<>(mas2);
        System.out.println(minMax2.minSearch() + " " + minMax2.maxSearch());
    }
}
