package razi.apa.ctf.videoPlayer.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import b.b.c.l;
import b.q.q;
import d.a.a.a;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class LaunchActivity extends l {
    public static final /* synthetic */ int s = 0;
    public SharedPreferences q;
    public Handler r = new Handler();

    @Override // b.b.c.l, androidx.activity.ComponentActivity, b.h.b.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.lauch_activity);
        a.e("Launch Activity onCreate was called.", new Object[0]);
        this.q = q.a(getApplicationContext());
    }

    @Override // b.b.c.l, android.app.Activity
    public void onStart() {
        super.onStart();
        int integer = getResources().getInteger(R.integer.min_splash_screen_duration);
        Intent intent = getIntent();
        if (intent.getBooleanExtra("launchNoDelay", false)) {
            integer = 0;
        }
        this.r.postDelayed(new f.a.a.a.b.a(this, intent), integer);
    }

    public final void t(Intent intent, String str) {
        a.e("========================================", new Object[0]);
        a.e("Dumping Intent " + str, new Object[0]);
        a.e("%s of type %s", intent.toString(), intent.getType());
        Uri data = intent.getData();
        Object[] objArr = new Object[2];
        objArr[0] = data == null ? "null" : data.toString();
        objArr[1] = intent.getDataString();
        a.e("Data: %s (%s)", objArr);
        a.e("Extras: ", new Object[0]);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str2 : extras.keySet()) {
                a.e("   %s = %s", str2, extras.get(str2));
            }
        } else {
            a.e("Intent has no extras.", new Object[0]);
        }
        a.e("========================================", new Object[0]);
    }
}
