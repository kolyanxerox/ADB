package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zb */
/* loaded from: classes2.dex */
public final class C2301zb implements InterfaceC1380ac {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f26140OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C2274yl f26141OooO0O0;

    public /* synthetic */ C2301zb(C2274yl c2274yl, int i) {
        this.f26140OooO00o = i;
        this.f26141OooO0O0 = c2274yl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1380ac
    public final void OooO00o(JSONObject jSONObject) {
        switch (this.f26140OooO00o) {
            case 0:
                this.f26141OooO0O0.zzc(jSONObject);
                break;
            default:
                C2274yl c2274yl = this.f26141OooO0O0;
                try {
                    c2274yl.zzc(jSONObject);
                    break;
                } catch (IllegalStateException unused) {
                    return;
                } catch (JSONException e) {
                    c2274yl.zzd(e);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1380ac
    public final void zza(String str) {
        switch (this.f26140OooO00o) {
            case 0:
                this.f26141OooO0O0.zzd(new C1382ae(str));
                break;
            default:
                C2274yl c2274yl = this.f26141OooO0O0;
                try {
                    if (str == null) {
                        c2274yl.zzd(new C1382ae());
                    } else {
                        c2274yl.zzd(new C1382ae(str));
                    }
                    break;
                } catch (IllegalStateException unused) {
                    return;
                }
        }
    }
}
