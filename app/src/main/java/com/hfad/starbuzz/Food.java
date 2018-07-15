package com.hfad.starbuzz;

public class Food {
    private String name;
    private String description;
    private int imageResourceId;
    //foods is an array of foods
    public static final Food[] foods={
            new Food("Fried Rice","A dish of cooked rice that has been stir-fried in a frying pan and is usually mixed with other ingredients such as eggs, vegetables, seafood, or meat. It is often eaten by itself or as an accompaniment to another dish.",R.drawable.fried_rice),
            new Food("Biryani","Vegetable Biryani prepared in a traditional Hyderabadi Dum Biryani style is a Vegetarian's dream come true for enjoying the flavorful slow cooked.",R.drawable.biryani),
            new Food("Aloo Prantha","Aloo Paratha is an easy to make North Indian breakfast dish. This traditional breakfast recipe is perfect for weekend mornings.",R.drawable.aloo_prantha)};

    //each FOOD has a name ,description,and image resource
    private Food (String name,String description,int imageResourceId){
        this.name=name;
        this.description=description;
        this.imageResourceId=imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
