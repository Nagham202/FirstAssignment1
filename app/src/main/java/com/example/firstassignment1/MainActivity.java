package com.example.firstassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    Button run;
    Button calculate;
    LinearLayout linearShow;
    RadioGroup groupPick;


    TextView text;
    TextView text1;
    TextView text2;
    TextView text3;
    EditText edittext1;
    EditText edittext2;
    EditText edittext3;
    EditText editresult;
    EditText multdetails;
    RadioButton radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        run = findViewById(R.id.run);
        linearShow = findViewById(R.id.linearshow);
        groupPick = findViewById(R.id.grouppick);
        text = findViewById(R.id.text);
        text1 = findViewById(R.id.length);
        text2 = findViewById(R.id.width);
        text3 = findViewById(R.id.height);
        edittext1 = findViewById(R.id.editlength);
        edittext2 = findViewById(R.id.editwidth);
        edittext3 = findViewById(R.id.editheight);
        editresult = findViewById(R.id.editresult);
        calculate = findViewById(R.id.calculate);
        multdetails = findViewById(R.id.multidetails);


        String[] types = {"Circle", "Rectangle", "Square", "Triangle"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, types); //this is dynamic not staticly

        spinner.setAdapter(adapter);
        multdetails.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.getId() == R.id.multidetails) {

                    view.getParent().requestDisallowInterceptTouchEvent(true);


                    switch (motionEvent.getAction() & MotionEvent.ACTION_MASK) {

                        case MotionEvent.ACTION_UP:
                            view.getParent().requestDisallowInterceptTouchEvent(false);
                            break;
                    }
                }


                return false;

            }
        });


        run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearShow.setVisibility(View.GONE);
                edittext1.setText("");
                edittext2.setText("");
                edittext3.setText("");
                editresult.setText("");
                multdetails.setText("");
                int radioId = groupPick.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                if (radioButton.getText().toString().equals("Area") && spinner.getSelectedItem().equals("Circle")) {
                    linearShow.setVisibility(View.VISIBLE);
                    multdetails.requestFocus();
                    multdetails.setFocusable(View.NOT_FOCUSABLE);
                    text.setText("Area of a circle");
                    text1.setText("Radius");
                    edittext1.setHint("Enter the radius :");
                    text2.setVisibility(View.GONE);
                    edittext2.setVisibility(View.GONE);
                    text3.setVisibility(View.GONE);
                    edittext3.setVisibility(View.GONE);
                    multdetails.requestFocus();


                } else if (radioButton.getText().toString().equals("Area") && spinner.getSelectedItem().equals("Rectangle")) {
                    linearShow.setVisibility(View.VISIBLE);
                    multdetails.requestFocus();
                    multdetails.setFocusable(View.NOT_FOCUSABLE);
                    text.setText("Area of a rectangle");
                    text1.setText("Length");
                    edittext1.setHint("Enter the length :");
                    text2.setVisibility(View.VISIBLE);
                    edittext2.setVisibility(View.VISIBLE);

                    text2.setText("width");
                    edittext2.setHint("Enter the width :");

                    text3.setVisibility(View.GONE);
                    edittext3.setVisibility(View.GONE);
                    multdetails.requestFocus();

                } else if (radioButton.getText().toString().equals("Area") && spinner.getSelectedItem().equals("Square")) {
                    linearShow.setVisibility(View.VISIBLE);
                    multdetails.requestFocus();
                    multdetails.setFocusable(View.NOT_FOCUSABLE);
                    text.setText("Area of a square");
                    text1.setText("length");
                    edittext1.setHint("Enter the length :");
                    text2.setVisibility(View.GONE);
                    edittext2.setVisibility(View.GONE);
                    text3.setVisibility(View.GONE);
                    edittext3.setVisibility(View.GONE);
                    multdetails.requestFocus();

                } else if (radioButton.getText().toString().equals("Area") && spinner.getSelectedItem().equals("Triangle")) {

                    linearShow.setVisibility(View.VISIBLE);
                    multdetails.requestFocus();
                    multdetails.setFocusable(View.NOT_FOCUSABLE);
                    text.setText("Area of a triangle");
                    text1.setText("Length");
                    edittext1.setHint("Enter the length :");
                    text2.setVisibility(View.VISIBLE);
                    edittext2.setVisibility(View.VISIBLE);
                    text2.setText("height");
                    edittext2.setHint("Enter the height :");

                    text3.setVisibility(View.GONE);
                    edittext3.setVisibility(View.GONE);
                    multdetails.requestFocus();

                } else if (radioButton.getText().toString().equals("Perimeter") && spinner.getSelectedItem().equals("Circle")) {
                    linearShow.setVisibility(View.VISIBLE);
                    multdetails.requestFocus();
                    multdetails.setFocusable(View.NOT_FOCUSABLE);
                    text.setText("Perimeter of a circle");
                    text1.setText("Radius");
                    edittext1.setHint("Enter the radius :");
                    text2.setVisibility(View.GONE);
                    edittext2.setVisibility(View.GONE);
                    text3.setVisibility(View.GONE);
                    edittext3.setVisibility(View.GONE);
                    multdetails.requestFocus();

                } else if (radioButton.getText().toString().equals("Perimeter") && spinner.getSelectedItem().equals("Rectangle")) {
                    linearShow.setVisibility(View.VISIBLE);
                    multdetails.requestFocus();
                    multdetails.setFocusable(View.NOT_FOCUSABLE);
                    text.setText("Perimeter of a rectangle");
                    text1.setText("Length");
                    edittext1.setHint("Enter the length :");
                    text2.setVisibility(View.VISIBLE);
                    edittext2.setVisibility(View.VISIBLE);

                    text2.setText("width");
                    edittext2.setHint("Enter the width :");

                    text3.setVisibility(View.GONE);
                    edittext3.setVisibility(View.GONE);
                    multdetails.requestFocus();


                } else if (radioButton.getText().toString().equals("Perimeter") && spinner.getSelectedItem().equals("Square")) {
                    linearShow.setVisibility(View.VISIBLE);
                    multdetails.requestFocus();
                    multdetails.setFocusable(View.NOT_FOCUSABLE);
                    text.setText("Perimeter of a square");
                    text1.setText("length");
                    edittext1.setHint("Enter the length :");
                    text2.setVisibility(View.GONE);
                    edittext2.setVisibility(View.GONE);
                    text3.setVisibility(View.GONE);
                    edittext3.setVisibility(View.GONE);
                    multdetails.requestFocus();


                } else if (radioButton.getText().toString().equals("Perimeter") && spinner.getSelectedItem().equals("Triangle")) {

                    linearShow.setVisibility(View.VISIBLE);
                    multdetails.requestFocus();
                    multdetails.setFocusable(View.NOT_FOCUSABLE);
                    text.setText("Perimeter of a triangle");
                    text1.setText("Length");
                    edittext1.setHint("Enter the length :");
                    text2.setVisibility(View.VISIBLE);
                    edittext2.setVisibility(View.VISIBLE);
                    text2.setText("width");
                    edittext2.setHint("Enter the width :");
                    text2.setVisibility(View.VISIBLE);
                    edittext2.setVisibility(View.VISIBLE);
                    text3.setVisibility(View.VISIBLE);
                    edittext3.setVisibility(View.VISIBLE);
                    text3.setText("height");
                    edittext3.setHint("Enter the height :");
                    multdetails.requestFocus();


                }

            }
        });


        calculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int radioId = groupPick.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                if (radioButton.getText().toString().equals("Area") && spinner.getSelectedItem().equals("Circle")) {

                    if (edittext1.getText().toString().equals("")) {


                        Toast.makeText(MainActivity.this, "Error!! the radius is empty", Toast.LENGTH_SHORT).show();
                        edittext1.setText("");

                        multdetails.setText("");
                        editresult.setText("");

                    } else {
                        circle circle = new circle(Double.parseDouble(edittext1.getText().toString()));

                        editresult.setText(String.valueOf(circle.getarea()));
                        multdetails.setText(circle.getareadetails());
                    }
                } else if (radioButton.getText().toString().equals("Area") && spinner.getSelectedItem().equals("Rectangle")) {
                    if (edittext1.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Error!! the length is empty", Toast.LENGTH_SHORT).show();
                        edittext1.setText("");
                        edittext2.setText("");
                        multdetails.setText("");
                        editresult.setText("");

                    } else if (edittext2.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Error!! the width is empty", Toast.LENGTH_SHORT).show();
                        edittext1.setText("");
                        edittext2.setText("");
                        multdetails.setText("");
                        editresult.setText("");

                    } else if (edittext1.getText().toString().equals("") && edittext2.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Error!! the length and width is empty", Toast.LENGTH_SHORT).show();
                        edittext1.setText("");
                        edittext2.setText("");
                        multdetails.setText("");
                        editresult.setText("");

                    } else {
                        rectangle rectangle = new rectangle(Double.parseDouble(edittext1.getText().toString()), Double.parseDouble(edittext2.getText().toString()));

                        editresult.setText(String.valueOf(rectangle.getarea()));
                        multdetails.setText(rectangle.getareadetails());

                    }

                } else if (radioButton.getText().toString().equals("Area") && spinner.getSelectedItem().equals("Square")) {

                    if (edittext1.getText().toString().equals("")) {

                        Toast.makeText(MainActivity.this, "Error!! the length is empty", Toast.LENGTH_SHORT).show();
                        edittext1.setText("");

                        multdetails.setText("");
                        editresult.setText("");

                    } else {
                        square square = new square(Double.parseDouble(edittext1.getText().toString()));

                        editresult.setText(String.valueOf(square.getarea()));
                        multdetails.setText(square.getareadetails());
                    }
                } else if (radioButton.getText().toString().equals("Area") && spinner.getSelectedItem().equals("Triangle")) {

                    if (edittext1.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Error!! the length is empty", Toast.LENGTH_SHORT).show();
                        edittext1.setText("");
                        edittext2.setText("");
                        multdetails.setText("");
                        editresult.setText("");

                    } else if (edittext2.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Error!! the height is empty", Toast.LENGTH_SHORT).show();
                        edittext1.setText("");
                        edittext2.setText("");
                        multdetails.setText("");
                        editresult.setText("");

                    } else if (edittext1.getText().toString().equals("") && edittext2.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Error!! the length and height is empty", Toast.LENGTH_SHORT).show();
                        edittext1.setText("");
                        edittext2.setText("");
                        multdetails.setText("");
                        editresult.setText("");

                    } else {
                        triangle triangle = new triangle(Double.parseDouble(edittext1.getText().toString()), Double.parseDouble(edittext2.getText().toString()));

                        editresult.setText(String.valueOf(triangle.getarea()));
                        multdetails.setText(triangle.getareadetails());

                    }

                } else if (radioButton.getText().toString().equals("Perimeter") && spinner.getSelectedItem().equals("Circle")) {
                    if (edittext1.getText().toString().equals("")) {
                        edittext1.setText("");

                        multdetails.setText("");
                        editresult.setText("");

                        Toast.makeText(MainActivity.this, "Error!! the radius is empty", Toast.LENGTH_SHORT).show();
                    } else {
                        circle circle = new circle(Double.parseDouble(edittext1.getText().toString()));

                        editresult.setText(String.valueOf(circle.getperimeter()));
                        multdetails.setText(circle.getperimeterdetails());
                    }

                } else if (radioButton.getText().toString().equals("Perimeter") && spinner.getSelectedItem().equals("Rectangle")) {
                    if (edittext1.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Error!! the length is empty", Toast.LENGTH_SHORT).show();
                        edittext1.setText("");
                        edittext2.setText("");
                        multdetails.setText("");
                        editresult.setText("");

                    } else if (edittext2.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Error!! the width is empty", Toast.LENGTH_SHORT).show();
                        edittext1.setText("");
                        edittext2.setText("");
                        multdetails.setText("");
                        editresult.setText("");

                    } else if (edittext1.getText().toString().equals("") && edittext2.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Error!! the length and width is empty", Toast.LENGTH_SHORT).show();
                        edittext1.setText("");
                        edittext2.setText("");
                        multdetails.setText("");
                        editresult.setText("");

                    } else {
                        rectangle rectangle = new rectangle(Double.parseDouble(edittext1.getText().toString()), Double.parseDouble(edittext2.getText().toString()));

                        editresult.setText(String.valueOf(rectangle.getperimeter()));
                        multdetails.setText(rectangle.getperimeterdetails());

                    }


                } else if (radioButton.getText().toString().equals("Perimeter") && spinner.getSelectedItem().equals("Square")) {

                    if (edittext1.getText().toString().equals("")) {

                        Toast.makeText(MainActivity.this, "Error!! the length is empty", Toast.LENGTH_SHORT).show();
                        edittext1.setText("");

                        multdetails.setText("");
                        editresult.setText("");
                    } else {
                        square square = new square(Double.parseDouble(edittext1.getText().toString()));

                        editresult.setText(String.valueOf(square.getperimeter()));
                        multdetails.setText(square.getperimeterdetails());
                    }
                } else if (radioButton.getText().toString().equals("Perimeter") && spinner.getSelectedItem().equals("Triangle")) {

                    if (edittext1.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Error!! the length is empty", Toast.LENGTH_SHORT).show();
                        edittext1.setText("");
                        edittext2.setText("");
                        edittext3.setText("");
                        multdetails.setText("");
                        editresult.setText("");

                    } else if (edittext2.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Error!! the width is empty", Toast.LENGTH_SHORT).show();
                        edittext1.setText("");
                        edittext2.setText("");
                        edittext3.setText("");
                        multdetails.setText("");
                        editresult.setText("");

                    } else if (edittext3.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Error!! the height is empty", Toast.LENGTH_SHORT).show();
                        edittext1.setText("");
                        edittext2.setText("");
                        edittext3.setText("");
                        multdetails.setText("");
                        editresult.setText("");

                    } else if (edittext1.getText().toString().equals("") || edittext2.getText().toString().equals("") || edittext3.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Error!! the some field are empty", Toast.LENGTH_SHORT).show();
                        edittext1.setText("");
                        edittext2.setText("");
                        edittext3.setText("");
                        multdetails.setText("");
                        editresult.setText("");

                    } else {
                        triangle triangle = new triangle(Double.parseDouble(edittext1.getText().toString()), Double.parseDouble(edittext2.getText().toString()), Double.parseDouble(edittext3.getText().toString()));

                        editresult.setText(String.valueOf(triangle.getperimeter()));
                        multdetails.setText(triangle.getperimeterdetails());

                    }

                }

            }
        });
    }
}