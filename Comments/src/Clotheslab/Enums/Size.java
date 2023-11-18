package Clotheslab.Enums;

public enum Size {
    XXS(38, "Детский размер"),
    XS(40,"Взрослый размер"),
    S(42, "Взрослый размер"),
    M(44,"Взрослый размер"),
    L(46,"Взрослый размер");
    private int euroSize;
    private String description;
    Size(int euroSize, String description) {
        this.euroSize = euroSize;
    }
    public String getDescription(){
        return description;
    }
}
