package activitytest.example.com.frequency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import static activitytest.example.com.frequency.R.id.btn_7;
import static activitytest.example.com.frequency.R.id.btn_freq;
import static activitytest.example.com.frequency.R.id.lv;
import static activitytest.example.com.frequency.R.id.system;
import static android.R.attr.button;
import static android.R.id.button1;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_freq=(Button)findViewById(R.id.btn_freq);
        Button btn_span=(Button)findViewById(R.id.btn_span);
        Button btn_ampt=(Button)findViewById(R.id.btn_ampt);


        btn_freq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Freq.class);
                startActivity(intent);
            }
        });

        btn_ampt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Ampt.class);
                startActivity(intent);
            }
        });

        btn_span.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Span.class);
                startActivity(intent);
            }
        });


    }

}
