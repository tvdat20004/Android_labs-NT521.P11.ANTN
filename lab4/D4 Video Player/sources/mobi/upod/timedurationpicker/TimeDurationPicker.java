package mobi.upod.timedurationpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import d.a.a.d;
import d.a.a.e;
import d.a.a.f;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class TimeDurationPicker extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public int f4356b;

    /* renamed from: c, reason: collision with root package name */
    public final c f4357c;

    /* renamed from: d, reason: collision with root package name */
    public final View f4358d;

    /* renamed from: e, reason: collision with root package name */
    public final View f4359e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f4360f;
    public final TextView g;
    public final TextView h;
    public final TextView[] i;
    public final TextView[] j;
    public final ImageButton k;
    public final ImageButton l;
    public final View m;
    public final View n;
    public final Button[] o;
    public final Button p;
    public a q;
    public TextView r;
    public TextView s;
    public TextView t;

    public interface a {
        void a(TimeDurationPicker timeDurationPicker, long j);
    }

    public static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new f();

        /* renamed from: b, reason: collision with root package name */
        public final String f4361b;

        public b(Parcel parcel) {
            super(parcel);
            this.f4361b = parcel.readString();
        }

        public b(Parcelable parcelable, String str) {
            super(parcelable);
            this.f4361b = str;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f4361b);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f4362a;

        /* renamed from: b, reason: collision with root package name */
        public int f4363b = 6;

        /* renamed from: c, reason: collision with root package name */
        public long f4364c = 0;

        /* renamed from: d, reason: collision with root package name */
        public final StringBuilder f4365d = new StringBuilder(6);

        public c() {
            e();
        }

        public long a() {
            int parseInt = Integer.parseInt(b());
            int parseInt2 = Integer.parseInt(c()) * 60000;
            return (Integer.parseInt(d()) * 1000) + parseInt2 + (parseInt * 3600000);
        }

        public String b() {
            int i = this.f4362a;
            return (i == 0 || i == 1) ? this.f4365d.substring(0, 2) : "00";
        }

        public String c() {
            int i = this.f4362a;
            return (i == 0 || i == 1) ? this.f4365d.substring(2, 4) : i == 2 ? this.f4365d.substring(0, 2) : "00";
        }

        public String d() {
            int i = this.f4362a;
            return i == 0 ? this.f4365d.substring(4, 6) : i == 2 ? this.f4365d.substring(2, 4) : "00";
        }

        public final void e() {
            while (this.f4365d.length() < this.f4363b) {
                this.f4365d.insert(0, '0');
            }
        }

        public void f(CharSequence charSequence) {
            for (int i = 0; i < charSequence.length(); i++) {
                char charAt = charSequence.charAt(i);
                if (!Character.isDigit(charAt)) {
                    throw new IllegalArgumentException("Only numbers are allowed");
                }
                while (this.f4365d.length() > 0 && this.f4365d.charAt(0) == '0') {
                    this.f4365d.deleteCharAt(0);
                }
                if (this.f4365d.length() < this.f4363b && (this.f4365d.length() > 0 || charAt != '0')) {
                    this.f4365d.append(charAt);
                }
                e();
            }
        }

        public void g(long j) {
            this.f4364c = j;
            long c2 = d.a.a.a.c(j);
            long c3 = this.f4362a == 2 ? ((int) j) / 60000 : ((int) (j - (d.a.a.a.c(j) * 3600000))) / 60000;
            long c4 = ((int) ((j - (d.a.a.a.c(j) * 3600000)) - ((((int) (j - (d.a.a.a.c(j) * 3600000))) / 60000) * 60000))) / 1000;
            if (c2 > 99 || c3 > 99) {
                h("99", "99", "99");
            } else {
                h(i(c2), i(c3), i(c4));
            }
        }

        public final void h(String str, String str2, String str3) {
            this.f4365d.setLength(0);
            int i = this.f4362a;
            if (i == 1 || i == 0) {
                this.f4365d.append(str);
            }
            this.f4365d.append(str2);
            int i2 = this.f4362a;
            if (i2 == 0 || i2 == 2) {
                this.f4365d.append(str3);
            }
        }

        public final String i(long j) {
            StringBuilder sb = new StringBuilder();
            sb.append(j < 10 ? "0" : "");
            sb.append(Long.toString(j));
            return sb.toString();
        }
    }

    public TimeDurationPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.timeDurationPickerStyle);
        this.f4356b = 0;
        this.f4357c = new c();
        this.q = null;
        FrameLayout.inflate(context, R.layout.time_duration_picker, this);
        this.f4358d = findViewById(R.id.displayRow);
        this.f4359e = findViewById(R.id.duration);
        TextView textView = (TextView) findViewById(R.id.hours);
        this.f4360f = textView;
        TextView textView2 = (TextView) findViewById(R.id.minutes);
        this.g = textView2;
        TextView textView3 = (TextView) findViewById(R.id.seconds);
        this.h = textView3;
        this.i = new TextView[]{textView, textView2, textView3};
        this.s = (TextView) findViewById(R.id.hoursLabel);
        this.t = (TextView) findViewById(R.id.minutesLabel);
        TextView textView4 = (TextView) findViewById(R.id.secondsLabel);
        this.r = textView4;
        this.j = new TextView[]{this.s, this.t, textView4};
        this.k = (ImageButton) findViewById(R.id.backspace);
        this.l = (ImageButton) findViewById(R.id.clear);
        this.m = findViewById(R.id.separator);
        this.n = findViewById(R.id.numPad);
        this.p = (Button) findViewById(R.id.numPadMeasure);
        Button[] buttonArr = {(Button) findViewById(R.id.numPad1), (Button) findViewById(R.id.numPad2), (Button) findViewById(R.id.numPad3), (Button) findViewById(R.id.numPad4), (Button) findViewById(R.id.numPad5), (Button) findViewById(R.id.numPad6), (Button) findViewById(R.id.numPad7), (Button) findViewById(R.id.numPad8), (Button) findViewById(R.id.numPad9), (Button) findViewById(R.id.numPad0), (Button) findViewById(R.id.numPad00)};
        this.o = buttonArr;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d.a.a.b.f4289a, R.attr.timeDurationPickerStyle, 0);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, -1);
            if (dimensionPixelSize > -1) {
                for (int i = 0; i < 11; i++) {
                    buttonArr[i].setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                }
            }
            b(context, obtainStyledAttributes, 6, this.i);
            b(context, obtainStyledAttributes, 5, this.o);
            b(context, obtainStyledAttributes, 7, this.j);
            ImageButton imageButton = this.k;
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                imageButton.setImageDrawable(drawable);
            }
            ImageButton imageButton2 = this.l;
            Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
            if (drawable2 != null) {
                imageButton2.setImageDrawable(drawable2);
            }
            View view = this.m;
            if (obtainStyledAttributes.hasValue(4)) {
                view.setBackgroundColor(obtainStyledAttributes.getColor(4, 0));
            }
            View view2 = this.f4358d;
            if (obtainStyledAttributes.hasValue(2)) {
                view2.setBackgroundColor(obtainStyledAttributes.getColor(2, 0));
            }
            if (obtainStyledAttributes.hasValue(8)) {
                this.f4356b = obtainStyledAttributes.getInt(8, 0);
            }
            obtainStyledAttributes.recycle();
            d();
            this.k.setOnClickListener(new d.a.a.c(this));
            this.l.setOnClickListener(new d(this));
            e eVar = new e(this);
            for (Button button : this.o) {
                button.setOnClickListener(eVar);
            }
            c();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(Context context, int i, TextView[] textViewArr) {
        for (TextView textView : textViewArr) {
            textView.setTextAppearance(context, i);
        }
    }

    public final void b(Context context, TypedArray typedArray, int i, TextView[] textViewArr) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0) {
            a(context, resourceId, textViewArr);
        }
    }

    public final void c() {
        this.f4360f.setText(this.f4357c.b());
        this.g.setText(this.f4357c.c());
        this.h.setText(this.f4357c.d());
        a aVar = this.q;
        if (aVar != null) {
            aVar.a(this, this.f4357c.a());
        }
    }

    public final void d() {
        TextView textView = this.f4360f;
        int i = this.f4356b;
        textView.setVisibility((i == 0 || i == 1) ? 0 : 8);
        TextView textView2 = this.s;
        int i2 = this.f4356b;
        textView2.setVisibility((i2 == 0 || i2 == 1) ? 0 : 8);
        TextView textView3 = this.h;
        int i3 = this.f4356b;
        textView3.setVisibility((i3 == 0 || i3 == 2) ? 0 : 8);
        TextView textView4 = this.r;
        int i4 = this.f4356b;
        textView4.setVisibility((i4 == 0 || i4 == 2) ? 0 : 8);
        c cVar = this.f4357c;
        int i5 = this.f4356b;
        cVar.f4362a = i5;
        cVar.f4363b = i5 == 0 ? 6 : 4;
        cVar.g(cVar.f4364c);
    }

    public long getDuration() {
        return this.f4357c.a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int measuredWidth = this.f4358d.getMeasuredWidth();
        int measuredHeight = this.f4358d.getMeasuredHeight();
        int i6 = (i5 - measuredWidth) / 2;
        this.f4358d.layout(i6, 0, measuredWidth + i6, measuredHeight);
        int measuredWidth2 = this.n.getMeasuredWidth();
        int i7 = (i5 - measuredWidth2) / 2;
        this.n.layout(i7, measuredHeight, measuredWidth2 + i7, this.n.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.touchable);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f4360f.measure(makeMeasureSpec, makeMeasureSpec);
        this.j[2].measure(makeMeasureSpec, makeMeasureSpec);
        int max = Math.max(this.f4360f.getMeasuredWidth() / 3, (int) (r3.getMeasuredWidth() * 1.2f));
        View[] viewArr = {this.g, this.h};
        for (int i3 = 0; i3 < 2; i3++) {
            View view = viewArr[i3];
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.setMargins(max, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
            view.setLayoutParams(layoutParams);
        }
        this.f4359e.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = (dimensionPixelSize * 2) + this.f4359e.getMeasuredWidth();
        int max2 = Math.max(this.f4359e.getMeasuredHeight(), dimensionPixelSize);
        this.p.measure(makeMeasureSpec, makeMeasureSpec);
        int max3 = Math.max(Math.max(this.p.getMeasuredHeight(), this.p.getMeasuredWidth()), dimensionPixelSize);
        int i4 = max3 * 3;
        int i5 = max3 * 4;
        int max4 = Math.max(measuredWidth, i4);
        int i6 = max2 + i5;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824) {
            max4 = size;
        }
        if (mode2 == 1073741824) {
            i6 = size2;
        }
        int max5 = Math.max(measuredWidth, max4);
        this.f4358d.measure(View.MeasureSpec.makeMeasureSpec(max5, 1073741824), View.MeasureSpec.makeMeasureSpec(max2, 1073741824));
        int max6 = Math.max(i5, max5);
        int max7 = Math.max(i5, i6 - max2);
        this.n.measure(View.MeasureSpec.makeMeasureSpec(max6, 1073741824), View.MeasureSpec.makeMeasureSpec(max7, 1073741824));
        setMeasuredDimension(Math.max(max5, max6), max2 + max7);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            StringBuilder j = c.a.a.a.a.j("Expected state of class ");
            j.append(b.class.getName());
            j.append(" but received state of class ");
            j.append(parcelable.getClass().getName());
            throw new IllegalArgumentException(j.toString());
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        c cVar = this.f4357c;
        cVar.f4365d.setLength(0);
        cVar.e();
        this.f4357c.f(bVar.f4361b);
        c();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new b(super.onSaveInstanceState(), this.f4357c.f4365d.toString());
    }

    public void setBackspaceIcon(Drawable drawable) {
        this.k.setImageDrawable(drawable);
    }

    public void setButtonTextAppearance(int i) {
        a(getContext(), i, this.o);
    }

    public void setClearIcon(Drawable drawable) {
        this.l.setImageDrawable(drawable);
    }

    public void setDisplayTextAppearance(int i) {
        a(getContext(), i, this.i);
    }

    public void setDuration(long j) {
        this.f4357c.g(j);
        c();
    }

    public void setDurationDisplayBackgroundColor(int i) {
        this.f4358d.setBackgroundColor(i);
    }

    public void setNumPadButtonPadding(int i) {
        for (Button button : this.o) {
            button.setPadding(i, i, i, i);
        }
    }

    public void setOnDurationChangeListener(a aVar) {
        this.q = aVar;
    }

    public void setSeparatorColor(int i) {
        this.m.setBackgroundColor(i);
    }

    public void setTimeUnits(int i) {
        this.f4356b = i;
        d();
    }

    public void setUnitTextAppearance(int i) {
        a(getContext(), i, this.j);
    }
}
