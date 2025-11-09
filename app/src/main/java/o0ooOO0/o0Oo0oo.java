package o0ooOO0;

import OoooOOO.o0O00000;
import OooooOO.ooooO0O0;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class o0Oo0oo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f33137OooO00o = new ArrayList();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public ValueAnimator f33138OooO0O0 = null;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final ooooO0O0 f33139OooO0OO = new ooooO0O0(this, 7);

    public final void OooO00o(int[] iArr, ValueAnimator valueAnimator) {
        o0O00000 o0o00000 = new o0O00000(iArr, valueAnimator);
        valueAnimator.addListener(this.f33139OooO0OO);
        this.f33137OooO00o.add(o0o00000);
    }
}
