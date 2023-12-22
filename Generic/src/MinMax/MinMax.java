package MinMax;

public class MinMax <T extends Number & Comparable<T>> {
    private T[] mas;

    public MinMax(T[] mas) {
        this.mas = mas;
    }

    public T[] getMas() {
        return mas;
    }

    public void setMas(T[] mas) {
        this.mas = mas;
    }
    public T minSearch(){
        T min = mas[0];
        for(T el : mas){
            if(el.compareTo(min) < 0){
                min = el;
            }
        }
        return min;
    }
    public T maxSearch(){
        T max = mas[0];
        for(T el : mas){
            if(el.compareTo(max) > 0){
                max = el;
            }
        }
        return max;
    }
}
