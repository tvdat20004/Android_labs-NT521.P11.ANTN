package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.b.h.m.l;
import b.b.h.m.z;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements z {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1, false));
    }

    @Override // b.b.h.m.z
    public void b(l lVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
