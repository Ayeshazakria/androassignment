package com.example.assign_intends;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String email[]={"a@gmail.com","b@gmail.com","c@gmail.com","d@gmail.com","d@gmail.com","e@gmail.com","f@gmail.com","g@gmail.coma","h@gmail.com","i@gmail.com"};
    int pass[]={12,34,56,78,90,11,13,14,15,16};
    EditText ed1;
    EditText ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.t1);
        ed2=(EditText)findViewById(R.id.t2);
    }

    public void signin(View view) {
boolean flag=false;
        for (int i = 0; i <= 9; i++) {
            if (email[i].equals(ed1.getText().toString()))
            {
                if ((pass[i]) == Integer.parseInt(String.valueOf(ed2.getText().toString())))
                {
                    Toast t = Toast.makeText(this, "you have successfully signed in", Toast.LENGTH_SHORT);
                    t.show();
                    flag=true;
                    break;

                }
                else
                { Toast t = Toast.makeText(this, "nvalid emailor password", Toast.LENGTH_SHORT);
                    t.show();
                    break;
                }
               // continue;

            } /*else {
                Toast t = Toast.makeText(this, "invalid emailor password", Toast.LENGTH_SHORT);
                t.show();

            }*/
        }
        if (!flag)
        { Toast t = Toast.makeText(this, "nvalid emailor password", Toast.LENGTH_SHORT);
            t.show();}
    }}
