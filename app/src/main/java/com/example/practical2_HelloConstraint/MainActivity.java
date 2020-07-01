package com.example.practical2_HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view){
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);

        toast.show();

    }

    public void countUp(View view){
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        btn=findViewById(R.id.button_zero);

        if (mCount != 0)
            btn.setBackgroundColor(Color.GREEN);

        if(mCount % 2 == 0)
            view.setBackgroundColor(Color.CYAN);
        else if(mCount % 2 != 0)
            view.setBackgroundResource(R.color.colorPrimary);

    }

    public void showZero(View view){
        mCount=0;
        mShowCount.setText(Integer.toString(mCount));
        btn=findViewById(R.id.button_count);
        if(mCount == 0) {
            view.setBackgroundColor(Color.LTGRAY);
            btn.setBackgroundResource(R.color.colorPrimary);
        }
    }
}