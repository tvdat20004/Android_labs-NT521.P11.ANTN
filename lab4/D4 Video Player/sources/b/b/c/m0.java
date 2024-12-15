package b.b.c;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* loaded from: classes.dex */
public class m0 {

    /* renamed from: d, reason: collision with root package name */
    public static m0 f463d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f464a;

    /* renamed from: b, reason: collision with root package name */
    public final LocationManager f465b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f466c = new l0();

    public m0(Context context, LocationManager locationManager) {
        this.f464a = context;
        this.f465b = locationManager;
    }

    public final Location a(String str) {
        try {
            if (this.f465b.isProviderEnabled(str)) {
                return this.f465b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }
}
