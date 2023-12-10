package Phone;

public class Phone {
    private String number;
    private String model;
    private double weight;
    public Phone(){
        number = "";
        model = "";
        weight = 0d;
    }
    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public void receiveCall(String nameCall){
        System.out.println("Calls {" + nameCall + "}\n");
    }
    public void receiveCall(String nameCall, String number){
        System.out.println("Calls {" + nameCall + "}\n" + "number: " + number + "\n");
    }
    public void sendMessage(String...number){
        for(String str:number){
            System.out.print(str + " ");
        }
        System.out.println();
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "PhoneClass{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
