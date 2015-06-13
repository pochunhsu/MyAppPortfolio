package com.pchsu.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.EnumMap;


public class MainActivity extends AppCompatActivity {
    private enum APP_NAME {SPODIFY_STREAMER, SUPER_DUO, BUILD_IT_BIGGER, XYZ_READER, CAPSTONE}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EnumMap<APP_NAME, Button> mButtonMap = new EnumMap<>(APP_NAME.class);
        mButtonMap.put(APP_NAME.SPODIFY_STREAMER,(Button)findViewById(R.id.button1));
        mButtonMap.put(APP_NAME.SUPER_DUO,(Button)findViewById(R.id.button2));
        mButtonMap.put(APP_NAME.BUILD_IT_BIGGER,(Button)findViewById(R.id.button3));
        mButtonMap.put(APP_NAME.XYZ_READER,(Button)findViewById(R.id.button4));
        mButtonMap.put(APP_NAME.CAPSTONE,(Button)findViewById(R.id.button5));

        mButtonMap.get(APP_NAME.SPODIFY_STREAMER).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myToast("This button will launch my SPODIFY STREAMER app!");
            }
        });
        mButtonMap.get(APP_NAME.SUPER_DUO).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myToast("This button will launch my SUPER DUO app!");
            }
        });
        mButtonMap.get(APP_NAME.BUILD_IT_BIGGER).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myToast("This button will launch my BUILD IT BIGGER app!");
            }
        });
        mButtonMap.get(APP_NAME.XYZ_READER).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myToast("This button will launch my XYZ READER app!");
            }
        });
        mButtonMap.get(APP_NAME.CAPSTONE).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myToast("This button will launch my CAPSTONE app!");
            }
        });
    }

    private void myToast (String str){
        Toast toast = Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM,0,15);
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
