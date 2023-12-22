package main;

import main.parser.Parser;

import java.io.FileNotFoundException;

import static main.calculate.Calculate.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Parser parser = new Parser();
        parser.parse("src\\resourse\\23_09_tasks.txt");

        for (int i = 0; i < parser.getArray().size(); i++) {
            if(parser.getArray().get(i).contains("Решите уравнение")){
                System.out.println("===Task " + i + "===");
                System.out.print("Решите уравнение: ");
                linearEquation(parser.getArray().get(i));
            }
            else if(parser.getArray().get(i).contains("Найдите значение выражения")){
                System.out.println("===Task " + i + "===");
                System.out.print("Найдите значение выражения: ");
                example(parser.getArray().get(i));
            }
            else if(parser.getArray().get(i).contains("Найдите решение квадратного уравнения")){
                System.out.println("===Task " + i + "===");
                System.out.print("Найдите решение квадратного уравнения: ");
                squareEquation(parser.getArray().get(i));
            }
        }
    }
}