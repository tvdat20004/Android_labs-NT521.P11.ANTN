package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import b.b.b;
import b.b.h.m.o;
import b.b.h.m.z;
import b.b.i.l2;
import b.h.j.u;
import b.h.j.y;
import java.util.Objects;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements z.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b, reason: collision with root package name */
    public o f61b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f62c;

    /* renamed from: d, reason: collision with root package name */
    public RadioButton f63d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f64e;

    /* renamed from: f, reason: collision with root package name */
    public CheckBox f65f;
    public TextView g;
    public ImageView h;
    public ImageView i;
    public LinearLayout j;
    public Drawable k;
    public int l;
    public Context m;
    public boolean n;
    public Drawable o;
    public boolean p;
    public LayoutInflater q;
    public boolean r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l2 r = l2.r(getContext(), attributeSet, b.r, R.attr.listMenuViewStyle, 0);
        this.k = r.g(5);
        this.l = r.m(1, -1);
        this.n = r.a(7, false);
        this.m = context;
        this.o = r.g(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.p = obtainStyledAttributes.hasValue(0);
        r.f730b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f65f = checkBox;
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
        rect.top = this.i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    public final void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f63d = radioButton;
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    public void c(boolean z) {
        int i;
        String sb;
        int i2 = (z && this.f61b.n()) ? 0 : 8;
        if (i2 == 0) {
            TextView textView = this.g;
            o oVar = this.f61b;
            char e2 = oVar.e();
            if (e2 == 0) {
                sb = "";
            } else {
                Resources resources = oVar.n.f604a.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(oVar.n.f604a).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i3 = oVar.n.n() ? oVar.k : oVar.i;
                o.c(sb2, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                o.c(sb2, i3, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                o.c(sb2, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                o.c(sb2, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                o.c(sb2, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                o.c(sb2, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (e2 == '\b') {
                    i = R.string.abc_menu_delete_shortcut_label;
                } else if (e2 == '\n') {
                    i = R.string.abc_menu_enter_shortcut_label;
                } else if (e2 != ' ') {
                    sb2.append(e2);
                    sb = sb2.toString();
                } else {
                    i = R.string.abc_menu_space_shortcut_label;
                }
                sb2.append(resources.getString(i));
                sb = sb2.toString();
            }
            textView.setText(sb);
        }
        if (this.g.getVisibility() != i2) {
            this.g.setVisibility(i2);
        }
    }

    @Override // b.b.h.m.z.a
    public void d(o oVar, int i) {
        this.f61b = oVar;
        setVisibility(oVar.isVisible() ? 0 : 8);
        setTitle(oVar.f618e);
        setCheckable(oVar.isCheckable());
        boolean n = oVar.n();
        oVar.e();
        c(n);
        setIcon(oVar.getIcon());
        setEnabled(oVar.isEnabled());
        setSubMenuArrowVisible(oVar.hasSubMenu());
        setContentDescription(oVar.q);
    }

    @Override // b.b.h.m.z.a
    public o getItemData() {
        return this.f61b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.k;
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        setBackground(drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f64e = textView;
        int i = this.l;
        if (i != -1) {
            textView.setTextAppearance(this.m, i);
        }
        this.g = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.o);
        }
        this.i = (ImageView) findViewById(R.id.group_divider);
        this.j = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f62c != null && this.n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f62c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f63d == null && this.f65f == null) {
            return;
        }
        if (this.f61b.h()) {
            if (this.f63d == null) {
                b();
            }
            compoundButton = this.f63d;
            compoundButton2 = this.f65f;
        } else {
            if (this.f65f == null) {
                a();
            }
            compoundButton = this.f65f;
            compoundButton2 = this.f63d;
        }
        if (z) {
            compoundButton.setChecked(this.f61b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f65f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f63d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f61b.h()) {
            if (this.f63d == null) {
                b();
            }
            compoundButton = this.f63d;
        } else {
            if (this.f65f == null) {
                a();
            }
            compoundButton = this.f65f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.r = z;
        this.n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility((this.p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.f61b.n);
        boolean z = this.r;
        if (z || this.n) {
            ImageView imageView = this.f62c;
            if (imageView == null && drawable == null && !this.n) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f62c = imageView2;
                LinearLayout linearLayout = this.j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.n) {
                this.f62c.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f62c;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f62c.getVisibility() != 0) {
                this.f62c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.f64e.setText(charSequence);
            if (this.f64e.getVisibility() == 0) {
                return;
            }
            textView = this.f64e;
            i = 0;
        } else {
            i = 8;
            if (this.f64e.getVisibility() == 8) {
                return;
            } else {
                textView = this.f64e;
            }
        }
        textView.setVisibility(i);
    }
}
