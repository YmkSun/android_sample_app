package com.ymksun.dev.android_sample_app.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.ymksun.dev.android_sample_app.R;

public class ListActivity extends BaseActivity {

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, ListActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }
}
