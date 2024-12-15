package b.b.i;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public TextView f786a;

    /* renamed from: b, reason: collision with root package name */
    public TextClassifier f787b;

    public s0(TextView textView) {
        this.f786a = textView;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f787b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f786a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }
}
