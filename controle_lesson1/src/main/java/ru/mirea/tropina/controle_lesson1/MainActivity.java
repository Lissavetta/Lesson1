package ru.mirea.tropina.controle_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCounter = 0;
    Button btn;
    TextView txv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button_cool);
        txv = (TextView) findViewById(R.id.editTextNumber);


        ImageView img= (ImageView) findViewById(R.id.imageView);
        img.setImageResource(R.drawable.catbread);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter ++;
                txv.setText(Integer.toString(mCounter));

            }
        });
    }

    public void onButtonClick(View view) {

    }
}