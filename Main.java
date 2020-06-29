//import java.util.Scanner;
//import java.util.ArrayList;

class Main {  
  public static void main(String[] args) {
    Buy buy = new Buy();

    Item.showAllItem();
    
    buy.buyItem();

    Item.testShowAllItem();
  }
}