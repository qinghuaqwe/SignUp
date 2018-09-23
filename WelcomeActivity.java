package edu.temple.signupform;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class WelcomeActivity extends Activity {
    TextView WelcomeName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        WelcomeName = findViewById(R.id.WelcomeName);

        Intent intent = getIntent();

        String message = intent.getStringExtra(FormActivity.EXTRA_MESSAGE);
        WelcomeName.setText("Welcome," + " " + message + ", to the SignUpForm App");

    }
}
