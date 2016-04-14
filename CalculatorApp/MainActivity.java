package com.example.camenbrusseau.myfirstapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double currentTopValue = 0.0;
    private double firstNum = 0.0;
    private boolean[] operators = new boolean[4];
    private boolean dotClicked = false;
    private double numClickedWhileDotClicked = 1.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void clickedZero(View view) {
        if (dotClicked) {
            currentTopValue += 0.0 / (10.0 * numClickedWhileDotClicked);
            numClickedWhileDotClicked *= 10.0;
        }
        else {
            currentTopValue = (currentTopValue * 10.0) + 0.0;
        }

        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedOne(View view) {
        if (dotClicked) {
            currentTopValue += 1.0 / (10.0 * numClickedWhileDotClicked);
            numClickedWhileDotClicked *= 10.0;
        }
        else {
            currentTopValue = (currentTopValue * 10.0) + 1.0;
        }

        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedTwo(View view) {
        if (dotClicked) {
            currentTopValue += 2.0 / (10.0 * numClickedWhileDotClicked);
            numClickedWhileDotClicked *= 10.0;
        }
        else {
            currentTopValue = (currentTopValue * 10.0) + 2.0;
        }

        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedThree(View view) {
        if (dotClicked) {
            currentTopValue += 3.0 / (10.0 * numClickedWhileDotClicked);
            numClickedWhileDotClicked *= 10.0;
        }
        else {
            currentTopValue = (currentTopValue * 10.0) + 3.0;
        }

        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedFour(View view) {
        if (dotClicked) {
            currentTopValue += 4.0 / (10.0 * numClickedWhileDotClicked);
            numClickedWhileDotClicked *= 10.0;
        }
        else {
            currentTopValue = (currentTopValue * 10.0) + 4.0;
        }

        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedFive(View view) {
        if (dotClicked) {
            currentTopValue += 5.0 / (10.0 * numClickedWhileDotClicked);
            numClickedWhileDotClicked *= 10.0;
        }
        else {
            currentTopValue = (currentTopValue * 10.0) + 5.0;
        }

        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedSix(View view) {
        if (dotClicked) {
            currentTopValue += 6.0 / (10.0 * numClickedWhileDotClicked);
            numClickedWhileDotClicked *= 10.0;
        }
        else {
            currentTopValue = (currentTopValue * 10.0) + 6.0;
        }

        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedSeven(View view) {
        if (dotClicked) {
            currentTopValue += 7.0 / (10.0 * numClickedWhileDotClicked);
            numClickedWhileDotClicked *= 10.0;
        }
        else {
            currentTopValue = (currentTopValue * 10.0) + 7.0;
        }

        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedEight(View view) {
        if (dotClicked) {
            currentTopValue += 8.0 / (10.0 * numClickedWhileDotClicked);
            numClickedWhileDotClicked *= 10.0;
        }
        else {
            currentTopValue = (currentTopValue * 10.0) + 8.0;
        }

        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedNine(View view) {
        if (dotClicked) {
            currentTopValue += 9.0 / (10.0 * numClickedWhileDotClicked);
            numClickedWhileDotClicked *= 10.0;
        }
        else {
            currentTopValue = (currentTopValue * 10.0) + 9.0;
        }

        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedPlus(View view) {
        for (int i = 0; i < operators.length; ++i) {
            if (operators[i]) {
                clickedEquals(findViewById(R.id.buttonPlus));
            }
        }

        firstNum = currentTopValue;
        currentTopValue = 0.0;
        operators[0] = true;
        dotClicked = false;
        numClickedWhileDotClicked = 1.0;
    }

    public void clickedMinus(View view) {
        for (int i = 0; i < operators.length; ++i) {
            if (operators[i]) {
                clickedEquals(findViewById(R.id.buttonMinus));
            }
        }

        firstNum = currentTopValue;
        currentTopValue = 0.0;
        operators[1] = true;
        dotClicked = false;
        numClickedWhileDotClicked = 1.0;
    }

    public void clickedDivide(View view) {
        for (int i = 0; i < operators.length; ++i) {
            if (operators[i]) {
                clickedEquals(findViewById(R.id.buttonDivide));
            }
        }

        firstNum = currentTopValue;
        currentTopValue = 0.0;
        operators[2] = true;
        dotClicked = false;
        numClickedWhileDotClicked = 1.0;
    }

    public void clickedMultiply(View view) {
        for (int i = 0; i < operators.length; ++i) {
            if (operators[i]) {
                clickedEquals(findViewById(R.id.buttonMultiply));
            }
        }

        firstNum = currentTopValue;
        currentTopValue = 0.0;
        operators[3] = true;
        dotClicked = false;
        numClickedWhileDotClicked = 1.0;
    }

    public void clickedDot(View view) {
        dotClicked = true;
    }

    public void clickedEquals(View view) {
        if (firstNum != 0) {
            for (int i = 0; i < operators.length; ++i) {
                if (operators[i]) {
                    if (i == 0) {
                        currentTopValue += firstNum;
                    }
                    if (i == 1) {
                        currentTopValue = firstNum - currentTopValue;
                    }
                    if (i == 2) {
                        currentTopValue = firstNum / currentTopValue;
                    }
                    if (i == 3) {
                        currentTopValue *= firstNum;
                    }
                    operators[i] = false;
                    dotClicked = false;
                    numClickedWhileDotClicked = 1.0;
                    firstNum = 0.0;
                    TextView topText = (TextView) findViewById(R.id.topText);
                    topText.setText("" + currentTopValue);
                    return ;
                }
            }
        }
    }

    public void clickedClear(View view) {
        currentTopValue = 0.0;
        firstNum = 0.0;
        dotClicked = false;
        numClickedWhileDotClicked = 1.0;
        for (int i = 0; i < operators.length; ++i) {
            operators[i] = false;
        }
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

}
