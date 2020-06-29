import java.util.ArrayList;

class ShoppingBag{
  protected ArrayList<Item> orderList = new ArrayList<>();//購入する商品
  //private ArrayList<Integer> allTempPrice = new ArrayList<>();
  private PriceCalculation priceCalculation  = new PriceCalculation();
  //private Bonus bonus = new Bonus();

  int num = 0;
  int itemPrice = 0;
  int totalPrice = 0;
  int taxTotalPrice = 0;
  
  //買い物カゴの追加
  public void addShoppingBag(Item item,int num){
    for(Item sameItem : orderList){
      if(sameItem.getName().equals(item.getName())){
        System.out.println("a" + item.getName() + item.getNum());
        item.setNum(item.getNum() + num);
        System.out.println("a" + item.getName() + item.getNum());
        return;
      }
    }
    orderList.add(item);
    item.setNum(num);
    System.out.println("b" + item.getName() + item.getNum());
  }

  public void firstAddShoppingBag(Item item,int num){
    orderList.add(item);
    item.setNum(num);
  }

  public void getTotalPrice(){
    for(Item item : orderList){
      num = item.getNum();
      totalPrice += priceCalculation.itemPrice(item,num);
    }
  }

  public void getTaxTotalPrice(){
    for(Item item : orderList){
      num = item.getNum();
      taxTotalPrice += priceCalculation.taxItemPrice(item,num);
    }
  }

  public void oneBonus(ArrayList<Item> orderList){}
  public void checkLighter(ArrayList<Item> orderList){}
          

  //買い物カゴ一覧表示
  public void printShoppingBag(){
    System.out.println("\t\t買い物カゴ一覧");
    System.out.println("-----------------------------------");
    
    for(Item item : orderList){
      System.out.println("商品名：" + item.getName() + "\t個数：" + item.getNum() + "\t単価：" + item.getPrice());
    }
    System.out.println("-----------------------------------");
    //税抜き合計金額を表示
    System.out.println("合計(税抜き) : " + totalPrice + "円");
    //税込み合計金額を表示
    System.out.println("合計(税込み) : " + taxTotalPrice + "円");
    System.out.println("看板娘「ま・い・ど・あ・り」");
  }

  public ArrayList<Item> getOrderList(){
    return orderList;
  }

}