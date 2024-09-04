package com.example.cp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity16 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        t1 = (TextView) findViewById(R.id.tv7);
        t1.setText("Python Tutorial | Python Programming Language\n"+"Python tutorial provides basic and advanced concepts of Python. Our Python tutorial is designed for beginners and professionals.\n" +
                "\n" +
                "Python is a simple, general purpose, high level, and object-oriented programming language.\n" +
                "\n" +
                "Python is an interpreted scripting language also. Guido Van Rossum is known as the founder of Python programming.\n" +
                "\n" +
                "Our Python tutorial includes all topics of Python Programming such as installation, control statements, Strings, Lists, Tuples, Dictionary, Modules, Exceptions, Date and Time, File I/O, Programs, etc. There are also given Python interview questions to help you better understand Python Programming.\n"+
                "What is Python\n" +
                "Python is a general-purpose, dynamic, high-level, and interpreted programming language. It supports Object Oriented programming approach to develop applications. It is simple and easy to learn and provides lots of high-level data structures.\n" +

                "Python is an easy-to-learn yet powerful and versatile scripting language, which makes it attractive for Application Development.\n" +

                "With its interpreted nature, Python's syntax and dynamic typing make it an ideal language for scripting and rapid application development.\n" +

                "Python supports multiple programming patterns, including object-oriented, imperative, and functional or procedural programming styles.\n" +

                "Python is not intended to work in a particular area, such as web programming. It is a multipurpose programming language because it can be used with web, enterprise, 3D CAD, etc.\n" +

                "We don't need to use data types to declare variable because it is dynamically typed, so we can write a=10 to assign an integer value in an integer variable.\n" +

                "Python makes development and debugging fast because no compilation step is included in Python development, and the edit-test-debug cycle is very fast.\n" +

                "Python has many web-based assets, open-source projects, and a vibrant community. Learning the language, working together on projects, and contributing to the Python ecosystem are all made very easy for developers.\n" +

                "Because of its straightforward language framework, Python is easier to understand and write code in. This makes it a fantastic programming language for novices.");
    }
}