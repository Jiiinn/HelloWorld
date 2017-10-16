package my.edu.taruc.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //R = resources class
        //Display this UI
        setContentView(R.layout.activity_main);

    }

    //View class - refers to any UI component
    public void displayName(View v){
        TextView textViewName;
        EditText editTextName;
        EditText editTextAge;
        int age;

        //Link UI to variable
        textViewName = (TextView)findViewById(R.id.textViewName);
        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextAge = (EditText)findViewById(R.id.editTextAge);

        age = Integer.parseInt(editTextAge.getText().toString());
        age += 1;

        textViewName.setText(getString(R.string.greeting) + " " + editTextName.getText() + ", you will be " + age + " in 2018.");
    }

    public void clearScreen(View v){
        TextView clearScreen;

        //Link UI to variable
        clearScreen = (TextView)findViewById(R.id.textViewName);
        clearScreen.setText(" ");
    }
}
