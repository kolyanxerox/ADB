package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C1589g1;
import com.google.android.gms.internal.ads.C1663i1;
import com.google.android.gms.internal.measurement.o0OOO00;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class zzq implements Callable {

    /* renamed from: OooOo0O */
    public final /* synthetic */ zzu f16345OooOo0O;

    public zzq(zzu zzuVar) {
        this.f16345OooOo0O = zzuVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzu zzuVar = this.f16345OooOo0O;
        return new C1663i1(C1589g1.OooOOO0(zzuVar.f16357OooOoO0, new o0OOO00(zzuVar.f16354OooOo0O.afmaVersion)));
    }
}
