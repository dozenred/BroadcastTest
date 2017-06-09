package com.example.dells.broadcasttest1.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dells.broadcasttest1.MainActivity;
import com.example.dells.broadcasttest1.R;

public class LoginActivity1 extends BaseActivity {
    private Button login_btn;
    private EditText username_et;
    private EditText password_et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        login_btn = (Button)findViewById(R.id.login_btn);
        username_et = (EditText)findViewById(R.id.username_et);
        password_et = (EditText)findViewById(R.id.password_et);
        login();
    }

    private void login() {
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = username_et.getText().toString();
                String password = password_et.getText().toString();
                if(username.equals("admin") && password.equals("123456")){
                    Intent intent = new Intent(v.getContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
