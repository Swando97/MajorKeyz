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

    String pass1,newPass,display,decode, finalMessage;

    public void encrypt(View view) {
        // Must Find way to clear textview after each encryption

        pass1 = password.getText().toString();

        display = message.getText().toString();


        // ADD Encryption algorithm

        int len1 = display.length(); //Converts string to integer
        int len2 = pass1.length(); //Converts string to integer
        
        /*if (pass1.length() == 0) {
            Toast.makeText(this, "Must provide password", Toast.LENGTH_SHORT).show();
        } else {
            String encrypt = pass1 + display;
            //Combines the length of pass1 and message
            for (int i = 0; i < (len1 + len2); i++) {
                char mssg = encrypt.charAt(i); //Obtains Character at index for entire Password+Message String
                int ascii = (int) mssg; //Stores  ASCII NUMBER
                int newAscii = ascii + 13; //Shifts ASCII Number by 5 * specific index number plus 13
                finalMessage = finalMessage + Character.toString((char) newAscii); //Converted encryption of string
            }
                txt.setText(finalMessage);
        }*/
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
        finalMessage = "";
    }


}
