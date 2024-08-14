package com.example.app_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonPic1,buttonPic2,buttonPic3;
   

    private TextView textViewResult;
    private ImageView imageViewPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPic1 = (Button) findViewById(R.id.button_pic1);
        buttonPic2 = (Button) findViewById(R.id.button_pic2);
        buttonPic3 = (Button) findViewById(R.id.button_pic3);
        
        imageViewPic = (ImageView) findViewById(R.id.imageView_id);
        textViewResult = (TextView) findViewById(R.id.textView_result);

        buttonPic1.setOnClickListener(new Mybutton());
        buttonPic2.setOnClickListener(new Mybutton());
        buttonPic3.setOnClickListener(new Mybutton());
    }

    private class Mybutton implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.button_pic1:
                    imageViewPic.setImageResource(R.drawable.cat_1);
                    textViewResult.setText("這是貓貓");
                    break;

                case  R.id.button_pic2:
                    imageViewPic.setImageResource(R.drawable.cat_2);
                    textViewResult.setText("this is kitty");
                    break;

                case R.id.button_pic3:
                    imageViewPic.setImageResource(R.drawable.cat_4);
                    textViewResult.setText("這是GAGA");
                    break;

            }

        }
    }
}