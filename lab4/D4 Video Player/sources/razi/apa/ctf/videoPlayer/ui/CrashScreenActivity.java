package razi.apa.ctf.videoPlayer.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import b.b.c.l;
import b.q.q;
import c.a.a.a.a;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class CrashScreenActivity extends l {
    public SharedPreferences q;
    public Button r;

    public void crashac_OnClick(View view) {
        switch (view.getId()) {
            case R.id.crashac_btn_close_app /* 2131230839 */:
                finish();
                break;
            case R.id.crashac_btn_resume /* 2131230840 */:
                if (t()) {
                    String string = q.a(getApplicationContext()).getString("LAST_PLAYED_TITLE", null);
                    Uri parse = Uri.parse(q.a(getApplicationContext()).getString("LAST_PLAYED_URL", null));
                    if (parse != null) {
                        Intent intent = new Intent(this, (Class<?>) LaunchActivity.class);
                        intent.setAction("android.intent.action.VIEW");
                        intent.setData(parse);
                        intent.putExtra("android.intent.extra.TITLE", string);
                        startActivity(intent);
                        finish();
                        break;
                    }
                }
                break;
        }
    }

    @Override // b.b.c.l, androidx.activity.ComponentActivity, b.h.b.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.crash_activity);
        this.q = q.a(getApplicationContext());
        Button button = (Button) findViewById(R.id.crashac_btn_resume);
        this.r = button;
        button.setEnabled(t());
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("exCauseStacktrace");
        if (stringExtra == null || stringExtra.isEmpty()) {
            StringBuilder j = a.j("no stacktrace! dumping intent now:\n");
            j.append(intent.toString());
            j.append("\n");
            j.append(intent.getData());
            j.append("\n\n");
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    j.append(str);
                    j.append(" = ");
                    j.append(extras.get(str));
                }
            } else {
                j.append("no extras");
            }
            stringExtra = j.toString();
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Platform Info:\n");
        sb2.append("Device: ");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(" (");
        sb2.append(Build.PRODUCT);
        sb2.append(")\nBoard: ");
        sb2.append(Build.BOARD);
        sb2.append("\nType&Tags: ");
        sb2.append(Build.TYPE);
        sb2.append(" (");
        sb2.append(Build.TAGS);
        sb2.append(")\nAndroid ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(" SDK ");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(" (");
        sb2.append(Build.VERSION.CODENAME);
        sb2.append(")\nABIs: ");
        for (String str2 : Build.SUPPORTED_ABIS) {
            sb2.append(str2);
            sb2.append(", ");
        }
        sb2.append("\n\nStacktrace:\n");
        sb.append(sb2.toString());
        sb.append(stringExtra);
        ((TextView) findViewById(R.id.crashac_txt_crash_details)).setText(sb.toString());
    }

    public final boolean t() {
        return (q.a(getApplicationContext()).getString("LAST_PLAYED_URL", null) == null || q.a(getApplicationContext()).getString("LAST_PLAYED_TITLE", null) == null || this.q.getLong("LAST_PLAYED_POSITION", -1L) <= 0) ? false : true;
    }
}
