package com.example.fy_wy.cal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class angle extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angle);
        Button but_one = (Button) findViewById(R.id.buttonOne);
        Button but_two = (Button) findViewById(R.id.buttonTwo);
        Button but_three = (Button) findViewById(R.id.buttonThree);
        Button but_four = (Button) findViewById(R.id.buttonFour);
        Button but_five = (Button) findViewById(R.id.buttonFive);
        Button but_six = (Button) findViewById(R.id.buttonSix);
        Button but_seven = (Button) findViewById(R.id.buttonSeven);
        Button but_eight = (Button) findViewById(R.id.buttonEight);
        Button but_nine = (Button) findViewById(R.id.buttonNine);
        Button but_zero = (Button) findViewById(R.id.buttonZero);
        Button but_point = (Button) findViewById(R.id.buttonpoint);
        Button but_clear = (Button) findViewById(R.id.buttonClear);
        Button but_equal=(Button) findViewById(R.id.buttonEqual);
        but_one.setOnClickListener(new MyclickListener());
        but_two.setOnClickListener(new MyclickListener());
        but_three.setOnClickListener(new MyclickListener());
        but_four.setOnClickListener(new MyclickListener());
        but_five.setOnClickListener(new MyclickListener());
        but_six.setOnClickListener(new MyclickListener());
        but_seven.setOnClickListener(new MyclickListener());
        but_eight.setOnClickListener(new MyclickListener());
        but_nine.setOnClickListener(new MyclickListener());
        but_zero.setOnClickListener(new MyclickListener());
        but_point.setOnClickListener(new MyclickListener());
        but_clear.setOnClickListener(new MyclickListener());
        but_equal.setOnClickListener(new MyclickListener());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.menu_one:
                Intent intent1 = new Intent(angle.this, MainActivity.class);
                startActivity(intent1);
                break;
            case R.id.menu_three:
                Intent intent3 = new Intent(angle.this, area.class);
                startActivity(intent3);
                break;
            case R.id.menu_four:
                Intent intent4 = new Intent(angle.this, angle.class);
                startActivity(intent4);
                break;
            case R.id.menu_five:
                Intent intent5 = new Intent(angle.this, speed.class);
                startActivity(intent5);
                break;
            case R.id.menu_six:
                Intent intent6=new Intent(angle.this,system.class);
                startActivity(intent6);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void shouPup1(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.angle);
        popup.show();
    }
    public void shouPup2(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.angle1);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        TextView textview1 = (TextView) findViewById(R.id.textview1);
        TextView textview2 = (TextView) findViewById(R.id.textview2);
        switch (menuItem.getItemId()) {
            case R.id.menu_six:
                textview1.setText("角度");
                break;
            case R.id.menu_seven:
                textview1.setText("弧度");
                break;
            case R.id.menu_eight:
                textview2.setText("角度");
                break;
            case R.id.menu_nine:
                textview2.setText("弧度");
                break;
        }
        return false;
    }
    class MyclickListener implements View.OnClickListener {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        TextView textview1 = (TextView) findViewById(R.id.textview1);
        TextView textview2 = (TextView) findViewById(R.id.textview2);
        public void onClick(View view) {
            double num1 = 0, result = 0;
            switch (view.getId()) {
                case R.id.buttonOne:
                    editText1.setText(editText1.getText() + "1");
                    break;
                case R.id.buttonTwo:
                    editText1.setText(editText1.getText() + "2");
                    break;
                case R.id.buttonThree:
                    editText1.setText(editText1.getText() + "3");
                    break;
                case R.id.buttonFour:
                    editText1.setText(editText1.getText() + "4");
                    break;
                case R.id.buttonFive:
                    editText1.setText(editText1.getText() + "5");
                    break;
                case R.id.buttonSix:
                    editText1.setText(editText1.getText() + "6");
                    break;
                case R.id.buttonSeven:
                    editText1.setText(editText1.getText() + "7");
                    break;
                case R.id.buttonEight:
                    editText1.setText(editText1.getText() + "8");
                    break;
                case R.id.buttonNine:
                    editText1.setText(editText1.getText() + "9");
                    break;
                case R.id.buttonZero:
                    editText1.setText(editText1.getText() + "0");
                    break;
                case R.id.buttonpoint:
                    editText1.setText(editText1.getText() + ".");
                    break;
                case R.id.buttonClear:
                    editText1.setText(null);
                    editText2.setText(null);
                    break;
                case R.id.buttonEqual:
                    String mystring1 = textview1.getText().toString();
                    String mystring2 = textview2.getText().toString();
                    String mystring3 = editText1.getText().toString();
                    num1 = Double.valueOf(mystring3);
                    if (mystring1.equals("角度") && mystring2.equals("弧度")) {
                        result = num1 * Math.PI / 180;
                    }
                    else if (mystring1.equals("弧度") && mystring2.equals("角度")) {
                        result = num1 * 180 / Math.PI;
                    }
                    else if (mystring1.equals("角度") && mystring2.equals("角度")) {
                        result = num1;
                    }
                    else if (mystring1.equals("弧度") && mystring2.equals("弧度")) {
                        result = num1;
                    }
                    editText2.setText(String.valueOf(result));
                    break;
            }


        }
    }
}
