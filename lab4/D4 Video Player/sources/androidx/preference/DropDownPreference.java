package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import b.q.t;
import java.util.Objects;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final Context Y;
    public final ArrayAdapter Z;
    public Spinner a0;
    public final AdapterView.OnItemSelectedListener b0;

    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                String charSequence = DropDownPreference.this.U[i].toString();
                if (charSequence.equals(DropDownPreference.this.V)) {
                    return;
                }
                Objects.requireNonNull(DropDownPreference.this);
                DropDownPreference.this.J(charSequence);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle, 0);
        this.b0 = new a();
        this.Y = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.Z = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.T;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.Z.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public void m() {
        super.m();
        ArrayAdapter arrayAdapter = this.Z;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void q(t tVar) {
        Spinner spinner = (Spinner) tVar.f305a.findViewById(R.id.spinner);
        this.a0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.Z);
        this.a0.setOnItemSelectedListener(this.b0);
        Spinner spinner2 = this.a0;
        String str = this.V;
        CharSequence[] charSequenceArr = this.U;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                if (charSequenceArr[length].equals(str)) {
                    i = length;
                    break;
                }
                length--;
            }
        }
        spinner2.setSelection(i);
        super.q(tVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void r() {
        this.a0.performClick();
    }
}
