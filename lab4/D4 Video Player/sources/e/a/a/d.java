package e.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.TypedValue;
import android.widget.MediaController;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pl.droidsonroids.gif.GifInfoHandle;

/* loaded from: classes.dex */
public class d extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f4298b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f4299c;

    /* renamed from: d, reason: collision with root package name */
    public long f4300d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f4301e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f4302f;
    public final Bitmap g;
    public final GifInfoHandle h;
    public final ConcurrentLinkedQueue<a> i;
    public ColorStateList j;
    public PorterDuffColorFilter k;
    public PorterDuff.Mode l;
    public final boolean m;
    public final m n;
    public final o o;
    public final Rect p;
    public ScheduledFuture<?> q;
    public int r;
    public int s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            r2 = this;
            int r0 = pl.droidsonroids.gif.GifInfoHandle.f4369b
            java.lang.String r0 = r4.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L18
            pl.droidsonroids.gif.GifInfoHandle r3 = new pl.droidsonroids.gif.GifInfoHandle
            java.lang.String r4 = r4.getPath()
            r3.<init>(r4)
            goto L26
        L18:
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r3 = r3.openAssetFileDescriptor(r4, r0)
            if (r3 == 0) goto L2c
            pl.droidsonroids.gif.GifInfoHandle r4 = new pl.droidsonroids.gif.GifInfoHandle
            r4.<init>(r3)
            r3 = r4
        L26:
            r4 = 1
            r0 = 0
            r2.<init>(r3, r0, r0, r4)
            return
        L2c:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not open AssetFileDescriptor for "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.d.<init>(android.content.ContentResolver, android.net.Uri):void");
    }

    public void a(long j) {
        if (this.m) {
            this.f4300d = 0L;
            this.n.sendEmptyMessageAtTime(-1, 0L);
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.q;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.n.removeMessages(-1);
        this.q = this.f4298b.schedule(this.o, Math.max(j, 0L), TimeUnit.MILLISECONDS);
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.h.b() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.h.b() > 1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        if (this.k == null || this.f4302f.getColorFilter() != null) {
            z = false;
        } else {
            this.f4302f.setColorFilter(this.k);
            z = true;
        }
        canvas.drawBitmap(this.g, this.p, this.f4301e, this.f4302f);
        if (z) {
            this.f4302f.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f4302f.getAlpha();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return 100;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f4302f.getColorFilter();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        int currentPosition;
        GifInfoHandle gifInfoHandle = this.h;
        synchronized (gifInfoHandle) {
            currentPosition = GifInfoHandle.getCurrentPosition(gifInfoHandle.f4370a);
        }
        return currentPosition;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        int duration;
        GifInfoHandle gifInfoHandle = this.h;
        synchronized (gifInfoHandle) {
            duration = GifInfoHandle.getDuration(gifInfoHandle.f4370a);
        }
        return duration;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        boolean isOpaque;
        GifInfoHandle gifInfoHandle = this.h;
        synchronized (gifInfoHandle) {
            isOpaque = GifInfoHandle.isOpaque(gifInfoHandle.f4370a);
        }
        return (!isOpaque || this.f4302f.getAlpha() < 255) ? -2 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        if (this.m && this.f4299c) {
            long j = this.f4300d;
            if (j != Long.MIN_VALUE) {
                long max = Math.max(0L, j - SystemClock.uptimeMillis());
                this.f4300d = Long.MIN_VALUE;
                this.f4298b.remove(this.o);
                this.q = this.f4298b.schedule(this.o, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return this.f4299c;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f4299c;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        return super.isStateful() || ((colorStateList = this.j) != null && colorStateList.isStateful());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f4301e.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.j;
        if (colorStateList == null || (mode = this.l) == null) {
            return false;
        }
        this.k = b(colorStateList, mode);
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        stop();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        this.f4298b.execute(new c(this, this, i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f4302f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4302f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public void setDither(boolean z) {
        this.f4302f.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f4302f.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.k = b(colorStateList, this.l);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.l = mode;
        this.k = b(this.j, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!this.m) {
            if (z) {
                if (z2) {
                    this.f4298b.execute(new b(this, this));
                }
                if (visible) {
                    start();
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public void start() {
        long restoreRemainder;
        synchronized (this) {
            if (this.f4299c) {
                return;
            }
            this.f4299c = true;
            GifInfoHandle gifInfoHandle = this.h;
            synchronized (gifInfoHandle) {
                restoreRemainder = GifInfoHandle.restoreRemainder(gifInfoHandle.f4370a);
            }
            a(restoreRemainder);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        synchronized (this) {
            if (this.f4299c) {
                this.f4299c = false;
                ScheduledFuture<?> scheduledFuture = this.q;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.n.removeMessages(-1);
                GifInfoHandle gifInfoHandle = this.h;
                synchronized (gifInfoHandle) {
                    GifInfoHandle.saveRemainder(gifInfoHandle.f4370a);
                }
            }
        }
    }

    public String toString() {
        int nativeErrorCode;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(this.h.c());
        objArr[1] = Integer.valueOf(this.h.a());
        objArr[2] = Integer.valueOf(this.h.b());
        GifInfoHandle gifInfoHandle = this.h;
        synchronized (gifInfoHandle) {
            nativeErrorCode = GifInfoHandle.getNativeErrorCode(gifInfoHandle.f4370a);
        }
        objArr[3] = Integer.valueOf(nativeErrorCode);
        return String.format(locale, "GIF: size: %dx%d, frames: %d, error: %d", objArr);
    }

    public d(Resources resources, int i) {
        this(new GifInfoHandle(resources.openRawResourceFd(i)), null, null, true);
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.density;
        if (i2 == 0) {
            i2 = 160;
        } else if (i2 == 65535) {
            i2 = 0;
        }
        int i3 = resources.getDisplayMetrics().densityDpi;
        float f2 = (i2 <= 0 || i3 <= 0) ? 1.0f : i3 / i2;
        this.s = (int) (this.h.a() * f2);
        this.r = (int) (this.h.c() * f2);
    }

    public d(GifInfoHandle gifInfoHandle, d dVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z) {
        boolean isOpaque;
        this.f4299c = true;
        this.f4300d = Long.MIN_VALUE;
        this.f4301e = new Rect();
        this.f4302f = new Paint(6);
        this.i = new ConcurrentLinkedQueue<>();
        o oVar = new o(this);
        this.o = oVar;
        this.m = z;
        int i = h.f4309a;
        this.f4298b = g.f4308a;
        this.h = gifInfoHandle;
        Bitmap createBitmap = Bitmap.createBitmap(gifInfoHandle.c(), gifInfoHandle.a(), Bitmap.Config.ARGB_8888);
        this.g = createBitmap;
        synchronized (gifInfoHandle) {
            isOpaque = GifInfoHandle.isOpaque(gifInfoHandle.f4370a);
        }
        createBitmap.setHasAlpha(true ^ isOpaque);
        this.p = new Rect(0, 0, gifInfoHandle.c(), gifInfoHandle.a());
        this.n = new m(this);
        oVar.a();
        this.r = gifInfoHandle.c();
        this.s = gifInfoHandle.a();
    }
}
