package razi.apa.ctf.videoPlayer.ui.mediapicker;

import android.os.Bundle;
import b.b.c.l;
import b.l.b.a;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import f.a.a.a.b.b.b.b;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class MediaPickerActivity extends l implements BottomNavigationView.b {
    public BottomNavigationView q;

    @Override // b.b.c.l, androidx.activity.ComponentActivity, b.h.b.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediapicker_activity);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.mediapicker_navigation_bar);
        this.q = bottomNavigationView;
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        a aVar = new a(n());
        aVar.m(R.id.mediapicker_content_container, new f.a.a.a.b.b.b.a(b.a.VIDEO));
        aVar.d();
    }
}
