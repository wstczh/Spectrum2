package activitytest.example.com.frequency;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import static activitytest.example.com.frequency.R.id.btn_numberdot;

/**
 * Created by Administrator on 2016/11/23.
 */

public class Test extends Activity implements View.OnClickListener {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn_number0, btn_number1, btn_number2, btn_number3, btn_number4, btn_number5, btn_number6, btn_number7, btn_number8, btn_number9;
    EditText edit1, edit2;
    boolean clear_flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ampt_layout);
        btn1 = (Button) findViewById(R.id.btn_1);//btn1-7一样
        btn_number0 = (Button) findViewById(R.id.btn_number0);//btn_number0-9一样
        edit1 = (EditText) findViewById(R.id.ampt_edit1);
        edit2 = (EditText) findViewById(R.id.ampt_edit2);
        btn_number0.setOnClickListener(this);//btn_number0-9一样

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.requestFocus();
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.showSoftInput(edit1, InputMethodManager.SHOW_IMPLICIT);
            }
        });
    }

    public void onClick(View view) {
        String str = edit1.getText().toString();
        edit1.requestFocus();
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(edit1, InputMethodManager.SHOW_IMPLICIT);

        switch (view.getId()) {
            case R.id.btn_number0:
            case R.id.btn_number1:
            case R.id.btn_number2:
            case R.id.btn_number3:
            case R.id.btn_number4:
            case R.id.btn_number5:
            case R.id.btn_number6:
            case R.id.btn_number7:
            case R.id.btn_number8:
            case R.id.btn_number9:
            case R.id.btn_numberdot:
                if (clear_flag) {
                    clear_flag = false;
                    str = "";
                    edit1.setText("");
                }
                edit1.setText(str + ((Button) view).getText());
                break;
            case R.id.btn_back:
                if (str != null && !str.equals("")) {
                    edit1.setText(str.substring(0, str.length() - 1));
                }
                break;
            case R.id.btn_esc:
                clear_flag = false;
                edit1.setText("");
                break;
        }
    }
}
