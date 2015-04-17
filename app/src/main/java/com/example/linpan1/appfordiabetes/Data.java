package com.example.linpan1.appfordiabetes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by linpan1 on 15/3/25.
 */
public class Data extends Activity{
    private EditText height;
    private EditText diet;
    private EditText weight;
    private EditText medicine;
    private EditText exercise;
    private EditText bloodGlucose;

    private Button  show;
    private Button  operate;
    private Button  myInformation;
    private Button  chat;

    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.data);

        height =(EditText)findViewById(R.id.height);
        diet  =(EditText)findViewById(R.id.diet);
        medicine =(EditText)findViewById(R.id.medicine);
        exercise =(EditText)findViewById(R.id.exercise);
        weight =(EditText)findViewById(R.id.weight);
        bloodGlucose =(EditText)findViewById(R.id.bloodGlucose);

        show = (Button)findViewById(R.id.show);
        operate = (Button)findViewById(R.id.operate);
        myInformation = (Button)findViewById(R.id.myinformation);
        chat = (Button)findViewById(R.id.chat);

//        show.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String xuetang_string=xuetang.getText().toString().trim();
//                String yinshi_string=yinshi.getText().toString().trim();
//                String email_string=email.getText().toString().trim();
//                String height_string=height.getText().toString().trim();
//                String yongyao_string=yongyao.getText().toString().trim();
//                String name_string=name.getText().toString().trim();
//                String weight_string=weight.getText().toString().trim();
//                String yundong_string=yundong.getText().toString().trim();
//                AVService.savePatientDoc(weight_string,email_string,name_string,xuetang_string,
//                        yinshi_string ,yongyao_string,yundong_string,height_string, true);
//
//            }
//        });


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Data.this, Figure.class);
                startActivity(intent);
            }
        });

        operate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Data.this, SearchAndDelete.class);
                startActivity(intent);
            }
        });

        myInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Data.this, SearchAndDelete.class);
                startActivity(intent);
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Data.this, SearchAndDelete.class);
                startActivity(intent);
            }
        });

    }
}
