package e.a.b;

/* loaded from: classes.dex */
public final class h {
    public String a(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }
}
