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

import static activitytest.example.com.frequency.R.id.btn_7;
import static activitytest.example.com.frequency.R.id.btn_span;
import static activitytest.example.com.frequency.R.id.lv;
import static activitytest.example.com.frequency.R.id.text;

/**
 * Created by Administrator on 2016/11/16.
 */

public class Freq extends Activity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn_number0, btn_number1, btn_number2, btn_number3, btn_number4, btn_number5, btn_number6, btn_number7, btn_number8, btn_number9, btn_numberdot, btn_numberadd, btn_esc, btn_back, btn_enter, btn_open, btn_close, btn_uparrow, btn_downarrow;
    EditText edit1, edit2, edit3, edit4, edit5, edit6, edit7;
    boolean clear_flag;
    static int flag1 = 0;
    static int flag2 = 0;
    static int flag;
    int data;
    TextView text1,text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.freq_layout);


        btn1 = (Button) findViewById(R.id.freq_2);
        btn2 = (Button) findViewById(R.id.freq_3);
        btn3 = (Button) findViewById(R.id.freq_4);
        btn4 = (Button) findViewById(R.id.freq_5);
        btn5 = (Button) findViewById(R.id.freq_6);
        btn6 = (Button) findViewById(R.id.freq_7);
        btn7 = (Button) findViewById(R.id.freq_8);
        btn_close = (Button) findViewById(R.id.freq_close);
        btn_open = (Button) findViewById(R.id.freq_open);
        btn_number0 = (Button) findViewById(R.id.freq_number0);
        btn_number1 = (Button) findViewById(R.id.freq_number1);
        btn_number2 = (Button) findViewById(R.id.freq_number2);
        btn_number3 = (Button) findViewById(R.id.freq_number3);
        btn_number4 = (Button) findViewById(R.id.freq_number4);
        btn_number5 = (Button) findViewById(R.id.freq_number5);
        btn_number6 = (Button) findViewById(R.id.freq_number6);
        btn_number7 = (Button) findViewById(R.id.freq_number7);
        btn_number8 = (Button) findViewById(R.id.freq_number8);
        btn_number9 = (Button) findViewById(R.id.freq_number9);
        btn_numberdot = (Button) findViewById(R.id.freq_numberdot);
        btn_esc = (Button) findViewById(R.id.freq_esc);
        btn_back = (Button) findViewById(R.id.freq_back);
        btn_enter = (Button) findViewById(R.id.freq_enter);
        btn_downarrow = (Button) findViewById(R.id.freq_downarrow);
        btn_uparrow = (Button) findViewById(R.id.freq_uparrow);

        edit1 = (EditText) findViewById(R.id.freq_edit1);
        edit2 = (EditText) findViewById(R.id.freq_edit2);
        edit3 = (EditText) findViewById(R.id.freq_edit3);
        edit4 = (EditText) findViewById(R.id.freq_edit4);
        edit5 = (EditText) findViewById(R.id.freq_edit5);
        text1=(TextView)findViewById(R.id.freq_texttitle);
        text2=(TextView)findViewById(R.id.freq_textnumber);

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
                text1.setText("中心频率");
                text2.setText(edit1.getText().toString());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit2.requestFocus();
                edit2.setSelection(edit2.getText().length());
                text1.setText("起始频率");
                text2.setText(edit2.getText().toString());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit3.requestFocus();
                edit3.setSelection(edit3.getText().length());
                text1.setText("终止频率");
                text2.setText(edit3.getText().toString());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit4.requestFocus();
                edit4.setSelection(edit4.getText().length());
                text1.setText("频率偏移");
                text2.setText(edit4.getText().toString());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit5.requestFocus();
                edit5.setSelection(edit5.getText().length());
                text1.setText("中频步长");
                text2.setText(edit5.getText().toString());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag1 == 0 && flag2 == 0) {
                    btn_open.setBackgroundResource(R.mipmap.blue_press);
                    btn_close.setBackgroundResource(R.mipmap.blue_normal);
                    flag1 = 1;
                } else if (flag1 == 1 && flag2 == 0) {
                    btn_close.setBackgroundResource(R.mipmap.blue_press);
                    btn_open.setBackgroundResource(R.mipmap.blue_normal);
                    flag1 = 0;
                }
            }
        });


        Button btn_ampt = (Button) findViewById(R.id.freq_ampt);
        Button btn_span = (Button) findViewById(R.id.freq_span);
        Button btn_hide = (Button) findViewById(R.id.freq_hide);

        btn_ampt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Freq.this, Ampt.class);
                startActivity(intent);
            }
        });

        btn_span.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Freq.this, Span.class);
                startActivity(intent);
            }
        });

        btn_hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Freq.this, OverAll.class);
                startActivity(intent);
            }
        });

        SharedPreferences pref1 = getSharedPreferences("freq1", MODE_PRIVATE);
        SharedPreferences pref2 = getSharedPreferences("freq2", MODE_PRIVATE);
        SharedPreferences pref3 = getSharedPreferences("freq3", MODE_PRIVATE);
        SharedPreferences pref4 = getSharedPreferences("freq4", MODE_PRIVATE);
        SharedPreferences pref5 = getSharedPreferences("freq5", MODE_PRIVATE);
        edit1.setText(pref1.getString("edit1", ""));
        edit2.setText(pref2.getString("edit2", ""));
        edit3.setText(pref3.getString("edit3", ""));
        edit4.setText(pref4.getString("edit4", ""));
        edit5.setText(pref5.getString("edit5", ""));
        flag1 = flag;
        if (flag1 == 0) {
            btn_close.setBackgroundResource(R.mipmap.blue_press);
            btn_open.setBackgroundResource(R.mipmap.blue_normal);
        } else if (flag1 == 1) {
            btn_open.setBackgroundResource(R.mipmap.blue_press);
            btn_close.setBackgroundResource(R.mipmap.blue_normal);
        }
    }

    @Override
    public void onClick(View view) {
        if (edit1.isFocused()) {
            String str1 = edit1.getText().toString();
            switch (view.getId()) {
                case R.id.freq_number0:
                case R.id.freq_number1:
                case R.id.freq_number2:
                case R.id.freq_number3:
                case R.id.freq_number4:
                case R.id.freq_number5:
                case R.id.freq_number6:
                case R.id.freq_number7:
                case R.id.freq_number8:
                case R.id.freq_number9:
                case R.id.freq_numberdot:
                    if (clear_flag) {
                        clear_flag = false;
                        str1 = "";
                        edit1.setText("");
                    }
                    edit1.setText(str1 + ((Button) view).getText());
                    break;
                case R.id.freq_back:
                    if (str1 != null && !str1.equals("")) {
                        edit1.setText(str1.substring(0, str1.length() - 1));
                    }
                    break;
                case R.id.freq_esc:
                    clear_flag = false;
                    edit1.setText("");
                    break;
                case R.id.freq_enter:
                    edit1.clearFocus();
                    break;
                case R.id.freq_downarrow:
                    if (str1 != null && str1.length() > 0) {
                        data = Integer.parseInt(str1) - 1;
                        edit1.setText(String.valueOf(data));
                    }
                    break;
                case R.id.freq_uparrow:
                    if (str1 != null && str1.length() > 0) {
                        data = Integer.parseInt(str1) + 1;
                        edit1.setText(String.valueOf(data));
                    }
                    break;
            }
            edit1.setSelection(edit1.getText().length());
//            text1.setText("中心频率");
            text2.setText(edit1.getText().toString());
        } else if (edit2.isFocused()) {
            String str2 = edit2.getText().toString();
            switch (view.getId()) {
                case R.id.freq_number0:
                case R.id.freq_number1:
                case R.id.freq_number2:
                case R.id.freq_number3:
                case R.id.freq_number4:
                case R.id.freq_number5:
                case R.id.freq_number6:
                case R.id.freq_number7:
                case R.id.freq_number8:
                case R.id.freq_number9:
                case R.id.freq_numberdot:
                    if (clear_flag) {
                        clear_flag = false;
                        str2 = "";
                        edit2.setText("");
                    }
                    edit2.setText(str2 + ((Button) view).getText());
                    break;
                case R.id.freq_back:
                    if (str2 != null && !str2.equals("")) {
                        edit2.setText(str2.substring(0, str2.length() - 1));
                    }
                    break;
                case R.id.freq_esc:
                    clear_flag = false;
                    edit2.setText("");
                    break;
                case R.id.freq_enter:
                    edit2.clearFocus();
                    break;
                case R.id.freq_downarrow:
                    if (str2 != null && str2.length() > 0) {
                        data = Integer.parseInt(str2) - 1;
                        edit2.setText(String.valueOf(data));
                    }
                    break;
                case R.id.freq_uparrow:
                    if (str2 != null && str2.length() > 0) {
                        data = Integer.parseInt(str2) + 1;
                        edit2.setText(String.valueOf(data));
                    }
                    break;
            }
            edit2.setSelection(edit2.getText().length());
//            text1.setText("其实频率");
            text2.setText(edit2.getText().toString());

        } else if (edit3.isFocused()) {
            String str3 = edit3.getText().toString();
            switch (view.getId()) {
                case R.id.freq_number0:
                case R.id.freq_number1:
                case R.id.freq_number2:
                case R.id.freq_number3:
                case R.id.freq_number4:
                case R.id.freq_number5:
                case R.id.freq_number6:
                case R.id.freq_number7:
                case R.id.freq_number8:
                case R.id.freq_number9:
                case R.id.freq_numberdot:
                    if (clear_flag) {
                        clear_flag = false;
                        str3 = "";
                        edit3.setText("");
                    }
                    edit3.setText(str3 + ((Button) view).getText());
                    break;
                case R.id.freq_back:
                    if (str3 != null && !str3.equals("")) {
                        edit3.setText(str3.substring(0, str3.length() - 1));
                    }
                    break;
                case R.id.freq_esc:
                    clear_flag = false;
                    edit3.setText("");
                    break;
                case R.id.freq_enter:
                    edit3.clearFocus();
                    break;
                case R.id.freq_downarrow:
                    if (str3 != null && str3.length() > 0) {
                        data = Integer.parseInt(str3) - 1;
                        edit3.setText(String.valueOf(data));
                    }
                    break;
                case R.id.freq_uparrow:
                    if (str3 != null && str3.length() > 0) {
                        data = Integer.parseInt(str3) + 1;
                        edit3.setText(String.valueOf(data));
                    }
                    break;
            }
            edit3.setSelection(edit3.getText().length());
//            text1.setText("终止频率");
            text2.setText(edit3.getText().toString());
        } else if (edit4.isFocused()) {
            String str4 = edit4.getText().toString();
            switch (view.getId()) {
                case R.id.freq_number0:
                case R.id.freq_number1:
                case R.id.freq_number2:
                case R.id.freq_number3:
                case R.id.freq_number4:
                case R.id.freq_number5:
                case R.id.freq_number6:
                case R.id.freq_number7:
                case R.id.freq_number8:
                case R.id.freq_number9:
                case R.id.freq_numberdot:
                    if (clear_flag) {
                        clear_flag = false;
                        str4 = "";
                        edit4.setText("");
                    }
                    edit4.setText(str4 + ((Button) view).getText());
                    break;
                case R.id.freq_back:
                    if (str4 != null && !str4.equals("")) {
                        edit4.setText(str4.substring(0, str4.length() - 1));
                    }
                    break;
                case R.id.freq_esc:
                    clear_flag = false;
                    edit4.setText("");
                    break;
                case R.id.freq_enter:
                    edit4.clearFocus();
                    break;
                case R.id.freq_downarrow:
                    if (str4 != null && str4.length() > 0) {
                        data = Integer.parseInt(str4) - 1;
                        edit4.setText(String.valueOf(data));
                    }
                    break;
                case R.id.freq_uparrow:
                    if (str4 != null && str4.length() > 0) {
                        data = Integer.parseInt(str4) + 1;
                        edit4.setText(String.valueOf(data));
                    }
                    break;
            }
            edit4.setSelection(edit4.getText().length());
//            text1.setText("频率偏移");
            text2.setText(edit4.getText().toString());
        }else if(edit5.isFocused()) {
            String str5 = edit5.getText().toString();
            switch (view.getId()) {
                case R.id.freq_number0:
                case R.id.freq_number1:
                case R.id.freq_number2:
                case R.id.freq_number3:
                case R.id.freq_number4:
                case R.id.freq_number5:
                case R.id.freq_number6:
                case R.id.freq_number7:
                case R.id.freq_number8:
                case R.id.freq_number9:
                case R.id.freq_numberdot:
                    if (clear_flag) {
                        clear_flag = false;
                        str5 = "";
                        edit5.setText("");
                    }
                    edit5.setText(str5 + ((Button) view).getText());
                    break;
                case R.id.freq_back:
                    if (str5 != null && !str5.equals("")) {
                        edit5.setText(str5.substring(0,str5.length() - 1));
                    }
                    break;
                case R.id.freq_esc:
                    clear_flag = false;
                    edit5.setText("");
                    break;
                case R.id.freq_enter:
                    edit5.clearFocus();
                    break;
                case R.id.freq_downarrow:
                    if (str5 != null && str5.length() > 0) {
                        data = Integer.parseInt(str5) - 1;
                        edit5.setText(String.valueOf(data));
                    }
                    break;
                case R.id.freq_uparrow:
                    if (str5 != null && str5.length() > 0) {
                        data = Integer.parseInt(str5) + 1;
                        edit5.setText(String.valueOf(data));
                    }
                    break;
            }
            edit5.setSelection(edit5.getText().length());
//            text1.setText("中频步长");
            text2.setText(edit5.getText().toString());
        }
    }

    protected void onStop() {
        SharedPreferences.Editor editor1 = getSharedPreferences("freq1", MODE_PRIVATE).edit();
        SharedPreferences.Editor editor2 = getSharedPreferences("freq2", MODE_PRIVATE).edit();
        SharedPreferences.Editor editor3 = getSharedPreferences("freq3", MODE_PRIVATE).edit();
        SharedPreferences.Editor editor4 = getSharedPreferences("freq4", MODE_PRIVATE).edit();
        SharedPreferences.Editor editor5 = getSharedPreferences("freq5", MODE_PRIVATE).edit();
        editor1.putString("edit1", edit1.getText().toString());
        editor2.putString("edit2", edit2.getText().toString());
        editor3.putString("edit3", edit3.getText().toString());
        editor4.putString("edit4", edit4.getText().toString());
        editor5.putString("edit5", edit5.getText().toString());
        editor1.commit();
        editor2.commit();
        editor3.commit();
        editor4.commit();
        editor5.commit();
        flag = flag1;
        super.onStop();
    }

}
