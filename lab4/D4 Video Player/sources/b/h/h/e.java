package b.h.h;

/* loaded from: classes.dex */
public class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f1239a = new e();

    @Override // b.h.h.f
    public int a(CharSequence charSequence, int i, int i2) {
        int i3 = i2 + i;
        int i4 = 2;
        while (i < i3 && i4 == 2) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i));
            g gVar = i.f1242a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i4 = 2;
                            break;
                    }
                    i++;
                }
                i4 = 0;
                i++;
            }
            i4 = 1;
            i++;
        }
        return i4;
    }
}
