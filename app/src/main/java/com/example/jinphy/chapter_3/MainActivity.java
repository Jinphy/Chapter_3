package com.example.jinphy.chapter_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = ((Button) findViewById(R.id.button));
        TranslateAnimation animation = (TranslateAnimation) getResources().getAnimation(R.anim.trans_anim);

    }


}
