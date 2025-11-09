package oo0o0Oo;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;

/* loaded from: classes2.dex */
public final class OooO0o extends ResourcesCompat.FontCallback {

    /* renamed from: OooO00o */
    public final /* synthetic */ OooOO0O f33213OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ OooOO0 f33214OooO0O0;

    public OooO0o(OooOO0 oooOO0, OooOO0O oooOO0O) {
        this.f33214OooO0O0 = oooOO0;
        this.f33213OooO00o = oooOO0O;
    }

    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
    /* renamed from: onFontRetrievalFailed */
    public final void lambda$callbackFailAsync$1(int i) {
        this.f33214OooO0O0.f33227OooOOO0 = true;
        this.f33213OooO00o.OooO00o(i);
    }

    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
    /* renamed from: onFontRetrieved */
    public final void lambda$callbackSuccessAsync$0(Typeface typeface) {
        OooOO0 oooOO0 = this.f33214OooO0O0;
        oooOO0.f33226OooOOO = Typeface.create(typeface, oooOO0.f33218OooO0OO);
        oooOO0.f33227OooOOO0 = true;
        this.f33213OooO00o.OooO0O0(oooOO0.f33226OooOOO, false);
    }
}
