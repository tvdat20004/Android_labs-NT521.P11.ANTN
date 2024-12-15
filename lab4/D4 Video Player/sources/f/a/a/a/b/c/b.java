package f.a.a.a.b.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import razi.apa.ctf.videoPlayer.R;
import razi.apa.ctf.videoPlayer.feature.playback.VideoPlaybackService;
import razi.apa.ctf.videoPlayer.ui.playback.PlaybackActivity;

/* loaded from: classes.dex */
public class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlaybackActivity f4355a;

    public b(PlaybackActivity playbackActivity) {
        this.f4355a = playbackActivity;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        VideoPlaybackService videoPlaybackService;
        VideoPlaybackService videoPlaybackService2;
        int b2;
        if (intent == null || intent.getAction() == null || !intent.getAction().equals("media_control")) {
            return;
        }
        int intExtra = intent.getIntExtra("control_type", -1);
        boolean z = true;
        if (intExtra == 0) {
            videoPlaybackService = this.f4355a.x;
            z = true ^ videoPlaybackService.b();
        } else {
            if (intExtra != 1) {
                if (intExtra == 2) {
                    PlaybackActivity playbackActivity = this.f4355a;
                    videoPlaybackService2 = playbackActivity.x;
                    b2 = d.a.a.a.b(playbackActivity.getApplicationContext(), "SEEK_BUTTON_INCREMENT", R.integer.DEF_SEEK_BUTTON_INCREMENT);
                } else if (intExtra != 3) {
                    d.a.a.a.g("Received Invalid PIP Request id: %d", Integer.valueOf(intExtra));
                    return;
                } else {
                    PlaybackActivity playbackActivity2 = this.f4355a;
                    videoPlaybackService2 = playbackActivity2.x;
                    b2 = -d.a.a.a.b(playbackActivity2.getApplicationContext(), "SEEK_BUTTON_INCREMENT", R.integer.DEF_SEEK_BUTTON_INCREMENT);
                }
                videoPlaybackService2.i(b2);
                return;
            }
            this.f4355a.x.j(0L);
            videoPlaybackService = this.f4355a.x;
        }
        videoPlaybackService.k(z);
    }
}
