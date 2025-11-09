package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class yc0 {

    /* renamed from: OooO */
    public df0 f25896OooO;

    /* renamed from: OooO00o */
    public final Context f25897OooO00o;

    /* renamed from: OooO0O0 */
    public final Executor f25898OooO0O0;

    /* renamed from: OooO0OO */
    public final C2130up f25899OooO0OO;

    /* renamed from: OooO0Oo */
    public final c90 f25900OooO0Oo;

    /* renamed from: OooO0o */
    public InterfaceC1779l7 f25901OooO0o;

    /* renamed from: OooO0o0 */
    public final bd0 f25902OooO0o0;

    /* renamed from: OooO0oO */
    public final nf0 f25903OooO0oO;

    /* renamed from: OooO0oo */
    public final ud0 f25904OooO0oo;

    public yc0(Context context, Executor executor, C2130up c2130up, c90 c90Var, bd0 bd0Var, ud0 ud0Var) {
        this.f25897OooO00o = context;
        this.f25898OooO0O0 = executor;
        this.f25899OooO0OO = c2130up;
        this.f25900OooO0Oo = c90Var;
        this.f25904OooO0oo = ud0Var;
        this.f25902OooO0o0 = bd0Var;
        this.f25903OooO0oO = c2130up.OooOoo();
    }

    public final boolean OooO00o() {
        df0 df0Var = this.f25896OooO;
        return (df0Var == null || df0Var.f18244OooOo.isDone()) ? false : true;
    }

    public final boolean OooO0O0(zzm zzmVar, String str, ze0 ze0Var, h90 h90Var) {
        C1503dq c1503dq;
        mf0 mf0Var;
        Executor executor = this.f25898OooO0O0;
        if (str == null) {
            zzo.zzg("Ad unit ID should not be null for interstitial ad.");
            executor.execute(new b30(this, 10));
            return false;
        }
        if (OooO00o()) {
            return false;
        }
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0O0)).booleanValue();
        C2130up c2130up = this.f25899OooO0OO;
        if (zBooleanValue && zzmVar.zzf) {
            ((p30) c2130up.f24694OooOo0O.zzb()).OooO0o0(true);
        }
        Pair pair = new Pair("api-call", Long.valueOf(zzmVar.zzz));
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        Bundle bundleOooO0oO = af0.OooO0oO(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        ud0 ud0Var = this.f25904OooO0oo;
        ud0Var.f24627OooO0OO = str;
        ud0Var.f24626OooO0O0 = ((vc0) ze0Var).f24946OooO0oO;
        ud0Var.f24625OooO00o = zzmVar;
        ud0Var.f24642OooOo00 = bundleOooO0oO;
        vd0 vd0VarOooO00o = ud0Var.OooO00o();
        int iOoooOoO = af0.OoooOoO(vd0VarOooO00o);
        Context context = this.f25897OooO00o;
        jf0 jf0VarOooOoO0 = ze0.OooOoO0(context, iOoooOoO, 4, zzmVar);
        boolean zBooleanValue2 = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0ooo0)).booleanValue();
        c90 c90Var = this.f25900OooO0Oo;
        if (zBooleanValue2) {
            C2130up c2130up2 = c2130up.f24676OooO0O0;
            C1765ku c1765ku = new C1765ku();
            c1765ku.f20683OooO0O0 = context;
            c1765ku.f20684OooO0OO = vd0VarOooO00o;
            C1802lu c1802lu = new C1802lu(c1765ku);
            C1767kw c1767kw = new C1767kw();
            c1767kw.OooO0O0(c90Var, executor);
            c1767kw.OooO0OO(c90Var, executor);
            c1503dq = new C1503dq(c2130up2, new C1658hx(4, (byte) 0), new C1804lw(c1767kw), c1802lu, new sj0(23, false), new p80(this.f25901OooO0o, 0), null, null);
        } else {
            C1767kw c1767kw2 = new C1767kw();
            HashSet hashSet = c1767kw2.f20698OooO0oo;
            HashSet hashSet2 = c1767kw2.f20696OooO0o0;
            bd0 bd0Var = this.f25902OooO0o0;
            if (bd0Var != null) {
                hashSet2.add(new C2248xw(bd0Var, executor));
                hashSet.add(new C2248xw(bd0Var, executor));
                c1767kw2.OooO00o(bd0Var, executor);
            }
            C2130up c2130up3 = c2130up.f24676OooO0O0;
            C1765ku c1765ku2 = new C1765ku();
            c1765ku2.f20683OooO0O0 = context;
            c1765ku2.f20684OooO0OO = vd0VarOooO00o;
            C1802lu c1802lu2 = new C1802lu(c1765ku2);
            c1767kw2.OooO0O0(c90Var, executor);
            hashSet2.add(new C2248xw(c90Var, executor));
            hashSet.add(new C2248xw(c90Var, executor));
            c1767kw2.OooO00o(c90Var, executor);
            c1767kw2.f20693OooO0OO.add(new C2248xw(c90Var, executor));
            c1767kw2.OooO0Oo(c90Var, executor);
            c1767kw2.OooO0OO(c90Var, executor);
            c1767kw2.f20702OooOOO0.add(new C2248xw(c90Var, executor));
            c1767kw2.OooOO0o.add(new C2248xw(c90Var, executor));
            c1503dq = new C1503dq(c2130up3, new C1658hx(4, (byte) 0), new C1804lw(c1767kw2), c1802lu2, new sj0(23, false), new p80(this.f25901OooO0o, 0), null, null);
        }
        if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue()) {
            mf0Var = (mf0) c1503dq.f18387ooOO.zzb();
            mf0Var.OooO(4);
            mf0Var.OooO0O0(zzmVar.zzp);
            mf0Var.OooO0o(zzmVar.zzm);
        } else {
            mf0Var = null;
        }
        C1875nt c1875nt = (C1875nt) c1503dq.f18371o000OOo.zzb();
        df0 df0VarOooO00o = c1875nt.OooO00o(c1875nt.OooO0O0());
        this.f25896OooO = df0VarOooO00o;
        df0VarOooO00o.addListener(new wp0(0, df0VarOooO00o, new OooOOo0.o0OOO0o(this, h90Var, mf0Var, jf0VarOooOoO0, c1503dq, 7, false)), executor);
        return true;
    }
}
