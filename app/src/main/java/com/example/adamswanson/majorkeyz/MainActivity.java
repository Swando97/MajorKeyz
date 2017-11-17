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

    String pass1,pass2;

    public void encrypt(View view){
        String display = message.getText().toString();
        txt.setText(display);

        pass1 = password.getText().toString();

    }

    public void decrypt(View view){

        pass2 = password.getText().toString();

        String decode = txt.getText().toString();

        if(pass2 != null) {
            if (pass1.equals(pass2)) {
                txt.setText(decode);
            }
            else{
                Toast.makeText(this, "Password Doesnt Match", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(this, "Must Supply Password!", Toast.LENGTH_SHORT).show();
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
