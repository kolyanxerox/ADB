package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.C1621gx;
import com.google.android.gms.internal.ads.C1847n1;
import com.google.android.gms.internal.ads.tq0;
import com.google.android.gms.internal.ads.vp0;

/* loaded from: classes2.dex */
final class zzaw implements vp0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ C1621gx f16543OooOo0O;

    public zzaw(C1621gx c1621gx) {
        this.f16543OooOo0O = c1621gx;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public final void zza(Throwable th) {
        C1621gx c1621gx = this.f16543OooOo0O;
        String message = th.getMessage();
        synchronized (c1621gx) {
            c1621gx.o0000Ooo(new tq0(message, 7));
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public final void mo13705zzb(@Nullable Object obj) {
        C1621gx c1621gx = this.f16543OooOo0O;
        zzbk zzbkVar = (zzbk) obj;
        synchronized (c1621gx) {
            c1621gx.o0000Ooo(new C1847n1(zzbkVar, 16));
        }
    }
}
