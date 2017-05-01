package magicdynamite.combatmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Dice die = new Dice();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick (View view)
    {
        int attack = die.rollDie();
        String attackDisplay = Integer.toString(attack);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("You did " + attackDisplay + " points of damage!");
    }
}
