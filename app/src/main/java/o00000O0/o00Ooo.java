package o00000O0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.github.superadb.R;

/* loaded from: classes2.dex */
public final class o00Ooo extends Oooo000 {

    /* renamed from: OooO0o, reason: collision with root package name */
    public EditText f29205OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f29206OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final com.applovin.mediation.nativeAds.OooO00o f29207OooO0oO;

    public o00Ooo(OooOo oooOo, int i) {
        super(oooOo);
        this.f29206OooO0o0 = R.drawable.design_password_eye;
        this.f29207OooO0oO = new com.applovin.mediation.nativeAds.OooO00o(this, 3);
        if (i != 0) {
            this.f29206OooO0o0 = i;
        }
    }

    @Override // o00000O0.Oooo000
    public final void OooO0O0() {
        OooOOo0();
    }

    @Override // o00000O0.Oooo000
    public final int OooO0OO() {
        return R.string.password_toggle_content_description;
    }

    @Override // o00000O0.Oooo000
    public final int OooO0Oo() {
        return this.f29206OooO0o0;
    }

    @Override // o00000O0.Oooo000
    public final View.OnClickListener OooO0o() {
        return this.f29207OooO0oO;
    }

    @Override // o00000O0.Oooo000
    public final boolean OooOO0O() {
        return true;
    }

    @Override // o00000O0.Oooo000
    public final boolean OooOO0o() {
        EditText editText = this.f29205OooO0o;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // o00000O0.Oooo000
    public final void OooOOO0(EditText editText) {
        this.f29205OooO0o = editText;
        OooOOo0();
    }

    @Override // o00000O0.Oooo000
    public final void OooOOo() {
        EditText editText = this.f29205OooO0o;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f29205OooO0o.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // o00000O0.Oooo000
    public final void OooOOoo() {
        EditText editText = this.f29205OooO0o;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
