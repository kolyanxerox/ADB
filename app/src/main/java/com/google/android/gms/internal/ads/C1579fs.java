package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.zzv;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.fs */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1579fs implements InterfaceC1656hv {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ VersionInfoParcel f19116OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f19117OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Context f19118OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ vd0 f19119OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ kd0 f19120OooOoO0;

    public /* synthetic */ C1579fs(Context context, VersionInfoParcel versionInfoParcel, kd0 kd0Var, vd0 vd0Var, int i) {
        this.f19117OooOo0O = i;
        this.f19118OooOo0o = context;
        this.f19116OooOo = versionInfoParcel;
        this.f19120OooOoO0 = kd0Var;
        this.f19119OooOoO = vd0Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1656hv
    public final void OoooOOO() {
        switch (this.f19117OooOo0O) {
            case 0:
                zzay zzayVarZzt = zzv.zzt();
                JSONObject jSONObject = this.f19120OooOoO0.f20511OooOoo;
                zzayVarZzt.zzn(this.f19118OooOo0o, this.f19116OooOo.afmaVersion, jSONObject.toString(), this.f19119OooOoO.f24955OooO0o);
                break;
            default:
                zzay zzayVarZzt2 = zzv.zzt();
                JSONObject jSONObject2 = this.f19120OooOoO0.f20511OooOoo;
                zzayVarZzt2.zzn(this.f19118OooOo0o, this.f19116OooOo.afmaVersion, jSONObject2.toString(), this.f19119OooOoO.f24955OooO0o);
                break;
        }
    }
}
