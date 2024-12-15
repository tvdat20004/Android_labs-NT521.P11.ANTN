package f.a.a.a.b.b;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import b.b.c.l;
import b.h.b.b;
import razi.apa.ctf.videoPlayer.R;
import razi.apa.ctf.videoPlayer.ui.AppSettingsActivity;
import razi.apa.ctf.videoPlayer.ui.PlayerDebugActivity;

/* loaded from: classes.dex */
public class a extends Fragment implements View.OnClickListener {
    public Button T;

    @Override // androidx.fragment.app.Fragment
    public View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mediapicker_fragment_more, viewGroup, false);
        Button button = (Button) inflate.findViewById(R.id.more_btn_update_check);
        this.T = button;
        button.setOnClickListener(this);
        inflate.findViewById(R.id.more_btn_settings).setOnClickListener(this);
        inflate.findViewById(R.id.more_btn_donate).setOnClickListener(this);
        inflate.findViewById(R.id.more_btn_about).setOnClickListener(this);
        inflate.findViewById(R.id.more_btn_help).setOnClickListener(this);
        Button button2 = (Button) inflate.findViewById(R.id.more_btn_debug);
        button2.setOnClickListener(this);
        button2.setVisibility(8);
        i();
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent;
        d.a.a.a.e("moreFragment_onClick()", new Object[0]);
        switch (view.getId()) {
            case R.id.more_btn_about /* 2131230998 */:
                Toast.makeText(i(), "Click on \"About YAVP\" :P", 1).show();
                intent = new Intent(i(), (Class<?>) AppSettingsActivity.class);
                break;
            case R.id.more_btn_debug /* 2131230999 */:
                intent = new Intent(i(), (Class<?>) PlayerDebugActivity.class);
                break;
            case R.id.more_btn_donate /* 2131231000 */:
            case R.id.more_btn_help /* 2131231001 */:
            default:
                return;
            case R.id.more_btn_settings /* 2131231002 */:
                intent = new Intent(i(), (Class<?>) AppSettingsActivity.class);
                break;
            case R.id.more_btn_update_check /* 2131231003 */:
                l d2 = d();
                if (d2 == null) {
                    return;
                }
                this.T.setEnabled(false);
                if (b.a(d2, "android.permission.INTERNET") != 0) {
                    b.b(d2, new String[]{"android.permission.INTERNET"}, 0);
                    Toast.makeText(i(), R.string.update_check_fail_toast, 0).show();
                    return;
                }
                return;
        }
        p0(intent);
    }
}
