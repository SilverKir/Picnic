package view;

import model.GroceryBasket;

import java.util.HashSet;
import java.util.Set;

public class PrintGroceryBasket {
    public void printGroceryBasket(GroceryBasket basket){
        Set<String> grosery = new HashSet<>(basket.getGrocery());
        System.out.printf("В корзине %s видов продуктов: \n ------------------- \n", grosery.size());
        for (String s : grosery) {
            System.out.printf("%s - %s шт. \n",s.substring(0,1).toUpperCase()+s.substring(1),basket.getQuantity(s));
        }
    }

    public void printCount (Integer count){
        System.out.println("-------------------");
        System.out.printf("Всего в корзине %s продуктов \n", count);
    }

    public void printLongestProduct(String product){
        System.out.printf("Самое длинное название продукта - \"%s\" ",product);
    }
}
