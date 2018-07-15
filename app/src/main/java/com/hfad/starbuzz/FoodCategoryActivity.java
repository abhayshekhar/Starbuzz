package com.hfad.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;


public class FoodCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_category);
        ArrayAdapter<Food>listAdapter=new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Food.foods
        );
        ListView listFoods=(ListView)findViewById(R.id.list_foods);
        listFoods.setAdapter(listAdapter);
        //create the listener
        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listFoods,
                                    View itemView,
                                    int position,
                                    long id){
                //pas the drink the user clicks on to foodactivity
                Intent intent=new Intent(FoodCategoryActivity.this,FoodActivity.class);
                intent.putExtra(FoodActivity.EXTRA_FOODID,(int)id);
                startActivity(intent);
            }
        };
        //assign the listener to the listview
        listFoods.setOnItemClickListener(itemClickListener);
    }

}

