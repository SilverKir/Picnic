package controller;

import model.GroceryBasket;
import service.GroceryCount;
import service.LongestWord;
import service.SplitInputData;
import view.GetData;
import view.PrintGroceryBasket;

public class Controller {
    GetData gd = new GetData();
    GroceryBasket gb = new GroceryBasket();
    SplitInputData splitInputData = new SplitInputData();
    GroceryCount groceryCount = new GroceryCount();
    LongestWord lw = new LongestWord();
    PrintGroceryBasket pb = new PrintGroceryBasket();

    public void Start() {
        String data = gd.getData("input.txt");
        String[] array = splitInputData.splitInputData(data);
        gb.putInBasket(array);
        int count = groceryCount.groceryCount(gb.getGroceryCount());
        String longestWord = lw.getLongestWord(gb.getGrocery());
        pb.printGroceryBasket(gb);
        pb.printCount(count);
        pb.printLongestProduct(longestWord);
    }
}
