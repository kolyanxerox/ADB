package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class sz0 implements zm0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final zm0 f24210OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public Uri f24211OooOo0o = Uri.EMPTY;

    public sz0(zm0 zm0Var) {
        this.f24210OooOo0O = zm0Var;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final long OooO0Oo(iq0 iq0Var) {
        zm0 zm0Var = this.f24210OooOo0O;
        this.f24211OooOo0o = iq0Var.f20087OooO00o;
        Map map = Collections.EMPTY_MAP;
        try {
            long jOooO0Oo = zm0Var.OooO0Oo(iq0Var);
            Uri uriZzc = zm0Var.zzc();
            if (uriZzc != null) {
                this.f24211OooOo0o = uriZzc;
            }
            zm0Var.zze();
            return jOooO0Oo;
        } catch (Throwable th) {
            Uri uriZzc2 = zm0Var.zzc();
            if (uriZzc2 != null) {
                this.f24211OooOo0o = uriZzc2;
            }
            zm0Var.zze();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void OooO0oo(e01 e01Var) {
        e01Var.getClass();
        this.f24210OooOo0O.OooO0oo(e01Var);
    }

    @Override // com.google.android.gms.internal.ads.q51
    public final int OooOO0(byte[] bArr, int i, int i2) {
        return this.f24210OooOo0O.OooOO0(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final Uri zzc() {
        return this.f24210OooOo0O.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void zzd() {
        this.f24210OooOo0O.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final Map zze() {
        return this.f24210OooOo0O.zze();
    }
}
