package b.u.a.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class e extends i implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public c f1817c;

    /* renamed from: d, reason: collision with root package name */
    public Context f1818d;

    /* renamed from: e, reason: collision with root package name */
    public ArgbEvaluator f1819e = null;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable.Callback f1820f;

    public e(Context context, c cVar, Resources resources) {
        b bVar = new b(this);
        this.f1820f = bVar;
        this.f1818d = context;
        this.f1817c = new c(null, bVar, null);
    }

    @Override // b.u.a.a.i, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f1817c.f1812b.draw(canvas);
        if (this.f1817c.f1813c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f1823b;
        return drawable != null ? drawable.getAlpha() : this.f1817c.f1812b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f1823b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1817c.f1811a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f1823b;
        return drawable != null ? drawable.getColorFilter() : this.f1817c.f1812b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f1823b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.f1823b.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f1823b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f1817c.f1812b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f1823b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f1817c.f1812b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1823b;
        return drawable != null ? drawable.getOpacity() : this.f1817c.f1812b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlResourceParser xmlResourceParser;
        Animator a2;
        s sVar;
        int next;
        int i = Build.VERSION.SDK_INT;
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray j = b.h.c.a.k.j(resources, theme, attributeSet, a.f1808e);
                    int resourceId = j.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = s.k;
                        if (i >= 24) {
                            sVar = new s();
                            sVar.f1823b = resources.getDrawable(resourceId, theme);
                            new r(sVar.f1823b.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                do {
                                    next = xml.next();
                                    if (next == 2) {
                                        break;
                                    }
                                } while (next != 1);
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                sVar = s.a(resources, xml, asAttributeSet, theme);
                            } catch (IOException | XmlPullParserException e2) {
                                Log.e("VectorDrawableCompat", "parser error", e2);
                                sVar = null;
                            }
                        }
                        sVar.g = false;
                        sVar.setCallback(this.f1820f);
                        s sVar2 = this.f1817c.f1812b;
                        if (sVar2 != null) {
                            sVar2.setCallback(null);
                        }
                        this.f1817c.f1812b = sVar;
                    }
                    j.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f1809f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f1818d;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        if (i >= 24) {
                            a2 = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    xmlResourceParser = resources2.getAnimation(resourceId2);
                                } catch (Throwable th) {
                                    th = th;
                                    xmlResourceParser = null;
                                }
                            } catch (IOException e3) {
                                e = e3;
                            } catch (XmlPullParserException e4) {
                                e = e4;
                            }
                            try {
                                a2 = g.a(context, resources2, theme2, xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), null, 0, 1.0f);
                                xmlResourceParser.close();
                            } catch (IOException e5) {
                                e = e5;
                                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                notFoundException.initCause(e);
                                throw notFoundException;
                            } catch (XmlPullParserException e6) {
                                e = e6;
                                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                notFoundException2.initCause(e);
                                throw notFoundException2;
                            } catch (Throwable th2) {
                                th = th2;
                                if (xmlResourceParser != null) {
                                    xmlResourceParser.close();
                                }
                                throw th;
                            }
                        }
                        a2.setTarget(this.f1817c.f1812b.f1849c.f1843b.p.getOrDefault(string, null));
                        c cVar = this.f1817c;
                        if (cVar.f1814d == null) {
                            cVar.f1814d = new ArrayList<>();
                            this.f1817c.f1815e = new b.e.b<>();
                        }
                        this.f1817c.f1814d.add(a2);
                        this.f1817c.f1815e.put(a2, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        c cVar2 = this.f1817c;
        if (cVar2.f1813c == null) {
            cVar2.f1813c = new AnimatorSet();
        }
        cVar2.f1813c.playTogether(cVar2.f1814d);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f1823b;
        return drawable != null ? drawable.isAutoMirrored() : this.f1817c.f1812b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f1823b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f1817c.f1813c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f1823b;
        return drawable != null ? drawable.isStateful() : this.f1817c.f1812b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f1817c.f1812b.setBounds(rect);
        }
    }

    @Override // b.u.a.a.i, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f1823b;
        return drawable != null ? drawable.setLevel(i) : this.f1817c.f1812b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1823b;
        return drawable != null ? drawable.setState(iArr) : this.f1817c.f1812b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f1817c.f1812b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
            return;
        }
        s sVar = this.f1817c.f1812b;
        Drawable drawable2 = sVar.f1823b;
        if (drawable2 != null) {
            drawable2.setAutoMirrored(z);
        } else {
            sVar.f1849c.f1846e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        s sVar = this.f1817c.f1812b;
        Drawable drawable2 = sVar.f1823b;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        } else {
            sVar.f1851e = colorFilter;
            sVar.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            b.h.b.h.E(drawable, i);
        } else {
            this.f1817c.f1812b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            b.h.b.h.F(drawable, colorStateList);
        } else {
            this.f1817c.f1812b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            b.h.b.h.G(drawable, mode);
        } else {
            this.f1817c.f1812b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f1817c.f1812b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f1817c.f1813c.isStarted()) {
                return;
            }
            this.f1817c.f1813c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f1817c.f1813c.end();
        }
    }
}
