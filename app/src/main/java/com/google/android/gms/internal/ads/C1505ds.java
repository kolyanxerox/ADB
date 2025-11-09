package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.ds */
/* loaded from: classes2.dex */
public final class C1505ds extends AbstractC1433bs {

    /* renamed from: OooOO0, reason: collision with root package name */
    public final Context f18396OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final View f18397OooOO0O;
    public final InterfaceC1722jo OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public final InterfaceC2318zs f18398OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final ld0 f18399OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public final C2213wy f18400OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public final C1438bx f18401OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public final Executor f18402OooOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public final n31 f18403OooOOo0;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public zzs f18404OooOOoo;

    public C1505ds(OooOOOo.o0ooOOo o0ooooo, Context context, ld0 ld0Var, View view, InterfaceC1722jo interfaceC1722jo, InterfaceC2318zs interfaceC2318zs, C2213wy c2213wy, C1438bx c1438bx, n31 n31Var, Executor executor) {
        super(o0ooooo);
        this.f18396OooOO0 = context;
        this.f18397OooOO0O = view;
        this.OooOO0o = interfaceC1722jo;
        this.f18399OooOOO0 = ld0Var;
        this.f18398OooOOO = interfaceC2318zs;
        this.f18400OooOOOO = c2213wy;
        this.f18401OooOOOo = c1438bx;
        this.f18403OooOOo0 = n31Var;
        this.f18402OooOOo = executor;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1433bs
    public final void OooO(FrameLayout frameLayout, zzs zzsVar) {
        InterfaceC1722jo interfaceC1722jo;
        if (frameLayout == null || (interfaceC1722jo = this.OooOO0o) == null) {
            return;
        }
        interfaceC1722jo.o0OoOo0(Oooo0oO.o0O0O00.OooO00o(zzsVar));
        frameLayout.setMinimumHeight(zzsVar.zzc);
        frameLayout.setMinimumWidth(zzsVar.zzf);
        this.f18404OooOOoo = zzsVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1397at
    public final void OooO00o() {
        this.f18402OooOOo.execute(new RunnableC1442c1(this, 21));
        super.OooO00o();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1433bs
    public final int OooO0O0() {
        return ((md0) this.f17099OooO00o.f23849OooO0O0.f24096OooOo).f21207OooO0Oo;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1433bs
    public final int OooO0OO() {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.oooOO0)).booleanValue() && this.f17100OooO0O0.f20542Oooooo0) {
            if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0oO0)).booleanValue()) {
                return 0;
            }
        }
        return ((md0) this.f17099OooO00o.f23849OooO0O0.f24096OooOo).f21206OooO0OO;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1433bs
    public final View OooO0Oo() {
        return this.f18397OooOO0O;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1433bs
    public final ld0 OooO0o() {
        zzs zzsVar = this.f18404OooOOoo;
        if (zzsVar != null) {
            return zzsVar.zzi ? new ld0(-3, 0, true) : new ld0(zzsVar.zze, zzsVar.zzb, false);
        }
        kd0 kd0Var = this.f17100OooO0O0;
        if (kd0Var.f20537Ooooo0o) {
            for (String str : kd0Var.f20487OooO00o) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f18397OooOO0O;
            return new ld0(view.getWidth(), view.getHeight(), false);
        }
        return (ld0) kd0Var.f20501OooOOo.get(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1433bs
    public final zzeb OooO0o0() {
        try {
            return this.f18398OooOOO.mo13704zza();
        } catch (yd0 unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1433bs
    public final ld0 OooO0oO() {
        return this.f18399OooOOO0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1433bs
    public final void OooO0oo() {
        this.f18401OooOOOo.zza();
    }
}
