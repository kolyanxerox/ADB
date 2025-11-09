package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.InterfaceC2270yh;
import com.google.android.gms.internal.ads.hg0;
import com.google.android.gms.internal.ads.vp0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class zzas implements vp0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ zzau f16493OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2270yh f16494OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f16495OooOo0o;

    public zzas(zzau zzauVar, InterfaceC2270yh interfaceC2270yh, boolean z) {
        this.f16494OooOo0O = interfaceC2270yh;
        this.f16495OooOo0o = z;
        this.f16493OooOo = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public final void zza(Throwable th) {
        try {
            this.f16494OooOo0O.zze("Internal error: " + th.getMessage());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public final void mo13705zzb(Object obj) {
        zzau zzauVar;
        List<Uri> list = (List) obj;
        try {
            ArrayList arrayList = zzau.f16497Ooooo00;
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                zzauVar = this.f16493OooOo;
                if (zHasNext) {
                    if (zzau.o0OoO0o((Uri) it.next(), zzauVar.f16523OoooO0, zzauVar.f16525OoooO0O)) {
                        zzauVar.f16520Oooo0oO.getAndIncrement();
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f16494OooOo0O.Oooo000(list);
            if (!zzauVar.f16512Oooo0 && !this.f16495OooOo0o) {
                return;
            }
            for (Uri uri : list) {
                boolean zO0OoO0o = zzau.o0OoO0o(uri, zzauVar.f16523OoooO0, zzauVar.f16525OoooO0O);
                hg0 hg0Var = zzauVar.f16514Oooo00O;
                if (zO0OoO0o) {
                    hg0Var.OooO0O0(zzau.o000OO0o(uri, zzauVar.f16524OoooO00, "1").toString(), null, null);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0Oo)).booleanValue()) {
                        hg0Var.OooO0O0(uri.toString(), null, null);
                    }
                }
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }
}
