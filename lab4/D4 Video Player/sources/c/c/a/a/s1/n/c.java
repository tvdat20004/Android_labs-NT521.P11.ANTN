package c.c.a.a.s1.n;

/* loaded from: classes.dex */
public abstract class c implements c.c.a.a.s1.b {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("SCTE-35 splice command: type=");
        j.append(getClass().getSimpleName());
        return j.toString();
    }
}
