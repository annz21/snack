package com.arit.demo.snack;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.button)
    public void showSnackbar(){
        Snackbar snackbar = Snackbar.make(layout, "Show some message",
                Snackbar.LENGTH_LONG);
        snackbar.show();
    }

    @BindView(R.id.layout)
    CoordinatorLayout layout;


}


