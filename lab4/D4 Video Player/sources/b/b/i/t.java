package b.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f798a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: b, reason: collision with root package name */
    public final int[] f799b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: c, reason: collision with root package name */
    public final int[] f800c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};

    /* renamed from: d, reason: collision with root package name */
    public final int[] f801d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: e, reason: collision with root package name */
    public final int[] f802e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

    /* renamed from: f, reason: collision with root package name */
    public final int[] f803f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    public final boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public final ColorStateList b(Context context, int i) {
        int c2 = h2.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{h2.f695b, h2.f697d, h2.f696c, h2.f699f}, new int[]{h2.b(context, R.attr.colorButtonNormal), b.h.d.a.a(c2, i), b.h.d.a.a(c2, i), i});
    }

    public ColorStateList c(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            ThreadLocal<TypedValue> threadLocal = b.b.d.a.a.f496a;
            return context.getColorStateList(R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            ThreadLocal<TypedValue> threadLocal2 = b.b.d.a.a.f496a;
            return context.getColorStateList(R.color.abc_tint_switch_track);
        }
        if (i == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList d2 = h2.d(context, R.attr.colorSwitchThumbNormal);
            if (d2 == null || !d2.isStateful()) {
                iArr[0] = h2.f695b;
                iArr2[0] = h2.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = h2.f698e;
                iArr2[1] = h2.c(context, R.attr.colorControlActivated);
                iArr[2] = h2.f699f;
                iArr2[2] = h2.c(context, R.attr.colorSwitchThumbNormal);
            } else {
                iArr[0] = h2.f695b;
                iArr2[0] = d2.getColorForState(iArr[0], 0);
                iArr[1] = h2.f698e;
                iArr2[1] = h2.c(context, R.attr.colorControlActivated);
                iArr[2] = h2.f699f;
                iArr2[2] = d2.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i == R.drawable.abc_btn_default_mtrl_shape) {
            return b(context, h2.c(context, R.attr.colorButtonNormal));
        }
        if (i == R.drawable.abc_btn_borderless_material) {
            return b(context, 0);
        }
        if (i == R.drawable.abc_btn_colored_material) {
            return b(context, h2.c(context, R.attr.colorAccent));
        }
        if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
            ThreadLocal<TypedValue> threadLocal3 = b.b.d.a.a.f496a;
            return context.getColorStateList(R.color.abc_tint_spinner);
        }
        if (a(this.f799b, i)) {
            return h2.d(context, R.attr.colorControlNormal);
        }
        if (a(this.f802e, i)) {
            ThreadLocal<TypedValue> threadLocal4 = b.b.d.a.a.f496a;
            return context.getColorStateList(R.color.abc_tint_default);
        }
        if (a(this.f803f, i)) {
            ThreadLocal<TypedValue> threadLocal5 = b.b.d.a.a.f496a;
            return context.getColorStateList(R.color.abc_tint_btn_checkable);
        }
        if (i != R.drawable.abc_seekbar_thumb_material) {
            return null;
        }
        ThreadLocal<TypedValue> threadLocal6 = b.b.d.a.a.f496a;
        return context.getColorStateList(R.color.abc_tint_seek_thumb);
    }

    public final void d(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (d1.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = u.f814b;
        }
        drawable.setColorFilter(u.c(i, mode));
    }
}
