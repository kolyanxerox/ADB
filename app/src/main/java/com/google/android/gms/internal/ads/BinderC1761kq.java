package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzdl;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.kq */
/* loaded from: classes2.dex */
public final class BinderC1761kq extends zzcy {

    /* renamed from: OooOo */
    public final t10 f20643OooOo;

    /* renamed from: OooOo0O */
    public final Context f20644OooOo0O;

    /* renamed from: OooOo0o */
    public final VersionInfoParcel f20645OooOo0o;

    /* renamed from: OooOoO */
    public final u80 f20646OooOoO;

    /* renamed from: OooOoO0 */
    public final k60 f20647OooOoO0;

    /* renamed from: OooOoOO */
    public final d30 f20648OooOoOO;

    /* renamed from: OooOoo */
    public final v10 f20649OooOoo;

    /* renamed from: OooOoo0 */
    public final C2162vk f20650OooOoo0;

    /* renamed from: OooOooO */
    public final p30 f20651OooOooO;

    /* renamed from: OooOooo */
    public final C2150v8 f20652OooOooo;

    /* renamed from: Oooo0 */
    public final h20 f20653Oooo0;

    /* renamed from: Oooo000 */
    public final nf0 f20654Oooo000;

    /* renamed from: Oooo00O */
    public final de0 f20655Oooo00O;

    /* renamed from: Oooo00o */
    public final C2208wt f20656Oooo00o;

    /* renamed from: Oooo0O0 */
    public boolean f20657Oooo0O0 = false;

    /* renamed from: Oooo0OO */
    public final Long f20658Oooo0OO;

