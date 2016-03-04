package com.app.mue.trial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by mue on 3/4/16.
 */
public class cars extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cars);
        addListenerOnButtonback();
    }
    public void addListenerOnButtonback() {
        button = (Button) findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                finish();
            }
        });

    }

}

