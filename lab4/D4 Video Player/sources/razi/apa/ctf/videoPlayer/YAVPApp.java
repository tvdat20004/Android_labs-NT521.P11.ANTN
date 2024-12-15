package razi.apa.ctf.videoPlayer;

import android.app.Application;
import android.content.Intent;
import android.os.Process;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.Objects;
import razi.apa.ctf.videoPlayer.ui.CrashScreenActivity;
import razi.apa.ctf.videoPlayer.ui.playback.PlaybackActivity;

/* loaded from: classes.dex */
public class YAVPApp extends Application implements Thread.UncaughtExceptionHandler {

    /* renamed from: b, reason: collision with root package name */
    public a f4371b;

    public interface a {
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        String name = thread.getName();
        String th2 = th.toString();
        String message = th.getMessage();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        d.a.a.a.f("[YAVPApp] unhandled exception in Thread %s: \nCause: %s \n%s \n%s \n", name, th2, message, stringWriter2);
        a aVar = this.f4371b;
        if (aVar != null) {
            PlaybackActivity playbackActivity = (PlaybackActivity) aVar;
            Objects.requireNonNull(playbackActivity);
            d.a.a.a.e("Saving Playback position on app crash...", new Object[0]);
            playbackActivity.v();
        }
        Intent intent = new Intent(this, (Class<?>) CrashScreenActivity.class);
        intent.setFlags(268468224);
        if (stringWriter2.length() > 131000) {
            stringWriter2 = stringWriter2.substring(0, 130976) + " [stack trace too large]";
        }
        intent.putExtra("exThreadName", name);
        intent.putExtra("exCauseShort", th2);
        intent.putExtra("exCauseMessage", message);
        intent.putExtra("exCauseStacktrace", stringWriter2);
        startActivity(intent);
        Process.killProcess(Process.myPid());
        System.exit(10);
    }
}
