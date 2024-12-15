package razi.apa.ctf.videoPlayer.feature.gl;

import android.os.Bundle;
import android.view.View;
import b.b.c.l;
import f.a.a.a.a.b.b;
import java.security.NoSuchAlgorithmException;
import pl.droidsonroids.gif.GifImageView;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class playCheck extends l {
    public b q;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                playCheck.this.q.a();
            } catch (NoSuchAlgorithmException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // b.b.c.l, androidx.activity.ComponentActivity, b.h.b.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        GifImageView gifImageView = (GifImageView) findViewById(R.id.gif);
        this.q = new b();
        gifImageView.setOnClickListener(new a());
    }
}
