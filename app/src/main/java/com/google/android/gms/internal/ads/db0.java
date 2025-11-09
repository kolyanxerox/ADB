package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class db0 implements kp0, g51 {

    /* renamed from: OooOo */
    public final Object f18224OooOo;

    /* renamed from: OooOo0O */
    public boolean f18225OooOo0O;

    /* renamed from: OooOo0o */
    public boolean f18226OooOo0o;

    /* renamed from: OooOoO */
    public Object f18227OooOoO;

    /* renamed from: OooOoO0 */
    public final Object f18228OooOoO0;

    /* renamed from: OooOoOO */
    public Object f18229OooOoOO;

    public /* synthetic */ db0(eb0 eb0Var, String str, List list, Bundle bundle, boolean z, boolean z2) {
        this.f18224OooOo = eb0Var;
        this.f18228OooOoO0 = str;
        this.f18227OooOoO = list;
        this.f18229OooOoOO = bundle;
        this.f18225OooOo0O = z;
        this.f18226OooOo0o = z2;
    }

    @Override // com.google.android.gms.internal.ads.g51
    public void OooO00o(C2260y7 c2260y7) {
        g51 g51Var = (g51) this.f18229OooOoOO;
        if (g51Var != null) {
            g51Var.OooO00o(c2260y7);
            c2260y7 = ((g51) this.f18229OooOoOO).zzc();
        }
        ((c61) this.f18224OooOo).OooO00o(c2260y7);
    }

    @Override // com.google.android.gms.internal.ads.g51
    public long zza() {
        if (this.f18225OooOo0O) {
            return ((c61) this.f18224OooOo).zza();
        }
        g51 g51Var = (g51) this.f18229OooOoOO;
        g51Var.getClass();
        return g51Var.zza();
    }

    @Override // com.google.android.gms.internal.ads.g51
    public C2260y7 zzc() {
        g51 g51Var = (g51) this.f18229OooOoOO;
        return g51Var != null ? g51Var.zzc() : ((c61) this.f18224OooOo).f17708OooOoO0;
    }

    @Override // com.google.android.gms.internal.ads.g51
    public boolean zzj() {
        if (this.f18225OooOo0O) {
            return false;
        }
        g51 g51Var = (g51) this.f18229OooOoOO;
        g51Var.getClass();
        return g51Var.zzj();
    }

    public db0(b51 b51Var) {
        this.f18228OooOoO0 = b51Var;
        c61 c61Var = new c61();
        c61Var.f17708OooOoO0 = C2260y7.f25859OooO0Oo;
        this.f18224OooOo = c61Var;
        this.f18225OooOo0O = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.kp0
    /* renamed from: zza */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o00000oO.OooOOO mo13700zza() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.db0.mo13700zza():o00000oO.OooOOO");
    }
}
