package com.example.mtuuu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.mtuuu.R.id;
import static com.example.mtuuu.R.layout;


public class MainActivity extends AppCompatActivity {
    TextView Prov;





    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        //ищем view
    }

        public void onClick(View v){
             Button button_1 = findViewById(id.button_1);
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
        }

           // sbutton_1 = new OnClickListener() {
             //   @Override
              //  public void onClick(View v){
              //     Prov.setText("Проверка мать его");
            //}
            //};

            // присвоим обработчик кнопке OK (btn


}





