package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdl;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;

/* loaded from: classes2.dex */
public final class q30 implements zzr, InterfaceC1466cp {

    /* renamed from: OooOo */
    public p30 f23498OooOo;

    /* renamed from: OooOo0O */
    public final Context f23499OooOo0O;

    /* renamed from: OooOo0o */
    public final VersionInfoParcel f23500OooOo0o;

    /* renamed from: OooOoO */
    public boolean f23501OooOoO;

    /* renamed from: OooOoO0 */
    public InterfaceC1722jo f23502OooOoO0;

    /* renamed from: OooOoOO */
    public boolean f23503OooOoOO;

    /* renamed from: OooOoo */
    public zzdl f23504OooOoo;

    /* renamed from: OooOoo0 */
    public long f23505OooOoo0;

    /* renamed from: OooOooO */
    public boolean f23506OooOooO;

    public q30(Context context, VersionInfoParcel versionInfoParcel) {
        this.f23499OooOo0O = context;
        this.f23500OooOo0o = versionInfoParcel;
    }

    public final synchronized void OooO00o(zzdl zzdlVar, C2079tb c2079tb, C1709jb c1709jb, C2079tb c2079tb2) {
        if (OooO0OO(zzdlVar)) {
            try {
                zzv.zzA();
                InterfaceC1722jo interfaceC1722joOooO00o = C2055so.OooO00o(new Oooo0oO.o0O0O00(0, 0, 0), this.f23499OooOo0O, this.f23500OooOo0o, null, null, new C1998r4(), null, null, null, null, null, null, "", false, false);
                this.f23502OooOoO0 = interfaceC1722joOooO00o;
                AbstractC1870no abstractC1870noZzN = interfaceC1722joOooO00o.zzN();
                if (abstractC1870noZzN == null) {
                    zzo.zzj("Failed to obtain a web view for the ad inspector");
                    try {
                        zzv.zzp().OooO0oo("InspectorUi.openInspector 2", new NullPointerException("Failed to obtain a web view for the ad inspector"));
                        zzdlVar.zze(af0.Oooo0O0(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e) {
                        zzv.zzp().OooO0oo("InspectorUi.openInspector 3", e);
                        return;
                    }
                }
                this.f23504OooOoo = zzdlVar;
                abstractC1870noZzN.OooOOO(null, null, null, null, null, false, null, null, null, null, null, null, null, c2079tb, null, new C1709jb(this.f23499OooOo0O, 5), c1709jb, c2079tb2, null);
                abstractC1870noZzN.f21533OooOoo0 = this;
                this.f23502OooOoO0.loadUrl((String) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0O));
                zzv.zzj();
                zzn.zza(this.f23499OooOo0O, new AdOverlayInfoParcel(this, this.f23502OooOoO0, 1, this.f23500OooOo0o), true, null);
                ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                this.f23505OooOoo0 = System.currentTimeMillis();
            } catch (C2018ro e2) {
                zzo.zzk("Failed to obtain a web view for the ad inspector", e2);
                try {
                    zzv.zzp().OooO0oo("InspectorUi.openInspector 0", e2);
                    zzdlVar.zze(af0.Oooo0O0(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e3) {
                    zzv.zzp().OooO0oo("InspectorUi.openInspector 1", e3);
                }
            }
        }
    }

    public final synchronized void OooO0O0(String str) {
        if (this.f23501OooOoO && this.f23503OooOoOO) {
            AbstractC2200wl.f25325OooO0o.execute(new wp0(27, this, str));
        }
    }

    public final synchronized boolean OooO0OO(zzdl zzdlVar) {
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0O0)).booleanValue()) {
            zzo.zzj("Ad inspector had an internal error.");
            try {
                zzdlVar.zze(af0.Oooo0O0(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f23498OooOo == null) {
            zzo.zzj("Ad inspector had an internal error.");
            try {
                zzv.zzp().OooO0oo("InspectorUi.shouldOpenUi", new NullPointerException("InspectorManager null"));
                zzdlVar.zze(af0.Oooo0O0(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f23501OooOoO && !this.f23503OooOoOO) {
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            if (System.currentTimeMillis() >= this.f23505OooOoo0 + ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0Oo)).intValue()) {
                return true;
            }
        }
        zzo.zzj("Ad inspector cannot be opened because it is already open.");
        try {
            zzdlVar.zze(af0.Oooo0O0(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1466cp
    public final synchronized void zza(boolean z, int i, String str, String str2) {
        if (z) {
            zze.zza("Ad inspector loaded.");
            this.f23501OooOoO = true;
            OooO0O0("");
            return;
        }
        zzo.zzj("Ad inspector failed to load.");
        try {
            zzv.zzp().OooO0oo("InspectorUi.onAdWebViewFinishedLoading 0", new Exception("Failed to load UI. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
            zzdl zzdlVar = this.f23504OooOoo;
            if (zzdlVar != null) {
                zzdlVar.zze(af0.Oooo0O0(17, null, null));
            }
        } catch (RemoteException e) {
            zzv.zzp().OooO0oo("InspectorUi.onAdWebViewFinishedLoading 1", e);
        }
        this.f23506OooOooO = true;
        this.f23502OooOoO0.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdp() {
        this.f23503OooOoOO = true;
        OooO0O0("");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzds(int i) {
        this.f23502OooOoO0.destroy();
        if (!this.f23506OooOooO) {
            zze.zza("Inspector closed.");
            zzdl zzdlVar = this.f23504OooOoo;
            if (zzdlVar != null) {
                try {
                    zzdlVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f23503OooOoOO = false;
        this.f23501OooOoO = false;
        this.f23505OooOoo0 = 0L;
        this.f23506OooOooO = false;
        this.f23504OooOoo = null;
    }
}
