package com.mccullaghdave.javatest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =(Button)
                findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

             private EditText favcolor;
             private TextView textout;
            public void onClick(View v){
                Button button=(Button) v;
                ((Button) v).setText("Clicked");
                favcolor = (EditText) findViewById(R.id.txtColor);
                textout = (TextView) findViewById(R.id.txtOutput);
                textout.setText(favcolor.getText());
                /*Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.TOP| Gravity.LEFT,0,0);
                toast.makeText(MainActivity.this, favcolor.getText(),toast.LENGTH_SHORT).show();*/

            }
        });

    }

    /*public void buttonOnClick(View v) {
        Button button=(Button) v;
        ((Button) v).setText("Clicked");

    }*/



}
