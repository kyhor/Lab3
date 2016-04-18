package com.example.khor_000.testproject;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView res;
    int in1;
    int in2;
    int sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        LayoutInflater inflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View layout = inflater.inflate(R.layout.content_main , (ViewGroup)findViewById(R.id.action_bar_root));


        num1 = (EditText) layout.findViewById(R.id.tv1);
        num1.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView tv, int i, KeyEvent keyEvent) {
                boolean handled = false;
                if (i == EditorInfo.IME_ACTION_NEXT) {

                    return true;
                }
                return handled;
            }
        });

        num2 = (EditText) layout.findViewById(R.id.tv2);
        num2.setOnEditorActionListener(new TextView.OnEditorActionListener(){
            public boolean onEditorAction(TextView tv, int i, KeyEvent keyEvent){
                boolean handled = false;
                if ( i == EditorInfo.IME_ACTION_NEXT){

                    return true;
                }
                return handled;
            }
        });

        final Button button = (Button) findViewById(R.id.sum);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                res = (TextView) layout.findViewById(R.id.result);

                String input2 = num2.getText().toString();
                in2 = Integer.parseInt(input2);

                String input1 = num1.getText().toString();
                in1 = Integer.parseInt(input1);

                sum = sum(in1,in2);

                res.setText("Sum: " + sum);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public int sum(int a,int b){
        return a+b;
    }

    public  int sub(int a, int b){

        return a-b;
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
