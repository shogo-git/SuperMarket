import java.util.ArrayList;

public class Bonus extends ShoppingBag{
    //ShoppingBag shoppingBag = new ShoppingBag();
    //おまけの判断
    public void oneBonus(ArrayList<Item> orderList){
        for(Item item : orderList) {
            int num = item.getNum();
            if (num >= 10) {
                // たばこのとき
                if (item.getCategory().equals("cigarette")) {
                    System.out.println("-----------------------------------");
                    //checkLighter(orderList);
                    bonusCigarette();
                    System.out.println("-----------------------------------");
                }
                // タバコ以外
                else {
                    System.out.println("-----------------------------------");
                    bonusItem(item);
                    System.out.println("-----------------------------------");
                }
            }
        }
    }

    // たばこのおまけメソッド
    public void bonusCigarette(){
        //super.addShoppingBag(Item.getById(8), 1);
        Item item = Item.getById(8);
        item.setNum(item.getNum() + 1);
        System.out.println("ライターのおまけ!!");
    }

    public void checkLighter(ArrayList<Item> orderList){
        for(Item item : orderList){
            if(item.getName().equals("ライター")){
                int num = item.getNum();
                item.setNum(num - 1);
                break;
            }
        }
    }

    // たばこ以外のおまけメソッド
    public void bonusItem(Item item) {
        int num = item.getNum();
		item.setNum(num + (num / 10));
        System.out.println(item.getName() + (num / 10) + "個おまけ!!");
	}
}