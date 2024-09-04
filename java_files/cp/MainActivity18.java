package com.example.cp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity18 extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);
        tv1 = (TextView) findViewById(R.id.tv9);
        tv1.setText("Python is a general-purpose, popular programming language, and it is used in almost every technical field. The various areas of Python use are given below.\n" +
                "\n" +
                "Data Science: Data Science is a vast field, and Python is an important language for this field because of its simplicity, ease of use, and availability of powerful data analysis and visualization libraries like NumPy, Pandas, and Matplotlib.\n" +
                "Desktop Applications: PyQt and Tkinter are useful libraries that can be used in GUI - Graphical User Interface-based Desktop Applications. There are better languages for this field, but it can be used with other languages for making Applications.\n" +
                "Console-based Applications: Python is also commonly used to create command-line or console-based applications because of its ease of use and support for advanced features such as input/output redirection and piping.\n" +
                "Mobile Applications: While Python is not commonly used for creating mobile applications, it can still be combined with frameworks like Kivy or BeeWare to create cross-platform mobile applications.\n" +
                "Software Development: Python is considered one of the best software-making languages. Python is easily compatible with both from Small Scale to Large Scale software.\n" +
                "Artificial Intelligence: AI is an emerging Technology, and Python is a perfect language for artificial intelligence and machine learning because of the availability of powerful libraries such as TensorFlow, Keras, and PyTorch.\n" +
                "Web Applications: Python is commonly used in web development on the backend with frameworks like Django and Flask and on the front end with tools like JavaScript and HTML.\n" +
                "Enterprise Applications: Python can be used to develop large-scale enterprise applications with features such as distributed computing, networking, and parallel processing.\n" +
                "3D CAD Applications: Python can be used for 3D computer-aided design (CAD) applications through libraries such as Blender.\n" +
                "Machine Learning: Python is widely used for machine learning due to its simplicity, ease of use, and availability of powerful machine learning libraries.\n"
        );
    }
}