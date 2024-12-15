package c.c.a.b.c;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import b.e.i;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final i<String, d> f3815a = new i<>();

    /* renamed from: b, reason: collision with root package name */
    public final i<String, PropertyValuesHolder[]> f3816b = new i<>();

    public static c a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static c b(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception e2) {
            StringBuilder j = c.a.a.a.a.j("Can't load animation resource ID #0x");
            j.append(Integer.toHexString(i));
            Log.w("MotionSpec", j.toString(), e2);
            return null;
        }
    }

    public static c c(List<Animator> list) {
        c cVar = new c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            cVar.f3816b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = a.f3810b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = a.f3811c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = a.f3812d;
            }
            d dVar = new d(startDelay, duration, interpolator);
            dVar.f3820d = objectAnimator.getRepeatCount();
            dVar.f3821e = objectAnimator.getRepeatMode();
            cVar.f3815a.put(propertyName, dVar);
        }
        return cVar;
    }

    public d d(String str) {
        if (this.f3815a.getOrDefault(str, null) != null) {
            return this.f3815a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f3815a.equals(((c) obj).f3815a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3815a.hashCode();
    }

    public String toString() {
        return '\n' + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3815a + "}\n";
    }
}
