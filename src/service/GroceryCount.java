package service;

import java.util.ArrayList;

public class GroceryCount {
    public Integer groceryCount (ArrayList<Integer> products){
        int count=0;
        for (Integer product : products) {
            count+=product;
        }
        return count;
    }
}
