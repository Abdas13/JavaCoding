package challenge;

public class MethodsExample {
    public static void main(String[] args) {
        /*
        inputs are isMember, price, membershipTime

        if
        is not a memeber: 5% discount
        is a member but the time of being membership is less than 5 years: 10% discount
        is a member and the time of being membership is more than 5 years: 15% discount
        create methods to find the amount of discount, the main price and the price after discount
         */

        boolean isMember=false;
        int membershipTime=4;
        double price=250;

        priceAfterDiscount(isMember,membershipTime,price);
    }
    public static void priceAfterDiscount(boolean isMember,int membershipTime,double price){

        if(isMember){
            if(membershipTime<5){
                System.out.println("The price of product: "+price);
                System.out.println("The amount of discount: "+price*0.10);
                System.out.println("The price after discount: "+(price-price*0.10));

            }else{
                System.out.println("The price of product: "+price);
                System.out.println("The amount of discount: "+price*0.15);
                System.out.println("The price after discount: "+(price-price*0.15));

            }

        }else{
            System.out.println("The price of product: "+price);
            System.out.println("The amount of discount: "+price*0.05);
            System.out.println("The price after discount: "+(price-price*0.05));

        }

    }



}
