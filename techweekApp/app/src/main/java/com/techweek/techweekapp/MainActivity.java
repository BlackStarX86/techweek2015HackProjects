package com.techweek.techweekapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    EditText boxone;
    EditText boxtwo;
    EditText boxthree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         boxone=(EditText)findViewById(R.id.coffeeinput);
         boxtwo=(EditText)findViewById(R.id.teainput);
         boxthree=(EditText)findViewById(R.id.Redbullinput);

    }
public void click()
{
    double value = Double.parseDouble(boxone.getText().toString())*95+Double.parseDouble(boxtwo.getText().toString())*26+Double.parseDouble(boxthree.getText().toString())*80;
    String result=Double.toString(value);
    Toast.makeText(MainActivity.this,result,Toast.LENGTH_LONG).show();
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
