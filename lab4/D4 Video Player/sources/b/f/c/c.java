package b.f.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public String f1040a;

    /* renamed from: b, reason: collision with root package name */
    public b f1041b;

    /* renamed from: c, reason: collision with root package name */
    public int f1042c;

    /* renamed from: d, reason: collision with root package name */
    public float f1043d;

    /* renamed from: e, reason: collision with root package name */
    public String f1044e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1045f;
    public int g;

    public c(c cVar, Object obj) {
        this.f1040a = cVar.f1040a;
        this.f1041b = cVar.f1041b;
        b(obj);
    }

    public c(String str, b bVar, Object obj) {
        this.f1040a = str;
        this.f1041b = bVar;
        b(obj);
    }

    public static void a(Context context, XmlPullParser xmlPullParser, HashMap<String, c> hashMap) {
        b bVar;
        Object string;
        int integer;
        float dimension;
        b bVar2 = b.DIMENSION_TYPE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), r.f1100c);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        b bVar3 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar3 = b.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    bVar = b.COLOR_TYPE;
                } else if (index == 2) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == 7) {
                        dimension = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == 4) {
                        dimension = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else {
                        if (index == 5) {
                            bVar = b.FLOAT_TYPE;
                            string = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                        } else if (index == 6) {
                            bVar = b.INT_TYPE;
                            integer = obtainStyledAttributes.getInteger(index, -1);
                            string = Integer.valueOf(integer);
                        } else if (index == 8) {
                            bVar = b.STRING_TYPE;
                            string = obtainStyledAttributes.getString(index);
                        }
                        Object obj2 = string;
                        bVar3 = bVar;
                        obj = obj2;
                    }
                    obj = Float.valueOf(dimension);
                    bVar3 = bVar2;
                }
                integer = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                Object obj22 = string;
                bVar3 = bVar;
                obj = obj22;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new c(str, bVar3, obj));
        }
        obtainStyledAttributes.recycle();
    }

    public void b(Object obj) {
        switch (this.f1041b) {
            case INT_TYPE:
                this.f1042c = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
            case DIMENSION_TYPE:
                this.f1043d = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.g = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f1044e = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f1045f = ((Boolean) obj).booleanValue();
                break;
        }
    }
}
