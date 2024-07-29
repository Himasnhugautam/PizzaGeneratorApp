public class Pizza {
    private int price;
    private final int extraCheesePrice=100;
    private final int extraToppingPrice=150;
    private final int backPackPrice=20;
    private final int basePizzaPrice;

    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingAdded=false;
    private boolean isOptedTakeAway=false;


    public Pizza(Boolean veg) {
        if(veg){
            this.price= 300;
        }
        else{
            this.price= 400;
        }
        basePizzaPrice= this.price;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded=true;
          //System.out.println("Extra cheese added");
          this.price +=extraCheesePrice;
    }
    public void addExtraTopping(){
        isExtraToppingAdded=true;
        //System.out.println("Extra toppings added");
        this.price+=extraToppingPrice;


    }
    public void takeAway(){
        isOptedTakeAway=true;
       // System.out.println("Take away");
        this.price-=backPackPrice;

    }
    public void getBill(){
        String bill="";
        System.out.println("Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+= "Extra cheese added:" +extraCheesePrice+ "\n";


        }
        if(isExtraToppingAdded){
            bill+= "Extra toppings added: " +extraToppingPrice+ "\n";
        }
        if(isOptedTakeAway){
            bill+= "Take away: " +backPackPrice+ "\n";

        }
         bill+="Bill: " +this.price+ "\n";
        System.out.println(bill);
    }
    }

