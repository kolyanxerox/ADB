package o0ooOO0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class oo0o0Oo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public CharSequence f33143OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final TextPaint f33144OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f33145OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f33146OooO0Oo;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public boolean f33152OooOO0O;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public Layout.Alignment f33148OooO0o0 = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f33147OooO0o = Integer.MAX_VALUE;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public float f33149OooO0oO = 0.0f;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public float f33150OooO0oo = 1.0f;

    /* renamed from: OooO, reason: collision with root package name */
    public int f33142OooO = 1;

    /* renamed from: OooOO0, reason: collision with root package name */
    public boolean f33151OooOO0 = true;
    public TextUtils.TruncateAt OooOO0o = null;

    public oo0o0Oo(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f33143OooO00o = charSequence;
        this.f33144OooO0O0 = textPaint;
        this.f33145OooO0OO = i;
        this.f33146OooO0Oo = charSequence.length();
    }

    public final StaticLayout OooO00o() {
        if (this.f33143OooO00o == null) {
            this.f33143OooO00o = "";
        }
        int iMax = Math.max(0, this.f33145OooO0OO);
        CharSequence charSequenceEllipsize = this.f33143OooO00o;
        int i = this.f33147OooO0o;
        TextPaint textPaint = this.f33144OooO0O0;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.OooOO0o);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f33146OooO0Oo);
        this.f33146OooO0Oo = iMin;
        if (this.f33152OooOO0O && this.f33147OooO0o == 1) {
            this.f33148OooO0o0 = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f33148OooO0o0);
        builderObtain.setIncludePad(this.f33151OooOO0);
        builderObtain.setTextDirection(this.f33152OooOO0O ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.OooOO0o;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f33147OooO0o);
        float f = this.f33149OooO0oO;
        if (f != 0.0f || this.f33150OooO0oo != 1.0f) {
            builderObtain.setLineSpacing(f, this.f33150OooO0oo);
        }
        if (this.f33147OooO0o > 1) {
            builderObtain.setHyphenationFrequency(this.f33142OooO);
        }
        return builderObtain.build();
    }
}
