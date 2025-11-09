package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzv;

/* renamed from: com.google.android.gms.internal.ads.ol */
/* loaded from: classes2.dex */
public final class C1905ol extends zzb {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C1978ql f23003OooO0O0;

    public C1905ol(C1978ql c1978ql) {
        this.f23003OooO0O0 = c1978ql;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        C1978ql c1978ql = this.f23003OooO0O0;
        C1386ai c1386ai = new C1386ai(c1978ql.f23633OooO0o0, c1978ql.f23632OooO0o.afmaVersion);
        synchronized (this.f23003OooO0O0.f23628OooO00o) {
            try {
                zzv.zze();
                C1485d7.OooO00o(this.f23003OooO0O0.f23635OooO0oo, c1386ai);
            } catch (IllegalArgumentException e) {
                zzo.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
