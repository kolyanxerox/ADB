package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;

/* loaded from: classes2.dex */
public final class y20 implements q20 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long f25838OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final sj0 f25839OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final hd0 f25840OooO0OO;

    public y20(long j, Context context, sj0 sj0Var, C2130up c2130up, String str) {
        this.f25838OooO00o = j;
        this.f25839OooO0O0 = sj0Var;
        this.f25840OooO0OO = (hd0) ((p31) new C2249xx(c2130up.f24676OooO0O0, context, str).f25813OooOo).zzb();
    }

    @Override // com.google.android.gms.internal.ads.q20
    public final void OooO00o(zzm zzmVar) {
        try {
            this.f25840OooO0OO.zzf(zzmVar, new w20(this));
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.q20
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.q20
    public final void zzc() {
        hd0 hd0Var = this.f25840OooO0OO;
        try {
            hd0Var.zzk(new x20(this));
            hd0Var.zzm(new Oooo0o.OooO0OO(null));
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
