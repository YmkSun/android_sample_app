package com.ymksun.dev.android_sample_app.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ymksun.dev.android_sample_app.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.btn_enter_main)
    Button btnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this, this);
    }

    @OnClick(R.id.btn_enter_main)
    public void onEnterClick(View v) {
        startActivity(HomeActivity.newIntent(this));
    }

}
