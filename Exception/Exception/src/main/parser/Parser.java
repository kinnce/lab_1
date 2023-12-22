package main.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser {
    private final ArrayList<String> array = new ArrayList<>();
    public ArrayList<String> getArray() {return array;}


    public void parse(String path) throws FileNotFoundException {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                array.add(scanner.nextLine());
            }
            scanner.close();
        }catch (FileNotFoundException e){
            System.err.println("Файл src/resourse/23_09_tasks.txt не найден");
            System.exit(1);
        }
    }
}