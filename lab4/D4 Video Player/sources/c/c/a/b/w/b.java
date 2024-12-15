package c.c.a.b.w;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes.dex */
public class b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f4085a;

    public b(j jVar) {
        this.f4085a = jVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        this.f4085a.e((TextUtils.isEmpty(((EditText) view).getText()) ^ true) && z);
    }
}
