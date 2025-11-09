package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.pv */
/* loaded from: classes2.dex */
public final class C1951pv extends p11 implements InterfaceC1399av, InterfaceC1840mv {

    /* renamed from: OooOo */
    public final kd0 f23430OooOo;

    /* renamed from: OooOoO0 */
    public final AtomicBoolean f23431OooOoO0;

    public C1951pv(Set set, kd0 kd0Var) {
        super(set);
        this.f23431OooOoO0 = new AtomicBoolean();
        this.f23430OooOo = kd0Var;
    }

    public final void o00000oo() {
        zzu zzuVar;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0oo0O)).booleanValue() && this.f23431OooOoO0.compareAndSet(false, true) && (zzuVar = this.f23430OooOo.f20539OooooOO) != null && zzuVar.zza == 3) {
            o0000Ooo(new p80(zzuVar, 13));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1840mv
    public final void zzg() {
        if (this.f23430OooOo.f20488OooO0O0 == 1) {
            o00000oo();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1399av
    public final void zzr() {
        int i = this.f23430OooOo.f20488OooO0O0;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            o00000oo();
        }
    }
}
