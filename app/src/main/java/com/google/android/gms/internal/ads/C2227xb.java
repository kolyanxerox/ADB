package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzaa;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xb */
/* loaded from: classes2.dex */
public final class C2227xb implements zzaa {

    /* renamed from: OooO00o, reason: collision with root package name */
    public boolean f25594OooO00o = false;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f25595OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ zza f25596OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ HashMap f25597OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Map f25598OooO0o0;

    public C2227xb(boolean z, zza zzaVar, HashMap map, Map map2) {
        this.f25595OooO0O0 = z;
        this.f25596OooO0OO = zzaVar;
        this.f25597OooO0Oo = map;
        this.f25598OooO0o0 = map2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zza(boolean z) {
        if (this.f25594OooO00o) {
            return;
        }
        zza zzaVar = this.f25596OooO0OO;
        if (z && this.f25595OooO0O0) {
            ((InterfaceC1401ax) zzaVar).Oooo000();
        }
        this.f25594OooO00o = true;
        String str = (String) this.f25598OooO0o0.get("event_id");
        Boolean boolValueOf = Boolean.valueOf(z);
        HashMap map = this.f25597OooO0Oo;
        map.put(str, boolValueOf);
        ((InterfaceC1675id) zzaVar).OooO0o("openIntentAsync", map);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzb(int i) {
    }
}
