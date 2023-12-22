package Task1;

import java.awt.print.Printable;

public class MainUser {
    public static void main(String[] args) {
        User1();
        System.out.println();
        User2();
        System.out.println();
        User3();
        System.out.println();
        Printable s;
    }
    public static void User1(){ // Query обычный внутренний класс
        User1 user1 = new User1("Login", "Password");
        user1.createQuery();

        User1.Query query1 = user1.new Query();
        query1.printToLog();

        User1.Query query2 = new User1("Login", "Password").new Query();
        query2.printToLog();

    }
    public static void User2(){ // Query как локальный класс
        User2 user1 = new User2("Login", "Password");
        user1.createQuery();
    }
    public static void User3(){ // Querry статический внутренний класс
        User3 user1 = new User3("Login", "Password");
        user1.createQuery();

        User3.Query query = new User3.Query();
        query.printToLog();
    }
}