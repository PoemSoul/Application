package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.application.util.ToastCustom;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Context context = MainActivity.this;
    private Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page);
        initView();
        initListener();
    }

    private void initView() {
        btnRegister=(Button)findViewById(R.id.register_btn);
    }

    private void initListener() {
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.register_btn){
            ToastCustom.getInstance(context).show("请输入用户名", 3000);
        }
    }
}
