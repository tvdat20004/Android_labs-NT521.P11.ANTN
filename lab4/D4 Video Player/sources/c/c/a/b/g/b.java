package c.c.a.b.g;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b.b.h.m.o;
import b.b.h.m.z;
import b.h.j.k0.b;
import b.h.j.m;
import b.h.j.u;
import b.h.j.y;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b extends FrameLayout implements z.a {
    public static final int[] q = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public final int f3848b;

    /* renamed from: c, reason: collision with root package name */
    public float f3849c;

    /* renamed from: d, reason: collision with root package name */
    public float f3850d;

    /* renamed from: e, reason: collision with root package name */
    public float f3851e;

    /* renamed from: f, reason: collision with root package name */
    public int f3852f;
    public boolean g;
    public ImageView h;
    public final TextView i;
    public final TextView j;
    public int k;
    public o l;
    public ColorStateList m;
    public Drawable n;
    public Drawable o;
    public c.c.a.b.e.c p;

    public b(Context context) {
        super(context, null, 0);
        this.k = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(razi.apa.ctf.videoPlayer.R.layout.design_bottom_navigation_item, (ViewGroup) this, true);
        setBackgroundResource(razi.apa.ctf.videoPlayer.R.drawable.design_bottom_navigation_item_background);
        this.f3848b = resources.getDimensionPixelSize(razi.apa.ctf.videoPlayer.R.dimen.design_bottom_navigation_margin);
        this.h = (ImageView) findViewById(razi.apa.ctf.videoPlayer.R.id.icon);
        TextView textView = (TextView) findViewById(razi.apa.ctf.videoPlayer.R.id.smallLabel);
        this.i = textView;
        TextView textView2 = (TextView) findViewById(razi.apa.ctf.videoPlayer.R.id.largeLabel);
        this.j = textView2;
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a(this));
        }
    }

    public final void a(float f2, float f3) {
        this.f3849c = f2 - f3;
        this.f3850d = (f3 * 1.0f) / f2;
        this.f3851e = (f2 * 1.0f) / f3;
    }

    public final boolean b() {
        return this.p != null;
    }

    public final void c(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    @Override // b.b.h.m.z.a
    public void d(o oVar, int i) {
        this.l = oVar;
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setIcon(oVar.getIcon());
        setTitle(oVar.f618e);
        setId(oVar.f614a);
        if (!TextUtils.isEmpty(oVar.q)) {
            setContentDescription(oVar.q);
        }
        b.b.a.c(this, !TextUtils.isEmpty(oVar.r) ? oVar.r : oVar.f618e);
        setVisibility(oVar.isVisible() ? 0 : 8);
    }

    public final void e(View view, float f2, float f3, int i) {
        view.setScaleX(f2);
        view.setScaleY(f3);
        view.setVisibility(i);
    }

    public c.c.a.b.e.c getBadge() {
        return this.p;
    }

    @Override // b.b.h.m.z.a
    public o getItemData() {
        return this.l;
    }

    public int getItemPosition() {
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        o oVar = this.l;
        if (oVar != null && oVar.isCheckable() && this.l.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, q);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c.c.a.b.e.c cVar = this.p;
        if (cVar != null && cVar.isVisible()) {
            o oVar = this.l;
            CharSequence charSequence = oVar.f618e;
            if (!TextUtils.isEmpty(oVar.q)) {
                charSequence = this.l.q;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) charSequence);
            sb.append(", ");
            c.c.a.b.e.c cVar2 = this.p;
            Object obj = null;
            if (cVar2.isVisible()) {
                if (!cVar2.d()) {
                    obj = cVar2.i.g;
                } else if (cVar2.i.h > 0 && (context = cVar2.f3841b.get()) != null) {
                    int c2 = cVar2.c();
                    int i = cVar2.l;
                    obj = c2 <= i ? context.getResources().getQuantityString(cVar2.i.h, cVar2.c(), Integer.valueOf(cVar2.c())) : context.getString(cVar2.i.i, Integer.valueOf(i));
                }
            }
            sb.append(obj);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) b.c.a(0, 1, getItemPosition(), 1, false, isSelected()).f1296a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) b.a.g.f1291a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(razi.apa.ctf.videoPlayer.R.string.item_view_role_description));
    }

    public void setBadge(c.c.a.b.e.c cVar) {
        this.p = cVar;
        ImageView imageView = this.h;
        if (imageView == null || !b() || imageView == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        c.c.a.b.e.c cVar2 = this.p;
        c.c.a.b.e.d.a(cVar2, imageView, null);
        imageView.getOverlay().add(cVar2);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
    
        if (r10 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        c(r9.h, (int) (r9.f3848b + r9.f3849c), 49);
        e(r9.j, 1.0f, 1.0f, 0);
        r0 = r9.i;
        r1 = r9.f3850d;
        e(r0, r1, r1, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        c(r9.h, r9.f3848b, 49);
        r0 = r9.j;
        r1 = r9.f3851e;
        e(r0, r1, r1, 4);
        e(r9.i, 1.0f, 1.0f, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008a, code lost:
    
        if (r10 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008c, code lost:
    
        c(r0, r1, 49);
        e(r9.j, 1.0f, 1.0f, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009d, code lost:
    
        r9.i.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        c(r0, r1, 17);
        e(r9.j, 0.5f, 0.5f, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        if (r10 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ae, code lost:
    
        if (r10 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setChecked(boolean r10) {
        /*
            r9 = this;
            android.widget.TextView r0 = r9.j
            int r1 = r0.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.j
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            android.widget.TextView r0 = r9.i
            int r1 = r0.getWidth()
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.i
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            int r0 = r9.f3852f
            r1 = -1
            r3 = 17
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 0
            r6 = 49
            r7 = 4
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r0 == r1) goto La3
            if (r0 == 0) goto L86
            r1 = 1
            if (r0 == r1) goto L57
            if (r0 == r2) goto L43
            goto Lb1
        L43:
            android.widget.ImageView r0 = r9.h
            int r1 = r9.f3848b
            r9.c(r0, r1, r3)
            android.widget.TextView r0 = r9.j
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r9.i
            r0.setVisibility(r1)
            goto Lb1
        L57:
            if (r10 == 0) goto L72
        L59:
            android.widget.ImageView r0 = r9.h
            int r1 = r9.f3848b
            float r1 = (float) r1
            float r2 = r9.f3849c
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.c(r0, r1, r6)
            android.widget.TextView r0 = r9.j
            r9.e(r0, r8, r8, r5)
            android.widget.TextView r0 = r9.i
            float r1 = r9.f3850d
            r9.e(r0, r1, r1, r7)
            goto Lb1
        L72:
            android.widget.ImageView r0 = r9.h
            int r1 = r9.f3848b
            r9.c(r0, r1, r6)
            android.widget.TextView r0 = r9.j
            float r1 = r9.f3851e
            r9.e(r0, r1, r1, r7)
            android.widget.TextView r0 = r9.i
            r9.e(r0, r8, r8, r5)
            goto Lb1
        L86:
            android.widget.ImageView r0 = r9.h
            int r1 = r9.f3848b
            if (r10 == 0) goto L95
        L8c:
            r9.c(r0, r1, r6)
            android.widget.TextView r0 = r9.j
            r9.e(r0, r8, r8, r5)
            goto L9d
        L95:
            r9.c(r0, r1, r3)
            android.widget.TextView r0 = r9.j
            r9.e(r0, r4, r4, r7)
        L9d:
            android.widget.TextView r0 = r9.i
            r0.setVisibility(r7)
            goto Lb1
        La3:
            boolean r0 = r9.g
            if (r0 == 0) goto Lae
            android.widget.ImageView r0 = r9.h
            int r1 = r9.f3848b
            if (r10 == 0) goto L95
            goto L8c
        Lae:
            if (r10 == 0) goto L72
            goto L59
        Lb1:
            r9.refreshDrawableState()
            r9.setSelected(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.b.g.b.setChecked(boolean):void");
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int i = Build.VERSION.SDK_INT;
        super.setEnabled(z);
        this.i.setEnabled(z);
        this.j.setEnabled(z);
        this.h.setEnabled(z);
        if (!z) {
            WeakHashMap<View, y> weakHashMap = u.f1311a;
            if (i >= 24) {
                setPointerIcon(null);
                return;
            }
            return;
        }
        m mVar = i >= 24 ? new m(PointerIcon.getSystemIcon(getContext(), 1002)) : new m(null);
        WeakHashMap<View, y> weakHashMap2 = u.f1311a;
        if (i >= 24) {
            setPointerIcon((PointerIcon) mVar.f1302a);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.n) {
            return;
        }
        this.n = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.o = drawable;
            ColorStateList colorStateList = this.m;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.h.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.h.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.m = colorStateList;
        if (this.l == null || (drawable = this.o) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.o.invalidateSelf();
    }

    public void setItemBackground(int i) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            Context context = getContext();
            Object obj = b.h.b.b.f1117a;
            drawable = context.getDrawable(i);
        }
        setItemBackground(drawable);
    }

    public void setItemPosition(int i) {
        this.k = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f3852f != i) {
            this.f3852f = i;
            o oVar = this.l;
            if (oVar != null) {
                setChecked(oVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.g != z) {
            this.g = z;
            o oVar = this.l;
            if (oVar != null) {
                setChecked(oVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        this.j.setTextAppearance(i);
        a(this.i.getTextSize(), this.j.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        this.i.setTextAppearance(i);
        a(this.i.getTextSize(), this.j.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.i.setTextColor(colorStateList);
            this.j.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.i.setText(charSequence);
        this.j.setText(charSequence);
        o oVar = this.l;
        if (oVar == null || TextUtils.isEmpty(oVar.q)) {
            setContentDescription(charSequence);
        }
        o oVar2 = this.l;
        if (oVar2 != null && !TextUtils.isEmpty(oVar2.r)) {
            charSequence = this.l.r;
        }
        b.b.a.c(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        setBackground(drawable);
    }
}
