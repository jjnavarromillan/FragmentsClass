package com.example.proharvesting.fragmentandroidclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    ViewGroup fragmentLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();

    }
    public void initComponents(){
        fragmentLayout = (ViewGroup) findViewById(R.id.fragmentLayout);

    }

    public void viewFragment1(View view) {

        FirstFragment firstFragment = new FirstFragment();
        getFragmentManager().beginTransaction().
                replace(R.id.fragmentLayout,firstFragment).commit();

    }

    public void viewFragment2(View view) {
        SecondFragment secondFragment = new SecondFragment();
        getFragmentManager().beginTransaction().
                replace(R.id.fragmentLayout,secondFragment).commit();

    }

    public void viewFragment3(View view) {

        ThirdFragment thirdFragment = new ThirdFragment();
        getFragmentManager().beginTransaction().
                replace(R.id.fragmentLayout,thirdFragment).commit();

    }
}
