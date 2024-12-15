package b.b.e.a;

import android.content.res.Resources;
import android.util.StateSet;

/* loaded from: classes.dex */
public abstract class m extends k {
    public int[][] J;

    public m(m mVar, n nVar, Resources resources) {
        super(mVar, nVar, resources);
        if (mVar != null) {
            this.J = mVar.J;
        } else {
            this.J = new int[this.g.length][];
        }
    }

    public int g(int[] iArr) {
        int[][] iArr2 = this.J;
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }
}
