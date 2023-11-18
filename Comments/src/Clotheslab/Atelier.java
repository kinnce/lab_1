package Clotheslab;

import Clotheslab.Clothes.Cloth;
import Clotheslab.Interfaces.MenСlothing;
import Clotheslab.Interfaces.WomenClothing;

public class Atelier {
    public static void clothMens(Cloth[] cloths){
        for(Cloth cloth : cloths){
            if(cloth instanceof MenСlothing){
                ((MenСlothing) cloth).clothMen();
            }
        }
    }

    public static void clothWomens(Cloth[] cloths) {
        for(Cloth cloth : cloths){
            if(cloth instanceof WomenClothing){
                ((WomenClothing) cloth).clothWomen();
            }
        }
    }
}