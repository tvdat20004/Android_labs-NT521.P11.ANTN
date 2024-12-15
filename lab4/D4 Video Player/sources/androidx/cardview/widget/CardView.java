package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import b.d.c.b;
import b.d.c.c;
import b.d.c.d;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] i = {R.attr.colorBackground};
    public static final c j = new b.d.c.a();

    /* renamed from: b, reason: collision with root package name */
    public boolean f142b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f143c;

    /* renamed from: d, reason: collision with root package name */
    public int f144d;

    /* renamed from: e, reason: collision with root package name */
    public int f145e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f146f;
    public final Rect g;
    public final b h;

    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f147a;

        public a() {
        }

        public boolean a() {
            return CardView.this.getPreventCornerOverlap();
        }

        public void b(int i, int i2, int i3, int i4) {
            CardView.this.g.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f146f;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, razi.apa.ctf.videoPlayer.R.attr.cardViewStyle);
        Resources resources;
        int i2;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f146f = rect;
        this.g = new Rect();
        a aVar = new a();
        this.h = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.d.b.f867a, razi.apa.ctf.videoPlayer.R.attr.cardViewStyle, razi.apa.ctf.videoPlayer.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(i);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i2 = razi.apa.ctf.videoPlayer.R.color.cardview_light_background;
            } else {
                resources = getResources();
                i2 = razi.apa.ctf.videoPlayer.R.color.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i2));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f142b = obtainStyledAttributes.getBoolean(7, false);
        this.f143c = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f144d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f145e = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        b.d.c.a aVar2 = (b.d.c.a) j;
        d dVar = new d(valueOf, dimension);
        aVar.f147a = dVar;
        CardView.this.setBackgroundDrawable(dVar);
        CardView cardView = CardView.this;
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        aVar2.b(aVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((d) ((a) this.h).f147a).h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f146f.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f146f.left;
    }

    public int getContentPaddingRight() {
        return this.f146f.right;
    }

    public int getContentPaddingTop() {
        return this.f146f.top;
    }

    public float getMaxCardElevation() {
        return ((d) ((a) this.h).f147a).f872e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f143c;
    }

    public float getRadius() {
        return ((d) ((a) this.h).f147a).f868a;
    }

    public boolean getUseCompatPadding() {
        return this.f142b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        b bVar = this.h;
        ColorStateList valueOf = ColorStateList.valueOf(i2);
        d dVar = (d) ((a) bVar).f147a;
        dVar.b(valueOf);
        dVar.invalidateSelf();
    }

    public void setCardElevation(float f2) {
        CardView.this.setElevation(f2);
    }

    public void setMaxCardElevation(float f2) {
        ((b.d.c.a) j).b(this.h, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.f145e = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.f144d = i2;
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f143c) {
            this.f143c = z;
            c cVar = j;
            b bVar = this.h;
            b.d.c.a aVar = (b.d.c.a) cVar;
            aVar.b(bVar, aVar.a(bVar).f872e);
        }
    }

    public void setRadius(float f2) {
        d dVar = (d) ((a) this.h).f147a;
        if (f2 == dVar.f868a) {
            return;
        }
        dVar.f868a = f2;
        dVar.c(null);
        dVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f142b != z) {
            this.f142b = z;
            c cVar = j;
            b bVar = this.h;
            b.d.c.a aVar = (b.d.c.a) cVar;
            aVar.b(bVar, aVar.a(bVar).f872e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        d dVar = (d) ((a) this.h).f147a;
        dVar.b(colorStateList);
        dVar.invalidateSelf();
    }
}
