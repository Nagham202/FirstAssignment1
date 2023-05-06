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
spinner=findViewById(R.id.spinner);
run=findViewById(R.id.run);
linearShow=findViewById(R.id.linearshow);
groupPick=findViewById(R.id.grouppick);
text=findViewById(R.id.text);
text1=findViewById(R.id.length);
text2=findViewById(R.id.width);
text3=findViewById(R.id.height);
edittext1=findViewById(R.id.editlength);
edittext2=findViewById(R.id.editwidth);
edittext3=findViewById(R.id.editheight);
editresult=findViewById(R.id.editresult);
calculate=findViewById(R.id.calculate);
multdetails=findViewById(R.id.multidetails);




        String[] types= {"Circle","Rectangle","Square","Triangle"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,types); //this is dynamic not staticly

        spinner.setAdapter(adapter);
        multdetails.setOnTouchListener(new View.OnTouchListener() {
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if(view.getId()==R.id.multidetails){

            view.getParent().requestDisallowInterceptTouchEvent(true);


            switch (motionEvent.getAction() & MotionEvent.ACTION_MASK){

                case MotionEvent.ACTION_UP: view.getParent().requestDisallowInterceptTouchEvent(false);
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
                int radioId=groupPick.getCheckedRadioButtonId();
                radioButton=findViewById(radioId);
                if(radioButton.getText().toString().equals("Area") && spinner.getSelectedItem().equals("Circle")) {
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


                }
                    else if(radioButton.getText().toString().equals("Area") && spinner.getSelectedItem().equals("Rectangle")) {
                    linearShow.setVisibility(View.VISIBLE);
                    multdetails.requestFocus();
                    multdetails.setFocusable(View.NOT_FOCUSABLE);
                        text.setText("Area of a rectangle");
                        text1.setText("Length");
                        edittext1.setHint("Enter the length :");
                        text2.setVisibility(View.VISIBLE);
                    edittext2.setVisibility(View.VISIBLE);

                    text2.setText("weight");
                        edittext2.setHint("Enter the weight :");

                        text3.setVisibility(View.GONE);
                        edittext3.setVisibility(View.GONE);
                    multdetails.requestFocus();

                    }
                else if(radioButton.getText().toString().equals("Area") && spinner.getSelectedItem().equals("Square")) {
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

                }
                else if(radioButton.getText().toString().equals("Area") && spinner.getSelectedItem().equals("Triangle")) {

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

                }


                 else if (radioButton.getText().toString().equals("Circumference")  && spinner.getSelectedItem().equals("Circle")) {
                    linearShow.setVisibility(View.VISIBLE);
                    multdetails.requestFocus();
                    multdetails.setFocusable(View.NOT_FOCUSABLE);
                    text.setText("Circumference of a circle");
                    text1.setText("Radius");
                    edittext1.setHint("Enter the radius :");
                    text2.setVisibility(View.GONE);
                    edittext2.setVisibility(View.GONE);
                    text3.setVisibility(View.GONE);
                    edittext3.setVisibility(View.GONE);
                    multdetails.requestFocus();

                }
                else if(radioButton.getText().toString().equals("Circumference") && spinner.getSelectedItem().equals("Rectangle")) {
                    linearShow.setVisibility(View.VISIBLE);
                    multdetails.requestFocus();
                    multdetails.setFocusable(View.NOT_FOCUSABLE);
                    text.setText("Circumference of a rectangle");
                    text1.setText("Length");
                    edittext1.setHint("Enter the length :");
                    text2.setVisibility(View.VISIBLE);
                    edittext2.setVisibility(View.VISIBLE);

                    text2.setText("weight");
                    edittext2.setHint("Enter the weight :");

                    text3.setVisibility(View.GONE);
                    edittext3.setVisibility(View.GONE);
                    multdetails.requestFocus();


                }
                else if(radioButton.getText().toString().equals("Circumference") && spinner.getSelectedItem().equals("Square")) {
                    linearShow.setVisibility(View.VISIBLE);
                    multdetails.requestFocus();
                    multdetails.setFocusable(View.NOT_FOCUSABLE);
                    text.setText("Circumference of a square");
                    text1.setText("length");
                    edittext1.setHint("Enter the length :");
                    text2.setVisibility(View.GONE);
                    edittext2.setVisibility(View.GONE);
                    text3.setVisibility(View.GONE);
                    edittext3.setVisibility(View.GONE);
                    multdetails.requestFocus();


                }
                else if(radioButton.getText().toString().equals("Circumference") && spinner.getSelectedItem().equals("Triangle")) {

                    linearShow.setVisibility(View.VISIBLE);
                    multdetails.requestFocus();
                    multdetails.setFocusable(View.NOT_FOCUSABLE);
                    text.setText("Circumference of a triangle");
                    text1.setText("Length");
                    edittext1.setHint("Enter the length :");
                    text2.setVisibility(View.VISIBLE);
                    edittext2.setVisibility(View.VISIBLE);
                    text2.setText("weight");
                    edittext2.setHint("Enter the weight :");
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
            circle circle=new circle();
            rectangle rectangle=new rectangle();
            square square=new square();
            triangle triangle=new triangle();
            @Override
            public void onClick(View view) {
                int radioId=groupPick.getCheckedRadioButtonId();
                radioButton=findViewById(radioId);
                if(radioButton.getText().toString().equals("Area") && spinner.getSelectedItem().equals("Circle")) {

                    if(edittext1.getText().toString().equals("")){

                        Toast.makeText(MainActivity.this, "Error!! the radius is empty", Toast.LENGTH_SHORT).show();
                    }
                    else{

                        editresult.setText(String.valueOf(circle.areaCircle(Double.parseDouble(edittext1.getText().toString()))));
                        multdetails.setText( circle.areadetails(Double.parseDouble(edittext1.getText().toString())));
                    }
                }
                else if(radioButton.getText().toString().equals("Area") && spinner.getSelectedItem().equals("Rectangle")) {
if (edittext1.getText().toString().equals("")){
    Toast.makeText(MainActivity.this, "Error!! the length is empty", Toast.LENGTH_SHORT).show();

}
else if(edittext2.getText().toString().equals("")){
    Toast.makeText(MainActivity.this, "Error!! the weight is empty", Toast.LENGTH_SHORT).show();

} else if (edittext1.getText().toString().equals("") && edittext2.getText().toString().equals("")) {
    Toast.makeText(MainActivity.this, "Error!! the length and weight is empty", Toast.LENGTH_SHORT).show();

}
else{
    editresult.setText(String.valueOf(rectangle.areaRectangle(Double.parseDouble(edittext1.getText().toString()),Double.parseDouble(edittext2.getText().toString()))));
    multdetails.setText( rectangle.areadetails(Double.parseDouble(edittext1.getText().toString()),Double.parseDouble(edittext2.getText().toString())));

}

                }
                else if(radioButton.getText().toString().equals("Area") && spinner.getSelectedItem().equals("Square")) {

                    if(edittext1.getText().toString().equals("")){

                        Toast.makeText(MainActivity.this, "Error!! the length is empty", Toast.LENGTH_SHORT).show();
                    }
                    else{

                        editresult.setText(String.valueOf(square.areaSquare(Double.parseDouble(edittext1.getText().toString()))));
                        multdetails.setText( square.areadetails(Double.parseDouble(edittext1.getText().toString())));
                    }
                }
                else if(radioButton.getText().toString().equals("Area") && spinner.getSelectedItem().equals("Triangle")) {

                    if (edittext1.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this, "Error!! the length is empty", Toast.LENGTH_SHORT).show();

                    }
                    else if(edittext2.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this, "Error!! the height is empty", Toast.LENGTH_SHORT).show();

                    } else if (edittext1.getText().toString().equals("") && edittext2.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Error!! the length and height is empty", Toast.LENGTH_SHORT).show();

                    }
                    else{
                        editresult.setText(String.valueOf(triangle.areaTriangle(Double.parseDouble(edittext1.getText().toString()),Double.parseDouble(edittext2.getText().toString()))));
                        multdetails.setText( triangle.areadetails(Double.parseDouble(edittext1.getText().toString()),Double.parseDouble(edittext2.getText().toString())));

                    }

                }


                else if (radioButton.getText().toString().equals("Circumference")  && spinner.getSelectedItem().equals("Circle")) {
                    if(edittext1.getText().toString().equals("")){

                        Toast.makeText(MainActivity.this, "Error!! the radius is empty", Toast.LENGTH_SHORT).show();
                    }
                    else{

                        editresult.setText(String.valueOf(circle.circumferenceCircle(Double.parseDouble(edittext1.getText().toString()))));
                        multdetails.setText( circle.circumferencedetails(Double.parseDouble(edittext1.getText().toString())));
                    }

                }
                else if(radioButton.getText().toString().equals("Circumference") && spinner.getSelectedItem().equals("Rectangle")) {
                    if (edittext1.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this, "Error!! the length is empty", Toast.LENGTH_SHORT).show();

                    }
                    else if(edittext2.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this, "Error!! the weight is empty", Toast.LENGTH_SHORT).show();

                    } else if (edittext1.getText().toString().equals("") && edittext2.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Error!! the length and weight is empty", Toast.LENGTH_SHORT).show();

                    }
                    else{
                        editresult.setText(String.valueOf(rectangle.circumferenceRectangle(Double.parseDouble(edittext1.getText().toString()),Double.parseDouble(edittext2.getText().toString()))));
                        multdetails.setText( rectangle.circumferencedetails(Double.parseDouble(edittext1.getText().toString()),Double.parseDouble(edittext2.getText().toString())));

                    }


                }
                else if(radioButton.getText().toString().equals("Circumference") && spinner.getSelectedItem().equals("Square")) {

                    if(edittext1.getText().toString().equals("")){

                        Toast.makeText(MainActivity.this, "Error!! the length is empty", Toast.LENGTH_SHORT).show();
                    }
                    else{

                        editresult.setText(String.valueOf(square.circumferenceSquare(Double.parseDouble(edittext1.getText().toString()))));
                        multdetails.setText( square.circumferencedetails(Double.parseDouble(edittext1.getText().toString())));
                    }
                }
                else if(radioButton.getText().toString().equals("Circumference") && spinner.getSelectedItem().equals("Triangle")) {

                    if (edittext1.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this, "Error!! the length is empty", Toast.LENGTH_SHORT).show();

                    }
                    else if(edittext2.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this, "Error!! the weight is empty", Toast.LENGTH_SHORT).show();

                    }
                    else if(edittext3.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this, "Error!! the height is empty", Toast.LENGTH_SHORT).show();

                    }
                    else if (edittext1.getText().toString().equals("") || edittext2.getText().toString().equals("") ||  edittext3.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Error!! the some field are empty", Toast.LENGTH_SHORT).show();

                    }
                    else{
                        editresult.setText(String.valueOf(triangle.circumferenceTriangle(Double.parseDouble(edittext1.getText().toString()),Double.parseDouble(edittext2.getText().toString()),Double.parseDouble(edittext3.getText().toString()))));
                        multdetails.setText( triangle.circumferencedetails(Double.parseDouble(edittext1.getText().toString()),Double.parseDouble(edittext2.getText().toString()),Double.parseDouble(edittext3.getText().toString())));

                    }

                }

            }
        });
    }
}