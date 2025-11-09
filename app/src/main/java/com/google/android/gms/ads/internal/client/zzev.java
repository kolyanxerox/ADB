package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.AbstractBinderC2228xc;
import com.google.android.gms.internal.ads.wj0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class zzev extends AbstractBinderC2228xc {

    /* renamed from: OooOo0O */
    public final /* synthetic */ zzex f16070OooOo0O;

    public /* synthetic */ zzev(zzex zzexVar) {
        this.f16070OooOo0O = zzexVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2265yc
    public final void zzb(List list) throws RemoteException {
        int i;
        ArrayList arrayList;
        synchronized (this.f16070OooOo0O.f16073OooO00o) {
            zzex zzexVar = this.f16070OooOo0O;
            zzexVar.f16076OooO0Oo = false;
            zzexVar.f16078OooO0o0 = true;
            arrayList = new ArrayList(this.f16070OooOo0O.f16075OooO0OO);
            this.f16070OooOo0O.f16075OooO0OO.clear();
        }
        wj0 wj0VarOooO00o = zzex.OooO00o(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(wj0VarOooO00o);
        }
    }
}
