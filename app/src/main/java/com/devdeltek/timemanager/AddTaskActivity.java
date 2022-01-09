package com.devdeltek.timemanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AddTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        wireupDisplay();
    }

    private void wireupDisplay(){

    }

    public static Intent intentFactory(Context context){
        Intent intent = new Intent(context, AddTaskActivity.class);
        return intent;
    }
}
