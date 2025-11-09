package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

/* renamed from: com.google.android.gms.internal.ads.my */
/* loaded from: classes2.dex */
public final class C1843my implements InterfaceC1481d3 {

    /* renamed from: OooOo0O */
    public final /* synthetic */ String f21361OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ C1917oy f21362OooOo0o;

    public C1843my(C1917oy c1917oy, String str) {
        this.f21361OooOo0O = str;
        this.f21362OooOo0o = c1917oy;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1481d3
    public final void Ooooo00(C1444c3 c1444c3) {
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17832o000Ooo0)).booleanValue()) {
            if (c1444c3.f17668OooOO0) {
                C1917oy c1917oy = this.f21362OooOo0o;
                if (c1917oy.OooOo0 != null) {
                    c1917oy.f23158OooOooo.put(this.f21361OooOo0O, Boolean.TRUE);
                    C1917oy c1917oy2 = this.f21362OooOo0o;
                    ?? r0 = c1917oy2.OooOo0;
                    if (r0 == 0) {
                        return;
                    }
                    c1917oy2.OooO0O0(r0.zzf(), this.f21362OooOo0o.OooOo0.zzl(), this.f21362OooOo0o.OooOo0.zzm(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (c1444c3.f17668OooOO0) {
                    C1917oy c1917oy3 = this.f21362OooOo0o;
                    if (c1917oy3.OooOo0 != null) {
                        c1917oy3.f23158OooOooo.put(this.f21361OooOo0O, Boolean.TRUE);
                        C1917oy c1917oy4 = this.f21362OooOo0o;
                        ?? r02 = c1917oy4.OooOo0;
                        if (r02 == 0) {
                        } else {
                            c1917oy4.OooO0O0(r02.zzf(), this.f21362OooOo0o.OooOo0.zzl(), this.f21362OooOo0o.OooOo0.zzm(), true);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
