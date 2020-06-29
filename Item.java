enum Item{
    itme1(1, "fruit", "りんご　", 100, 0),
    item2(2, "fruit", "みかん　", 40, 0),
    item3(3, "fruit", "ぶどう　", 150, 0),
    item4(4, "food", "のり弁　", 350, 0),
    item5(5, "food", "しゃけ弁", 400, 0),
    item6(6, "cigarette", "タバコ　", 420, 0),
    item7(7, "cigarette", "メンソ　", 440, 0),
    item8(8, "item", "ライター", 100, 0),
    item9(9, "drink", "お茶　　", 80, 0),
    item10(10, "drink", "コーヒー", 100, 0);

    private int id;
    private String category;
    private String name;
    private int price;
    private int num;

    private Item(){
    }

    private Item(int id,String category,String name,int price,int num){
      this.id = id;
      this.name = name;
      this.category = category;
      this.price = price;
      this.num = num;
    }
  
  public static Item showAllItem(){
    System.out.println("店長「へい！！　らっしゃい！！！」");
    System.out.println("\t\t商品一覧");
    System.out.println("-----------------------------------");
    System.out.println("\tID:\t商品名 :\t価格");
    System.out.println("-----------------------------------");
    for(Item item: Item.values()){
       System.out.println("\t" + item.getId() + " ：\t" + item.getName() + ":\t" + item.getPrice() + "円");
    }
    System.out.println("-----------------------------------");
    return null;
  }

  public static Item testShowAllItem(){
    System.out.println("ーーーーーーーテスト用ーーーーーーーーー");
    System.out.println("\t\t商品一覧");
    System.out.println("-----------------------------------");
    System.out.println("\tID:\t商品名 :\t価格");
    System.out.println("-----------------------------------");
    for(Item item: Item.values()){
       System.out.println("\t" + item.getId() + ":\t" + item.getName() + ":\t" + item.getPrice() + "円:\t個数:" + item.getNum());
    }
    System.out.println("-----------------------------------");
    return null;
  }

  public void setNum(int num){
    this.num = num;
  }

  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public String getCategory() {
    return category;
  }
  public int getPrice() {
    return price;
  }
  public int getNum(){
    return num;
  }

  public static Item getById(int id){
    for(Item item : Item.values()){
      if(item.getId() == id){
        return item;
      }
    }
    return null;
  }

}