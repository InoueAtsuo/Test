package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText input1;
    private Button button1;
    private TextView text1;
    private Button moveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
        button1 = findViewById(R.id.button1);
        text1 = findViewById(R.id.text1);
        moveButton = findViewById(R.id.move_button);

        setView();
    }

    private void setView() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputValue1 = input1.getText().toString();
                text1.setText(inputValue1);
            }
        });

        moveButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity02.class);
                startActivity(intent);
            }
        });
    }
}
