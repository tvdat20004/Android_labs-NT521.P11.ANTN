package c.c.a.a.v1.u;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public int f3378f;
    public int h;

    /* renamed from: a, reason: collision with root package name */
    public String f3373a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f3374b = "";

    /* renamed from: c, reason: collision with root package name */
    public List<String> f3375c = Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    public String f3376d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f3377e = null;
    public boolean g = false;
    public boolean i = false;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;

    public static int b(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    public int a() {
        int i = this.l;
        if (i == -1 && this.m == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.m == 1 ? 2 : 0);
    }
}
