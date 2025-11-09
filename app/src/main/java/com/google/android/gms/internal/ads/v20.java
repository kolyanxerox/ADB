package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;

/* loaded from: classes2.dex */
public final class v20 implements q20 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long f24838OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final f90 f24839OooO0O0;

    public v20(long j, Context context, sj0 sj0Var, C2130up c2130up, String str) {
        this.f24838OooO00o = j;
        C2130up c2130up2 = c2130up.f24676OooO0O0;
        zzs zzsVar = new zzs();
        str.getClass();
        f90 f90Var = (f90) ((p31) new p80(c2130up2, context, str, zzsVar).f23242OooOo0o).zzb();
        this.f24839OooO0O0 = f90Var;
        f90Var.zzD(new u20(this, sj0Var));
    }

    @Override // com.google.android.gms.internal.ads.q20
    public final void OooO00o(zzm zzmVar) {
        this.f24839OooO0O0.zzab(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.q20
    public final void zza() {
        this.f24839OooO0O0.zzx();
    }

    @Override // com.google.android.gms.internal.ads.q20
    public final void zzc() {
        this.f24839OooO0O0.zzW(new Oooo0o.OooO0OO(null));
    }
}
