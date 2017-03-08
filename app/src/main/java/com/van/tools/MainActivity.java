package com.van.tools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.van.mtools.utils.ToastHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastHelper.get(this).showShort("fdsa");
    }
}
