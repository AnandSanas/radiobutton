package com.example.radiobuttoncomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgp;
    RadioButton rbtn, cb1, cb2, cb3, cb4, cb5;
    TextView output;
    Button reset, submit;
    int result;
    String fruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgp = findViewById(R.id.rgp);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);

        output = findViewById(R.id.output);

        reset = findViewById(R.id.reset);
        submit = findViewById(R.id.submit);



        rgp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
              rbtn = findViewById(checkedId);
              // fruit = rbtn.getText().toString(); this string conversion causing app crash
              Toast.makeText(MainActivity.this, "You are hovering "+fruit,Toast.LENGTH_SHORT).show();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result = rgp.getCheckedRadioButtonId();
                rbtn = findViewById(result);
                fruit = rbtn.getText().toString();

                if (result==-1)
                {
                    Toast.makeText(MainActivity.this, "No option is selected", Toast.LENGTH_LONG).show();
                }
                else
                {
                    findradiobutton();
                }
                output.setText(fruit);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rgp.clearCheck();

            }
        });



    }

    private void findradiobutton() {

        switch (result)
        {
            case R.id.cb1:
                Toast.makeText(this, "You selected "+fruit, Toast.LENGTH_SHORT).show();
                break;

            case R.id.cb2:
                Toast.makeText(this, "You selected "+fruit, Toast.LENGTH_SHORT).show();
                break;

            case R.id.cb3:
                Toast.makeText(this, "You selected "+fruit, Toast.LENGTH_SHORT).show();
                break;

            case R.id.cb4:
                Toast.makeText(this, "You selected "+fruit, Toast.LENGTH_SHORT).show();
                break;

            case R.id.cb5:
                Toast.makeText(this, "You selected "+fruit, Toast.LENGTH_SHORT).show();
                break;
        }

    }
}