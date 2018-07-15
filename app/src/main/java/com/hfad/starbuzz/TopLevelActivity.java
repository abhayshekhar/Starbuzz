package com.hfad.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;

public class TopLevelActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        //create an onitemclicklistener
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> listView,
                                    View itemView,
                                    int position,
                                    long id){
                if (position==0){
                    Intent intent=new Intent(TopLevelActivity.this,DrinkCategoryActivity.class);
                    startActivity(intent);
                }
                else if(position==1){
                    Intent intent=new Intent(TopLevelActivity.this,FoodCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };
        //add the listener to the listview
        ListView listView=(ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}





