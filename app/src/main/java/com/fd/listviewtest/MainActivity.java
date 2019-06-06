package com.fd.listviewtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindView();
    }

    private void bindView() {
        findViewById(R.id.btn_list_activity).setOnClickListener(this);
        findViewById(R.id.btn_list_view).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btn_list_activity:
                intent = new Intent(this, UseListActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_list_view:
                intent = new Intent(this, UseListViewActivity.class);
                startActivity(intent);
                break;
        }
    }
}
