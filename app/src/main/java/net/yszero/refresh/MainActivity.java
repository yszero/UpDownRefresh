package net.yszero.refresh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import net.yszero.refresh.activity.LoadMoreActivity;
import net.yszero.refresh.activity.LoadMoreWrapperActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_base).setOnClickListener(this);
        findViewById(R.id.btn_wrapper).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.btn_base:
                intent = new Intent(this, LoadMoreActivity.class);
                break;

            case R.id.btn_wrapper:
                intent = new Intent(this, LoadMoreWrapperActivity.class);
                break;

            default:
                break; 
        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}
