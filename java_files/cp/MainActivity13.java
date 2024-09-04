package com.example.cp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity13 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        t1 = (TextView) findViewById(R.id.tv4);
        t1.setText("Java Tutorial\n"+"What is Java?\n" +
                "Java is a programming language and a platform. Java is a high level, robust, object-oriented and secure programming language.\n" +
                "\n" +
                "Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) in the year 1995. James Gosling is known as the father of Java. Before Java, its name was Oak. Since Oak was already a registered company, so James Gosling and his team changed the name from Oak to Java.\n" +
                "\n" +
                "Platform: Any hardware or software environment in which a program runs, is known as a platform. Since Java has a runtime environment (JRE) and API, it is called a platform.\n"+"Java Example\n" +
                "Let's have a quick look at Java programming example. A detailed description of Hello Java example is available in next page.\n" +
                "\n" +
                "Simple.java\n" +
                "\n" +
                "class Simple{  \n" +
                "    public static void main(String args[]){  \n" +
                "     System.out.println(\"Hello Java\");  \n" +
                "    }  \n" +
                "}  \n"+"Application\n" +
                "According to Sun, 3 billion devices run Java. There are many devices where Java is currently used. Some of them are as follows:\n" +

                "Desktop Applications such as acrobat reader, media player, antivirus, etc.\n" +
                "Web Applications such as irctc.co.in, javatpoint.com, etc.\n" +
                "Enterprise Applications such as banking applications.\n" +
                "Mobile\n" +
                "Embedded System\n" +
                "Smart Card\n" +
                "Robotics\n" +
                "Games, etc.\n"+"Prerequisite\n" +
                "To learn Java, you must have the basic knowledge of C/C++ programming language.\n" +
                "\n" +
                "Audience\n" +
                "Our Java programming tutorial is designed to help beginners and professionals.\n" +
                "\n"
               );
    }
}