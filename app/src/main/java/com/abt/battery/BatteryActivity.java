package com.abt.battery;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.abt.R;

/**
 * Created by pisoft on 2018/4/13.
 */
public class BatteryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_battery);


        BatteryView view = (BatteryView) findViewById(R.id.battery);

    }

}