package c.a.a.a;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: outline */
/* loaded from: classes.dex */
public abstract class a {
    public static String a(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.A());
        return sb.toString();
    }

    public static String b(String str, int i) {
        return str + i;
    }

    public static void c(String str, String str2, String str3) {
        Log.w(str3, str + str2);
    }

    public static void d(StringBuilder sb, Fragment fragment, String str) {
        sb.append(fragment);
        Log.d(str, sb.toString());
    }

    public static void e(StringBuilder sb, String str, String str2) {
        sb.append(str);
        Log.w(str2, sb.toString());
    }

    public static String f(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String g(String str, String str2) {
        return str + str2;
    }

    public static String h(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String i(XmlPullParser xmlPullParser, StringBuilder sb, String str) {
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder j(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder k(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static void l(int i, HashMap hashMap, String str, int i2, String str2, int i3, String str3, int i4, String str4) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
        hashMap.put(str3, Integer.valueOf(i3));
        hashMap.put(str4, Integer.valueOf(i4));
    }

    public static void m(String str, int i, String str2) {
        Log.w(str2, str + i);
    }
}
