package b.n;

import androidx.lifecycle.LiveData;

/* loaded from: classes.dex */
public class m<T> extends LiveData<T> {
    public void c(T t) {
        LiveData.a("setValue");
        this.f235e++;
        this.f233c = t;
        b(null);
    }
}
