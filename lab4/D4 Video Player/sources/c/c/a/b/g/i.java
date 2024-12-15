package c.c.a.b.g;

import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import b.b.h.m.l;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import f.a.a.a.b.b.b.b;
import razi.apa.ctf.videoPlayer.R;
import razi.apa.ctf.videoPlayer.ui.mediapicker.MediaPickerActivity;

/* loaded from: classes.dex */
public class i implements l.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomNavigationView f3865b;

    public i(BottomNavigationView bottomNavigationView) {
        this.f3865b = bottomNavigationView;
    }

    @Override // b.b.h.m.l.a
    public boolean a(l lVar, MenuItem menuItem) {
        Fragment aVar;
        boolean z;
        if (this.f3865b.h != null && menuItem.getItemId() == this.f3865b.getSelectedItemId()) {
            this.f3865b.h.a(menuItem);
            return true;
        }
        BottomNavigationView.b bVar = this.f3865b.g;
        if (bVar != null) {
            MediaPickerActivity mediaPickerActivity = (MediaPickerActivity) bVar;
            switch (menuItem.getItemId()) {
                case R.id.mediapicker_navigation_target_more /* 2131230977 */:
                    aVar = new f.a.a.a.b.b.a();
                    break;
                case R.id.mediapicker_navigation_target_music /* 2131230978 */:
                    aVar = new f.a.a.a.b.b.b.a(b.a.MUSIC);
                    break;
                case R.id.mediapicker_navigation_target_videos /* 2131230979 */:
                    aVar = new f.a.a.a.b.b.b.a(b.a.VIDEO);
                    break;
                default:
                    aVar = null;
                    break;
            }
            if (aVar == null) {
                d.a.a.a.f("did not find a fragment for menu item id= %d", Integer.valueOf(menuItem.getItemId()));
                z = false;
            } else {
                b.l.b.a aVar2 = new b.l.b.a(mediaPickerActivity.n());
                aVar2.m(R.id.mediapicker_content_container, aVar);
                aVar2.d();
                z = true;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // b.b.h.m.l.a
    public void b(l lVar) {
    }
}
