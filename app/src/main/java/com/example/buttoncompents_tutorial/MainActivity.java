package com.example.buttoncompents_tutorial;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    // Boolean for lock mode imagebutton
    Boolean lockMode = false;

    // Constraint Layout Variable
    ConstraintLayout main;
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

        // Normal Button
        Button click = findViewById(R.id.button);
        click.setOnClickListener(v -> {
            // Do something in response to button click

            Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();

        });

        // ImageButton and textview
        TextView textView = findViewById(R.id.textView);

        ImageButton LockButton = findViewById(R.id.imageButton);
        LockButton.setOnClickListener(v -> {


            lockMode = !lockMode;
            if(lockMode) {

                // Do something in response to button click
                Toast.makeText(MainActivity.this, "Lock Button Clicked", Toast.LENGTH_SHORT).show();
                textView.setText("Lock Mode:Onn");
            } else{

                // Do something in response to button click
                Toast.makeText(MainActivity.this, "Lock Button Clicked", Toast.LENGTH_SHORT).show();
                textView.setText("Lock Mode:OFF");
            }
        });

        // CheckBox
        CheckBox checkBox= findViewById(R.id.checkBox);
        checkBox.setOnClickListener(v -> {
           if (checkBox.isChecked()){
               AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Alert");
                alertDialog.setMessage("CheckBox Checked");
                alertDialog.show();
           } else{
               AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
               alertDialog.setTitle("Alert");
               alertDialog.setMessage("CheckBox Unchecked");
               alertDialog.show();
           }
        });

        // Switch and constraintLayout
        main = findViewById(R.id.main);
        Switch switchButton = findViewById(R.id.switch1);
        switchButton.setOnClickListener(v -> {
            if (switchButton.isChecked()){
                main.setBackgroundColor(getResources().getColor(R.color.white));
            } else{
                main.setBackgroundColor(getResources().getColor(R.color.black));
            }
        });

        // ToogleButton
        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setOnClickListener(v -> {
            if (toggleButton.isChecked()){
                main.setBackgroundColor(getResources().getColor(R.color.white));
                Toast.makeText(this, "Toogle pressed", Toast.LENGTH_SHORT).show();
            } else{
                main.setBackgroundColor(getResources().getColor(R.color.black));
                Toast.makeText(this, "Toogle pressed", Toast.LENGTH_SHORT).show();
            }
        });

        // This is a chipgroup button
        Chip chip1 = findViewById(R.id.chip1);
        chip1.setOnClickListener(v -> {
            Toast.makeText(this, "Chip1 pressed", Toast.LENGTH_SHORT).show();
        });
        Chip chip2 = findViewById(R.id.chip2);
        chip2.setOnClickListener(v -> {
            Toast.makeText(this, "Chip2 pressed", Toast.LENGTH_SHORT).show();
        });
        Chip chip3 = findViewById(R.id.chip3);
        chip3.setOnClickListener(v -> {
            Toast.makeText(this, "Chip3 pressed", Toast.LENGTH_SHORT).show();
        });

        // RadioButton
        RadioButton radioButton1 = findViewById(R.id.radioButton1);
        radioButton1.setOnClickListener(v -> {
            Toast.makeText(this, "RadioButton1 pressed", Toast.LENGTH_SHORT).show();
        });

        RadioButton radioButton2 = findViewById(R.id.radioButton2);
        radioButton2.setOnClickListener(v -> {
            Toast.makeText(this, "RadioButton2 pressed", Toast.LENGTH_SHORT).show();
        });

        // FloatingActionButton
        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton2);
        floatingActionButton.setOnClickListener(v -> {
            Toast.makeText(this, "You can record your voice", Toast.LENGTH_SHORT).show();
        });

    }
}