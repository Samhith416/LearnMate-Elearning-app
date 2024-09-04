package com.example.cp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity12 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        t1 = (TextView) findViewById(R.id.tv3);
        t1.setText("\n\nAndroid Emulator\n" +
                "The Android emulator is an Android Virtual Device (AVD), which represents a specific Android device. We can use the Android emulator as a target device to execute and test our Android application on our PC. The Android emulator provides almost all the functionality of a real device. We can get the incoming phone calls and text messages. It also gives the location of the device and simulates different network speeds. Android emulator simulates rotation and other hardware sensors. It accesses the Google Play store, and much more\n"+"Testing Android applications on emulator are sometimes faster and easier than doing on a real device. For example, we can transfer data faster to the emulator than to a real device connected through USB.\n" +
                "\n" +
                "The Android emulator comes with predefined configurations for several Android phones, Wear OS, tablet, Android TV devices\n"+"Requirement and recommendations\n" +
                "The Android emulator takes additional requirements beyond the basic system requirement for Android Studio. These requirements are given below:\n" +

                "SDK Tools 26.1.1 or higher\n" +
                "64-bit processor\n" +
                "Windows: CPU with UG (unrestricted guest) support\n" +
                "HAXM 6.2.1 or later (recommended HAXM 7.2.0 or later)\n"+"Install the emulator\n" +
                "The Android emulator is installed while installing the Android Studio. However some components of emulator may or may not be installed while installing Android Studio. To install the emulator component, select the Android Emulator component in the SDK Tools tab of the SDK Manager.\n" +
                "\n" +
                "Run an Android app on the Emulator\n" +
                "We can run an Android app form the Android Studio project, or we can run an app which is installed on the Android Emulator as we run any app on a device.");
    }
}