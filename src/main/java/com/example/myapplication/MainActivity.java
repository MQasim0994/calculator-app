package com.example.myapplication; // Line 1 par apna actual package name rehne dijiyega

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView; // TextView ke liye naya import
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        CheckBox checkBox1 = findViewById(R.id.checkBox1);
        CheckBox checkBox2=findViewById(R.id.checkBox2);
        CheckBox checkBox3=findViewById(R.id.checkBox3);
        Button myButton = findViewById(R.id.myButton);
        TextView tvResult = findViewById(R.id.tvResult);


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox1.isChecked()) {
                    Toast.makeText(MainActivity.this, "Order place successful", Toast.LENGTH_SHORT).show();

                    tvResult.setText("Order place successful");
                    tvResult.setTextColor(0xFF00AA00);

                }
                if(checkBox2.isChecked()){
                    Toast.makeText(MainActivity.this,"Pizza added in cart",Toast.LENGTH_SHORT).show();
                    tvResult.setText("Pizza added in cart");
                    tvResult.setTextColor(0xFF00AA00);
                }
                if(checkBox3.isChecked()){
                    Toast.makeText(MainActivity.this,"Burger added in cart",Toast.LENGTH_SHORT).show();
                    tvResult.setText("Burger added in cart");
                    tvResult.setTextColor(0xFF00AA00);
                }


                }

        });
    }
}