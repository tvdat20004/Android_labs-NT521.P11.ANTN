package c.c.a.a.a2;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;

@TargetApi(17)
/* loaded from: classes.dex */
public final class t implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f1959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f1960b;

    public t(v vVar, DisplayManager displayManager) {
        this.f1960b = vVar;
        this.f1959a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i) {
        if (i == 0) {
            this.f1960b.b();
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i) {
    }
}
