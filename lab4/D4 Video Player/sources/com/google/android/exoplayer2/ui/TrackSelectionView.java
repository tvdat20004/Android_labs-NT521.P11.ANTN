package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import c.c.a.a.u1.q0;
import c.c.a.a.u1.s0;
import c.c.a.a.w1.m;
import c.c.a.a.w1.o;
import c.c.a.a.x1.g;
import c.c.a.a.x1.t;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final int f4165b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f4166c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckedTextView f4167d;

    /* renamed from: e, reason: collision with root package name */
    public final CheckedTextView f4168e;

    /* renamed from: f, reason: collision with root package name */
    public final b f4169f;
    public final SparseArray<m.a> g;
    public boolean h;
    public boolean i;
    public t j;
    public CheckedTextView[][] k;
    public o.a l;
    public int m;
    public s0 n;
    public boolean o;
    public c p;

    public class b implements View.OnClickListener {
        public b(a aVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r10) {
            /*
                Method dump skipped, instructions count: 234
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.TrackSelectionView.b.onClick(android.view.View):void");
        }
    }

    public interface c {
        void a(boolean z, List<m.a> list);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        this.g = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f4165b = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f4166c = from;
        b bVar = new b(null);
        this.f4169f = bVar;
        this.j = new g(getResources());
        this.n = s0.f2921e;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f4167d = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(razi.apa.ctf.videoPlayer.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(razi.apa.ctf.videoPlayer.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f4168e = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(razi.apa.ctf.videoPlayer.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    @RequiresNonNull({"mappedTrackInfo"})
    public final boolean a(int i) {
        if (!this.h || this.n.f2923c[i].f2918b <= 1) {
            return false;
        }
        o.a aVar = this.l;
        int i2 = this.m;
        int i3 = aVar.f3432c[i2].f2923c[i].f2918b;
        int[] iArr = new int[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            if ((aVar.f3434e[i2][i][i5] & 7) == 4) {
                iArr[i4] = i5;
                i4++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i4);
        int i6 = 16;
        String str = null;
        int i7 = 0;
        boolean z = false;
        int i8 = 0;
        while (i7 < copyOf.length) {
            String str2 = aVar.f3432c[i2].f2923c[i].f2919c[copyOf[i7]].j;
            int i9 = i8 + 1;
            if (i8 == 0) {
                str = str2;
            } else {
                z |= !l0.a(str, str2);
            }
            i6 = Math.min(i6, aVar.f3434e[i2][i][i7] & 24);
            i7++;
            i8 = i9;
        }
        if (z) {
            i6 = Math.min(i6, aVar.f3433d[i2]);
        }
        return i6 != 0;
    }

    public final void b() {
        boolean z;
        boolean z2;
        this.f4167d.setChecked(this.o);
        this.f4168e.setChecked(!this.o && this.g.size() == 0);
        for (int i = 0; i < this.k.length; i++) {
            m.a aVar = this.g.get(i);
            int i2 = 0;
            while (true) {
                CheckedTextView[][] checkedTextViewArr = this.k;
                if (i2 < checkedTextViewArr[i].length) {
                    CheckedTextView checkedTextView = checkedTextViewArr[i][i2];
                    if (aVar != null) {
                        int[] iArr = aVar.f3425c;
                        int length = iArr.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                z2 = false;
                                break;
                            } else {
                                if (iArr[i3] == i2) {
                                    z2 = true;
                                    break;
                                }
                                i3++;
                            }
                        }
                        if (z2) {
                            z = true;
                            checkedTextView.setChecked(z);
                            i2++;
                        }
                    }
                    z = false;
                    checkedTextView.setChecked(z);
                    i2++;
                }
            }
        }
    }

    public final void c() {
        int i;
        String b2;
        Resources resources;
        int i2;
        char c2;
        int i3 = 1;
        int childCount = getChildCount() - 1;
        while (true) {
            i = 3;
            if (childCount < 3) {
                break;
            }
            removeViewAt(childCount);
            childCount--;
        }
        if (this.l == null) {
            this.f4167d.setEnabled(false);
            this.f4168e.setEnabled(false);
            return;
        }
        this.f4167d.setEnabled(true);
        this.f4168e.setEnabled(true);
        s0 s0Var = this.l.f3432c[this.m];
        this.n = s0Var;
        int i4 = s0Var.f2922b;
        this.k = new CheckedTextView[i4][];
        boolean z = this.i && i4 > 1;
        int i5 = 0;
        while (true) {
            s0 s0Var2 = this.n;
            if (i5 >= s0Var2.f2922b) {
                b();
                return;
            }
            q0 q0Var = s0Var2.f2923c[i5];
            boolean a2 = a(i5);
            this.k[i5] = new CheckedTextView[q0Var.f2918b];
            int i6 = 0;
            while (i6 < q0Var.f2918b) {
                if (i6 == 0) {
                    addView(this.f4166c.inflate(razi.apa.ctf.videoPlayer.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f4166c.inflate((a2 || z) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f4165b);
                t tVar = this.j;
                c.c.a.a.l0 l0Var = q0Var.f2919c[i6];
                g gVar = (g) tVar;
                Objects.requireNonNull(gVar);
                int f2 = u.f(l0Var.j);
                if (f2 == -1) {
                    if (u.g(l0Var.g) == null) {
                        if (u.a(l0Var.g) == null) {
                            if (l0Var.o == -1 && l0Var.p == -1) {
                                if (l0Var.w == -1 && l0Var.x == -1) {
                                    f2 = -1;
                                }
                            }
                        }
                        f2 = i3;
                    }
                    f2 = 2;
                }
                String str = "";
                if (f2 == 2) {
                    String[] strArr = new String[i];
                    strArr[0] = gVar.c(l0Var);
                    int i7 = l0Var.o;
                    int i8 = l0Var.p;
                    if (i7 == -1 || i8 == -1) {
                        c2 = 1;
                    } else {
                        Resources resources2 = gVar.f3472a;
                        Integer valueOf = Integer.valueOf(i8);
                        c2 = 1;
                        str = resources2.getString(razi.apa.ctf.videoPlayer.R.string.exo_track_resolution, Integer.valueOf(i7), valueOf);
                    }
                    strArr[c2] = str;
                    strArr[2] = gVar.a(l0Var);
                    b2 = gVar.d(strArr);
                } else if (f2 == 1) {
                    String[] strArr2 = new String[3];
                    strArr2[0] = gVar.b(l0Var);
                    int i9 = l0Var.w;
                    if (i9 != -1 && i9 >= 1) {
                        if (i9 == 1) {
                            resources = gVar.f3472a;
                            i2 = razi.apa.ctf.videoPlayer.R.string.exo_track_mono;
                        } else if (i9 == 2) {
                            resources = gVar.f3472a;
                            i2 = razi.apa.ctf.videoPlayer.R.string.exo_track_stereo;
                        } else if (i9 == 6 || i9 == 7) {
                            resources = gVar.f3472a;
                            i2 = razi.apa.ctf.videoPlayer.R.string.exo_track_surround_5_point_1;
                        } else if (i9 != 8) {
                            resources = gVar.f3472a;
                            i2 = razi.apa.ctf.videoPlayer.R.string.exo_track_surround;
                        } else {
                            resources = gVar.f3472a;
                            i2 = razi.apa.ctf.videoPlayer.R.string.exo_track_surround_7_point_1;
                        }
                        str = resources.getString(i2);
                    }
                    strArr2[1] = str;
                    strArr2[2] = gVar.a(l0Var);
                    b2 = gVar.d(strArr2);
                } else {
                    b2 = gVar.b(l0Var);
                }
                if (b2.length() == 0) {
                    b2 = gVar.f3472a.getString(razi.apa.ctf.videoPlayer.R.string.exo_track_unknown);
                }
                checkedTextView.setText(b2);
                if ((this.l.f3434e[this.m][i5][i6] & 7) == 4) {
                    i3 = 1;
                    checkedTextView.setFocusable(true);
                    checkedTextView.setTag(Pair.create(Integer.valueOf(i5), Integer.valueOf(i6)));
                    checkedTextView.setOnClickListener(this.f4169f);
                } else {
                    i3 = 1;
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.k[i5][i6] = checkedTextView;
                addView(checkedTextView);
                i6++;
                i = 3;
            }
            i5++;
            i = 3;
        }
    }

    public boolean getIsDisabled() {
        return this.o;
    }

    public List<m.a> getOverrides() {
        ArrayList arrayList = new ArrayList(this.g.size());
        for (int i = 0; i < this.g.size(); i++) {
            arrayList.add(this.g.valueAt(i));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.h != z) {
            this.h = z;
            c();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (!z && this.g.size() > 1) {
                for (int size = this.g.size() - 1; size > 0; size--) {
                    this.g.remove(size);
                }
            }
            c();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f4167d.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(t tVar) {
        Objects.requireNonNull(tVar);
        this.j = tVar;
        c();
    }
}
