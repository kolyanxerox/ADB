package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class j40 implements u40 {

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final Pattern f20174OooO0oo = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: OooO00o, reason: collision with root package name */
    public final C2051sk f20175OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C2163vl f20176OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final vd0 f20177OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final ScheduledExecutorService f20178OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final mf0 f20179OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final m50 f20180OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final Context f20181OooO0oO;

    public j40(Context context, vd0 vd0Var, C2051sk c2051sk, C2163vl c2163vl, ScheduledExecutorService scheduledExecutorService, m50 m50Var, mf0 mf0Var) {
        this.f20181OooO0oO = context;
        this.f20177OooO0OO = vd0Var;
        this.f20175OooO00o = c2051sk;
        this.f20176OooO0O0 = c2163vl;
        this.f20178OooO0Oo = scheduledExecutorService;
        this.f20180OooO0o0 = m50Var;
        this.f20179OooO0o = mf0Var;
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final o00000oO.OooOOO OooO00o(C2197wi c2197wi) {
        o00000oO.OooOOO oooOOOOoooOoO;
        C2051sk c2051sk = this.f20175OooO00o;
        String str = c2197wi.zzd;
        zzv.zzq();
        boolean zZzD = zzs.zzD(str);
        C2163vl c2163vl = (C2163vl) c2051sk.f24096OooOo;
        if (zZzD) {
            oooOOOOoooOoO = ii0.Ooooo00(new v40(1));
        } else {
            oooOOOOoooOoO = ii0.OoooOoO(((C2163vl) c2051sk.f24098OooOo0o).OooO0O0(new CallableC2031s0(5, c2051sk, c2197wi)), ExecutionException.class, new C2094tq(2), c2163vl);
        }
        ko0 ko0VarOoooOoO = ii0.OoooOoO(oooOOOOoooOoO, v40.class, new e40(c2051sk, c2197wi, Binder.getCallingUid(), 0), c2163vl);
        jf0 jf0VarOooO0oO = ze0.OooO0oO(this.f20181OooO0oO, 11);
        af0.OoooO00(ko0VarOoooOoO, jf0VarOooO0oO);
        o00000oO.OooOOO oooOOOOoOO = ii0.ooOO(ko0VarOoooOoO, new C2043sc(this, 7), this.f20176OooO0O0);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oOo0O)).booleanValue()) {
            oooOOOOoOO = ii0.OoooOoO(ii0.o00Oo0(oooOOOOoOO, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o00oOo0o)).intValue(), TimeUnit.SECONDS, this.f20178OooO0Oo), TimeoutException.class, new C2094tq(3), AbstractC2200wl.f25327OooO0oO);
        }
        af0.OoooooO(oooOOOOoOO, this.f20179OooO0o, jf0VarOooO0oO, false);
        oooOOOOoOO.addListener(new wp0(0, oooOOOOoOO, new C1847n1(this, 20)), AbstractC2200wl.f25327OooO0oO);
        return oooOOOOoOO;
    }
}
