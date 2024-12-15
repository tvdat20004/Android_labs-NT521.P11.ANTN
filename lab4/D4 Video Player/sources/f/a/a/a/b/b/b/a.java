package f.a.a.a.b.b.b;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.b.c.l;
import b.l.b.h;
import f.a.a.a.b.b.b.b;
import f.a.a.a.b.b.b.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class a extends Fragment implements c.a {
    public static final /* synthetic */ int Z = 0;
    public RecyclerView T;
    public View U;
    public View V;
    public Button W;
    public b.a X;
    public List<b> Y;

    /* renamed from: f.a.a.a.b.b.b.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0006a implements View.OnClickListener {
        public ViewOnClickListenerC0006a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            int i = a.Z;
            if (aVar.t0()) {
                String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE"};
                h<?> hVar = aVar.s;
                if (hVar == null) {
                    throw new IllegalStateException("Fragment " + aVar + " not attached to Activity");
                }
                l lVar = hVar.f1414f;
                Objects.requireNonNull(lVar);
                l.k(0);
                try {
                    lVar.l = true;
                    b.h.b.b.b(lVar, strArr, ((lVar.j(aVar) + 1) << 16) + 0);
                } finally {
                    lVar.l = false;
                }
            }
        }
    }

    public a() {
        this.X = b.a.VIDEO;
        this.Y = new ArrayList();
    }

    public a(b.a aVar) {
        this.X = b.a.VIDEO;
        this.Y = new ArrayList();
        this.X = aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void I(Bundle bundle) {
        super.I(bundle);
        d.a.a.a.f("onCREATE: %s", this.X.toString());
        r0();
    }

    @Override // androidx.fragment.app.Fragment
    public View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Button button;
        d.a.a.a.e("onCreateView()", new Object[0]);
        View inflate = layoutInflater.inflate(R.layout.mediapicker_fragment_media_chooser, viewGroup, false);
        this.T = (RecyclerView) inflate.findViewById(R.id.mediapicker_media_previews_list);
        this.U = inflate.findViewById(R.id.mediapicker_no_media_container);
        this.V = inflate.findViewById(R.id.mediapicker_no_permissions_container);
        this.W = (Button) inflate.findViewById(R.id.mediapicker_request_permissions_btn);
        if (i() != null && this.T != null && this.U != null && this.V != null && (button = this.W) != null) {
            button.setOnClickListener(new ViewOnClickListenerC0006a());
            q0();
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void V(int i, String[] strArr, int[] iArr) {
        if (i == 0 && iArr[0] == 0) {
            r0();
            q0();
        }
    }

    public final void q0() {
        int i;
        Context i2 = i();
        if (i2 == null || this.T == null) {
            d.a.a.a.f("Context or mediaCardsRecylcer is null!", new Object[0]);
            return;
        }
        if (t0()) {
            d.a.a.a.e("No Storage permissions, show noStoragePermissions info", new Object[0]);
            this.T.setVisibility(8);
            this.U.setVisibility(8);
            this.V.setVisibility(0);
            return;
        }
        List<b> list = this.Y;
        if (list == null || list.size() <= 0) {
            d.a.a.a.e("No media entries, show noMediaEntries info", new Object[0]);
            this.T.setVisibility(8);
            this.U.setVisibility(0);
            this.V.setVisibility(8);
            return;
        }
        this.T.setVisibility(0);
        this.U.setVisibility(8);
        this.V.setVisibility(8);
        c cVar = new c(i2, this.Y, this);
        int ordinal = this.X.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = R.drawable.ic_music_note_black_24dp;
            }
            this.T.setLayoutManager(new LinearLayoutManager(1, false));
            this.T.setAdapter(cVar);
        }
        i = R.drawable.ic_terrain_black_24dp;
        cVar.f4354f = i2.getDrawable(i);
        this.T.setLayoutManager(new LinearLayoutManager(1, false));
        this.T.setAdapter(cVar);
    }

    public final void r0() {
        Context i;
        ContentResolver contentResolver;
        if (t0() || (i = i()) == null || (contentResolver = i().getContentResolver()) == null) {
            return;
        }
        b.a aVar = this.X;
        this.Y.clear();
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            s0(i, contentResolver, new Uri[]{MediaStore.Video.Media.EXTERNAL_CONTENT_URI, MediaStore.Video.Media.getContentUri("phoneStorage")}, aVar);
        } else if (ordinal == 1) {
            s0(i, contentResolver, new Uri[]{MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, MediaStore.Audio.Media.getContentUri("phoneStorage")}, aVar);
        }
        d.a.a.a.e("initializeMediaEntries() found %d media entries for kind %s", Integer.valueOf(this.Y.size()), this.X.toString());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:6|7|8|(3:20|21|(1:23)(6:24|25|(2:134|135)|27|28|(5:127|128|129|130|15)(5:30|(9:31|(4:33|(3:105|106|(1:108)(9:109|(1:111)(3:113|114|(5:116|117|118|119|120))|112|(3:94|95|(5:100|(4:41|(1:43)(1:67)|44|45)(10:68|69|70|(1:74)|(1:85)(1:78)|79|80|81|82|83)|46|(1:48)(0)|12))|39|(0)(0)|46|(0)(0)|12))|35|36)(1:126)|37|(0)|39|(0)(0)|46|(0)(0)|12)|13|14|15)))|10|(2:19|15)(0)|12|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x020c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e A[Catch: all -> 0x0118, TryCatch #11 {all -> 0x0118, blocks: (B:95:0x00f9, B:97:0x00ff, B:100:0x010a, B:41:0x011e, B:44:0x012e, B:67:0x012a, B:117:0x00c9, B:119:0x00d1, B:120:0x00d9), top: B:94:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cf A[LOOP:1: B:31:0x0089->B:48:0x01cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s0(android.content.Context r29, android.content.ContentResolver r30, android.net.Uri[] r31, f.a.a.a.b.b.b.b.a r32) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.a.b.b.b.a.s0(android.content.Context, android.content.ContentResolver, android.net.Uri[], f.a.a.a.b.b.b.b$a):void");
    }

    public final boolean t0() {
        Context i = i();
        return i == null || b.h.b.b.a(i, "android.permission.READ_EXTERNAL_STORAGE") != 0;
    }
}
