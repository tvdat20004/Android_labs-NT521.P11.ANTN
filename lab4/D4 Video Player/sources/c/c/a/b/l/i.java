package c.c.a.b.l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class i extends BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public static final int f3908e;

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f3909b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3910c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3911d;

    static {
        f3908e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public i() {
        Calendar e2 = g0.e();
        this.f3909b = e2;
        this.f3910c = e2.getMaximum(7);
        this.f3911d = e2.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f3910c;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        int i2 = this.f3910c;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f3911d;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.f3909b;
        int i2 = i + this.f3911d;
        int i3 = this.f3910c;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(this.f3909b.getDisplayName(7, f3908e, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.f3909b.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
