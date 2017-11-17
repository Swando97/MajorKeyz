package com.example.adamswanson.majorkeyz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText message, password;
    TextView txt;

    String pass1,newPass,display,decode;

    public void encrypt(View view){

        // SAVE PASSWORD 1
        pass1 = password.getText().toString();

        display = message.getText().toString();

        // ADD Encryption algorithm

        int len1 = display.length(); //Converts string to integer
        int len2 = pass1.length(); //Converts string to integer

        int i = 0;

        if(pass1.length() == 0) {
            Toast.makeText(this, "Must provide password", Toast.LENGTH_SHORT).show();
        }
        else if(len1 > len2) {
            while (len1 > len2) {
                newPass = pass1 + pass1.charAt(i);
                i++;
                len2 += 1;
                pass1 = newPass;
            }
            txt.setText(display + pass1 + "");
        }
        else if(len2 > len1) {
            while (len2 > len1) {
                newPass = display + display.charAt(i);
                i++;
                len1 += 1;
                display = newPass;
            }
            txt.setText(display + pass1 + "");
        }
        else if(len1 == len2){
            txt.setText(display + pass1 + "");
        }

        // Done Encryption algorithm
    }

    public void decrypt(View view){

        // SAVE PASSWORD 2
        newPass = password.getText().toString();


        decode = message.getText().toString();

        if(display.equals(decode)) {
            if (pass1.equals(newPass)) {

                // Reverse encryption algorithm
                txt.setText(decode);
            }
            else{
                Toast.makeText(this, "Password Doesnt Match", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(this, "Must Supply Proper encryption!", Toast.LENGTH_SHORT).show();
        }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = (EditText) findViewById(R.id.editTxtMssg);
        password = (EditText) findViewById(R.id.editTxtPassword);
        txt = (TextView) findViewById(R.id.displayMssg);
    }


}
