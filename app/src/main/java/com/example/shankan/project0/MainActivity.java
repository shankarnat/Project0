package com.example.shankan.project0;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Accessing Button1 and calling the toast notifications
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonnotification(v);
                }
        });
        //Accessing Button2 and calling the toast notifications
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonnotification(v);
            }
        });
        //Accessing Button3 and calling the toast notifications
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonnotification(v);
            }
        });
        //Accessing Button4 and calling the toast notifications
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonnotification(v);
            }
        });
        //Accessing Button5 and calling the toast notifications
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonnotification(v);
            }
        });
        //Accessing Button6 and calling the toast notifications
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonnotification(v);
            }
        });
    }
    //Method to display the Toast notification
    public void buttonnotification(View view){
        //type casting the view to button and use the button methods and display toast notifications
        Button button = (Button) view;
        Context context = getApplicationContext();
        CharSequence text;
        text = button.getText();
        int duration = Toast.LENGTH_SHORT;
        Toast newToast = Toast.makeText(context, text, duration);
        newToast.show();
    }

}
