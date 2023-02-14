package com.driver;

import java.sql.SQLOutput;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    // I create topping variable as topping is diff for veg/nonveg
    private int topping;

    //need to check if extra-cheese,topping,bag added then no need to add again [user created]
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingAdded;
    private boolean isBagAdded;
    private boolean isBillCreated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price = 300;
            this.topping = 70;
        }
        else {
            this.price = 400;
            this.topping = 120;
        }

        this.bill = "Base Price Of The Pizza: " + this.price + "\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheeseAdded==false){
            this.price += 80;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraToppingAdded==false){
            this.price += this.topping;
            isExtraToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isBagAdded==false){
            this.price += 20;
            isBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillCreated==false) {
            if (isExtraCheeseAdded)
                this.bill += "Extra Cheese Added: 80" + "\n";
            if (isExtraToppingAdded)
                this.bill += "Extra Toppings Added: " + this.topping + "\n";
            if (isBagAdded)
                this.bill += "Paperbag Added: 20" + "\n";

            this.bill += "Total Price: " + this.price + "\n";

            isBillCreated = true;
        }

        return this.bill;
    }
}
