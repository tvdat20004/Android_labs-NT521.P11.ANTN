package c.c.a.a.x1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c.c.a.a.g1;
import c.c.a.a.v0;
import c.c.a.a.x0;
import c.c.a.a.y0;
import c.c.a.a.z;
import c.c.a.a.z1.l0;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Objects;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public abstract class o extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final AspectRatioFrameLayout f3480b;

    /* renamed from: c, reason: collision with root package name */
    public final View f3481c;

    /* renamed from: d, reason: collision with root package name */
    public final View f3482d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f3483e;

    /* renamed from: f, reason: collision with root package name */
    public final SubtitleView f3484f;
    public final View g;
    public final TextView h;
    public final l i;
    public final n j;
    public final FrameLayout k;
    public final FrameLayout l;
    public x0 m;
    public boolean n;
    public boolean o;
    public Drawable p;
    public int q;
    public boolean r;
    public c.c.a.a.z1.n<? super z> s;
    public CharSequence t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    public o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        boolean z5;
        int i7;
        int i8;
        View textureView;
        if (isInEditMode()) {
            this.f3480b = null;
            this.f3481c = null;
            this.f3482d = null;
            this.f3483e = null;
            this.f3484f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            ImageView imageView = new ImageView(context);
            if (l0.f3761a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, null));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        int i9 = R.layout.exo_player_view;
        boolean z6 = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, q.f3488d, 0, 0);
            try {
                z5 = obtainStyledAttributes.hasValue(25);
                i6 = obtainStyledAttributes.getColor(25, 0);
                int resourceId = obtainStyledAttributes.getResourceId(13, R.layout.exo_player_view);
                z3 = obtainStyledAttributes.getBoolean(30, true);
                i7 = obtainStyledAttributes.getResourceId(6, 0);
                z4 = obtainStyledAttributes.getBoolean(31, true);
                i3 = obtainStyledAttributes.getInt(26, 1);
                i4 = obtainStyledAttributes.getInt(15, 0);
                int i10 = obtainStyledAttributes.getInt(24, 5000);
                z = obtainStyledAttributes.getBoolean(9, true);
                boolean z7 = obtainStyledAttributes.getBoolean(2, true);
                i5 = obtainStyledAttributes.getInteger(22, 0);
                this.r = obtainStyledAttributes.getBoolean(10, this.r);
                boolean z8 = obtainStyledAttributes.getBoolean(8, true);
                obtainStyledAttributes.recycle();
                z2 = z7;
                z6 = z8;
                i9 = resourceId;
                i2 = i10;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            i3 = 1;
            z = true;
            z2 = true;
            z3 = true;
            z4 = true;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            z5 = false;
            i7 = 0;
        }
        LayoutInflater.from(context).inflate(i9, this);
        n nVar = new n(this, null);
        this.j = nVar;
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f3480b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i4);
        }
        View findViewById = findViewById(R.id.exo_shutter);
        this.f3481c = findViewById;
        if (findViewById != null && z5) {
            findViewById.setBackgroundColor(i6);
        }
        if (aspectRatioFrameLayout == null || i3 == 0) {
            this.f3482d = null;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i3 == 2) {
                textureView = new TextureView(context);
            } else if (i3 != 3) {
                textureView = new SurfaceView(context);
            } else {
                c.c.a.a.x1.v.k kVar = new c.c.a.a.x1.v.k(context);
                kVar.setSingleTapListener(nVar);
                this.f3482d = kVar;
                this.f3482d.setLayoutParams(layoutParams);
                aspectRatioFrameLayout.addView(this.f3482d, 0);
            }
            this.f3482d = textureView;
            this.f3482d.setLayoutParams(layoutParams);
            aspectRatioFrameLayout.addView(this.f3482d, 0);
        }
        this.k = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.l = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f3483e = imageView2;
        this.o = z3 && imageView2 != null;
        if (i7 != 0) {
            Context context2 = getContext();
            Object obj = b.h.b.b.f1117a;
            this.p = context2.getDrawable(i7);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f3484f = subtitleView;
        if (subtitleView != null) {
            subtitleView.b();
            subtitleView.c();
        }
        View findViewById2 = findViewById(R.id.exo_buffering);
        this.g = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.q = i5;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.h = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        l lVar = (l) findViewById(R.id.exo_controller);
        View findViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (lVar != null) {
            this.i = lVar;
            i8 = 0;
        } else if (findViewById3 != null) {
            i8 = 0;
            l lVar2 = new l(context, null, 0, attributeSet);
            this.i = lVar2;
            lVar2.setId(R.id.exo_controller);
            lVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(lVar2, indexOfChild);
        } else {
            i8 = 0;
            this.i = null;
        }
        l lVar3 = this.i;
        this.u = lVar3 != null ? i2 : i8;
        this.x = z;
        this.v = z2;
        this.w = z6;
        this.n = (!z4 || lVar3 == null) ? i8 : 1;
        e();
    }

    public static void b(TextureView textureView, int i) {
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width == 0.0f || height == 0.0f || i == 0) {
            textureView.setTransform(null);
            return;
        }
        Matrix matrix = new Matrix();
        float f2 = width / 2.0f;
        float f3 = height / 2.0f;
        matrix.postRotate(i, f2, f3);
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        RectF rectF2 = new RectF();
        matrix.mapRect(rectF2, rectF);
        matrix.postScale(width / rectF2.width(), height / rectF2.height(), f2, f3);
        textureView.setTransform(matrix);
    }

    public final void c() {
        View view = this.f3481c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void d() {
        ImageView imageView = this.f3483e;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            this.f3483e.setVisibility(4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        x0 x0Var = this.m;
        if (x0Var != null && x0Var.e()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = (keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23) && this.n;
        if (!z || this.i.f()) {
            if (!(this.n && this.i.a(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
                if (!z) {
                    return false;
                }
                g(true);
                return false;
            }
        }
        g(true);
        return true;
    }

    public void e() {
        l lVar = this.i;
        if (lVar != null) {
            lVar.c();
        }
    }

    public final boolean f() {
        x0 x0Var = this.m;
        return x0Var != null && x0Var.e() && this.m.l();
    }

    public final void g(boolean z) {
        if (!(f() && this.w) && this.n) {
            boolean z2 = this.i.f() && this.i.getShowTimeoutMs() <= 0;
            boolean i = i();
            if (z || z2 || i) {
                j(i);
            }
        }
    }

    public View[] getAdOverlayViews() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.l;
        if (frameLayout != null) {
            arrayList.add(frameLayout);
        }
        l lVar = this.i;
        if (lVar != null) {
            arrayList.add(lVar);
        }
        return (View[]) arrayList.toArray(new View[0]);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.k;
        Objects.requireNonNull(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.v;
    }

    public boolean getControllerHideOnTouch() {
        return this.x;
    }

    public int getControllerShowTimeoutMs() {
        return this.u;
    }

    public Drawable getDefaultArtwork() {
        return this.p;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.l;
    }

    public x0 getPlayer() {
        return this.m;
    }

    public int getResizeMode() {
        p.g(this.f3480b != null);
        return this.f3480b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f3484f;
    }

    public boolean getUseArtwork() {
        return this.o;
    }

    public boolean getUseController() {
        return this.n;
    }

    public View getVideoSurfaceView() {
        return this.f3482d;
    }

    public final boolean h(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f2 = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f3480b;
                ImageView imageView = this.f3483e;
                if (aspectRatioFrameLayout != null) {
                    if (imageView instanceof c.c.a.a.x1.v.k) {
                        f2 = 0.0f;
                    }
                    aspectRatioFrameLayout.setAspectRatio(f2);
                }
                this.f3483e.setImageDrawable(drawable);
                this.f3483e.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        x0 x0Var = this.m;
        if (x0Var == null) {
            return true;
        }
        int p = x0Var.p();
        return this.v && (p == 1 || p == 4 || !this.m.l());
    }

    public final void j(boolean z) {
        if (this.n) {
            this.i.setShowTimeoutMs(z ? 0 : this.u);
            this.i.n();
        }
    }

    public final boolean k() {
        if (!this.n || this.m == null) {
            return false;
        }
        if (!this.i.f()) {
            g(true);
        } else if (this.x) {
            this.i.c();
        }
        return true;
    }

    public final void l() {
        int i;
        if (this.g != null) {
            x0 x0Var = this.m;
            boolean z = true;
            if (x0Var == null || x0Var.p() != 2 || ((i = this.q) != 2 && (i != 1 || !this.m.l()))) {
                z = false;
            }
            this.g.setVisibility(z ? 0 : 8);
        }
    }

    public final void m() {
        TextView textView = this.h;
        if (textView != null) {
            CharSequence charSequence = this.t;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.h.setVisibility(0);
                return;
            }
            z zVar = null;
            x0 x0Var = this.m;
            if (x0Var != null && x0Var.p() == 1 && this.s != null) {
                zVar = this.m.s();
            }
            if (zVar == null) {
                this.h.setVisibility(8);
                return;
            }
            this.h.setText((CharSequence) this.s.a(zVar).second);
            this.h.setVisibility(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a5, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(boolean r13) {
        /*
            r12 = this;
            c.c.a.a.x0 r0 = r12.m
            if (r0 == 0) goto Lb5
            c.c.a.a.u1.s0 r0 = r0.k()
            int r0 = r0.f2922b
            r1 = 0
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = r1
        L10:
            if (r0 == 0) goto L14
            goto Lb5
        L14:
            if (r13 == 0) goto L1d
            boolean r13 = r12.r
            if (r13 != 0) goto L1d
            r12.c()
        L1d:
            c.c.a.a.x0 r13 = r12.m
            c.c.a.a.w1.s r13 = r13.w()
            r0 = r1
        L24:
            int r2 = r13.f3440a
            if (r0 >= r2) goto L3e
            c.c.a.a.x0 r2 = r12.m
            int r2 = r2.x(r0)
            r3 = 2
            if (r2 != r3) goto L3b
            c.c.a.a.w1.r[] r2 = r13.f3441b
            r2 = r2[r0]
            if (r2 == 0) goto L3b
            r12.d()
            return
        L3b:
            int r0 = r0 + 1
            goto L24
        L3e:
            r12.c()
            boolean r0 = r12.o
            if (r0 == 0) goto Lb1
            r0 = r1
        L46:
            int r2 = r13.f3440a
            if (r0 >= r2) goto La8
            c.c.a.a.w1.r[] r2 = r13.f3441b
            r2 = r2[r0]
            if (r2 == 0) goto La5
            r3 = r1
        L51:
            r4 = r2
            c.c.a.a.w1.g r4 = (c.c.a.a.w1.g) r4
            int[] r5 = r4.f3409c
            int r5 = r5.length
            if (r3 >= r5) goto La5
            c.c.a.a.l0[] r4 = r4.f3410d
            r4 = r4[r3]
            c.c.a.a.s1.c r4 = r4.h
            if (r4 == 0) goto La2
            r5 = -1
            r6 = r1
            r8 = r6
            r7 = r5
        L65:
            c.c.a.a.s1.b[] r9 = r4.f2719b
            int r10 = r9.length
            if (r6 >= r10) goto L9f
            r9 = r9[r6]
            boolean r10 = r9 instanceof c.c.a.a.s1.m.b
            if (r10 == 0) goto L77
            c.c.a.a.s1.m.b r9 = (c.c.a.a.s1.m.b) r9
            byte[] r10 = r9.f2744f
            int r9 = r9.f2743e
            goto L81
        L77:
            boolean r10 = r9 instanceof c.c.a.a.s1.k.b
            if (r10 == 0) goto L9c
            c.c.a.a.s1.k.b r9 = (c.c.a.a.s1.k.b) r9
            byte[] r10 = r9.i
            int r9 = r9.f2728b
        L81:
            r11 = 3
            if (r7 == r5) goto L86
            if (r9 != r11) goto L9c
        L86:
            int r7 = r10.length
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeByteArray(r10, r1, r7)
            android.graphics.drawable.BitmapDrawable r8 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r10 = r12.getResources()
            r8.<init>(r10, r7)
            boolean r8 = r12.h(r8)
            if (r9 != r11) goto L9b
            goto L9f
        L9b:
            r7 = r9
        L9c:
            int r6 = r6 + 1
            goto L65
        L9f:
            if (r8 == 0) goto La2
            return
        La2:
            int r3 = r3 + 1
            goto L51
        La5:
            int r0 = r0 + 1
            goto L46
        La8:
            android.graphics.drawable.Drawable r13 = r12.p
            boolean r13 = r12.h(r13)
            if (r13 == 0) goto Lb1
            return
        Lb1:
            r12.d()
            return
        Lb5:
            boolean r13 = r12.r
            if (r13 != 0) goto Lbf
            r12.d()
            r12.c()
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.x1.o.n(boolean):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.n || this.m == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.z = true;
            return true;
        }
        if (action != 1 || !this.z) {
            return false;
        }
        this.z = false;
        performClick();
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!this.n || this.m == null) {
            return false;
        }
        g(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return k();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        p.g(this.f3480b != null);
        this.f3480b.setAspectRatioListener(bVar);
    }

    public void setControlDispatcher(c.c.a.a.t tVar) {
        p.g(this.i != null);
        this.i.setControlDispatcher(tVar);
    }

    public void setControllerAutoShow(boolean z) {
        this.v = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.w = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        p.g(this.i != null);
        this.x = z;
    }

    public void setControllerShowTimeoutMs(int i) {
        p.g(this.i != null);
        this.u = i;
        if (this.i.f()) {
            j(i());
        }
    }

    public void setControllerVisibilityListener(k kVar) {
        p.g(this.i != null);
        this.i.setVisibilityListener(kVar);
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        p.g(this.h != null);
        this.t = charSequence;
        m();
    }

    @Deprecated
    public void setDefaultArtwork(Bitmap bitmap) {
        setDefaultArtwork(bitmap == null ? null : new BitmapDrawable(getResources(), bitmap));
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.p != drawable) {
            this.p = drawable;
            n(false);
        }
    }

    public void setErrorMessageProvider(c.c.a.a.z1.n<? super z> nVar) {
        if (this.s != nVar) {
            this.s = nVar;
            m();
        }
    }

    public void setFastForwardIncrementMs(int i) {
        p.g(this.i != null);
        this.i.setFastForwardIncrementMs(i);
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.r != z) {
            this.r = z;
            n(false);
        }
    }

    public void setPlaybackPreparer(v0 v0Var) {
        p.g(this.i != null);
        this.i.setPlaybackPreparer(v0Var);
    }

    public void setPlayer(x0 x0Var) {
        p.g(Looper.myLooper() == Looper.getMainLooper());
        p.c(x0Var == null || x0Var.q() == Looper.getMainLooper());
        x0 x0Var2 = this.m;
        if (x0Var2 == x0Var) {
            return;
        }
        if (x0Var2 != null) {
            x0Var2.t(this.j);
            y0 d2 = this.m.d();
            if (d2 != null) {
                g1 g1Var = (g1) d2;
                g1Var.f2008f.remove(this.j);
                View view = this.f3482d;
                if (view instanceof TextureView) {
                    TextureView textureView = (TextureView) view;
                    g1Var.N();
                    if (textureView != null && textureView == g1Var.r) {
                        g1Var.K(null);
                    }
                } else if (view instanceof c.c.a.a.x1.v.k) {
                    ((c.c.a.a.x1.v.k) view).setVideoComponent(null);
                } else if (view instanceof SurfaceView) {
                    SurfaceView surfaceView = (SurfaceView) view;
                    SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
                    g1Var.N();
                    if (holder != null && holder == g1Var.q) {
                        g1Var.I(null);
                    }
                }
            }
            g1 z = this.m.z();
            if (z != null) {
                z.h.remove(this.j);
            }
        }
        this.m = x0Var;
        if (this.n) {
            this.i.setPlayer(x0Var);
        }
        SubtitleView subtitleView = this.f3484f;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        l();
        m();
        n(true);
        if (x0Var == null) {
            e();
            return;
        }
        y0 d3 = x0Var.d();
        if (d3 != null) {
            View view2 = this.f3482d;
            if (view2 instanceof TextureView) {
                ((g1) d3).K((TextureView) view2);
            } else if (view2 instanceof c.c.a.a.x1.v.k) {
                ((c.c.a.a.x1.v.k) view2).setVideoComponent(d3);
            } else if (view2 instanceof SurfaceView) {
                SurfaceView surfaceView2 = (SurfaceView) view2;
                ((g1) d3).I(surfaceView2 != null ? surfaceView2.getHolder() : null);
            }
            ((g1) d3).f2008f.add(this.j);
        }
        g1 z2 = x0Var.z();
        if (z2 != null) {
            n nVar = this.j;
            if (!z2.x.isEmpty()) {
                nVar.w(z2.x);
            }
            z2.h.add(nVar);
        }
        x0Var.f(this.j);
        g(false);
    }

    public void setRepeatToggleModes(int i) {
        p.g(this.i != null);
        this.i.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        p.g(this.f3480b != null);
        this.f3480b.setResizeMode(i);
    }

    public void setRewindIncrementMs(int i) {
        p.g(this.i != null);
        this.i.setRewindIncrementMs(i);
    }

    public void setShowBuffering(int i) {
        if (this.q != i) {
            this.q = i;
            l();
        }
    }

    @Deprecated
    public void setShowBuffering(boolean z) {
        setShowBuffering(z ? 1 : 0);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        p.g(this.i != null);
        this.i.setShowMultiWindowTimeBar(z);
    }

    public void setShowShuffleButton(boolean z) {
        p.g(this.i != null);
        this.i.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f3481c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        p.g((z && this.f3483e == null) ? false : true);
        if (this.o != z) {
            this.o = z;
            n(false);
        }
    }

    public void setUseController(boolean z) {
        l lVar;
        x0 x0Var;
        p.g((z && this.i == null) ? false : true);
        if (this.n == z) {
            return;
        }
        this.n = z;
        if (z) {
            lVar = this.i;
            x0Var = this.m;
        } else {
            l lVar2 = this.i;
            if (lVar2 == null) {
                return;
            }
            lVar2.c();
            lVar = this.i;
            x0Var = null;
        }
        lVar.setPlayer(x0Var);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f3482d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }
}
