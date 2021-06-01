package com.example.inventroycounterapplication;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {


    private TextView numberBox1,numberBox2,numberBox3,numberBox4,numberBox5,numberBox6;
    private ImageButton plusBTN1,plusBTN2,plusBTN3,plusBTN4,plusBTN5,plusBTN6;
    private ImageButton minusBTN1,minusBTN2,minusBTN3,minusBTN4,minusBTN5,minusBTN6;
    private int counterProduct1,counterProduct2,counterProduct3,counterProduct4,counterProduct5,counterProduct6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Product 1
        numberBox1 =  (TextView) findViewById(R.id.numberBox1);
        plusBTN1 = (ImageButton) findViewById(R.id.plus_button1);
        minusBTN1 = (ImageButton) findViewById(R.id.minus_button1);

        //Listeners for Product 1
        plusBTN1.setOnClickListener(v -> {
            counterProduct1++;
            numberBox1.setText(counterProduct1+"");
        });
        minusBTN1.setOnClickListener(v -> {
            counterProduct1--;
            numberBox1.setText(counterProduct1+"");
        });

        //Product 2
        numberBox2 =  (TextView) findViewById(R.id.numberBox2);
        plusBTN2 = (ImageButton) findViewById(R.id.plus_button2);
        minusBTN2 = (ImageButton) findViewById(R.id.minus_button2);

        //Listeners for Product 2
        plusBTN2.setOnClickListener(v -> {
            counterProduct2++;
            numberBox2.setText(counterProduct2+"");
        });
        minusBTN2.setOnClickListener(v -> {
            counterProduct2--;
            numberBox2.setText(counterProduct2+"");
        });


        //Product 3
        numberBox3 =  (TextView) findViewById(R.id.numberBox3);
        plusBTN3 = (ImageButton) findViewById(R.id.plus_button3);
        minusBTN3 = (ImageButton) findViewById(R.id.minus_button3);

        //Listeners for Product 3
        plusBTN3.setOnClickListener(v -> {
            counterProduct3++;
            numberBox3.setText(counterProduct3+"");
        });
        minusBTN3.setOnClickListener(v -> {
            counterProduct3--;
            numberBox3.setText(counterProduct3+"");
        });



        //Product 4
        numberBox4 =  (TextView) findViewById(R.id.numberBox4);
        plusBTN4 = (ImageButton) findViewById(R.id.plus_button4);
        minusBTN4 = (ImageButton) findViewById(R.id.minus_button4);

        //Listeners for Product 4
        plusBTN4.setOnClickListener(v -> {
            counterProduct4++;
            numberBox4.setText(counterProduct4+"");
        });
        minusBTN4.setOnClickListener(v -> {
            counterProduct4--;
            numberBox4.setText(counterProduct4+"");
        });

        //Product 5
        numberBox5 =  (TextView) findViewById(R.id.numberBox5);
        plusBTN5 = (ImageButton) findViewById(R.id.plus_button5);
        minusBTN5 = (ImageButton) findViewById(R.id.minus_button5);

        //Listeners for Product 5
        plusBTN5.setOnClickListener(v -> {
            counterProduct5++;
            numberBox5.setText(counterProduct5+"");
        });
        minusBTN5.setOnClickListener(v -> {
            counterProduct5--;
            numberBox5.setText(counterProduct5+"");
        });

        //Product 6
        numberBox6 =  (TextView) findViewById(R.id.numberBox6);
        plusBTN6 = (ImageButton) findViewById(R.id.plus_button6);
        minusBTN6 = (ImageButton) findViewById(R.id.minus_button6);

        //Listeners for Product 6
        plusBTN6.setOnClickListener(v -> {
            counterProduct6++;
            numberBox6.setText(counterProduct6+"");
        });
        minusBTN6.setOnClickListener(v -> {
            counterProduct6--;
            numberBox6.setText(counterProduct6+"");
        });


        initCounter();

    }

    private void initCounter()
    {
        counterProduct1 = counterProduct2 = counterProduct3 = counterProduct4 = counterProduct5 = counterProduct6 = 0;

        numberBox1.setText(counterProduct1 + "");
        numberBox2.setText(counterProduct2 + "");
        numberBox3.setText(counterProduct3 + "");
        numberBox4.setText(counterProduct4 + "");
        numberBox5.setText(counterProduct5 + "");
        numberBox6.setText(counterProduct6 + "");
    }


}