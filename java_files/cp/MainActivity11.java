package com.example.cp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity11 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        t1 = (TextView) findViewById(R.id.tv2);
        t1.setText("History of Android\n" +
                "The history and versions of android are interesting to know. The code names of android ranges from A to J currently, such as Aestro, Blender, Cupcake, Donut, Eclair, Froyo, Gingerbread, Honeycomb, Ice Cream Sandwitch, Jelly Bean, KitKat and Lollipop. Let's understand the android history in a sequence.\n" +
                "\n" +
                "1) Initially, Andy Rubin founded Android Incorporation in Palo Alto, California, United States in October, 2003.\n" +
                "\n" +
                "2) In 17th August 2005, Google acquired android Incorporation. Since then, it is in the subsidiary of Google Incorporation.\n" +
                "\n" +
                "3) The key employees of Android Incorporation are Andy Rubin, Rich Miner, Chris White and Nick Sears.\n" +
                "\n" +
                "4) Originally intended for camera but shifted to smart phones later because of low market for camera only.\n" +
                "\n" +
                "5) Android is the nick name of Andy Rubin given by coworkers because of his love to robots.\n" +
                "\n" +
                "6) In 2007, Google announces the development of android OS.\n" +
                "\n" +
                "7) In 2008, HTC launched the first android mobile.\n"+"Android Core Building Blocks\nAn android component is simply a piece of code that has a well defined life cycle e.g. Activity, Receiver, Service etc.\n" +
                "\n" +
                "The core building blocks or fundamental components of android are activities, views, intents, services, content providers, fragments and AndroidManifest.xml.\n" +
                "\n" +
                "Activity\n" +
                "An activity is a class that represents a single screen. It is like a Frame in AWT.\n" +
                "\n" +
                "View\n" +
                "A view is the UI element such as button, label, text field etc. Anything that you see is a view.\n"+"Intent\n" +
                "Intent is used to invoke components. It is mainly used to:\n" +
                "\n"
               );
    }
}