package b.u.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f1811a;

    /* renamed from: b, reason: collision with root package name */
    public s f1812b;

    /* renamed from: c, reason: collision with root package name */
    public AnimatorSet f1813c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<Animator> f1814d;

    /* renamed from: e, reason: collision with root package name */
    public b.e.b<Animator, String> f1815e;

    public c(c cVar, Drawable.Callback callback, Resources resources) {
        if (cVar != null) {
            this.f1811a = cVar.f1811a;
            s sVar = cVar.f1812b;
            if (sVar != null) {
                Drawable.ConstantState constantState = sVar.getConstantState();
                s sVar2 = (s) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                this.f1812b = sVar2;
                sVar2.mutate();
                this.f1812b = sVar2;
                sVar2.setCallback(callback);
                this.f1812b.setBounds(cVar.f1812b.getBounds());
                this.f1812b.g = false;
            }
            ArrayList<Animator> arrayList = cVar.f1814d;
            if (arrayList != null) {
                int size = arrayList.size();
                this.f1814d = new ArrayList<>(size);
                this.f1815e = new b.e.b<>(size);
                for (int i = 0; i < size; i++) {
                    Animator animator = cVar.f1814d.get(i);
                    Animator clone = animator.clone();
                    String orDefault = cVar.f1815e.getOrDefault(animator, null);
                    clone.setTarget(this.f1812b.f1849c.f1843b.p.getOrDefault(orDefault, null));
                    this.f1814d.add(clone);
                    this.f1815e.put(clone, orDefault);
                }
                if (this.f1813c == null) {
                    this.f1813c = new AnimatorSet();
                }
                this.f1813c.playTogether(this.f1814d);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f1811a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
