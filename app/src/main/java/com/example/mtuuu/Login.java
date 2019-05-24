package com.example.mtuuu;

import android.app.Activity;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Map;

import okhttp3.Response;

import static java.lang.reflect.Method.*;


public class Login<view> extends Activity {


    private Object TextView;
    private Socket Jsoup;
    private Object POST;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final String username = "user";
        final String password = "password";

        TextView textView1;
        TextView textView2;
        textView1 = (TextView) findViewById(R.id.username);
        textView2 = (TextView) findViewById(R.id.password);


    }


    public View onClick(View view) {
        try {
            Response res1 = Jsoup.connect("http://68.183.73.55:8080/login/")
                    .data("login","polina")
                    .data("passwd","123")
                    .method(POST)
                    .execute();
            Map loginCoockies = res1.cookies();
            System.out.println(loginCoockies);
            DocumentsContract.Document doc = Jsoup.connect("http://68.183.73.55:8080/login/")
                    .cookies(loginCoockies)
                    .get();
            System.out.println(doc);
        } catch (IOException e) {
            System.out.println(e);
        }
        return null;
    }
}