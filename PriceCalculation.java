class PriceCalculation{
  private int itemPrice = 0;
  private int taxPrice = 0;
  private final double TAX = 1.10;
  private final double DISCOUNTRATE = 0.9;

  public int itemPrice(Item item,int num){
    itemPrice = item.getPrice() * num;
    return itemPrice;
  }

  public int taxItemPrice(Item item,int num){
    taxPrice = item.getPrice() * num;
    if(item.getCategory().equals("cigarette") == false){
      taxPrice = (int)(taxPrice * TAX);
    }
    return taxPrice;
  }

  public int discountSumItemPrice(Item item, int num){
    itemPrice = (int)(item.getPrice() * num * DISCOUNTRATE);
    //System.out.println("" +  +"")
    return itemPrice;
  }


}