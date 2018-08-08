package com.google.android.tv.setup.validation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.google.android.tv.setup.BaseActivity;

public class MockKatnissActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        iv0.setVisibility(View.VISIBLE);
        iv0.setImageResource(R.drawable.mock_katniss);

        btn0.setVisibility(View.VISIBLE);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAboutToFinish();
                finish();
            }
        });
    }

    protected void onAboutToFinish() {
        setResult(Activity.RESULT_OK);
    }
}