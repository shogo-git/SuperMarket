import java.util.Scanner;
import java.util.ArrayList;

public class Buy{
    ShoppingBag shoppingBag = new ShoppingBag();
    ShoppingBag bonus = new Bonus();
    Scanner sc = new Scanner(System.in);
    boolean loop = true; //Whileの制御変数
    boolean first = true; //firstAbbShoppingBagの制御変数
    
    public void buyItem(){
        while(loop){
            //商品IDの入力
            System.out.println("商品IDを入力してください。");
            String lineId = sc.nextLine();
            int id = Integer.parseInt(lineId);
    
            //取得した商品IDを用いて商品情報を取得
            Item item = Item.getById(id);
        
            //商品個数の入力
            System.out.println(item.getName() + "の購入個数を入力してください。");
            String lineNum = sc.nextLine();
            int num = Integer.parseInt(lineNum);

            if(first){
                shoppingBag.firstAddShoppingBag(item,num);
                first = false;
            }else{
                //ShoppingBagクラスに取得した商品情報を追加
                shoppingBag.addShoppingBag(item,num);
            }
    
            //yを入力で(loop = true), nもしくはそれ以外の文字列を入力で(loop = false) 
            System.out.println("買い物を続けますか？(y/n)");
            String lineCheck = sc.nextLine();	
            if(lineCheck.equals("y")){
                loop = true;
            }
            if(lineCheck.equals("n")){
            sc.close();
            loop = false;
            }
        
        }
        
        checkCigarette(shoppingBag.getOrderList());
        //bonus.oneBonus(shoppingBag.getOrderList());bonus.checkLighter(shoppingBag.getOrderList());
        shoppingBag.getTotalPrice();
        shoppingBag.getTaxTotalPrice();
        // bonus.checkLighter(shoppingBag.getOrderList());
        bonus.oneBonus(shoppingBag.getOrderList());
        shoppingBag.printShoppingBag();
    }

    public void checkCigarette(ArrayList<Item> orderList){
        for(Item item : orderList){
            if (item.getCategory().equals("cigarette")) {
                if(item.getNum() >= 10){
                    bonus.checkLighter(shoppingBag.getOrderList());
                    break;
                }
            }
        }
    }

}