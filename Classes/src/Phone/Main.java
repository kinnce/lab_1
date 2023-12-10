package Phone;

public class Main {
     public static void main(String[] args) {
         Phone phone1 = new Phone();
         Phone phone2 = new Phone();
         Phone phone3 = new Phone();
         Phone phone4 = new Phone();
         Phone phone5 = new Phone();
         phone1.setNumber("89276543268");
         phone2.setNumber("89273241234");
         phone3.setNumber("89987896553");
         phone4.setNumber("89123456789");
         phone5.setNumber("89123423484");
         phone1.setModel("IPhone 11");
         phone2.setModel("IPhone 12");
         phone3.setModel("IPhone 13");
         phone4.setModel("IPhone 14");
         phone5.setModel("IPhone 15");
         phone1.setWeight(194d);
         phone2.setWeight(162d);
         phone3.setWeight(150d);
         phone4.setWeight(172d);
         phone5.setWeight(171d);
         System.out.println(phone1);
         System.out.println(phone2);
         System.out.println(phone3);
         System.out.println(phone4);
         System.out.println(phone5);
         phone1.receiveCall("Maria");
         phone2.receiveCall("Igor");
         phone3.receiveCall("Anna");
         phone4.receiveCall("Veronika");
         phone5.receiveCall("Sergey");
         System.out.println();

         Phone phone6 = new Phone("89375135244", "IPhone 14 pro", 206d);
         System.out.println(phone6);
         phone4.receiveCall("Irina", "89365135244");

         phone4.sendMessage(phone1.getNumber(), phone2.getNumber(), phone3.getNumber(), phone4.getNumber(), phone5.getNumber());


     }
 }