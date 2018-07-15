package com.hfad.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends Activity {
    public static final String EXTRA_FOODID="foodId";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        //get the food from the intent
        int foodId =(Integer)getIntent().getExtras().get(EXTRA_FOODID);
        Food food=Food.foods[foodId];

        //populate the food name
        TextView name=(TextView)findViewById(R.id.name);
        name.setText(food.getName());

        //populate the food description
        TextView description =(TextView)findViewById(R.id.description);
        description.setText(food.getDescription());

        //populate the food image
        ImageView photo =(ImageView)findViewById(R.id.photo);
        photo.setImageResource(food.getImageResourceId());
        photo.setContentDescription(food.getName());

    }
}
