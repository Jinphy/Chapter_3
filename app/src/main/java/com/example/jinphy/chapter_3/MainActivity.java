package com.example.jinphy.chapter_3;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.PathInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = ((Button) findViewById(R.id.button));
        button.setOnClickListener(this::onClick);
    }

    public void onClick(View view) {

        // 加载补间动画
//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.trans_anim);
//        animation.setInterpolator(new AnticipateOvershootInterpolator());
//        button.startAnimation(animation);

        // 加载属性动画
        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.anim_set);
        animator.setTarget(button);
        animator.start();


    }


}
