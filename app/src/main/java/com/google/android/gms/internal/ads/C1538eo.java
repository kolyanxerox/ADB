package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;

/* renamed from: com.google.android.gms.internal.ads.eo */
/* loaded from: classes2.dex */
public final class C1538eo extends AbstractC1684im {

    /* renamed from: OooOo, reason: collision with root package name */
    public final C2090tm f18633OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public C1831mm f18634OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public C1898oe f18635OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public boolean f18636OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public int f18637OooOoo0;

    public C1538eo(Context context, C2090tm c2090tm) {
        super(context);
        this.f18637OooOoo0 = 1;
        this.f18636OooOoOO = false;
        this.f18633OooOo = c2090tm;
        c2090tm.OooO00o(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final int OooO() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final int OooOO0() {
        return OooOoo() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final int OooOO0O() {
        return OooOoo() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final int OooOO0o() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final long OooOOO() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final int OooOOO0() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final long OooOOOO() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final long OooOOOo() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOOo() {
        zze.zza("AdImmersivePlayerView pause");
        if (OooOoo() && this.f18635OooOoO0.f22978OooO00o.get()) {
            this.f18635OooOoO0.f22978OooO00o.set(false);
            OooOooO(5);
            zzs.zza.post(new RunnableC1465co(this, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final String OooOOo0() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOOoo() {
        zze.zza("AdImmersivePlayerView play");
        if (OooOoo()) {
            this.f18635OooOoO0.f22978OooO00o.set(true);
            OooOooO(4);
            this.f20061OooOo0O.f23374OooO0OO = true;
            zzs.zza.post(new RunnableC1465co(this, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOo(float f, float f2) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOo0(C1831mm c1831mm) {
        this.f18634OooOoO = c1831mm;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOo00(int i) {
        zze.zza("AdImmersivePlayerView seek " + i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOo0O(String str) {
        if (str != null) {
            Uri.parse(str).toString();
            this.f18635OooOoO0 = new C1898oe(1);
            OooOooO(3);
            zzs.zza.post(new RunnableC1465co(this, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOo0o() {
        zze.zza("AdImmersivePlayerView stop");
        C1898oe c1898oe = this.f18635OooOoO0;
        if (c1898oe != null) {
            c1898oe.f22978OooO00o.set(false);
            this.f18635OooOoO0 = null;
            OooOooO(1);
        }
        this.f18633OooOo.OooO0OO();
    }

    public final boolean OooOoo() {
        int i = this.f18637OooOoo0;
        return (i == 1 || i == 2 || this.f18635OooOoO0 == null) ? false : true;
    }

    public final void OooOooO(int i) {
        C2164vm c2164vm = this.f20062OooOo0o;
        C2090tm c2090tm = this.f18633OooOo;
        if (i == 4) {
            c2090tm.OooO0O0();
            c2164vm.f24999OooO0Oo = true;
            c2164vm.OooO00o();
        } else if (this.f18637OooOoo0 == 4) {
            c2090tm.f24343OooOOO0 = false;
            c2164vm.f24999OooO0Oo = false;
            c2164vm.OooO00o();
        }
        this.f18637OooOoo0 = i;
    }

    @Override // android.view.View
    public final String toString() {
        return OooO0oO.OooOo.OooOoo(C1538eo.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2127um
    public final void zzn() {
        if (this.f18635OooOoO0 != null) {
            this.f20062OooOo0o.getClass();
        }
    }
}
