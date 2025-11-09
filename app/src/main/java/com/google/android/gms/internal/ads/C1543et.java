package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.et */
/* loaded from: classes2.dex */
public final class C1543et implements y70 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final List f18696OooO00o;

    public C1543et(List list) {
        this.f18696OooO00o = list;
    }

    @Override // com.google.android.gms.internal.ads.y70
    public final void zzr() {
        for (o00000oO.OooOOO oooOOO : this.f18696OooO00o) {
            C2007rd c2007rd = new C2007rd(17);
            oooOOO.addListener(new wp0(0, oooOOO, c2007rd), qp0.f23673OooOo0O);
        }
    }

    public C1543et(AbstractC1397at abstractC1397at) {
        this.f18696OooO00o = Collections.singletonList(ii0.OooooOO(abstractC1397at));
    }
}
