package o00000O0;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class o0ooOOo implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f29231OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f29232OooOo0o;

    public /* synthetic */ o0ooOOo(TextInputLayout textInputLayout, int i) {
        this.f29231OooOo0O = i;
        this.f29232OooOo0o = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29231OooOo0O) {
            case 0:
                CheckableImageButton checkableImageButton = this.f29232OooOo0o.f27877OooOo.f29177OooOoo0;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                break;
            default:
                this.f29232OooOo0o.f27881OooOoO0.requestLayout();
                break;
        }
    }
}
