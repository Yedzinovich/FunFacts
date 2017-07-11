package com.example.inna.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG=FunFactsActivity.class.getSimpleName();
    //declare variables
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mBackground;


    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the values to variables
        mFactTextView=(TextView)findViewById(R.id.factTextView);
        mShowFactButton=(Button)findViewById(R.id.showFactButton);
        mBackground=(RelativeLayout)findViewById(R.id.Background);

         View.OnClickListener listener =new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String fact = mFactBook.getFact();
               int color=mColorWheel.getColor();
                //Update the screen with our dynamic facts
                mFactTextView.setText(fact);
                mBackground.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);
            }
        };
        mShowFactButton.setOnClickListener(listener);

       // Toast.makeText(FunFactsActivity.this, "Yey, our activity was created", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "We are logging from the onCreate method");
    }
}
