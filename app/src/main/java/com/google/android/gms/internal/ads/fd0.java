package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class fd0 {

    /* renamed from: OooO, reason: collision with root package name */
    public o00000oO.OooOOO f18923OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f18924OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f18925OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final C2130up f18926OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final bd0 f18927OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final sd0 f18928OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final tc0 f18929OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final nf0 f18930OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final ud0 f18931OooO0oo;

    public fd0(Context context, Executor executor, C2130up c2130up, tc0 tc0Var, bd0 bd0Var, ud0 ud0Var, sd0 sd0Var) {
        this.f18924OooO00o = context;
        this.f18925OooO0O0 = executor;
        this.f18926OooO0OO = c2130up;
        this.f18929OooO0o0 = tc0Var;
        this.f18927OooO0Oo = bd0Var;
        this.f18931OooO0oo = ud0Var;
        this.f18928OooO0o = sd0Var;
        this.f18930OooO0oO = c2130up.OooOoo();
    }

    public final boolean OooO00o(zzm zzmVar, String str, ze0 ze0Var, h90 h90Var) {
        mf0 mf0Var;
        Executor executor = this.f18925OooO0O0;
        if (str == null) {
            zzo.zzg("Ad unit ID should not be null for rewarded video ad.");
            executor.execute(new b30(this, 11));
            return false;
        }
        o00000oO.OooOOO oooOOO = this.f18923OooO;
        if (oooOOO != null && !oooOOO.isDone()) {
            return false;
        }
        boolean zBooleanValue = ((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue();
        tc0 tc0Var = this.f18929OooO0o0;
        Object obj = null;
        if (!zBooleanValue || tc0Var.zzd() == null) {
            mf0Var = null;
        } else {
            mf0Var = (mf0) ((C1577fq) ((i10) tc0Var.zzd())).f18998OooO0oO.zzb();
            mf0Var.OooO(5);
            mf0Var.OooO0O0(zzmVar.zzp);
            mf0Var.OooO0o(zzmVar.zzm);
        }
        boolean z = zzmVar.zzf;
        Context context = this.f18924OooO00o;
        ze0.OooO(context, z);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0O0)).booleanValue() && zzmVar.zzf) {
            ((p30) this.f18926OooO0OO.f24694OooOo0O.zzb()).OooO0o0(true);
        }
        Pair pair = new Pair("api-call", Long.valueOf(zzmVar.zzz));
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        Bundle bundleOooO0oO = af0.OooO0oO(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        ud0 ud0Var = this.f18931OooO0oo;
        ud0Var.f24627OooO0OO = str;
        ud0Var.f24626OooO0O0 = zzs.zzd();
        ud0Var.f24625OooO00o = zzmVar;
        ud0Var.f24642OooOo00 = bundleOooO0oO;
        vd0 vd0VarOooO00o = ud0Var.OooO00o();
        jf0 jf0VarOooOoO0 = ze0.OooOoO0(context, af0.OoooOoO(vd0VarOooO00o), 5, zzmVar);
        dd0 dd0Var = new dd0();
        dd0Var.f18236OooO00o = vd0VarOooO00o;
        o00000oO.OooOOO oooOOOOooO0oo = tc0Var.OooO0oo(new C1548ey(dd0Var, false, obj, 19), new wj0(this, 29));
        this.f18923OooO = oooOOOOooO0oo;
        oooOOOOooO0oo.addListener(new wp0(0, oooOOOOooO0oo, new OooOOo0.o0OOO0o(this, h90Var, mf0Var, jf0VarOooOoO0, dd0Var, 8, false)), executor);
        return true;
    }

    public final C2204wp OooO0O0(rc0 rc0Var) {
        C2204wp c2204wp = new C2204wp(this.f18926OooO0OO.f24676OooO0O0, 1);
        C1765ku c1765ku = new C1765ku();
        c1765ku.f20683OooO0O0 = this.f18924OooO00o;
        c1765ku.f20684OooO0OO = ((dd0) rc0Var).f18236OooO00o;
        c1765ku.f20687OooO0o0 = this.f18928OooO0o;
        c2204wp.f25356OooO0o = new C1802lu(c1765ku);
        c2204wp.f25357OooO0o0 = new C1804lw(new C1767kw());
        return c2204wp;
    }
}
