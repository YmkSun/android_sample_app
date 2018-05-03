package com.ymksun.dev.android_sample_app.activities;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.ymksun.dev.android_sample_app.AndroidSampleApp;
import com.ymksun.dev.android_sample_app.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.tv_toolbar_title)
    TextView tvToolbarTitle;

    @BindView(R.id.iv_toolbar_logo)
    ImageView ivToolbarLogo;

    @BindView(R.id.spinner_type)
    Spinner spinnerType;

    @BindView(R.id.btn_garden_list)
    Button btnList;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, HomeActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this, this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        tvToolbarTitle.setText(getResources().getString(R.string.string_home));
        ivToolbarLogo.setImageDrawable(getResources().getDrawable(R.drawable.sunflower_blossom));

        spinnerType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(), parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
                Log.i(AndroidSampleApp.LOG_TAG, "Selected Type: " + parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_yes:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.radio_no:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }


    @OnClick(R.id.btn_garden_list)
    public void onEnterClick(View v) {
        startActivity(ListActivity.newIntent(this));
    }
}
