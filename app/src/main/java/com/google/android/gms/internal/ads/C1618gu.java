package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gu */
/* loaded from: classes2.dex */
public final class C1618gu {

    /* renamed from: OooO, reason: collision with root package name */
    public final mb0 f19461OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final gf0 f19462OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final VersionInfoParcel f19463OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final ApplicationInfo f19464OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f19465OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final PackageInfo f19466OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f19467OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final n31 f19468OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final String f19469OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final zzj f19470OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final vd0 f19471OooOO0O;
    public final int OooOO0o;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final C1657hw f19472OooOOO0;

    public C1618gu(gf0 gf0Var, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, n31 n31Var, zzj zzjVar, String str2, mb0 mb0Var, vd0 vd0Var, C1657hw c1657hw, int i) {
        this.f19462OooO00o = gf0Var;
        this.f19463OooO0O0 = versionInfoParcel;
        this.f19464OooO0OO = applicationInfo;
        this.f19465OooO0Oo = str;
        this.f19467OooO0o0 = arrayList;
        this.f19466OooO0o = packageInfo;
        this.f19468OooO0oO = n31Var;
        this.f19469OooO0oo = str2;
        this.f19461OooO = mb0Var;
        this.f19470OooOO0 = zzjVar;
        this.f19471OooOO0O = vd0Var;
        this.f19472OooOOO0 = c1657hw;
        this.OooOO0o = i;
    }

    public final df0 OooO00o(Bundle bundle) {
        this.f19472OooOOO0.zza();
        return new s20(this.f19462OooO00o, ef0.SIGNALS, null, gf0.f19331OooO0Oo, Collections.EMPTY_LIST, this.f19461OooO.OooO00o(new C1581fu(new Bundle(), new Bundle()), bundle, this.OooOO0o == 2)).OooO00o();
    }

    public final df0 OooO0O0() {
        Bundle bundle = new Bundle();
        int i = 0;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17849o000oo0O)).booleanValue()) {
            Bundle bundle2 = this.f19471OooOO0O.f24967OooOOoo;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        df0 df0VarOooO00o = OooO00o(bundle);
        ef0 ef0Var = ef0.REQUEST_PARCEL;
        o00000oO.OooOOO[] oooOOOArr = {df0VarOooO00o, (o00000oO.OooOOO) this.f19468OooO0oO.zzb()};
        gf0 gf0Var = this.f19462OooO00o;
        gf0Var.getClass();
        List listAsList = Arrays.asList(oooOOOArr);
        CallableC1544eu callableC1544eu = new CallableC1544eu(this, df0VarOooO00o, bundle, i);
        pm0 pm0Var = rm0.f23913OooOo0o;
        listAsList.getClass();
        rm0 rm0VarOooOOOO = rm0.OooOOOO(listAsList);
        CallableC2074t6 callableC2074t6 = new CallableC2074t6(6);
        C2163vl c2163vl = AbstractC2200wl.f25327OooO0oO;
        pp0 pp0Var = new pp0(rm0VarOooOOOO, true, false);
        pp0Var.f23398Oooo0OO = new op0(pp0Var, callableC2074t6, c2163vl);
        pp0Var.OooOo0o();
        pp0 pp0Var2 = new pp0(rm0VarOooOOOO, true, false);
        pp0Var2.f23398Oooo0OO = new op0(pp0Var2, callableC1544eu, gf0Var.f19332OooO00o);
        pp0Var2.OooOo0o();
        return new s20(gf0Var, ef0Var, null, pp0Var, listAsList, pp0Var2).OooO00o();
    }
}
