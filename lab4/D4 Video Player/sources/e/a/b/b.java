package e.a.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class b {
    public final a a(Context context, String[] strArr, String str, g gVar) {
        String[] strArr2;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr3 = applicationInfo.splitSourceDirs;
        int i = 0;
        if (strArr3 == null || strArr3.length == 0) {
            strArr2 = new String[]{applicationInfo.sourceDir};
        } else {
            strArr2 = new String[strArr3.length + 1];
            strArr2[0] = applicationInfo.sourceDir;
            System.arraycopy(strArr3, 0, strArr2, 1, strArr3.length);
        }
        int length = strArr2.length;
        ZipFile zipFile = null;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            String str2 = strArr2[i];
            int i4 = i3;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), i2);
                    break;
                } catch (IOException unused) {
                    i4 = i5;
                }
            }
            if (zipFile != null) {
                int i6 = i2;
                int i7 = i3;
                while (true) {
                    int i8 = i3 + 1;
                    if (i3 < 5) {
                        int length2 = strArr.length;
                        int i9 = i6;
                        int i10 = i7;
                        while (i7 < length2) {
                            String str3 = strArr[i7];
                            StringBuilder j = c.a.a.a.a.j("lib");
                            j.append(File.separatorChar);
                            j.append(str3);
                            j.append(File.separatorChar);
                            j.append(str);
                            String sb = j.toString();
                            Object[] objArr = new Object[2];
                            objArr[i10] = sb;
                            objArr[i9] = str2;
                            Objects.requireNonNull(gVar);
                            String.format(Locale.US, "Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(sb);
                            if (entry != null) {
                                return new a(zipFile, entry);
                            }
                            i7++;
                            i10 = 0;
                            i9 = 1;
                        }
                        i7 = i10;
                        i3 = i8;
                        i6 = i9;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
            i3 = 0;
            i2 = 1;
        }
        return null;
    }
}
