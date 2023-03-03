package ru.mirea.tropina.controle_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img= (ImageView) findViewById(R.id.imageView);
        img.setImageResource(R.drawable.catbread);
    }
}