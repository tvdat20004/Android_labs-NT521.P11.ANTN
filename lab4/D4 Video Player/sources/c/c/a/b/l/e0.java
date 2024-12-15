package c.c.a.b.l;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class e0 extends LinearLayoutManager {
    public e0(Context context, int i, boolean z) {
        super(i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void V0(RecyclerView recyclerView, RecyclerView.x xVar, int i) {
        d0 d0Var = new d0(this, recyclerView.getContext());
        d0Var.f348a = i;
        W0(d0Var);
    }
}
