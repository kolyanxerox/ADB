package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.hy */
/* loaded from: classes2.dex */
public final class C1659hy implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f19875OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final p31 f19876OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final p31 f19877OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final p31 f19878OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final p31 f19879OooO0o0;

    public /* synthetic */ C1659hy(p31 p31Var, p31 p31Var2, p31 p31Var3, p31 p31Var4, int i) {
        this.f19875OooO00o = i;
        this.f19876OooO0O0 = p31Var;
        this.f19877OooO0OO = p31Var2;
        this.f19878OooO0Oo = p31Var3;
        this.f19879OooO0o0 = p31Var4;
    }

    public OooOOOo.o0ooOOo OooO00o() {
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f19876OooO0O0.zzb();
        InterfaceC1506dt interfaceC1506dt = (InterfaceC1506dt) this.f19877OooO0OO.zzb();
        x70 x70Var = (x70) this.f19878OooO0Oo.zzb();
        fg0 fg0Var = (fg0) this.f19879OooO0o0.zzb();
        OooOOOo.o0ooOOo o0ooooo = new OooOOOo.o0ooOOo();
        o0ooooo.f13436OooO0oO = new jq0();
        o0ooooo.f13430OooO00o = new AtomicBoolean();
        o0ooooo.f13431OooO0O0 = c2163vl;
        o0ooooo.f13432OooO0OO = scheduledExecutorService;
        o0ooooo.f13433OooO0Oo = interfaceC1506dt;
        o0ooooo.f13435OooO0o0 = x70Var;
        o0ooooo.f13434OooO0o = fg0Var;
        return o0ooooo;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f19875OooO00o) {
            case 0:
                C1408b3 c1408b3 = (C1408b3) this.f19876OooO0O0.zzb();
                Executor executor = (Executor) this.f19877OooO0OO.zzb();
                Context context = (Context) this.f19878OooO0Oo.zzb();
                return new C2058sr(executor, new C1836mr(context, c1408b3), (Oooo0OO.o00Ooo) this.f19879OooO0o0.zzb());
            case 1:
                return new i00((Executor) this.f19876OooO0O0.zzb(), (C2058sr) this.f19877OooO0OO.zzb(), (C2285yw) this.f19878OooO0Oo.zzb(), (C1468cr) this.f19879OooO0o0.zzb());
            default:
                return OooO00o();
        }
    }
}
