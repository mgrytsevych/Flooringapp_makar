package makar.flooringapp_makar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Makar on 3/5/2017.
 */

public class SecondActivity extends AppCompatActivity {

    //variables
    TextView tvResult;
    Double Length, Width, Area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        tvResult = (TextView) findViewById(R.id.textViewResult);

        Bundle extras = getIntent().getExtras();
        Length = extras.getDouble("rmLength");//checks users input for length
        Width = extras.getDouble("rmWidth");//checks input of width

        Area = Length*Width; //calculating area

        //sets the output
        tvResult.setText("Flooring Area: Width is " + Width + " and Length is " + Length + " and flooring needed is " + Area + " square units.");
    }
}
