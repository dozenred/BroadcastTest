package com.example.dells.broadcasttest1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dells.broadcasttest1.activities.BaseActivity;

public class MainActivity extends BaseActivity {
    private Button forceOffline_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        forceOffline_btn = (Button)findViewById(R.id.force_offline_btn);
        forceOffline();
    }

    private void forceOffline() {
        forceOffline_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.test.FORCE_OFFLINE");
                sendBroadcast(intent);
            }
        });
    }
}
