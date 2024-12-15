package e.a.b;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
public class f implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4326a;

    public f(g gVar, String str) {
        this.f4326a = str;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.startsWith(this.f4326a);
    }
}
