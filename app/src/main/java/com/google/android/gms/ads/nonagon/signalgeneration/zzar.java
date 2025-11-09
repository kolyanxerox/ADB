package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.InterfaceC2270yh;
import com.google.android.gms.internal.ads.hg0;
import com.google.android.gms.internal.ads.vp0;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class zzar implements vp0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ zzau f16490OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2270yh f16491OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f16492OooOo0o;

    public zzar(zzau zzauVar, InterfaceC2270yh interfaceC2270yh, boolean z) {
        this.f16491OooOo0O = interfaceC2270yh;
        this.f16492OooOo0o = z;
        this.f16490OooOo = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public final void zza(Throwable th) {
        try {
            this.f16491OooOo0O.zze("Internal error: " + th.getMessage());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public final void mo13705zzb(Object obj) {
        zzau zzauVar = this.f16490OooOo;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.f16491OooOo0O.Oooo000(arrayList);
            if (!zzauVar.f16515Oooo00o && !this.f16492OooOo0o) {
                return;
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                Uri uri = (Uri) obj2;
                boolean zO0OoO0o = zzau.o0OoO0o(uri, zzauVar.f16522OoooO, zzauVar.f16526OoooOO0);
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
