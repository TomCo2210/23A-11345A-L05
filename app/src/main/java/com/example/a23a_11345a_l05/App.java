package com.example.a23a_11345a_l05;

import android.app.Application;

import com.example.a23a_11345a_l05.Utilities.MySP3;
import com.example.a23a_11345a_l05.Utilities.SignalGenerator;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MySP3.init(this);
        SignalGenerator.init(this);
    }
}
