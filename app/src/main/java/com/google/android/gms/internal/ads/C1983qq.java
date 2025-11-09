package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzj;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.qq */
/* loaded from: classes2.dex */
public final class C1983qq implements InterfaceC1946pq {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f23675OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final zzj f23676OooO0O0;

    public /* synthetic */ C1983qq(zzj zzjVar, int i) {
        this.f23675OooO00o = i;
        this.f23676OooO0O0 = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1946pq
    public final void OooO00o(HashMap map) {
        switch (this.f23675OooO00o) {
            case 0:
                this.f23676OooO0O0.zzu(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
                break;
            default:
                this.f23676OooO0O0.zzv(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
                break;
        }
    }
}
