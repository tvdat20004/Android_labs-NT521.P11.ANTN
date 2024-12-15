package b.u.a.a;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class g {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x035c, code lost:
    
        if (r2.hasNext() == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x035e, code lost:
    
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x036a, code lost:
    
        if (r27 != 0) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x036c, code lost:
    
        r26.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0370, code lost:
    
        r26.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0373, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x034a, code lost:
    
        if (r26 == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x034c, code lost:
    
        if (r13 == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x034e, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator a(android.content.Context r21, android.content.res.Resources r22, android.content.res.Resources.Theme r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25, android.animation.AnimatorSet r26, int r27, float r28) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.u.a.a.g.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static Keyframe b(Keyframe keyframe, float f2) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f2) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f2) : Keyframe.ofObject(f2);
    }

    public static PropertyValuesHolder c(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder ofInt;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && d(i4)) || (z2 && d(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i != 2) {
            h hVar = i == 3 ? h.f1822a : null;
            if (z3) {
                if (z) {
                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z2) {
                        ofInt = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                    } else {
                        ofInt = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofInt = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                }
            } else {
                if (!z) {
                    if (z2) {
                        ofInt = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : d(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                    }
                    if (propertyValuesHolder == null && hVar != null) {
                        propertyValuesHolder.setEvaluator(hVar);
                        return propertyValuesHolder;
                    }
                }
                int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : d(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z2) {
                    ofInt = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : d(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                } else {
                    ofInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            }
            propertyValuesHolder = ofInt;
            return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
        }
        String string = typedArray.getString(i2);
        String string2 = typedArray.getString(i3);
        b.h.d.c[] m = b.h.b.h.m(string);
        b.h.d.c[] m2 = b.h.b.h.m(string2);
        if (m == null && m2 == null) {
            return null;
        }
        if (m == null) {
            if (m2 != null) {
                return PropertyValuesHolder.ofObject(str, new f(), m2);
            }
            return null;
        }
        f fVar = new f();
        if (m2 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, fVar, m);
        } else {
            if (!b.h.b.h.c(m, m2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            ofObject = PropertyValuesHolder.ofObject(str, fVar, m, m2);
        }
        return ofObject;
    }

    public static boolean d(int i) {
        return i >= 28 && i <= 31;
    }

    public static ValueAnimator e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        TypedArray j = b.h.c.a.k.j(resources, theme, attributeSet, a.g);
        TypedArray j2 = b.h.c.a.k.j(resources, theme, attributeSet, a.k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long j3 = b.h.c.a.k.h(xmlPullParser, "duration") ? j.getInt(1, 300) : 300;
        int i = 0;
        long j4 = !b.h.c.a.k.h(xmlPullParser, "startOffset") ? 0 : j.getInt(2, 0);
        int i2 = !b.h.c.a.k.h(xmlPullParser, "valueType") ? 4 : j.getInt(7, 4);
        if (b.h.c.a.k.h(xmlPullParser, "valueFrom") && b.h.c.a.k.h(xmlPullParser, "valueTo")) {
            if (i2 == 4) {
                TypedValue peekValue = j.peekValue(5);
                boolean z = peekValue != null;
                int i3 = z ? peekValue.type : 0;
                TypedValue peekValue2 = j.peekValue(6);
                boolean z2 = peekValue2 != null;
                i2 = ((z && d(i3)) || (z2 && d(z2 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder c2 = c(j, i2, 5, 6, "");
            if (c2 != null) {
                valueAnimator4.setValues(c2);
            }
        }
        valueAnimator4.setDuration(j3);
        valueAnimator4.setStartDelay(j4);
        valueAnimator4.setRepeatCount(!b.h.c.a.k.h(xmlPullParser, "repeatCount") ? 0 : j.getInt(3, 0));
        valueAnimator4.setRepeatMode(!b.h.c.a.k.h(xmlPullParser, "repeatMode") ? 1 : j.getInt(4, 1));
        if (j2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String d2 = b.h.c.a.k.d(j2, xmlPullParser, "pathData", 1);
            if (d2 != null) {
                String d3 = b.h.c.a.k.d(j2, xmlPullParser, "propertyXName", 2);
                String d4 = b.h.c.a.k.d(j2, xmlPullParser, "propertyYName", 3);
                if (d3 == null && d4 == null) {
                    throw new InflateException(j2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path n = b.h.b.h.n(d2);
                float f3 = 0.5f * f2;
                PathMeasure pathMeasure = new PathMeasure(n, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f4 = 0.0f;
                do {
                    f4 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f4));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(n, false);
                int min = Math.min(100, ((int) (f4 / f3)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f5 = f4 / (min - 1);
                valueAnimator2 = valueAnimator4;
                typedArray = j;
                int i4 = 0;
                float f6 = 0.0f;
                while (true) {
                    if (i >= min) {
                        break;
                    }
                    int i5 = min;
                    pathMeasure2.getPosTan(f6 - ((Float) arrayList.get(i4)).floatValue(), fArr3, null);
                    fArr[i] = fArr3[0];
                    fArr2[i] = fArr3[1];
                    f6 += f5;
                    int i6 = i4 + 1;
                    if (i6 < arrayList.size() && f6 > ((Float) arrayList.get(i6)).floatValue()) {
                        pathMeasure2.nextContour();
                        i4 = i6;
                    }
                    i++;
                    min = i5;
                }
                PropertyValuesHolder ofFloat = d3 != null ? PropertyValuesHolder.ofFloat(d3, fArr) : null;
                PropertyValuesHolder ofFloat2 = d4 != null ? PropertyValuesHolder.ofFloat(d4, fArr2) : null;
                if (ofFloat == null) {
                    i = 0;
                    objectAnimator.setValues(ofFloat2);
                } else {
                    i = 0;
                    if (ofFloat2 == null) {
                        objectAnimator.setValues(ofFloat);
                    } else {
                        objectAnimator.setValues(ofFloat, ofFloat2);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = j;
                objectAnimator.setPropertyName(b.h.c.a.k.d(j2, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = j;
        }
        if (b.h.c.a.k.h(xmlPullParser, "interpolator")) {
            typedArray2 = typedArray;
            i = typedArray2.getResourceId(i, i);
        } else {
            typedArray2 = typedArray;
        }
        if (i > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (j2 != null) {
            j2.recycle();
        }
        return valueAnimator3;
    }
}
