package com.example.khor_000.testproject.tests;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import  com.example.khor_000.testproject.MainActivity;
import com.example.khor_000.testproject.R;

/**
 * Created by Khor_000 on 17/4/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }
    public void test_fitst(){
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();
        assertEquals("Hello World!", tester);

    }
}
