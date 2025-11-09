package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbk;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.wt */
/* loaded from: classes2.dex */
public final class C2208wt implements InterfaceC2173vv, InterfaceC1584fx {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Context f25399OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public OooOOo0.o0OOO0o f25400OooOo0O;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final VersionInfoParcel f25402OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final nf0 f25403OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final cq0 f25404OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public boolean f25406OooOoo0 = false;

    /* renamed from: OooOoo, reason: collision with root package name */
    public boolean f25405OooOoo = false;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final AtomicBoolean f25401OooOo0o = new AtomicBoolean();

    public C2208wt(Context context, nf0 nf0Var, VersionInfoParcel versionInfoParcel, cq0 cq0Var) {
        this.f25399OooOo = context;
        this.f25403OooOoO0 = nf0Var;
        this.f25402OooOoO = versionInfoParcel;
        this.f25404OooOoOO = cq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO00o() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f25401OooOo0o
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lb
            goto L9d
        Lb:
            com.google.android.gms.internal.ads.oOo0o00 r0 = com.google.android.gms.internal.ads.AbstractC1633h8.f19648OooOO0
            java.lang.Object r0 = r0.OooOOO()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 2
            if (r0 == 0) goto L1c
        L1a:
            r3 = r2
            goto L66
        L1c:
            com.google.android.gms.internal.ads.oOo0o00 r0 = com.google.android.gms.internal.ads.AbstractC1633h8.f19649OooOO0O
            java.lang.Object r0 = r0.OooOOO()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 3
            if (r0 == 0) goto L2c
            goto L66
        L2c:
            com.google.android.gms.internal.ads.oOo0o00 r0 = com.google.android.gms.internal.ads.AbstractC1633h8.f19639OooO
            java.lang.Object r0 = r0.OooOOO()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c
        L3a:
            r3 = r1
            goto L66
        L3c:
            com.google.android.gms.internal.ads.ql r0 = com.google.android.gms.ads.internal.zzv.zzp()
            com.google.android.gms.ads.internal.util.zzj r0 = r0.OooO0Oo()
            com.google.android.gms.internal.ads.nl r0 = r0.zzg()
            java.lang.String r0 = r0.f21508OooO0o0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3a
            r4.<init>(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "local_flag_write"
            java.lang.String r0 = r4.optString(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r4 = "client"
            boolean r4 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r4 == 0) goto L5e
            goto L1a
        L5e:
            java.lang.String r4 = "service"
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r0 == 0) goto L3a
        L66:
            int r3 = r3 + (-1)
            com.google.android.gms.internal.ads.nf0 r0 = r5.f25403OooOoO0
            android.content.Context r4 = r5.f25399OooOo
            if (r3 == r1) goto L7e
            if (r3 == r2) goto L71
            goto L9d
        L71:
            com.google.android.gms.internal.ads.be r2 = com.google.android.gms.ads.internal.zzv.zzg()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()
            com.google.android.gms.internal.ads.ge r0 = r2.OooO0O0(r4, r3, r0)
            goto L8a
        L7e:
            com.google.android.gms.internal.ads.be r2 = com.google.android.gms.ads.internal.zzv.zzg()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()
            com.google.android.gms.internal.ads.ge r0 = r2.OooO00o(r4, r3, r0)
        L8a:
            java.lang.String r2 = "google.afma.sdkConstants.getSdkConstants"
            com.google.android.gms.internal.ads.rd r3 = com.google.android.gms.internal.ads.AbstractC1565fe.f18933OooO0O0
            com.google.android.gms.internal.ads.ie r0 = r0.OooO00o(r2, r3, r3)
            OooOOo0.o0OOO0o r2 = new OooOOo0.o0OOO0o
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r5.f25402OooOoO
            r2.<init>(r4, r0, r3)
            r5.f25400OooOo0O = r2
            r5.f25406OooOoo0 = r1
        L9d:
            boolean r0 = r5.f25406OooOoo0
            if (r0 != 0) goto La2
            goto Lcd
        La2:
            OooOOo0.o0OOO0o r0 = r5.f25400OooOo0O
            if (r0 == 0) goto Lcd
            o00000oO.OooOOO r0 = r0.OooOo0O()
            boolean r1 = r5.f25405OooOoo
            if (r1 != 0) goto Lc8
            com.google.android.gms.internal.ads.oOo0o00 r1 = com.google.android.gms.internal.ads.AbstractC1413b8.f17431OooO
            java.lang.Object r1 = r1.OooOOO()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lc8
            com.google.android.gms.internal.ads.c1 r1 = new com.google.android.gms.internal.ads.c1
            r2 = 24
            r1.<init>(r5, r2)
            com.google.android.gms.internal.ads.cq0 r2 = r5.f25404OooOoOO
            r0.addListener(r1, r2)
        Lc8:
            java.lang.String r1 = "persistFlagsClient"
            com.google.android.gms.internal.ads.ze0.OooOOo0(r0, r1)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2208wt.OooO00o():void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void OoooO0(C2197wi c2197wi) {
        OooO00o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void oo000o(rd0 rd0Var) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1584fx
    public final void zze(zzbk zzbkVar) {
        OooO00o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1584fx
    public final void zzf(String str) {
        OooO00o();
    }
}
