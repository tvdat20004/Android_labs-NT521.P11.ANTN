package b.u.a.a;

import android.animation.TypeEvaluator;
import java.util.Objects;

/* loaded from: classes.dex */
public class f implements TypeEvaluator<b.h.d.c[]> {

    /* renamed from: a, reason: collision with root package name */
    public b.h.d.c[] f1821a;

    @Override // android.animation.TypeEvaluator
    public b.h.d.c[] evaluate(float f2, b.h.d.c[] cVarArr, b.h.d.c[] cVarArr2) {
        b.h.d.c[] cVarArr3 = cVarArr;
        b.h.d.c[] cVarArr4 = cVarArr2;
        if (!b.h.b.h.c(cVarArr3, cVarArr4)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!b.h.b.h.c(this.f1821a, cVarArr3)) {
            this.f1821a = b.h.b.h.o(cVarArr3);
        }
        for (int i = 0; i < cVarArr3.length; i++) {
            b.h.d.c cVar = this.f1821a[i];
            b.h.d.c cVar2 = cVarArr3[i];
            b.h.d.c cVar3 = cVarArr4[i];
            Objects.requireNonNull(cVar);
            cVar.f1163a = cVar2.f1163a;
            int i2 = 0;
            while (true) {
                float[] fArr = cVar2.f1164b;
                if (i2 < fArr.length) {
                    cVar.f1164b[i2] = (cVar3.f1164b[i2] * f2) + ((1.0f - f2) * fArr[i2]);
                    i2++;
                }
            }
        }
        return this.f1821a;
    }
}
