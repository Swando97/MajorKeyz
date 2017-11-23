package com.example.adamswanson.majorkeyz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText message;
    EditText txt;
    Button bt;

    String display,finalMessage;
    String Newstr;

    int encryptCntr = 0;

    public void encrypt(View view) {
        Newstr="";

        display = message.getText().toString();

            for (int i = 0; i < display.length(); i++) {
                char ch = Character.toLowerCase(display.charAt(i));
                switch (ch) {
                    case 'a':
                        Newstr=Newstr+"=";
                        break;
                    case 'b':
                        Newstr=Newstr+"/";
                        break;
                    case 'c':
                        Newstr=Newstr+"?";
                        break;
                    case 'd':
                        Newstr=Newstr+"!";
                        break;
                    case 'e':
                        Newstr=Newstr+";";
                        break;
                    case 'f':
                        Newstr=Newstr+":";
                        break;
                    case 'g':
                        Newstr=Newstr+"'";
                        break;
                    case 'h':
                        Newstr=Newstr+"\"";
                        break;
                    case 'i':
                        Newstr=Newstr+"*";
                        break;
                    case 'j':
                        Newstr=Newstr+")";
                        break;
                    case 'k':
                        Newstr=Newstr+"(";
                        break;
                    case 'l':
                        Newstr=Newstr+"+";
                        break;
                    case 'm':
                        Newstr=Newstr+"-";
                        break;
                    case 'n':
                        Newstr=Newstr+"&";
                        break;
                    case 'o':
                        Newstr=Newstr+"%";
                        break;
                    case 'p':
                        Newstr=Newstr+"$";
                        break;
                    case 'q':
                        Newstr=Newstr+"_";
                        break;
                    case 'r':
                        Newstr=Newstr+"@";
                        break;
                    case 's' :
                        Newstr=Newstr+".";
                        break;
                    case 't':
                        Newstr=Newstr+",";
                        break;
                    case 'u':
                        Newstr=Newstr+" ";
                        break;
                    case 'v' :
                        Newstr=Newstr+"1";
                        break;
                    case 'w':
                        Newstr=Newstr+"2";
                        break;
                    case 'x' :
                        Newstr=Newstr+"3";
                        break;
                    case 'y':
                        Newstr=Newstr+"4";
                        break;
                    case 'z' :
                        Newstr=Newstr+"5";
                        break;
                    case ' ' :
                        Newstr=Newstr+"6";
                        break;
                    case ',':
                        Newstr=Newstr+'7';
                        break;
                    case '.':
                        Newstr=Newstr+"8";
                        break;
                    case '@':
                        Newstr=Newstr+'9';
                        break;
                    case '#' :
                        Newstr=Newstr+'0';
                        break;
                    case '$' :
                        Newstr=Newstr+"a";
                        break;
                    case '%' :
                        Newstr= Newstr+"b";
                        break;
                    case '&':
                        Newstr= Newstr+"c";
                        break;
                    case '-' :
                        Newstr= Newstr+"d";
                        break;
                    case '+' :
                        Newstr = Newstr+"e";
                        break;
                    case '(':
                        Newstr=Newstr+"f";
                        break;
                    case ')':
                        Newstr=Newstr+"g";
                        break;
                    case '*':
                        Newstr=Newstr+"h";
                        break;
                    case '"':
                        Newstr = Newstr+"i";
                        break;
                    case '\'':
                        Newstr = Newstr+"j";
                        break;
                    case ':':
                        Newstr = Newstr+"k";
                        break;
                    case ';':
                        Newstr = Newstr+"l";
                        break;
                    case '!' :
                        Newstr= Newstr+"m";
                        break;
                    case '?':
                        Newstr = Newstr+"n";
                        break;
                    case '_':
                        Newstr = Newstr+"o";
                        break;

                    case '/':
                        Newstr=Newstr+"p";
                        break;
                    case '=':
                        Newstr=Newstr+"q";
                        break;
                    case '1':
                        Newstr=Newstr+"r";
                        break;
                    case '2':
                        Newstr = Newstr+"s";
                        break;
                    case '3':
                        Newstr = Newstr+"t";
                        break;
                    case '4':
                        Newstr = Newstr+"u";
                        break;
                    case '5':
                        Newstr = Newstr+"v";
                        break;
                    case '6' :
                        Newstr= Newstr+"w";
                        break;
                    case '7':
                        Newstr = Newstr+"x";
                        break;
                    case '8':
                        Newstr = Newstr+"y";
                        break;
                    case '9':
                        Newstr = Newstr+"z";
                        break;
                    case '0':
                        Newstr = Newstr+"#";
                        break;

                    default:
                        Newstr=Newstr+" ERROR ";
                        break;
                }
            }
            txt.setText(Newstr);
            encryptCntr++;
    }

    public void decrypt(View view){

        Newstr="";

        display = message.getText().toString();

        for (int i = 0; i < display.length(); i++) {
            char ch = Character.toLowerCase(display.charAt(i));
            switch (ch) {
                case '=':
                    Newstr=Newstr+"a";
                    break;
                case '/':
                    Newstr=Newstr+"b";
                    break;
                case '?':
                    Newstr=Newstr+"c";
                    break;
                case '!':
                    Newstr=Newstr+"d";
                    break;
                case ';':
                    Newstr=Newstr+"e";
                    break;
                case ':':
                    Newstr=Newstr+"f";
                    break;
                case '\'':
                    Newstr=Newstr+"g";
                    break;
                case '"':
                    Newstr=Newstr+"h";
                    break;
                case '*':
                    Newstr=Newstr+"i";
                    break;
                case ')':
                    Newstr=Newstr+"j";
                    break;
                case '(':
                    Newstr=Newstr+"k";
                    break;
                case '+':
                    Newstr=Newstr+"l";
                    break;
                case '-':
                    Newstr=Newstr+"m";
                    break;
                case '&':
                    Newstr=Newstr+"n";
                    break;
                case '%':
                    Newstr=Newstr+"o";
                    break;
                case '$':
                    Newstr=Newstr+"p";
                    break;
                case '_':
                    Newstr=Newstr+"q";
                    break;
                case '@':
                    Newstr=Newstr+"r";
                    break;
                case '.' :
                    Newstr=Newstr+"s";
                    break;
                case ',':
                    Newstr=Newstr+"t";
                    break;
                case ' ':
                    Newstr=Newstr+"u";
                    break;
                case '1' :
                    Newstr=Newstr+"v";
                    break;
                case '2':
                    Newstr=Newstr+"w";
                    break;
                case '3' :
                    Newstr=Newstr+"x";
                    break;
                case '4':
                    Newstr=Newstr+"y";
                    break;
                case '5' :
                    Newstr=Newstr+"z";
                    break;
                case '6' :
                    Newstr=Newstr+" ";
                    break;
                case '7':
                    Newstr=Newstr+',';
                    break;
                case '8':
                    Newstr=Newstr+".";
                    break;
                case '9':
                    Newstr=Newstr+'@';
                    break;
                case '0' :
                    Newstr=Newstr+'#';
                    break;
                case 'a' :
                    Newstr=Newstr+"S";
                    break;
                case 'b' :
                    Newstr= Newstr+"%";
                    break;
                case 'c':
                    Newstr= Newstr+"&";
                    break;
                case 'd' :
                    Newstr= Newstr+"-";
                    break;
                case 'e' :
                    Newstr = Newstr+"+";
                    break;
                case 'f':
                    Newstr=Newstr+"(";
                    break;
                case 'g':
                    Newstr=Newstr+")";
                    break;
                case 'h':
                    Newstr=Newstr+"*";
                    break;
                case 'i':
                    Newstr = Newstr+"\"";
                    break;
                case 'j':
                    Newstr = Newstr+"'";
                    break;
                case 'k':
                    Newstr = Newstr+":";
                    break;
                case 'l':
                    Newstr = Newstr+";";
                    break;
                case 'm' :
                    Newstr= Newstr+"!";
                    break;
                case 'n':
                    Newstr = Newstr+"?";
                    break;
                case 'o':
                    Newstr = Newstr+"_";
                    break;

                case 'p':
                    Newstr=Newstr+"/";
                    break;
                case 'q':
                    Newstr=Newstr+"=";
                    break;
                case 'r':
                    Newstr=Newstr+"1";
                    break;
                case 's':
                    Newstr = Newstr+"2";
                    break;
                case 't':
                    Newstr = Newstr+"3";
                    break;
                case 'u':
                    Newstr = Newstr+"4";
                    break;
                case 'v':
                    Newstr = Newstr+"5";
                    break;
                case 'w' :
                    Newstr= Newstr+"6";
                    break;
                case 'x':
                    Newstr = Newstr+"7";
                    break;
                case 'y':
                    Newstr = Newstr+"8";
                    break;
                case 'z':
                    Newstr = Newstr+"9";
                    break;

                default:
                    Newstr=Newstr+" ERROR ";
                    break;
            }
            }
            txt.setText(Newstr);
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = (EditText) findViewById(R.id.editTxtMssg);
        txt = (EditText) findViewById(R.id.displayMssg);
        bt = (Button) findViewById(R.id.btnShare);
        finalMessage = "";

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/Plain");
                String shareMessage = txt.getText().toString();
                myIntent.putExtra(Intent.EXTRA_TEXT,shareMessage);
                startActivity(Intent.createChooser(myIntent,"Shared Through"));
            }
        });
    }


}
