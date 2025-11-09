package o0ooOO0;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class o000000 {

    /* renamed from: OooO0OO */
    public float f33090OooO0OO;

    /* renamed from: OooO0o */
    public oo0o0Oo.OooOO0 f33092OooO0o;

    /* renamed from: OooO0o0 */
    public final WeakReference f33093OooO0o0;

    /* renamed from: OooO00o */
    public final TextPaint f33088OooO00o = new TextPaint(1);

    /* renamed from: OooO0O0 */
    public final o0O0O00 f33089OooO0O0 = new o0O0O00(this, 0);

    /* renamed from: OooO0Oo */
    public boolean f33091OooO0Oo = true;

    public o000000(o000OOo o000ooo2) {
        this.f33093OooO0o0 = new WeakReference(null);
        this.f33093OooO0o0 = new WeakReference(o000ooo2);
    }

    public final float OooO00o(String str) {
        if (!this.f33091OooO0Oo) {
            return this.f33090OooO0OO;
        }
        float fMeasureText = str == null ? 0.0f : this.f33088OooO00o.measureText((CharSequence) str, 0, str.length());
        this.f33090OooO0OO = fMeasureText;
        this.f33091OooO0Oo = false;
        return fMeasureText;
    }

    public final void OooO0O0(oo0o0Oo.OooOO0 oooOO0, Context context) {
        if (this.f33092OooO0o != oooOO0) {
            this.f33092OooO0o = oooOO0;
            if (oooOO0 != null) {
                TextPaint textPaint = this.f33088OooO00o;
                o0O0O00 o0o0o00 = this.f33089OooO0O0;
                oooOO0.OooO0o0(context, textPaint, o0o0o00);
                o000OOo o000ooo2 = (o000OOo) this.f33093OooO0o0.get();
                if (o000ooo2 != null) {
                    textPaint.drawableState = o000ooo2.getState();
                }
                oooOO0.OooO0Oo(context, textPaint, o0o0o00);
                this.f33091OooO0Oo = true;
            }
            o000OOo o000ooo3 = (o000OOo) this.f33093OooO0o0.get();
            if (o000ooo3 != null) {
                o000ooo3.OooO00o();
                o000ooo3.onStateChange(o000ooo3.getState());
            }
        }
    }
}
