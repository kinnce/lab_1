package main.calculate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Calculate {

    public static void linearEquation(String text){
        String string = text.replaceAll("[А-Яа-я: ]","");
        String reg = "(?<=op)|(?=op)|=".replace("op", "[-+*/()]");
        String[] s = string.split(reg);
        String position="";
        System.out.println(string);

        String patFirst = "^\\s*([-?a-zA-Z]+)\\s*(\\*|/|\\+|-)\\s*([-?0-9]+)\\s*=\\s*(-?[0-9]+)\\s*$";
        String patSecond = "^\\s*([-?0-9]+)\\s*(\\*|/|\\+|-)\\s*([-?a-zA-Z]+)\\s*=\\s*(-?[0-9]+)\\s*$";
        String patThird = "^\\s*([-?0-9]+)\\s*(\\*|/|\\+|-)\\s*([-?0-9]+)\\s*=\\s*([-?a-zA-Z]+)\\s*$";

        double temp = 0;
        double shiftFirst = 1, shiftSecond=0;
        if (string.matches(patFirst) || string.matches(patSecond) || string.matches(patThird)) {
            if(s[0].equals("-")) {
                shiftFirst = 2;
            }
            if(s[(int)shiftFirst+1].equals("-")) {
                shiftSecond=1;
            }
            if(string.matches(patFirst)){
                position = s[(int)shiftFirst-1];
                switch (s[(int) shiftFirst]){
                    case "*":
                        if(shiftSecond==1){
                            if(s[(int) shiftFirst+2] == s[s.length-2]){
                                temp = -1*Double.parseDouble(s[s.length-1])/Double.parseDouble(s[(int) shiftFirst+2]);
                                break;
                            }
                            else{
                                temp = Double.parseDouble(s[s.length-1])/Double.parseDouble(s[(int) shiftFirst+2]);
                                break;
                            }
                        }
                        else{
                            if(s[(int) shiftFirst+1] == s[s.length-2]){
                                temp = Double.parseDouble(s[s.length-1])/Double.parseDouble(s[(int) shiftFirst+1]);
                                break;
                            }
                            else{
                                temp = -1*Double.parseDouble(s[s.length-1])/Double.parseDouble(s[(int) shiftFirst+1]);
                                break;
                            }
                        }

                    case "/":
                        if(s[(int) shiftFirst+1] == s[s.length-2]){
                            temp = Double.parseDouble(s[s.length-1])*Double.parseDouble(s[(int) shiftFirst+1]);
                            break;
                        }
                        else{
                            temp = -1*Double.parseDouble(s[s.length-1])*Double.parseDouble(s[(int) shiftFirst+1]);
                            break;
                        }
                    case "+":
                        if(s[(int) shiftFirst+1] == s[s.length-2]){
                            temp = Double.parseDouble(s[s.length-1])-Double.parseDouble(s[(int) shiftFirst+1]);
                            break;
                        }
                        else{
                            temp = -1*Double.parseDouble(s[s.length-1])-Double.parseDouble(s[(int) shiftFirst+1]);
                            break;
                        }
                    case "-":
                        if(s[(int) shiftFirst+1] == s[s.length-2]){
                            temp = Double.parseDouble(s[s.length-1])+Double.parseDouble(s[(int) shiftFirst+1]);
                            break;
                        }
                        else{
                            temp = -1*Double.parseDouble(s[s.length-1])+Double.parseDouble(s[(int) shiftFirst+1]);
                            break;
                        }
                }
            }
            else if (string.matches(patSecond)){
                position = s[(int)shiftFirst+(int)shiftSecond+1];
                switch (s[(int) shiftFirst]){
                    case "*":
                        if(s[(int) shiftFirst+2] == s[s.length-1]){
                            temp = Double.parseDouble(s[s.length-1])/Double.parseDouble(s[(int) shiftFirst-1]);
                            break;
                        }
                        else{
                            temp = -1*Double.parseDouble(s[s.length-1])/Double.parseDouble(s[(int) shiftFirst-1]);
                            break;
                        }
                    case "/":
                        if(s[(int) shiftFirst+1] == s[s.length-2]){
                            temp = Double.parseDouble(s[(int)shiftFirst-1]) / Double.parseDouble(s[s.length-1]);
                            break;
                        }
                        else{
                            temp = -1*Double.parseDouble(s[s.length-1])*Double.parseDouble(s[(int) shiftFirst+1]);
                            break;
                        }
                    case "+":
                        if(s[(int) shiftFirst+1] == s[s.length-2]){
                            temp = Double.parseDouble(s[s.length-1])-Double.parseDouble(s[(int) shiftFirst+1]);
                            break;
                        }
                        else{
                            temp = -1*Double.parseDouble(s[s.length-1])-Double.parseDouble(s[(int) shiftFirst+1]);
                            break;
                        }
                    case "-":
                        if(s[(int) shiftFirst+1] == s[s.length-2]){
                            temp = Double.parseDouble(s[s.length-1])+Double.parseDouble(s[(int) shiftFirst+1]);
                            break;
                        }
                        else{
                            temp = -1*Double.parseDouble(s[s.length-1])+Double.parseDouble(s[(int) shiftFirst+1]);
                            break;
                        }
                }
            }
            else{
                position=s[s.length-1];
                shiftFirst = 0;
                shiftSecond = 0;
                if(s[0].equals("-")){
                    shiftFirst = 1;
                }
                if(s[2+(int)shiftFirst].equals("-")){
                    shiftSecond = 1;
                }
                if(s[1+(int)shiftFirst].equals("*")){
                    temp = Double.parseDouble(s[(int)shiftFirst]) * Double.parseDouble(s[2+(int)shiftFirst+(int)shiftSecond]);
                    if(shiftSecond==1){
                        temp*=-1;
                    }
                    if(shiftFirst==1){
                        temp*=-1;
                    }
                }
                else if(s[1+(int)shiftFirst].equals("/")){
                    temp = Double.parseDouble(s[0+(int)shiftFirst]) / Double.parseDouble(s[2+(int)shiftFirst+(int)shiftSecond]);
                    if(shiftSecond==1) {
                        temp *= -1;
                    }
                    if(shiftFirst==1){
                        temp*=-1;
                    }
                }
                else if(s[1+(int)shiftFirst].equals("+")){
                    if(s[0].equals("-")){
                        temp = -1*Double.parseDouble(s[0+(int)shiftFirst]) + Double.parseDouble(s[2+(int)shiftFirst+(int)shiftSecond]);
                    }
                }
                else if(s[1+(int)shiftFirst].equals("-")){
                    if(s[0].equals("-")){
                        temp = -1*Double.parseDouble(s[0+(int)shiftFirst]) - Double.parseDouble(s[2+(int)shiftFirst+(int)shiftSecond]);
                    }
                }
                if(s[3+(int)shiftFirst+(int)shiftSecond].equals("-")){
                    temp = -1*temp;
                }
                System.out.println(position + " = " + temp);
                shiftSecond=-1;
            }
        } else {
            System.out.println("Неверный формат");
        }
        if(shiftFirst==2){
            temp = -1*temp;
        }
        if(shiftSecond!=-1){
            System.out.println(position + " = " + temp);

        }
    }

    public static void example(String text){
        ArrayList<String> array1 = new ArrayList<>();
        ArrayList<String> array2 = new ArrayList<>();
        double temp = 0;
        String string = text.replaceAll("[А-Яа-я: ]","");
        System.out.println(string);
        String reg = "(?<=op)|(?=op)|=".replace("op", "[-+*/()]");
        String[] s = string.split(reg);
        for (int i = 0; i < s.length; i++) {
            switch (s[i]){
                case "*":
                    temp = (Double.parseDouble(s[i-1])*Double.parseDouble(s[i+1]));
                    array1.add(String.valueOf(temp));
                    i++;
                    break;
                case "/":
                    temp = division(Double.parseDouble(s[i-1]),Double.parseDouble(s[i+1]));
                    array1.add(String.valueOf(temp));
                    array1.add("/");
                    i++;
                    break;
                default:
                    if(i==s.length-1){
                        array1.add(s[i]);
                    }
                    else{
                        if(!s[i+1].equals("*") && !s[i+1].equals("/")){
                            array1.add(s[i]);
                        }
                    }

            }
        }
        for (int i = 0; i < array1.size(); i++) {
            if(i==0){
                array2.add(array1.get(0));
            }
            if(i%2==1 && array1.get(i).equals("+")){
                array2.add(array1.get(i+1));
            }
            else if (i%2==1 && array1.get(i).equals("-")){
                array2.add(String.valueOf((-1*Double.parseDouble(array1.get(i+1)))));
            }
        }
        temp = sum(array2);
        System.out.println(string + "=" + temp);
    }
    public static void squareEquation(String text) {
        double a=0,b=0,c=0;
        String string = text.replaceAll("[А-Яа-я: ]","");
        String reg = "(?<=op)|(?=op)|=".replace("op", "[-+*/()]");
        String[] s = string.split(reg);
        System.out.println(string);
        Pattern pat;
        Matcher mat;
        pat = Pattern.compile("[0-9]");
        mat = pat.matcher(String.valueOf(string.charAt(0)));


        if(mat.find()){
            if(s[0].equals("-")){
                a = -1*Double.parseDouble(String.valueOf(s[1]));
                if(s[0].equals("-")){
                    b = -1*Double.parseDouble(String.valueOf(s[5]));
                }
                else {
                    b = Double.parseDouble(String.valueOf(s[5]));
                }
                if(s[8].equals("-")){
                    c = -1*Double.parseDouble(String.valueOf(s[9]));
                }
                else {
                    c = Double.parseDouble(String.valueOf(s[9]));
                }
            }
            else{
                a = Double.parseDouble(String.valueOf(s[0]));
                if(s[3].equals("-")){
                    b = -1*Double.parseDouble(String.valueOf(s[4]));
                }
                else {
                    b = Double.parseDouble(String.valueOf(s[4]));
                }
                if(s[7].equals("-")){
                    c = -1*Double.parseDouble(String.valueOf(s[8]));
                }
                else {
                    c = Double.parseDouble(String.valueOf(s[8]));
                }
            }

        }

        else{
            if(s[0].equals("-")){
                a = -1;
                if(s[2].equals("-")){
                    b = -1*Double.parseDouble(String.valueOf(s[3]));
                }
                else {
                    b = Double.parseDouble(String.valueOf(s[3]));
                }
                if(s[6].equals("-")){
                    c = -1*Double.parseDouble(String.valueOf(s[7]));
                }
                else {
                    c = Double.parseDouble(String.valueOf(s[7]));
                }
            }
            else{
                a = 1;
                if(s[1].equals("-")){
                    b = -1*Double.parseDouble(String.valueOf(s[2]));
                }
                else {
                    b = Double.parseDouble(String.valueOf(s[2]));
                }
                if(s[5].equals("-")){
                    c = -1*Double.parseDouble(String.valueOf(s[6]));
                }
                else {
                    c = Double.parseDouble(String.valueOf(s[6]));
                }
            }
        }
        double finalB = b;
        double finalA = a;
        double finalC = c;
        Function<Double, Double> d = (coef) -> Math.pow(finalB, 2) - 4 * finalA * finalC;
        double D = d.apply(a);
        if(D<0){
            System.out.println("Решений нет");
        } else if (D==0) {
            double temp = (-b)/(2*a);
            System.out.println("x = " + temp);
        }
        else{
            double temp = (-b+Math.pow(D,0.5))/(2*a);
            System.out.println("x1 = " + temp);

            temp = (-b-Math.pow(D,0.5))/(2*a);
            System.out.println("x2 = " + temp);
        }
    }

    public static double sum(ArrayList<String> arrayList){
        double x = 0;
        for (String a: arrayList) {
            x += Double.parseDouble(a);
        }
        return Math.round(x*1000.0)/1000.0;
    }
    public static double division(double... args){
        double x = args[0];
        int i=0;
        for (double a:args) {
            if (a==0 && i!=0)
            {
                throw new ArithmeticException("Ошибка. Нельзя делить на 0");
            }
            if (a==0 && i==0)
            {
                return 0;
            }
            x/=a;
            i++;
        }
        x*=args[0];

        return Math.round(x*1000.0)/1000.0;
    }
}