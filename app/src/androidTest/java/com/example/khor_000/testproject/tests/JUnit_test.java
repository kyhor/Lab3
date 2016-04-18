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

        int sumtest = mainActivity.sum(10,20);

        assertEquals(10+20, sumtest);
    }
}
