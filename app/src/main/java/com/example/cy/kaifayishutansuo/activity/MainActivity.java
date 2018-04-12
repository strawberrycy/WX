package com.example.cy.kaifayishutansuo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.cy.kaifayishutansuo.R;

public class MainActivity extends AppCompatActivity {

    private EditText text;
    private String extra_test;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            extra_test = savedInstanceState.getString("extra_test");
        }
        initView();
        text.setText(extra_test);
    }

    private void initView() {
        text = (EditText) findViewById(R.id.text);
        btn = (Button) findViewById(R.id.btn);
    }
}
