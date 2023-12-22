package Calculate;

public class Calculate {
    public static <T extends Number,V extends Number> double sum(T numb1, V numb2){
        return numb1.doubleValue() + numb2.doubleValue();
    }
    public static <T extends Number,V extends Number> double multiply(T numb1, V numb2){
        return numb1.doubleValue() * numb2.doubleValue();
    }
    public static <T extends Number,V extends Number> double divide(T numb1, V numb2){
        return numb1.doubleValue() / numb2.doubleValue();
    }
    public static <T extends Number,V extends Number> double subtraction(T numb1, V numb2){
        return numb1.doubleValue() - numb2.doubleValue();
    }
}
