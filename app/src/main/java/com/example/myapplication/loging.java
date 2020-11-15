package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Pattern;

public class loging extends AppCompatActivity {
    Button log1;
    private TextInputLayout text2email;
    private TextInputLayout text2pass;
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
//                    "(?=.*[0-9])" +
//                    "(?=.*[a-z])" +
//                    "(?=.*[A-Z])" +
                    "(?=.*[a-zA-Z])" +
                    "(?=.*[@#$%^&+=])" +
                    "(?=\\S+$)" +
                    ".{6,}" +
                    "$");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loging);

        log1 = findViewById(R.id.login1);

        text2email=findViewById(R.id.text_input2_email);
        text2pass=findViewById(R.id.text_input2_pass);

        log1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                confirmInput();

            }
        });
    }




    private boolean validateEmail2() {
        String emailinput2 = text2email.getEditText().getText().toString().trim();
        if (emailinput2.isEmpty()) {
            text2email.setError("field can't be empty\n");
            return false;
        }
        else if (!Patterns.EMAIL_ADDRESS.matcher(emailinput2).matches()) {
            text2email.setError("Please enter a valid email addrerss\n");
            return false;
        }

        else {
            text2email.setError(null);
            return true;
        }
    }

    private boolean validatepassword2() {
        String passwordinput = text2pass.getEditText().getText().toString().trim();
        if (passwordinput.isEmpty()) {
            text2pass.setError("field can't be empty\n");
            return false;

        }
        else if(!PASSWORD_PATTERN.matcher(passwordinput).matches())
        {
            text2pass.setError("week password\n");
            return false;

        }
        else {
            text2pass.setError(null);
            return true;
        }
    }




    private void confirmInput(){

        if (!validateEmail2() | !validatepassword2() ) {
            return;
        }

        String input = "Email: " + text2email.getEditText().getText().toString();
        input += "\n";
        input = "Password: " + text2pass.getEditText().getText().toString();

        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();

        Intent l2 = new Intent(loging.this, enterpage.class);
        startActivity(l2);

        Intent l = new Intent(loging.this, enterpage.class);
        startActivity(l);
    }



}
