package e.a.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import pl.droidsonroids.gif.GifInfoHandle;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final List<String> f4311a = Arrays.asList("raw", "drawable", "mipmap");

    public static class a extends l {

        /* renamed from: c, reason: collision with root package name */
        public final int f4312c;

        /* renamed from: d, reason: collision with root package name */
        public final int f4313d;

        public a() {
            this.f4312c = 0;
            this.f4313d = 0;
        }

        public a(ImageView imageView, AttributeSet attributeSet, int i, int i2) {
            super(imageView, attributeSet, i, i2);
            this.f4312c = a(imageView, attributeSet, true);
            this.f4313d = a(imageView, attributeSet, false);
        }

        public static int a(ImageView imageView, AttributeSet attributeSet, boolean z) {
            int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", z ? "src" : "background", 0);
            if (attributeResourceValue > 0) {
                if (k.f4311a.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) && !k.b(imageView, z, attributeResourceValue)) {
                    return attributeResourceValue;
                }
            }
            return 0;
        }
    }

    public static void a(int i, Drawable drawable) {
        if (drawable instanceof d) {
            GifInfoHandle gifInfoHandle = ((d) drawable).h;
            Objects.requireNonNull(gifInfoHandle);
            if (i < 0 || i > 65535) {
                throw new IllegalArgumentException("Loop count of range <0, 65535>");
            }
            synchronized (gifInfoHandle) {
                GifInfoHandle.setLoopCount(gifInfoHandle.f4370a, (char) i);
            }
        }
    }

    public static boolean b(ImageView imageView, boolean z, int i) {
        Resources resources = imageView.getResources();
        if (resources != null) {
            try {
                if (!f4311a.contains(resources.getResourceTypeName(i))) {
                    return false;
                }
                d dVar = new d(resources, i);
                if (z) {
                    imageView.setImageDrawable(dVar);
                    return true;
                }
                imageView.setBackground(dVar);
                return true;
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return false;
    }
}
