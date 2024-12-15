package com.example.razictf_2;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class MainActivity extends AppCompatActivity {
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        final ImageButton imageButton = (ImageButton) findViewById(R.id.my_button);
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        new Timer().schedule(new TimerTask() { // from class: com.example.razictf_2.MainActivity.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                MainActivity.this.runOnUiThread(new Runnable() { // from class: com.example.razictf_2.MainActivity.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Random random = new Random();
                        float nextFloat = random.nextFloat() * displayMetrics.widthPixels;
                        float nextFloat2 = random.nextFloat() * displayMetrics.heightPixels;
                        new Timer();
                        imageButton.animate().x(nextFloat).y(nextFloat2).setDuration(0L).start();
                    }
                });
            }
        }, 0L, 1000L);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.example.razictf_2.MainActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TextView textView = (TextView) MainActivity.this.findViewById(R.id.Num);
                int parseInt = Integer.parseInt(textView.getText().toString());
                if (parseInt == 0 || parseInt < 0) {
                    textView.setText("0");
                    return;
                }
                int i = parseInt - 1;
                String run = new switcher().run(i);
                if (run != null) {
                    ((TextView) MainActivity.this.findViewById(R.id.Flag)).setText(run);
                }
                textView.setText(String.valueOf(i));
            }
        });
    }
}
