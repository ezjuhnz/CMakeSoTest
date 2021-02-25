package com.example.cmakesotestapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("test-lib");     //为了调用第三方库创建的JNI库
        System.loadLibrary("native-lib");   //native库,第三方库已经集成在里面了
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
        int ret = new Test().jAdd(2,3);
        tv.setText(stringFromJNI() + ret);

    }

    public native String stringFromJNI();
}