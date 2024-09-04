package com.example.cp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity15 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        t1 = (TextView) findViewById(R.id.tv6);
        t1.setText("Java Control Statements | Control Flow in Java\n" +
                "Java compiler executes the code from top to bottom. The statements in the code are executed according to the order in which they appear. However, Java provides statements that can be used to control the flow of Java code. Such statements are called control flow statements. It is one of the fundamental features of Java, which provides a smooth flow of program.\n" +
                "\n" +
                "Java provides three types of control flow statements.\n" +
                "\n" +
                "Decision Making statements\n" +
                "if statements\n" +
                "switch statement\n" +
                "Loop statements\n" +
                "do while loop\n" +
                "while loop\n" +
                "for loop\n" +
                "for-each loop\n" +
                "Jump statements\n" +
                "break statement\n" +
                "continue statement\n"+"Decision-Making statements:\n" +
                "As the name suggests, decision-making statements decide which statement to execute and when. Decision-making statements evaluate the Boolean expression and control the program flow depending upon the result of the condition provided. There are two types of decision-making statements in Java, i.e., If statement and switch statement.\n"+
                "Loop Statements\n" +
                "In programming, sometimes we need to execute the block of code repeatedly while some condition evaluates to true. However, loop statements are used to execute the set of instructions in a repeated order. The execution of the set of instructions depends upon a particular condition.\n" +
                "\n" +
                "In Java, we have three types of loops that execute similarly. However, there are differences in their syntax and condition checking time.\n" +

                "for loop\n" +
                "while loop\n" +
                "do-while loop\n"+"Jump Statements\n" +
                "Jump statements are used to transfer the control of the program to the specific statements. In other words, jump statements transfer the execution control to the other part of the program. There are two types of jump statements in Java, i.e., break and continue.");
    }
}