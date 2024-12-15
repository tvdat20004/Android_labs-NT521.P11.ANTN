package b.b.c;

import android.content.Context;
import android.widget.ArrayAdapter;

/* loaded from: classes.dex */
public class j extends ArrayAdapter<CharSequence> {
    public j(Context context, int i, int i2, CharSequence[] charSequenceArr) {
        super(context, i, i2, charSequenceArr);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
