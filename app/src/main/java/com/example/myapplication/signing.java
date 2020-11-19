package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Pattern;

import static android.util.Patterns.EMAIL_ADDRESS;
import static java.util.regex.Pattern.*;

public class signing extends AppCompatActivity {
    Button sgn1;

    private static final String[] neams=new String[]
    {
        "Aya","Ahmed","Ali"
    };

    private TextInputLayout textemail;
    private TextInputLayout textusername;
    private TextInputLayout textpasword;
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
        setContentView(R.layout.activity_signing);
        textusername = findViewById(R.id.text_input_username);
        textemail = findViewById(R.id.text_input_email);
        textpasword = findViewById(R.id.text_input_password);
        sgn1 = findViewById(R.id.sign1);



        sgn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

confirmInput();

            }
        });


        AutoCompleteTextView editText =findViewById(R.id.tt1);
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,neams);
                editText.setAdapter(adapter);







    }


    private boolean validateusername() {
        String usernameinput = textusername.getEditText().getText().toString().trim();
        if (usernameinput.isEmpty()) {
            textusername.setError("field can't be empty\n");
            return false;
        } else if (usernameinput.length() > 15) {
            textusername.setError("username too long\n");
            return false;
        } else {
            textusername.setError(null);
            return true;
        }
    }

    private boolean validateEmail() {
        String emailinput = textemail.getEditText().getText().toString().trim();
        if (emailinput.isEmpty()) {
            textemail.setError("field can't be empty\n");
            return false;
        }
        else if (!Patterns.EMAIL_ADDRESS.matcher(emailinput).matches()) {
            textemail.setError("Please enter a valid email addrerss\n");
            return false;
        }

        else {
            textemail.setError(null);
            return true;
        }
    }

    private boolean validatepassword() {
        String passwordinput = textpasword.getEditText().getText().toString().trim();
        if (passwordinput.isEmpty()) {
            textpasword.setError("field can't be empty\n");
            return false;

        }
        else if(!PASSWORD_PATTERN.matcher(passwordinput).matches())
        {
            textpasword.setError("week password\n");
            return false;

        }
        else {
            textpasword.setError(null);
            return true;
        }
    }

private void confirmInput(){

    if (!validateusername() | !validateEmail() | !validatepassword()) {
        return;
    }

    String input = "Email: " + textemail.getEditText().getText().toString();
    input += "\n";
    input = "Username: " + textusername.getEditText().getText().toString();
    input += "\n";
    input = "Password: " + textpasword.getEditText().getText().toString();

    Toast.makeText(this, input, Toast.LENGTH_SHORT).show();

    Intent l2 = new Intent(signing.this, enterpage.class);
    startActivity(l2);
}

}
