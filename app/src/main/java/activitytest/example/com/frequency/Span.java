package activitytest.example.com.frequency;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import static activitytest.example.com.frequency.R.id.btn_ampt;
import static activitytest.example.com.frequency.R.id.btn_linear;
import static activitytest.example.com.frequency.R.id.btn_log;

/**
 * Created by Administrator on 2016/11/16.
 */

public class Span extends Activity implements View.OnClickListener{
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn_number0, btn_number1, btn_number2, btn_number3, btn_number4, btn_number5, btn_number6, btn_number7, btn_number8, btn_number9, btn_numberdot, btn_numberadd, btn_esc, btn_back, btn_enter, btn_linear, btn_log, btn_uparrow, btn_downarrow;
    EditText edit1, edit2, edit3, edit4, edit5, edit6, edit7;
    boolean clear_flag;
    static int flag1 = 0;
    static int flag2 = 0;
    static int flag;
    int data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.span_layout);

        btn1 = (Button) findViewById(R.id.span_2);
        btn2 = (Button) findViewById(R.id.span_3);
        btn3 = (Button) findViewById(R.id.span_4);
        btn4 = (Button) findViewById(R.id.span_5);
        btn5 = (Button) findViewById(R.id.span_6);
        btn6 = (Button) findViewById(R.id.span_7);
        btn7 = (Button) findViewById(R.id.span_8);
        btn_log = (Button) findViewById(R.id.span_log);
        btn_linear = (Button) findViewById(R.id.span_linear);
        btn_number0 = (Button) findViewById(R.id.span_number0);
        btn_number1 = (Button) findViewById(R.id.span_number1);
        btn_number2 = (Button) findViewById(R.id.span_number2);
        btn_number3 = (Button) findViewById(R.id.span_number3);
        btn_number4 = (Button) findViewById(R.id.span_number4);
        btn_number5 = (Button) findViewById(R.id.span_number5);
        btn_number6 = (Button) findViewById(R.id.span_number6);
        btn_number7 = (Button) findViewById(R.id.span_number7);
        btn_number8 = (Button) findViewById(R.id.span_number8);
        btn_number9 = (Button) findViewById(R.id.span_number9);
        btn_numberdot = (Button) findViewById(R.id.span_numberdot);
        btn_esc = (Button) findViewById(R.id.span_esc);
        btn_back = (Button) findViewById(R.id.span_back);
        btn_enter = (Button) findViewById(R.id.span_enter);
        btn_downarrow = (Button) findViewById(R.id.span_downarrow);
        btn_uparrow = (Button) findViewById(R.id.span_uparrow);

        edit1 = (EditText) findViewById(R.id.span_edit1);


        btn_number0.setOnClickListener(this);
        btn_number1.setOnClickListener(this);
        btn_number2.setOnClickListener(this);
        btn_number3.setOnClickListener(this);
        btn_number4.setOnClickListener(this);
        btn_number5.setOnClickListener(this);
        btn_number6.setOnClickListener(this);
        btn_number7.setOnClickListener(this);
        btn_number8.setOnClickListener(this);
        btn_number9.setOnClickListener(this);
        btn_numberdot.setOnClickListener(this);
        btn_esc.setOnClickListener(this);
        btn_back.setOnClickListener(this);
        btn_enter.setOnClickListener(this);
        btn_downarrow.setOnClickListener(this);
        btn_uparrow.setOnClickListener(this);
//             btn1.setOnClickListener(new View.OnClickListener() {
//                 @Override
//                 public void onClick(View view) {
//
//                 }
//             });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.requestFocus();
                edit1.setSelection(edit1.getText().length());
            }
        });
//        btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                edit2.requestFocus();
//                edit2.setSelection(edit2.getText().length());
//            }
//        });
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                edit3.requestFocus();
//                edit3.setSelection(edit3.getText().length());
//            }
//        });
//        btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (flag1 == 0 && flag2 == 0) {
//                    btn_linear.setBackgroundResource(R.mipmap.blue_press);
//                    btn_log.setBackgroundResource(R.mipmap.blue_normal);
//                    flag1 = 1;
//                } else if (flag1 == 1 && flag2 == 0) {
//                    btn_log.setBackgroundResource(R.mipmap.blue_press);
//                    btn_linear.setBackgroundResource(R.mipmap.blue_normal);
//                    flag1 = 0;
//                }
//            }
//        });
//          btn6.setOnClickListener(this);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag1 == 0 && flag2 == 0) {
                    btn_linear.setBackgroundResource(R.mipmap.blue_press);
                    btn_log.setBackgroundResource(R.mipmap.blue_normal);
                    flag1 = 1;
                } else if (flag1 == 1 && flag2 == 0) {
                    btn_log.setBackgroundResource(R.mipmap.blue_press);
                    btn_linear.setBackgroundResource(R.mipmap.blue_normal);
                    flag1 = 0;
                }
            }
        });


        Button btn_freq = (Button) findViewById(R.id.span_freq);
        Button btn_ampt = (Button) findViewById(R.id.span_ampt);
        Button btn_hide = (Button) findViewById(R.id.span_hide);

        btn_freq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Span.this,Freq.class);
                startActivity(intent);
            }
        });

        btn_ampt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Span.this, Ampt.class);
                startActivity(intent);
            }
        });

        btn_hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Span.this, OverAll.class);
                startActivity(intent);
            }
        });

        SharedPreferences pref1 = getSharedPreferences("s1", MODE_PRIVATE);
        edit1.setText(pref1.getString("edit1", ""));

        flag1 = flag;
        if (flag1 == 0) {
            btn_log.setBackgroundResource(R.mipmap.blue_press);
            btn_linear.setBackgroundResource(R.mipmap.blue_normal);
        } else if (flag1 == 1) {
            btn_linear.setBackgroundResource(R.mipmap.blue_press);
            btn_log.setBackgroundResource(R.mipmap.blue_normal);
        }
    }

    @Override
    public void onClick(View view) {
        if (edit1.isFocused()) {
            String str1 = edit1.getText().toString();
            switch (view.getId()) {
                case R.id.span_number0:
                case R.id.span_number1:
                case R.id.span_number2:
                case R.id.span_number3:
                case R.id.span_number4:
                case R.id.span_number5:
                case R.id.span_number6:
                case R.id.span_number7:
                case R.id.span_number8:
                case R.id.span_number9:
                case R.id.span_numberdot:
                    if (clear_flag) {
                        clear_flag = false;
                        str1 = "";
                        edit1.setText("");
                    }
                    edit1.setText(str1 + ((Button) view).getText());
                    break;
                case R.id.span_back:
                    if (str1 != null && !str1.equals("")) {
                        edit1.setText(str1.substring(0, str1.length() - 1));
                    }
                    break;
                case R.id.span_esc:
                    clear_flag = false;
                    edit1.setText("");
                    break;
                case R.id.span_enter:
                    edit1.clearFocus();
                    break;
                case R.id.span_downarrow:
                    if (str1 != null && str1.length() > 0) {
                        data = Integer.parseInt(str1)-1;
                        edit1.setText(String.valueOf(data));
                    }
                    break;
                case R.id.span_uparrow:
                    if(str1 != null && str1.length() > 0){
                        data=Integer.parseInt(str1)+1;
                        edit1.setText(String.valueOf(data));
                    }
                    break;
            }
            edit1.setSelection(edit1.getText().length());
        }
    }

    protected void onStop() {
        SharedPreferences.Editor editor1 = getSharedPreferences("s1", MODE_PRIVATE).edit();
        editor1.putString("edit1", edit1.getText().toString());
        editor1.commit();
        flag = flag1;
        super.onStop();
    }
}
