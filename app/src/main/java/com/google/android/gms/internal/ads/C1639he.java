package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.he */
/* loaded from: classes2.dex */
public final class C1639he implements InterfaceC1380ac {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final C2155vd f19714OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C2274yl f19715OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ C1676ie f19716OooO0OO;

    public C1639he(C1676ie c1676ie, C2155vd c2155vd, C2274yl c2274yl) {
        this.f19716OooO0OO = c1676ie;
        this.f19714OooO00o = c2155vd;
        this.f19715OooO0O0 = c2274yl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1380ac
    public final void OooO00o(JSONObject jSONObject) {
        C2155vd c2155vd = this.f19714OooO00o;
        C2274yl c2274yl = this.f19715OooO0O0;
        try {
            try {
                c2274yl.zzc(((InterfaceC1455ce) this.f19716OooO0OO.f20029OooO0OO).OooO0Oo(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                c2274yl.zzd(e);
            }
        } finally {
            c2155vd.OooOO0o();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1380ac
    public final void zza(String str) {
        C2155vd c2155vd = this.f19714OooO00o;
        C2274yl c2274yl = this.f19715OooO0O0;
        try {
            if (str == null) {
                c2274yl.zzd(new C1382ae());
            } else {
                c2274yl.zzd(new C1382ae(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            c2155vd.OooOO0o();
            throw th;
        }
        c2155vd.OooOO0o();
    }
}
