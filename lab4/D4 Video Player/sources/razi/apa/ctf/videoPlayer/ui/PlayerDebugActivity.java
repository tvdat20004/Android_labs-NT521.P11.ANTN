package razi.apa.ctf.videoPlayer.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import b.b.c.l;
import b.q.q;
import d.a.a.a;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class PlayerDebugActivity extends l implements CompoundButton.OnCheckedChangeListener {
    public Switch q;
    public Switch r;
    public Switch s;
    public Switch t;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Switch r2;
        int id = compoundButton.getId();
        if (id == R.id.vtest_tgl_add_title_extra) {
            r2 = this.t;
        } else {
            if (id != R.id.vtest_tgl_open_direct) {
                return;
            }
            r2 = this.r;
            z = !z;
        }
        r2.setEnabled(z);
    }

    @Override // b.b.c.l, androidx.activity.ComponentActivity, b.h.b.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.debug_activity);
        this.q = (Switch) findViewById(R.id.vtest_tgl_open_direct);
        this.r = (Switch) findViewById(R.id.vtest_tgl_open_share);
        this.s = (Switch) findViewById(R.id.vtest_tgl_add_title_extra);
        this.t = (Switch) findViewById(R.id.vtest_tgl_non_standard_title);
        this.q.setOnCheckedChangeListener(this);
        this.s.setOnCheckedChangeListener(this);
    }

    public void videoTest_OnClick(View view) {
        Intent intent;
        Intent intent2;
        String str = "Big Buck Bunny";
        String str2 = "https://download.blender.org/peach/bigbuckbunny_movies/BigBuckBunny_320x180.mp4";
        switch (view.getId()) {
            case R.id.vtest_btn_3gp /* 2131231226 */:
                str2 = "http://techslides.com/demos/sample-videos/small.3gp";
                str = "Sample 3GP";
                break;
            case R.id.vtest_btn_dash /* 2131231228 */:
                str2 = "https://dash.akamaized.net/dash264/TestCasesIOP33/adapatationSetSwitching/5/manifest.mpd";
                str = "Tears of Steel";
                break;
            case R.id.vtest_btn_dash_2 /* 2131231229 */:
                str2 = "https://dash.akamaized.net/dash264/TestCases/1a/netflix/exMPD_BIP_TC1.mpd";
                str = "Elephants Dream";
                break;
            case R.id.vtest_btn_dash_3 /* 2131231230 */:
                str2 = "http://ftp.itec.aau.at/datasets/DASHDataset2014/BigBuckBunny/15sec/BigBuckBunny_15s_onDemand_2014_05_09.mpd";
                break;
            case R.id.vtest_btn_dash_and_subs /* 2131231231 */:
                str2 = "http://media.axprod.net/dash/ED_TTML_NEW/Clear/Manifest_sub_in.mpd";
                str = "Demo (DASH + TTML Subs)";
                break;
            case R.id.vtest_btn_hls /* 2131231232 */:
                str2 = "https://bitdash-a.akamaihd.net/content/sintel/hls/playlist.m3u8";
                str = "bitmovin - sintel";
                break;
            case R.id.vtest_btn_media_picker /* 2131231233 */:
                intent2 = new Intent(this, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.MAIN");
                startActivity(intent2);
                return;
            case R.id.vtest_btn_mp3 /* 2131231234 */:
                str2 = "http://storage.googleapis.com/exoplayer-test-media-0/play.mp3";
                str = "ExoPlayer Test - MP3";
                break;
            case R.id.vtest_btn_mp4_2 /* 2131231236 */:
                str2 = "http://techslides.com/demos/sample-videos/small.mp4";
                str = "Sample MP4";
                break;
            case R.id.vtest_btn_replaylast /* 2131231237 */:
                str2 = q.a(getApplicationContext()).getString("LAST_PLAYED_URL", "https://download.blender.org/peach/bigbuckbunny_movies/BigBuckBunny_320x180.mp4");
                str = q.a(getApplicationContext()).getString("LAST_PLAYED_TITLE", "REPLAY_LAST_TITLE_FALLBACK");
                break;
            case R.id.vtest_btn_settings /* 2131231238 */:
                intent2 = new Intent(this, (Class<?>) AppSettingsActivity.class);
                startActivity(intent2);
                return;
            case R.id.vtest_btn_webm /* 2131231239 */:
                str2 = "http://techslides.com/demos/sample-videos/small.webm";
                str = "Sample WEBM";
                break;
        }
        boolean isChecked = this.q.isChecked();
        boolean z = this.r.isChecked() && !isChecked;
        boolean isChecked2 = this.s.isChecked();
        boolean z2 = !this.t.isChecked() && isChecked2;
        a.e("Launching PlaybackActivity with URI=\"%s\"; Title=\"%s\" - Open Direct: %b; Open Share: %b Insert Title: %b; Use Standard Extra: %b", str2, str, Boolean.valueOf(isChecked), Boolean.valueOf(z), Boolean.valueOf(isChecked2), Boolean.valueOf(z2));
        if (isChecked) {
            intent = new Intent(this, (Class<?>) LaunchActivity.class);
            intent.setAction("android.intent.action.VIEW");
        } else if (z) {
            intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
        } else {
            intent = new Intent("android.intent.action.VIEW");
        }
        if (z) {
            intent.putExtra("android.intent.extra.TEXT", str2);
        } else {
            intent.setData(Uri.parse(str2));
        }
        if (isChecked2) {
            intent.putExtra(z2 ? "android.intent.extra.TITLE" : "title", str);
        }
        startActivity(intent);
    }

    public void videoTest_OnCrashClick(View view) {
        throw new Exception("Manual APP Crash");
    }
}
