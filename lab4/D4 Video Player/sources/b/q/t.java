package b.q;

import android.R;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class t extends RecyclerView.a0 {
    public final SparseArray<View> t;
    public boolean u;
    public boolean v;

    public t(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.t = sparseArray;
        sparseArray.put(R.id.title, view.findViewById(R.id.title));
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(razi.apa.ctf.videoPlayer.R.id.icon_frame, view.findViewById(razi.apa.ctf.videoPlayer.R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
    }

    public View w(int i) {
        View view = this.t.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.f305a.findViewById(i);
        if (findViewById != null) {
            this.t.put(i, findViewById);
        }
        return findViewById;
    }
}
