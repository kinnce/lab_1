package Generic;

public class Class <T extends Comparable<T>, V extends Animal & Serializable, K extends Number> {
    private T obj1;
    private V obj2;
    private K obj3;

    public Class(T obj1, V obj2, K obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public void print() {
        System.out.println(obj1.getClass().getName() + " " + obj2.getClass().getName() + " " + obj3.getClass().getName());
    }

    public T getObj1() {
        return obj1;
    }

    public V getObj2() {
        return obj2;
    }

    public K getObj3() {
        return obj3;
    }
}
