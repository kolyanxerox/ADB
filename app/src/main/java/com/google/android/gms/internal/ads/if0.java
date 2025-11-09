package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class if0 implements InterfaceC1989qw, InterfaceC2283yu, InterfaceC2100tw {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final mf0 f20038OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final jf0 f20039OooOo0o;

    public if0(Context context, mf0 mf0Var) {
        this.f20038OooOo0O = mf0Var;
        this.f20039OooOo0o = ze0.OooO0oO(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2283yu
    public final void OooO0o0(zze zzeVar) {
        if (((Boolean) AbstractC1449c8.f17951OooO0Oo.OooOOO()).booleanValue()) {
            String string = zzeVar.zza().toString();
            jf0 jf0Var = this.f20039OooOo0o;
            jf0Var.OooO0o0(string);
            jf0Var.OooOO0(false);
            this.f20038OooOo0O.OooO00o(jf0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2100tw
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2100tw
    public final void zzb() {
        if (((Boolean) AbstractC1449c8.f17951OooO0Oo.OooOOO()).booleanValue()) {
            jf0 jf0Var = this.f20039OooOo0o;
            jf0Var.OooOO0(true);
            this.f20038OooOo0O.OooO00o(jf0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1989qw
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1989qw
    public final void zzl() {
        if (((Boolean) AbstractC1449c8.f17951OooO0Oo.OooOOO()).booleanValue()) {
            this.f20039OooOo0o.zzi();
        }
    }
}
