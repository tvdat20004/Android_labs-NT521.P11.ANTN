package b.h.d;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class i extends l {
    @Override // b.h.d.l
    public Typeface a(Context context, b.h.c.a.c cVar, Resources resources, int i) {
        b.h.c.a.d[] dVarArr = cVar.f1139a;
        int length = dVarArr.length;
        FontFamily.Builder builder = null;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i2 >= length) {
                break;
            }
            b.h.c.a.d dVar = dVarArr[i2];
            try {
                Font.Builder weight = new Font.Builder(resources, dVar.f1145f).setWeight(dVar.f1141b);
                if (!dVar.f1142c) {
                    i3 = 0;
                }
                Font build = weight.setSlant(i3).setTtcIndex(dVar.f1144e).setFontVariationSettings(dVar.f1143d).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            } catch (IOException unused) {
            }
            i2++;
        }
        if (builder == null) {
            return null;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0)).build();
    }

    @Override // b.h.d.l
    public Typeface b(Context context, CancellationSignal cancellationSignal, b.h.g.g[] gVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        int length = gVarArr.length;
        FontFamily.Builder builder = null;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i2 >= length) {
                if (builder == null) {
                    return null;
                }
                return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0)).build();
            }
            b.h.g.g gVar = gVarArr[i2];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(gVar.f1196a, "r", cancellationSignal);
            } catch (IOException unused) {
            }
            if (openFileDescriptor != null) {
                try {
                    Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(gVar.f1198c);
                    if (!gVar.f1199d) {
                        i3 = 0;
                    }
                    Font build = weight.setSlant(i3).setTtcIndex(gVar.f1197b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else if (openFileDescriptor == null) {
                i2++;
            }
            openFileDescriptor.close();
            i2++;
        }
    }

    @Override // b.h.d.l
    public Typeface c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // b.h.d.l
    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (IOException unused) {
            return null;
        }
    }
}
