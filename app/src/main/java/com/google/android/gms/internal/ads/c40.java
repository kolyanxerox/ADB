package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbk;

/* loaded from: classes2.dex */
public final class c40 implements InterfaceC2173vv, InterfaceC1584fx {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f17676OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final h20 f17677OooOo0o;

    public c40(Context context, h20 h20Var) {
        this.f17676OooOo0O = context;
        this.f17677OooOo0o = h20Var;
    }

    public final void OooO00o(Context context) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o00oO)).booleanValue()) {
            AbstractC2200wl.f25321OooO00o.execute(new wp0(28, this, context));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void OoooO0(C2197wi c2197wi) {
        OooO00o(this.f17676OooOo0O);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void oo000o(rd0 rd0Var) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1584fx
    public final void zze(zzbk zzbkVar) {
        OooO00o(this.f17676OooOo0O);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1584fx
    public final void zzf(String str) {
    }
}
