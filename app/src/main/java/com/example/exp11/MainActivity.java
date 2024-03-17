package com.example.exp11;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,bm,bmu,bdo,bd,be,bclr;
    EditText tx; float val1=0,val2=0,res=0; String op="";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.one);
        b2=(Button)findViewById(R.id.two);
        b3=(Button)findViewById(R.id.three);
        b4 =(Button)findViewById(R.id.four);
        b5=(Button)findViewById(R.id.five);
        b6=(Button)findViewById(R.id.six);
        b7=(Button)findViewById(R.id.seven);
        b8=(Button)findViewById(R.id.eight);
        b9=(Button)findViewById(R.id.nine);
        b0=(Button)findViewById(R.id.zero);
        bp=(Button)findViewById(R.id.plus);
        bm=(Button)findViewById(R.id.minus);
        bmu=(Button)findViewById(R.id.multi);
        bdo=(Button)findViewById(R.id.dot);
        bd=(Button)findViewById(R.id.divide);
        be=(Button)findViewById(R.id.equal);
        bclr=(Button)findViewById(R.id.clear);
        tx=(EditText)findViewById(R.id.txt);

    }
    public void show(View v){
        Button b=(Button)v;
        String set=b.getText().toString();
        tx.append(set);

    }
    public void calc(View v){
        Button b=(Button)v;
        op=b.getText().toString();
        val1=Float.parseFloat(tx.getText().toString());
        tx.setText("");

    }
    public void equal(View v){
        val2=Float.parseFloat(tx.getText().toString());
        switch(op) {
            case "+":
                res =val1+val2;
                tx.setText(String.valueOf(res));
                break;
            case " -":
                res =val1
                        -val2;
                tx.setText(String.valueOf(res));
                break;
            case "*":
                res =val1*val2;
                tx.setText(String.valueOf(res));
                break;
            case "/":
                res =val1/val2;
                tx.setText(String.valueOf(res));
                break;
            default:

        }
    }
}
