package e.a.a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import pl.droidsonroids.gif.GifInfoHandle;

/* loaded from: classes.dex */
public class j extends View.BaseSavedState {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* renamed from: b, reason: collision with root package name */
    public final long[][] f4310b;

    public j(Parcel parcel, i iVar) {
        super(parcel);
        this.f4310b = new long[parcel.readInt()][];
        int i = 0;
        while (true) {
            long[][] jArr = this.f4310b;
            if (i >= jArr.length) {
                return;
            }
            jArr[i] = parcel.createLongArray();
            i++;
        }
    }

    public void i(Drawable drawable, int i) {
        int restoreSavedState;
        long[][] jArr = this.f4310b;
        if (jArr[i] == null || !(drawable instanceof d)) {
            return;
        }
        d dVar = (d) drawable;
        GifInfoHandle gifInfoHandle = dVar.h;
        long[] jArr2 = jArr[i];
        Bitmap bitmap = dVar.g;
        synchronized (gifInfoHandle) {
            restoreSavedState = GifInfoHandle.restoreSavedState(gifInfoHandle.f4370a, jArr2, bitmap);
        }
        dVar.a(restoreSavedState);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4310b.length);
        for (long[] jArr : this.f4310b) {
            parcel.writeLongArray(jArr);
        }
    }

    public j(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        long[] savedState;
        this.f4310b = new long[drawableArr.length][];
        for (int i = 0; i < drawableArr.length; i++) {
            Drawable drawable = drawableArr[i];
            if (drawable instanceof d) {
                long[][] jArr = this.f4310b;
                GifInfoHandle gifInfoHandle = ((d) drawable).h;
                synchronized (gifInfoHandle) {
                    savedState = GifInfoHandle.getSavedState(gifInfoHandle.f4370a);
                }
                jArr[i] = savedState;
            } else {
                this.f4310b[i] = null;
            }
        }
    }
}
