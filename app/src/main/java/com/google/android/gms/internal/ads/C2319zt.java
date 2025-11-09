package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbk;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.zt */
/* loaded from: classes2.dex */
public final class C2319zt implements InterfaceC2173vv, InterfaceC1584fx {

    /* renamed from: OooOo, reason: collision with root package name */
    public final VersionInfoParcel f26378OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f26379OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final vd0 f26380OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final d30 f26381OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final zzj f26382OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final nf0 f26383OooOoOO;

    public C2319zt(Context context, vd0 vd0Var, VersionInfoParcel versionInfoParcel, zzj zzjVar, d30 d30Var, nf0 nf0Var) {
        this.f26379OooOo0O = context;
        this.f26380OooOo0o = vd0Var;
        this.f26378OooOo = versionInfoParcel;
        this.f26382OooOoO0 = zzjVar;
        this.f26381OooOoO = d30Var;
        this.f26383OooOoOO = nf0Var;
    }

    public final void OooO00o() throws JSONException {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00OoO0)).booleanValue()) {
            vd0 vd0Var = this.f26380OooOo0o;
            C1867nl c1867nlZzg = this.f26382OooOoO0.zzg();
            zzv.zza().zzc(this.f26379OooOo0O, this.f26378OooOo, vd0Var.f24955OooO0o, c1867nlZzg, this.f26383OooOoOO);
        }
        this.f26381OooOoO.OooO0O0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void OoooO0(C2197wi c2197wi) throws JSONException {
        OooO00o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void oo000o(rd0 rd0Var) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1584fx
    public final void zze(zzbk zzbkVar) throws JSONException {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00OoO0o)).booleanValue()) {
            OooO00o();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1584fx
    public final void zzf(String str) {
    }
}
