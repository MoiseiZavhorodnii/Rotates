package com.example.rotatesapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         EditText editText = findViewById(R.id.word);
        editText.getText();

        EditText editText_2 = findViewById(R.id.word_1);
        editText_2.getText();

        TextView textView = findViewById(R.id.result_1);
        textView.setText("");

         Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {

                    String str_1 = editText_2.getText().toString();

                    String str = editText.getText().toString();


            String[] words = str.split(" ");
            StringBuilder builder = new StringBuilder();
            for (String s : words)
            {
                StringBuilder rev = new StringBuilder(" ");
                int i = 0;
                while (i < s.length())
                {
                    rev.insert(0, s.charAt(i));

                        i++;

                }

                builder.append(rev);

            }

            textView.setText(builder);

    });





    }

}