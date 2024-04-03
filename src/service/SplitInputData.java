package service;


public class SplitInputData {
    public String[] splitInputData(String data){
        return   data.toLowerCase().trim().split(" ");
    }
}
