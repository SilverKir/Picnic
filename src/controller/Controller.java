package controller;

import model.GroceryBasket;
import service.GroceryCount;
import service.LongestWord;
import service.SplitInputData;
import view.GetData;
import view.PrintGroceryBasket;

public class Controller {
    GetData getData = new GetData();
    GroceryBasket groceryBasket = new GroceryBasket();
    SplitInputData splitInputData = new SplitInputData();
    GroceryCount groceryCount = new GroceryCount();
    LongestWord longestWord = new LongestWord();
    PrintGroceryBasket printGroceryBasket = new PrintGroceryBasket();

    public void Start() {
        String data = getData.getData("input.txt");
        String[] array = splitInputData.splitInputData(data);
        groceryBasket.putInBasket(array);
        int count = groceryCount.groceryCount(groceryBasket.getGroceryCount());
        String longWord = longestWord.getLongestWord(groceryBasket.getGrocery());
        printGroceryBasket.printGroceryBasket(groceryBasket);
        printGroceryBasket.printCount(count);
        printGroceryBasket.printLongestProduct(longWord);
    }
}
