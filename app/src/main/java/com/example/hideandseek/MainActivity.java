package com.example.hideandseek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    Button show,hide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        hide=findViewById(R.id.hide);
        show=findViewById(R.id.show);
        hide.setOnClickListener(this);
        show.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==show)
        {
            textView.animate().alpha(1).setDuration(750);
        }
        if(v==hide)
        {
            textView.animate().alpha(0).setDuration(750);
        }
    }
}
