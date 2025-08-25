package arrays;

public class BuySalestocks {

    public static  void buyandsellstocks(int price[]){
        int buyprice= Integer.MAX_VALUE;
        int maxprofit=0;
        for (int i = 0; i < price.length; i++) {
            if (buyprice<price[i]){
                int profit =price[i]-buyprice;
                maxprofit= Math.max(maxprofit,profit);
            }
            else {
                buyprice=price[i];

            }
        }
        System.out.println(maxprofit);
    }
    public static void main(String []args){
        int price[]={7,1,5,3,6,4};
        buyandsellstocks(price);


    }
}
