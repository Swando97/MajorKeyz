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
                        Newstr=Newstr+"{";
                        break;
                    case 'b':
                        Newstr=Newstr+"}";
                        break;
                    case 'c':
                        Newstr=Newstr+"#";
                        break;
                    case 'd':
                        Newstr=Newstr+"~";
                        break;
                    case 'e':
                        Newstr=Newstr+"+";
                        break;
                    case 'f':
                        Newstr=Newstr+"-";
                        break;
                    case 'g':
                        Newstr=Newstr+"*";
                        break;
                    case 'h':
                        Newstr=Newstr+"@";
                        break;
                    case 'i':
                        Newstr=Newstr+"/";
                        break;
                    case 'j':
                        Newstr=Newstr+"\\";
                        break;
                    case 'k':
                        Newstr=Newstr+"?";
                        break;
                    case 'l':
                        Newstr=Newstr+"$";
                        break;
                    case 'm':
                        Newstr=Newstr+"!";
                        break;
                    case 'n':
                        Newstr=Newstr+"^";
                        break;
                    case 'o':
                        Newstr=Newstr+"(";
                        break;
                    case 'p':
                        Newstr=Newstr+")";
                        break;
                    case 'q':
                        Newstr=Newstr+"<";
                        break;
                    case 'r':
                        Newstr=Newstr+">";
                        break;
                    case 's' :
                        Newstr=Newstr+"=";
                        break;
                    case 't':
                        Newstr=Newstr+";";
                        break;
                    case 'u':
                        Newstr=Newstr+",";
                        break;
                    case 'v' :
                        Newstr=Newstr+"_";
                        break;
                    case 'w':
                        Newstr=Newstr+"[";
                        break;
                    case 'x' :
                        Newstr=Newstr+"]";
                        break;
                    case 'y':
                        Newstr=Newstr+":";
                        break;
                    case 'z' :
                        Newstr=Newstr+"\"";
                        break;
                    case ' ' :
                        Newstr=Newstr+" ";
                        break;
                    case '.':
                        Newstr=Newstr+'|';
                        break;
                    case ',':
                        Newstr=Newstr+">";
                        break;
                    case '(':
                        Newstr=Newstr+'4';
                        break;
                    case '\"' :
                        Newstr=Newstr+'5';
                        break;
                    case ')' :
                        Newstr=Newstr+"7";
                        break;
                    case '?' :
                        Newstr= Newstr+"2";
                        break;
                    case '!':
                        Newstr= Newstr+"8";
                        break;
                    case '-' :
                        Newstr= Newstr+"6";
                        break;
                    case '%' :
                        Newstr = Newstr+"9";
                        break;
                    case '1':
                        Newstr=Newstr+"r";
                        break;
                    case '2':
                        Newstr=Newstr+"k";
                        break;
                    case '3':
                        Newstr=Newstr+"b";
                        break;
                    case '4':
                        Newstr = Newstr+"e";
                        break;
                    case '5':
                        Newstr = Newstr+"q";
                        break;
                    case '6':
                        Newstr = Newstr+"h";
                        break;
                    case '7':
                        Newstr = Newstr+"u";
                        break;
                    case '8' :
                        Newstr= Newstr+"y";
                        break;
                    case '9':
                        Newstr = Newstr+"w";
                        break;
                    case '0':
                        Newstr = Newstr+"z";
                        break;
                    default:
                        Newstr=Newstr+"0";
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
                case '{':
                    Newstr=Newstr+"A";
                    break;
                case '}':
                    Newstr=Newstr+"B";
                    break;
                case '#':
                    Newstr=Newstr+"C";
                    break;
                case '~':
                    Newstr=Newstr+"D";
                    break;
                case '+':
                    Newstr=Newstr+"E";
                    break;
                case '-':
                    Newstr=Newstr+"F";
                    break;
                case '*':
                    Newstr=Newstr+"G";
                    break;
                case '@':
                    Newstr=Newstr+"H";
                    break;
                case '/':
                    Newstr=Newstr+"I";
                    break;
                case '\\':
                    Newstr=Newstr+"J";
                    break;
                case '?':
                    Newstr=Newstr+"K";
                    break;
                case '$':
                    Newstr=Newstr+"L";
                    break;
                case '!':
                    Newstr=Newstr+"M";
                    break;
                case '^':
                    Newstr=Newstr+"N";
                    break;
                case '(':
                    Newstr=Newstr+"O";
                    break;
                case ')':
                    Newstr=Newstr+"P";
                    break;
                case '<':
                    Newstr=Newstr+"Q";
                    break;
                case '>':
                    Newstr=Newstr+"R";
                    break;
                case '=' :
                    Newstr=Newstr+"S";
                    break;
                case ';':
                    Newstr=Newstr+"T";
                    break;
                case ',':
                    Newstr=Newstr+"U";
                    break;
                case '_' :
                    Newstr=Newstr+"V";
                    break;
                case '[':
                    Newstr=Newstr+"W";
                    break;
                case ']' :
                    Newstr=Newstr+"X";
                    break;
                case ':':
                    Newstr=Newstr+"Y";
                    break;
                case '\"' :
                    Newstr=Newstr+"Z";
                    break;
                case '1':
                    Newstr=Newstr+"r";
                    break;
                case '2':
                    Newstr=Newstr+"k";
                    break;
                case '3':
                    Newstr=Newstr+"b";
                    break;
                case '4':
                    Newstr = Newstr+"e";
                    break;
                case '5':
                    Newstr = Newstr+"q";
                    break;
                case '6':
                    Newstr = Newstr+"h";
                    break;
                case '7':
                    Newstr = Newstr+"u";
                    break;
                case '8' :
                    Newstr= Newstr+"y";
                    break;
                case '9':
                    Newstr = Newstr+"w";
                    break;
                case '0':
                    Newstr = Newstr+"z";
                    break;
                case ' ' :
                    Newstr=Newstr+" ";
                    break;
                case '|':
                    Newstr=Newstr+'.';
                    break;
                case '>':
                    Newstr=Newstr+";";
                    break;
                case '(':
                    Newstr=Newstr+'4';
                    break;
                case '\"' :
                    Newstr=Newstr+'5';
                    break;
                case ')' :
                    Newstr=Newstr+"7";
                    break;
                case '?' :
                    Newstr= Newstr+"2";
                    break;
                case '!':
                    Newstr= Newstr+"8";
                    break;
                case '-' :
                    Newstr= Newstr+"6";
                    break;
                case '%' :
                    Newstr = Newstr+"9";
                    break;
                default:
                    Newstr=Newstr+"0";
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
