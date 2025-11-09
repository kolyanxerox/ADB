package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class x00 implements Callable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final h20 f25483OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final zza f25484OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Context f25485OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final Executor f25486OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final s50 f25487OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final C1663i1 f25488OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final hg0 f25489OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final VersionInfoParcel f25490OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final x50 f25491OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final xd0 f25492OooOooo;

    public x00(Context context, Executor executor, C1663i1 c1663i1, VersionInfoParcel versionInfoParcel, zza zzaVar, s50 s50Var, hg0 hg0Var, h20 h20Var, x50 x50Var, xd0 xd0Var) {
        this.f25485OooOo0o = context;
        this.f25486OooOoO = executor;
        this.f25488OooOoOO = c1663i1;
        this.f25490OooOoo0 = versionInfoParcel;
        this.f25484OooOo0O = zzaVar;
        this.f25487OooOoO0 = s50Var;
        this.f25489OooOoo = hg0Var;
        this.f25483OooOo = h20Var;
        this.f25491OooOooO = x50Var;
        this.f25492OooOooo = xd0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        z00 z00Var = new z00(this);
        synchronized (z00Var) {
            ep0 ep0VarOoooooo = ii0.Ooooooo(ii0.Oooooo(new oO000O0O(z00Var.f26053OooO0OO, z00Var.f26055OooO0o, z00Var.f26057OooO0oO, z00Var.f26052OooO0O0, z00Var.f26060OooOO0O, z00Var.OooOO0o, (String) zzbe.zzc().OooO00o(AbstractC1448c7.f17914o00Oo00o)), AbstractC2200wl.f25325OooO0o), new C2123ui(z00Var, 1), z00Var.f26056OooO0o0);
            z00Var.f26061OooOOO0 = ep0VarOoooooo;
            ze0.OooOOo0(ep0VarOoooooo, "NativeJavascriptExecutor.initializeEngine");
        }
        return z00Var;
    }
}
