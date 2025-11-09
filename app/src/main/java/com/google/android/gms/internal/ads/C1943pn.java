package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;

/* renamed from: com.google.android.gms.internal.ads.pn */
/* loaded from: classes2.dex */
public final class C1943pn extends AbstractC1869nn {
    @Override // com.google.android.gms.internal.ads.AbstractC1869nn
    public final void OooOO0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1869nn
    public final boolean OooOOo0(String str) {
        String strZzf = zzf.zzf(str);
        InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) this.f21515OooOo.get();
        if (interfaceC1722jo != null && strZzf != null) {
            interfaceC1722jo.o00Ooo(strZzf, this);
        }
        zzo.zzj("VideoStreamNoopCache is doing nothing.");
        OooOO0O(str, strZzf, "noop", "Noop cache is a noop.");
        return false;
    }
}