    public BinderC1761kq(Context context, VersionInfoParcel versionInfoParcel, t10 t10Var, k60 k60Var, u80 u80Var, d30 d30Var, C2162vk c2162vk, v10 v10Var, p30 p30Var, C2150v8 c2150v8, nf0 nf0Var, de0 de0Var, C2208wt c2208wt, h20 h20Var) {
        this.f20644OooOo0O = context;
        this.f20645OooOo0o = versionInfoParcel;
        this.f20643OooOo = t10Var;
        this.f20647OooOoO0 = k60Var;
        this.f20646OooOoO = u80Var;
        this.f20648OooOoOO = d30Var;
        this.f20650OooOoo0 = c2162vk;
        this.f20649OooOoo = v10Var;
        this.f20651OooOooO = p30Var;
        this.f20652OooOooo = c2150v8;
        this.f20654Oooo000 = nf0Var;
        this.f20655Oooo00O = de0Var;
        this.f20656Oooo00o = c2208wt;
        this.f20653Oooo0 = h20Var;
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        this.f20658Oooo0OO = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized float zze() {
        return zzv.zzs().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final String zzf() {
        return this.f20645OooOo0o.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final List zzg() {
        return this.f20648OooOoOO.OooO00o();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(String str) {
        this.f20646OooOoO.OooO0O0(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() {
        this.f20648OooOoOO.f18154OooOOo0 = false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean z) throws IOException, RemoteException {
        Context context = this.f20644OooOo0O;
        try {
            sj0.OooO00o(context).OooOOO(z);
            if (z) {
                return;
            }
            try {
                if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                } else {
                    throw new IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (IOException e) {
                zzv.zzp().OooO0oo("clearStorageOnGpidPubDisable_scar", e);
            }
        } catch (IOException e2) {
            throw new RemoteException(e2.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzk() {
        if (this.f20657Oooo0O0) {
            zzo.zzj("Mobile ads is initialized already.");
            return;
        }
        AbstractC1448c7.OooO00o(this.f20644OooOo0O);
        zzv.zzp().OooO0o(this.f20644OooOo0O, this.f20645OooOo0o);
        this.f20656Oooo00o.OooO00o();
        zzv.zzc().OooO0OO(this.f20644OooOo0O);
        this.f20657Oooo0O0 = true;
        this.f20648OooOoOO.OooO0O0();
        u80 u80Var = this.f20646OooOoO;
        u80Var.getClass();
        zzv.zzp().OooO0Oo().zzo(new t80(u80Var, 1));
        u80Var.f24597OooO0o.execute(new t80(u80Var, 0));
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00OoO)).booleanValue()) {
            v10 v10Var = this.f20649OooOoo;
            if (!v10Var.f24834OooO0o.getAndSet(true)) {
                zzv.zzp().OooO0Oo().zzo(new u10(v10Var, 1));
            }
            v10Var.f24832OooO0OO.execute(new u10(v10Var, 0));
        }
        this.f20651OooOooO.OooO0OO();
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOOOo)).booleanValue()) {
            final int i = 0;
            AbstractC2200wl.f25321OooO00o.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.jq

                /* renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ BinderC1761kq f20351OooOo0o;

                {
                    this.f20351OooOo0o = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String packageName;
                    switch (i) {
                        case 0:
                            BinderC1761kq binderC1761kq = this.f20351OooOo0o;
                            if (zzv.zzp().OooO0Oo().zzM()) {
                                if (!zzv.zzt().zzj(binderC1761kq.f20644OooOo0O, zzv.zzp().OooO0Oo().zzi(), binderC1761kq.f20645OooOo0o.afmaVersion)) {
                                    zzv.zzp().OooO0Oo().zzx(false);
                                    zzv.zzp().OooO0Oo().zzw("");
                                    break;
                                }
                            }
                            break;
                        case 1:
                            AbstractC1641hg.OooO0o(this.f20351OooOo0o.f20644OooOo0O, true);
                            break;
                        case 2:
                            BinderC1761kq binderC1761kq2 = this.f20351OooOo0o;
                            C1853n7 c1853n7Zzf = zzv.zzf();
                            if (!c1853n7Zzf.f21424OooOo0O.getAndSet(true)) {
                                Context context = binderC1761kq2.f20644OooOo0O;
                                c1853n7Zzf.f21425OooOo0o = context;
                                c1853n7Zzf.f21423OooOo = binderC1761kq2.f20653Oooo0;
                                if (c1853n7Zzf.f21426OooOoO == null && context != null && (packageName = CustomTabsClient.getPackageName(context, null)) != null) {
                                    CustomTabsClient.bindCustomTabsService(context, packageName, c1853n7Zzf);
                                    break;
                                }
                            }
                            break;
                        default:
                            BinderC1761kq binderC1761kq3 = this.f20351OooOo0o;
                            binderC1761kq3.getClass();
                            BinderC1716ji binderC1716ji = new BinderC1716ji("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            C2150v8 c2150v8 = binderC1761kq3.f20652OooOooo;
                            c2150v8.getClass();
                            try {
                                C2187w8 c2187w8 = (C2187w8) zzs.zzb(c2150v8.f24886OooOo0O, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new o0O(29));
                                Parcel parcelOooO = c2187w8.OooO();
                                AbstractC2218x2.OooO0o0(parcelOooO, binderC1716ji);
                                c2187w8.o000OO0O(parcelOooO, 1);
                                break;
                            } catch (RemoteException e) {
                                zzo.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
                                return;
                            } catch (zzr e2) {
                                zzo.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
                            }
                    }
                }
            });
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOO00)).booleanValue()) {
            final int i2 = 3;
            AbstractC2200wl.f25321OooO00o.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.jq

                /* renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ BinderC1761kq f20351OooOo0o;

                {
                    this.f20351OooOo0o = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String packageName;
                    switch (i2) {
                        case 0:
                            BinderC1761kq binderC1761kq = this.f20351OooOo0o;
                            if (zzv.zzp().OooO0Oo().zzM()) {
                                if (!zzv.zzt().zzj(binderC1761kq.f20644OooOo0O, zzv.zzp().OooO0Oo().zzi(), binderC1761kq.f20645OooOo0o.afmaVersion)) {
                                    zzv.zzp().OooO0Oo().zzx(false);
                                    zzv.zzp().OooO0Oo().zzw("");
                                    break;
                                }
                            }
                            break;
                        case 1:
                            AbstractC1641hg.OooO0o(this.f20351OooOo0o.f20644OooOo0O, true);
                            break;
                        case 2:
                            BinderC1761kq binderC1761kq2 = this.f20351OooOo0o;
                            C1853n7 c1853n7Zzf = zzv.zzf();
                            if (!c1853n7Zzf.f21424OooOo0O.getAndSet(true)) {
                                Context context = binderC1761kq2.f20644OooOo0O;
                                c1853n7Zzf.f21425OooOo0o = context;
                                c1853n7Zzf.f21423OooOo = binderC1761kq2.f20653Oooo0;
                                if (c1853n7Zzf.f21426OooOoO == null && context != null && (packageName = CustomTabsClient.getPackageName(context, null)) != null) {
                                    CustomTabsClient.bindCustomTabsService(context, packageName, c1853n7Zzf);
                                    break;
                                }
                            }
                            break;
                        default:
                            BinderC1761kq binderC1761kq3 = this.f20351OooOo0o;
                            binderC1761kq3.getClass();
                            BinderC1716ji binderC1716ji = new BinderC1716ji("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            C2150v8 c2150v8 = binderC1761kq3.f20652OooOooo;
                            c2150v8.getClass();
                            try {
                                C2187w8 c2187w8 = (C2187w8) zzs.zzb(c2150v8.f24886OooOo0O, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new o0O(29));
                                Parcel parcelOooO = c2187w8.OooO();
                                AbstractC2218x2.OooO0o0(parcelOooO, binderC1716ji);
                                c2187w8.o000OO0O(parcelOooO, 1);
                                break;
                            } catch (RemoteException e) {
                                zzo.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
                                return;
                            } catch (zzr e2) {
                                zzo.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
                            }
                    }
                }
            });
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17880o00O0o0O)).booleanValue()) {
            final int i3 = 1;
            AbstractC2200wl.f25321OooO00o.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.jq

                /* renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ BinderC1761kq f20351OooOo0o;

                {
                    this.f20351OooOo0o = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String packageName;
                    switch (i3) {
                        case 0:
                            BinderC1761kq binderC1761kq = this.f20351OooOo0o;
                            if (zzv.zzp().OooO0Oo().zzM()) {
                                if (!zzv.zzt().zzj(binderC1761kq.f20644OooOo0O, zzv.zzp().OooO0Oo().zzi(), binderC1761kq.f20645OooOo0o.afmaVersion)) {
                                    zzv.zzp().OooO0Oo().zzx(false);
                                    zzv.zzp().OooO0Oo().zzw("");
                                    break;
                                }
                            }
                            break;
                        case 1:
                            AbstractC1641hg.OooO0o(this.f20351OooOo0o.f20644OooOo0O, true);
                            break;
                        case 2:
                            BinderC1761kq binderC1761kq2 = this.f20351OooOo0o;
                            C1853n7 c1853n7Zzf = zzv.zzf();
                            if (!c1853n7Zzf.f21424OooOo0O.getAndSet(true)) {
                                Context context = binderC1761kq2.f20644OooOo0O;
                                c1853n7Zzf.f21425OooOo0o = context;
                                c1853n7Zzf.f21423OooOo = binderC1761kq2.f20653Oooo0;
                                if (c1853n7Zzf.f21426OooOoO == null && context != null && (packageName = CustomTabsClient.getPackageName(context, null)) != null) {
                                    CustomTabsClient.bindCustomTabsService(context, packageName, c1853n7Zzf);
                                    break;
                                }
                            }
                            break;
                        default:
                            BinderC1761kq binderC1761kq3 = this.f20351OooOo0o;
                            binderC1761kq3.getClass();
                            BinderC1716ji binderC1716ji = new BinderC1716ji("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            C2150v8 c2150v8 = binderC1761kq3.f20652OooOooo;
                            c2150v8.getClass();
                            try {
                                C2187w8 c2187w8 = (C2187w8) zzs.zzb(c2150v8.f24886OooOo0O, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new o0O(29));
                                Parcel parcelOooO = c2187w8.OooO();
                                AbstractC2218x2.OooO0o0(parcelOooO, binderC1716ji);
                                c2187w8.o000OO0O(parcelOooO, 1);
                                break;
                            } catch (RemoteException e) {
                                zzo.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
                                return;
                            } catch (zzr e2) {
                                zzo.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
                            }
                    }
                }
            });
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o00oO)).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o00oo)).booleanValue()) {
                final int i4 = 2;
                AbstractC2200wl.f25321OooO00o.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.jq

                    /* renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ BinderC1761kq f20351OooOo0o;

                    {
                        this.f20351OooOo0o = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String packageName;
                        switch (i4) {
                            case 0:
                                BinderC1761kq binderC1761kq = this.f20351OooOo0o;
                                if (zzv.zzp().OooO0Oo().zzM()) {
                                    if (!zzv.zzt().zzj(binderC1761kq.f20644OooOo0O, zzv.zzp().OooO0Oo().zzi(), binderC1761kq.f20645OooOo0o.afmaVersion)) {
                                        zzv.zzp().OooO0Oo().zzx(false);
                                        zzv.zzp().OooO0Oo().zzw("");
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                AbstractC1641hg.OooO0o(this.f20351OooOo0o.f20644OooOo0O, true);
                                break;
                            case 2:
                                BinderC1761kq binderC1761kq2 = this.f20351OooOo0o;
                                C1853n7 c1853n7Zzf = zzv.zzf();
                                if (!c1853n7Zzf.f21424OooOo0O.getAndSet(true)) {
                                    Context context = binderC1761kq2.f20644OooOo0O;
                                    c1853n7Zzf.f21425OooOo0o = context;
                                    c1853n7Zzf.f21423OooOo = binderC1761kq2.f20653Oooo0;
                                    if (c1853n7Zzf.f21426OooOoO == null && context != null && (packageName = CustomTabsClient.getPackageName(context, null)) != null) {
                                        CustomTabsClient.bindCustomTabsService(context, packageName, c1853n7Zzf);
                                        break;
                                    }
                                }
                                break;
                            default:
                                BinderC1761kq binderC1761kq3 = this.f20351OooOo0o;
                                binderC1761kq3.getClass();
                                BinderC1716ji binderC1716ji = new BinderC1716ji("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                C2150v8 c2150v8 = binderC1761kq3.f20652OooOooo;
                                c2150v8.getClass();
                                try {
                                    C2187w8 c2187w8 = (C2187w8) zzs.zzb(c2150v8.f24886OooOo0O, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new o0O(29));
                                    Parcel parcelOooO = c2187w8.OooO();
                                    AbstractC2218x2.OooO0o0(parcelOooO, binderC1716ji);
                                    c2187w8.o000OO0O(parcelOooO, 1);
                                    break;
                                } catch (RemoteException e) {
                                    zzo.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
                                    return;
                                } catch (zzr e2) {
                                    zzo.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
                                }
                        }
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzl(String str, Oooo0o.OooO0O0 oooO0O0) {
        String strZzq;
        RunnableC1688iq runnableC1688iq;
        Context context = this.f20644OooOo0O;
        AbstractC1448c7.OooO00o(context);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00OoOo0)).booleanValue()) {
            try {
                zzv.zzq();
                strZzq = com.google.android.gms.ads.internal.util.zzs.zzq(context);
            } catch (RemoteException | RuntimeException e) {
                zzv.zzp().OooO0oo("NonagonMobileAdsSettingManager_AppId", e);
            }
        } else {
            strZzq = "";
        }
        boolean z = true;
        String str2 = true == TextUtils.isEmpty(strZzq) ? str : strZzq;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00OoO0)).booleanValue();
        C2148v6 c2148v6 = AbstractC1448c7.f17788o0000OOO;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) zzbe.zzc().OooO00o(c2148v6)).booleanValue();
        if (((Boolean) zzbe.zzc().OooO00o(c2148v6)).booleanValue()) {
            runnableC1688iq = new RunnableC1688iq(this, (Runnable) Oooo0o.OooO0OO.o000O0oO(oooO0O0), 1);
        } else {
            runnableC1688iq = null;
            z = zBooleanValue2;
        }
        RunnableC1688iq runnableC1688iq2 = runnableC1688iq;
        if (z) {
            zzv.zza().zza(this.f20644OooOo0O, this.f20645OooOo0o, str2, runnableC1688iq2, this.f20654Oooo000, this.f20653Oooo0, this.f20658Oooo0OO);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(zzdl zzdlVar) {
        this.f20651OooOooO.OooO0Oo(zzdlVar, o30.f22324OooOo0o);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(Oooo0o.OooO0O0 oooO0O0, String str) {
        if (oooO0O0 == null) {
            zzo.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0);
        if (context == null) {
            zzo.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        zzau zzauVar = new zzau(context);
        zzauVar.zzn(str);
        zzauVar.zzo(this.f20645OooOo0o.afmaVersion);
        zzauVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(InterfaceC2156ve interfaceC2156ve) {
        this.f20655Oooo00O.OooOo0O(interfaceC2156ve);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzp(boolean z) {
        zzv.zzs().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzq(float f) {
        zzv.zzs().zzd(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzr(String str) {
        AbstractC1448c7.OooO00o(this.f20644OooOo0O);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00OoO0)).booleanValue()) {
                zzv.zza().zza(this.f20644OooOo0O, this.f20645OooOo0o, str, null, this.f20654Oooo000, null, null);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(InterfaceC2265yc interfaceC2265yc) {
        d30 d30Var = this.f20648OooOoOO;
        d30Var.getClass();
        d30Var.f18145OooO0o0.addListener(new wp0(25, d30Var, interfaceC2265yc), d30Var.f18148OooOO0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(String str) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOoo0)).booleanValue()) {
            zzv.zzp().f23634OooO0oO = str;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(zzfv zzfvVar) {
        C2162vk c2162vk = this.f20650OooOoo0;
        Context context = this.f20644OooOo0O;
        c2162vk.getClass();
        ((C1904ok) ((p31) C2051sk.OooOo00(context).f24100OooOoO0).zzb()).OooO00o(-1, System.currentTimeMillis());
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17940oo0o0Oo)).booleanValue() && c2162vk.OooO0o0(context) && C2162vk.OooO0oO(context)) {
            synchronized (c2162vk.f24983OooO) {
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized boolean zzv() {
        return zzv.zzs().zze();
    }
}
