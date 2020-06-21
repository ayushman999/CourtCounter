package com.example.android.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    int n=0;
    int n1=0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ;
    }
    public void three(View view)
    {
        n=n+3;
        display(n);
    }
    public void twoPointer(View view)
    {
        n=n+2;
        display(n);
    }
    public void free(View view)
    {
        n=n+1;
        display(n);
    }

    public void display(int m)
    {
        TextView t=(TextView) findViewById(R.id.text_view);
        t.setText(""+m);
    }

    public void threea(View view)
    {
        n1=n1+3;
        displayB(n1);
    }
    public void twoPointera(View view)
    {
        n1=n1+2;
        displayB(n1);
    }
    public void freea(View view)
    {
        n1=n1+1;
        displayB(n1);
    }
    public void reset(View view)
    {
        n=0;
        n1=0;
        display(n);
        displayB(n1);
    }

    public void displayB(int m)
    {
        TextView t1=(TextView) findViewById(R.id.text_view1);
        t1.setText(""+m);
    }
}
