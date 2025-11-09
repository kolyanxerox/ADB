package com.google.android.gms.internal.ads;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.rs */
/* loaded from: classes2.dex */
public final class C2022rs extends AbstractC1433bs {

    /* renamed from: OooOO0, reason: collision with root package name */
    public final InterfaceC2152va f23935OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final o000oOoO f23936OooOO0O;
    public final Executor OooOO0o;

    public C2022rs(OooOOOo.o0ooOOo o0ooooo, InterfaceC2152va interfaceC2152va, o000oOoO o000oooo2, Executor executor) {
        super(o0ooooo);
        this.f23935OooOO0 = interfaceC2152va;
        this.f23936OooOO0O = o000oooo2;
        this.OooOO0o = executor;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1397at
    public final void OooO00o() {
        this.OooOO0o.execute(new wp0(19, this, new RunnableC1442c1(new AtomicReference(this.f23936OooOO0O), 22)));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1433bs
    public final int OooO0O0() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1433bs
    public final int OooO0OO() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1433bs
    public final View OooO0Oo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1433bs
    public final ld0 OooO0o() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1433bs
    public final zzeb OooO0o0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1433bs
    public final ld0 OooO0oO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1433bs
    public final void OooO0oo() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1433bs
    public final void OooO(FrameLayout frameLayout, zzs zzsVar) {
    }
}
