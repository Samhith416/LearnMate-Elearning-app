package com.example.cp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity10 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        t1 = (TextView) findViewById(R.id.t1);
        t1.setText("Android tutorial or Android Studio tutorial covers basic and advanced concepts of android technology. Our Android development tutorial is developed for beginners and professionals.\n" +
                "\n" +
                "Android is a complete set of software for mobile devices such as tablet computers, notebooks, smartphones, electronic book readers, set-top boxes etc.\n" +
                "\n" +
                "It contains a linux-based Operating System, middleware and key mobile applications.\n" +
                "\n" +
                "It can be thought of as a mobile operating system. But it is not limited to mobile only. It is currently used in various devices such as mobiles, tablets, televisions etc.\n"+"Before learning all topics of android, it is required to know what is android.\n" +
                "\n" +
                "Android is a software package and linux based operating system for mobile devices such as tablet computers and smartphones.\n" +
                "\n" +
                "It is developed by Google and later the OHA (Open Handset Alliance). Java language is mainly used to write the android code even though other languages can be used.\n" +
                "\n" +
                "The goal of android project is to create a successful real-world product that improves the mobile experience for end users.\n"+"After learning what is android, let's see the features of android. The important features of android are given below:\n" +
                "\n" +
                "1) It is open-source." +
                "\n" +
                "2) Anyone can customize the Android Platform.\n3) There are a lot of mobile applications that can be chosen by the consumer." +
                "\n" +
                "3) It provides many interesting features like weather details, opening screen, live RSS (Really Simple Syndication) feeds etc." +
                "\n" +
                "4)It provides support for messaging services(SMS and MMS), web browser, storage (SQLite), connectivity (GSM, CDMA, Blue Tooth, Wi-Fi etc.), media, handset layout etc.\n" +
                "\n");
    }
}