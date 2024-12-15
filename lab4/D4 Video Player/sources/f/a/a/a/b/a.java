package f.a.a.a.b;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import java.util.Locale;
import java.util.Objects;
import razi.apa.ctf.videoPlayer.ui.LaunchActivity;
import razi.apa.ctf.videoPlayer.ui.mediapicker.MediaPickerActivity;
import razi.apa.ctf.videoPlayer.ui.playback.PlaybackActivity;

/* loaded from: classes.dex */
public class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f4340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LaunchActivity f4341c;

    public a(LaunchActivity launchActivity, Intent intent) {
        this.f4341c = launchActivity;
        this.f4340b = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        Uri data;
        String action = this.f4340b.getAction();
        if (action == null || (!(action.equals("android.intent.action.VIEW") || action.equals("android.intent.action.SEND")) || this.f4340b.getData() == null)) {
            LaunchActivity launchActivity = this.f4341c;
            int i = LaunchActivity.s;
            Objects.requireNonNull(launchActivity);
            launchActivity.startActivity(new Intent(launchActivity, (Class<?>) MediaPickerActivity.class));
            launchActivity.finish();
            return;
        }
        LaunchActivity launchActivity2 = this.f4341c;
        int i2 = LaunchActivity.s;
        Intent intent = launchActivity2.getIntent();
        launchActivity2.t(intent, "Calling Intent");
        boolean z = false;
        d.a.a.a.e("call Intent: %s", intent.toString());
        Bundle extras = intent.getExtras();
        if (extras != null) {
            d.a.a.a.e("call Intent Extras: ", new Object[0]);
            for (String str : extras.keySet()) {
                Object obj = extras.get(str);
                Object[] objArr = new Object[2];
                objArr[0] = str;
                objArr[1] = obj == null ? "NULL" : obj.toString();
                d.a.a.a.e("\"%s\" : \"%s\"", objArr);
            }
        }
        String action2 = intent.getAction();
        String str2 = null;
        if (action2 == null || action2.equalsIgnoreCase("android.intent.action.VIEW")) {
            data = intent.getData();
        } else {
            if (action2.equalsIgnoreCase("android.intent.action.SEND")) {
                String type = intent.getType();
                if (type != null) {
                    if (type.equalsIgnoreCase("text/plain")) {
                        if (intent.hasExtra("android.intent.extra.TEXT")) {
                            data = Uri.parse(intent.getStringExtra("android.intent.extra.TEXT"));
                        }
                    } else if ((type.startsWith("video/") || type.startsWith("audio/")) && intent.hasExtra("android.intent.extra.STREAM")) {
                        data = (Uri) intent.getExtras().get("android.intent.extra.STREAM");
                    }
                }
            } else {
                d.a.a.a.g("Received Intent with unknown action: %s", intent.getAction());
            }
            data = null;
        }
        if (data != null) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                if (extras2.containsKey("android.intent.extra.TITLE")) {
                    String string = extras2.getString("android.intent.extra.TITLE");
                    d.a.a.a.e("Parsing title from default EXTRA_TITLE...", new Object[0]);
                    str2 = string;
                } else {
                    for (String str3 : extras2.keySet()) {
                        if (str3.toLowerCase(Locale.US).contains("title")) {
                            Object obj2 = extras2.get(str3);
                            if (obj2 instanceof String) {
                                String str4 = (String) obj2;
                                if (!str4.isEmpty()) {
                                    d.a.a.a.e("Parsing title from non- default title extra (\"%s\" : \"%s\")", str3, str4);
                                    str2 = str4;
                                }
                            }
                        }
                    }
                }
                if (str2 != null) {
                    d.a.a.a.e("parsed final title from extra: %s", str2);
                }
            }
            if ((str2 == null || str2.isEmpty()) && (str2 = data.getLastPathSegment()) != null && !str2.isEmpty() && str2.indexOf(46) != -1) {
                str2 = str2.substring(0, str2.lastIndexOf(46));
                d.a.a.a.e("parse title from uri: %s", str2);
            }
            if (!str2.isEmpty()) {
                Intent intent2 = new Intent(launchActivity2, (Class<?>) PlaybackActivity.class);
                intent2.setData(data);
                intent2.putExtra("android.intent.extra.TITLE", str2);
                if (launchActivity2.q.getLong("LAST_PLAYED_POSITION", -1L) > 0 && (data.toString().equalsIgnoreCase(launchActivity2.q.getString("LAST_PLAYED_URL", "")) || str2.equalsIgnoreCase(launchActivity2.q.getString("LAST_PLAYED_TITLE", "")))) {
                    d.a.a.a.e("Putting INTENT_EXTRA_JUMP_TO because playback can be resumed.", new Object[0]);
                    intent2.putExtra("jumpTo", launchActivity2.q.getLong("LAST_PLAYED_POSITION", 0L));
                }
                launchActivity2.t(intent2, "Launch Intent");
                launchActivity2.q.edit().putString("LAST_PLAYED_URL", data.toString()).putString("LAST_PLAYED_TITLE", str2).apply();
                launchActivity2.startActivity(intent2);
                z = true;
            }
        }
        if (z) {
            launchActivity2.finish();
        } else {
            Toast.makeText(launchActivity2.getApplicationContext(), "Could not launch Playback Activity!", 1).show();
        }
    }
}
