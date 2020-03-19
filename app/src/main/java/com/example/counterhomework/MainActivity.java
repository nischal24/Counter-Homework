package com.example.counterhomework;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button countButton;
    private TextView text;
    private EditText editText;
    private  int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countButton=findViewById(R.id.countButton);
        text=findViewById(R.id.textView);
        if (savedInstanceState != null)
        {
            text.setText(savedInstanceState.getString("value"));
            counter=savedInstanceState.getInt("countNumber");
        }
        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                if (text!=null)
                {
                    text.setText(String.valueOf(counter));
                }
            }
        });
    }
    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putInt("countNumber",counter);
        outState.putString("value", text.getText().toString());

    }
}
