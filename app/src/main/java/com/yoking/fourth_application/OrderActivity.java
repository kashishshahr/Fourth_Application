package com.yoking.fourth_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    public void onBackClick(View view){
        Intent intent=new Intent(this,MainActivity.class);
        TextView textView=findViewById(R.id.OrderText);
        textView.clearComposingText();
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.MSG);
        //SEt text inside Textview to message
        TextView textView=findViewById(R.id.OrderText);
        textView.setText(message);
    }
}