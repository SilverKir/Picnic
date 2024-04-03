package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GroceryBasket {
    Map<String, Integer> groceryBasket = new HashMap<>();

    public void addGrocery(String grocery) {
        if (groceryBasket.containsKey(grocery)) {
            groceryBasket.put(grocery, groceryBasket.get(grocery) + 1);
        } else {
            groceryBasket.put(grocery, 1);
        }
    }

    public void putInBasket(String[] grocery) {
        for (int i = 0; i < grocery.length; i++) {
            if (grocery[i].trim().length() > 0) {
                addGrocery(grocery[i].trim());
            }
        }
    }

    public Set<String> getGrocery() {
        return groceryBasket.keySet();
    }

    public ArrayList<Integer> getGroceryCount() {
        return new ArrayList<Integer>(groceryBasket.values());
    }

    public Integer getQuantity (String key){
        return groceryBasket.get(key);
    }

}
