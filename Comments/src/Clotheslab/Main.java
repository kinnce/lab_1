package Clotheslab;

import Clotheslab.Clothes.*;
import Clotheslab.Enums.Color;
import Clotheslab.Enums.Size;
public class Main{
    public static void main(String[]args){
    Cloth[] cloth = {
            new tshirt(Size.XXS, 500, Color.RED),
            new trousers(Size.M, 1500, Color.BLUE),
            new skirt(Size.M, 2000, Color.BROWN),
            new tshirt(Size.L, 1000, Color.GREEN),
            new tie(Size.M, 800, Color.BLACK)};
    Atelier.clothMens(cloth);
    System.out.println();
    Atelier.clothWomens(cloth);
    }
}
