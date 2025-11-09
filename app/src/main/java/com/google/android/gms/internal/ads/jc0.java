package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class jc0 {

    /* renamed from: OooO */
    public final nf0 f20272OooO;

    /* renamed from: OooO00o */
    public final Context f20273OooO00o;

    /* renamed from: OooO0O0 */
    public final Executor f20274OooO0O0;

    /* renamed from: OooO0OO */
    public final C2130up f20275OooO0OO;

    /* renamed from: OooO0Oo */
    public final c90 f20276OooO0Oo;

    /* renamed from: OooO0o */
    public final FrameLayout f20277OooO0o;

    /* renamed from: OooO0o0 */
    public final e90 f20278OooO0o0;

    /* renamed from: OooO0oO */
    public InterfaceC1779l7 f20279OooO0oO;

    /* renamed from: OooO0oo */
    public final C2099tv f20280OooO0oo;

    /* renamed from: OooOO0 */
    public final C1509dw f20281OooOO0;

    /* renamed from: OooOO0O */
    public final ud0 f20282OooOO0O;
    public df0 OooOO0o;

    /* renamed from: OooOOO */
    public zze f20283OooOOO;

    /* renamed from: OooOOO0 */
    public boolean f20284OooOOO0;

    /* renamed from: OooOOOO */
    public h90 f20285OooOOOO;

    public jc0(Context context, Executor executor, zzs zzsVar, C2130up c2130up, c90 c90Var, e90 e90Var, ud0 ud0Var, C1509dw c1509dw) {
        this.f20273OooO00o = context;
        this.f20274OooO0O0 = executor;
        this.f20275OooO0OO = c2130up;
        this.f20276OooO0Oo = c90Var;
        this.f20278OooO0o0 = e90Var;
        this.f20282OooOO0O = ud0Var;
        this.f20280OooO0oo = new C2099tv((ScheduledExecutorService) c2130up.f24678OooO0Oo.zzb(), (Oooo0OO.o00Ooo) c2130up.f24679OooO0o.zzb());
        this.f20272OooO = c2130up.OooOoo();
        this.f20277OooO0o = new FrameLayout(context);
        this.f20281OooOO0 = c1509dw;
        ud0Var.f24626OooO0O0 = zzsVar;
        this.f20284OooOOO0 = true;
        this.f20283OooOOO = null;
        this.f20285OooOOOO = null;
    }

    public final boolean OooO00o() {
        df0 df0Var = this.OooOO0o;
        return (df0Var == null || df0Var.f18244OooOo.isDone()) ? false : true;
    }

    public final boolean OooO0O0(zzm zzmVar, String str, ze0 ze0Var, h90 h90Var) {
        boolean z;
        mf0 mf0Var;
        C2315zp c2315zp;
        mf0 mf0Var2;
        Executor executor = this.f20274OooO0O0;
        if (str == null) {
            zzo.zzg("Ad unit ID should not be null for banner ad.");
            executor.execute(new b30(this, 9));
            return false;
        }
        boolean zOooO00o = OooO00o();
        ud0 ud0Var = this.f20282OooOO0O;
        if (!zOooO00o) {
            boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0O0)).booleanValue();
            C2130up c2130up = this.f20275OooO0OO;
            if (zBooleanValue && zzmVar.zzf) {
                ((p30) c2130up.f24694OooOo0O.zzb()).OooO0o0(true);
            }
            Pair pair = new Pair("api-call", Long.valueOf(zzmVar.zzz));
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            Bundle bundleOooO0oO = af0.OooO0oO(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
            ud0Var.f24627OooO0OO = str;
            ud0Var.f24625OooO00o = zzmVar;
            ud0Var.f24642OooOo00 = bundleOooO0oO;
            vd0 vd0VarOooO00o = ud0Var.OooO00o();
            int iOoooOoO = af0.OoooOoO(vd0VarOooO00o);
            Context context = this.f20273OooO00o;
            jf0 jf0VarOooOoO0 = ze0.OooOoO0(context, iOoooOoO, 3, zzmVar);
            boolean zBooleanValue2 = ((Boolean) AbstractC1854n8.f21434OooO0Oo.OooOOO()).booleanValue();
            c90 c90Var = this.f20276OooO0Oo;
            if (!zBooleanValue2 || !ud0Var.f24626OooO0O0.zzk) {
                boolean zBooleanValue3 = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0ooO0)).booleanValue();
                FrameLayout frameLayout = this.f20277OooO0o;
                C1509dw c1509dw = this.f20281OooOO0;
                C2099tv c2099tv = this.f20280OooO0oo;
                if (zBooleanValue3) {
                    C2130up c2130up2 = c2130up.f24676OooO0O0;
                    C1765ku c1765ku = new C1765ku();
                    c1765ku.f20683OooO0O0 = context;
                    c1765ku.f20684OooO0OO = vd0VarOooO00o;
                    C1802lu c1802lu = new C1802lu(c1765ku);
                    C1767kw c1767kw = new C1767kw();
                    c1767kw.OooO0O0(c90Var, executor);
                    c1767kw.OooO0OO(c90Var, executor);
                    C1804lw c1804lw = new C1804lw(c1767kw);
                    p80 p80Var = new p80(this.f20279OooO0oO, 0);
                    z = true;
                    c2315zp = new C2315zp(c2130up2, new wj0(frameLayout, 13), new C2249xx(0, C2213wy.f25420OooO0oo, (Object) null), new C1658hx(4, (byte) 0), c1804lw, c1802lu, new sj0(23, false), p80Var, new C2249xx(28, c2099tv, c1509dw), null, null);
                    mf0Var = null;
                } else {
                    z = true;
                    C2130up c2130up3 = c2130up.f24676OooO0O0;
                    C1765ku c1765ku2 = new C1765ku();
                    c1765ku2.f20683OooO0O0 = context;
                    c1765ku2.f20684OooO0OO = vd0VarOooO00o;
                    C1802lu c1802lu2 = new C1802lu(c1765ku2);
                    C1767kw c1767kw2 = new C1767kw();
                    c1767kw2.OooO0O0(c90Var, executor);
                    C2248xw c2248xw = new C2248xw(c90Var, executor);
                    HashSet hashSet = c1767kw2.f20693OooO0OO;
                    hashSet.add(c2248xw);
                    hashSet.add(new C2248xw(this.f20278OooO0o0, executor));
                    c1767kw2.OooO0Oo(c90Var, executor);
                    c1767kw2.f20695OooO0o.add(new C2248xw(c90Var, executor));
                    c1767kw2.f20696OooO0o0.add(new C2248xw(c90Var, executor));
                    c1767kw2.f20698OooO0oo.add(new C2248xw(c90Var, executor));
                    c1767kw2.OooO00o(c90Var, executor);
                    c1767kw2.OooO0OO(c90Var, executor);
                    c1767kw2.f20702OooOOO0.add(new C2248xw(c90Var, executor));
                    C1804lw c1804lw2 = new C1804lw(c1767kw2);
                    p80 p80Var2 = new p80(this.f20279OooO0oO, 0);
                    mf0Var = null;
                    c2315zp = new C2315zp(c2130up3, new wj0(frameLayout, 13), new C2249xx(0, C2213wy.f25420OooO0oo, (Object) null), new C1658hx(4, (byte) 0), c1804lw2, c1802lu2, new sj0(23, false), p80Var2, new C2249xx(28, c2099tv, c1509dw), null, null);
                }
                if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue()) {
                    mf0 mf0Var3 = (mf0) c2315zp.f26348o00ooo.zzb();
                    mf0Var3.OooO(3);
                    mf0Var3.OooO0O0(zzmVar.zzp);
                    mf0Var3.OooO0o(zzmVar.zzm);
                    mf0Var2 = mf0Var3;
                } else {
                    mf0Var2 = mf0Var;
                }
                this.f20285OooOOOO = h90Var;
                C1875nt c1875nt = (C1875nt) c2315zp.f26303o00000O0.zzb();
                df0 df0VarOooO00o = c1875nt.OooO00o(c1875nt.OooO0O0());
                this.OooOO0o = df0VarOooO00o;
                df0VarOooO00o.addListener(new wp0(0, df0VarOooO00o, new C1386ai(this, mf0Var2, jf0VarOooOoO0, c2315zp, 13, false)), executor);
                return z;
            }
            if (c90Var != null) {
                c90Var.o0OOO0o(af0.Oooo0O0(7, null, null));
            }
        } else if (!ud0Var.f24638OooOOOo) {
            this.f20284OooOOO0 = true;
            return false;
        }
        return false;
    }

    public final void OooO0OO() {
        synchronized (this) {
            try {
                df0 df0Var = this.OooOO0o;
                if (df0Var != null && df0Var.f18244OooOo.isDone()) {
                    try {
                        AbstractC1433bs abstractC1433bs = (AbstractC1433bs) this.OooOO0o.f18244OooOo.get();
                        this.OooOO0o = null;
                        this.f20277OooO0o.removeAllViews();
                        if (abstractC1433bs.OooO0Oo() != null) {
                            ViewParent parent = abstractC1433bs.OooO0Oo().getParent();
                            if (parent instanceof ViewGroup) {
                                zzo.zzj("Banner view provided from " + abstractC1433bs.f17103OooO0o.f23118OooOo0O + " already has a parent view. Removing its old parent.");
                                ((ViewGroup) parent).removeView(abstractC1433bs.OooO0Oo());
                            }
                        }
                        C2148v6 c2148v6 = AbstractC1448c7.o0O0ooO0;
                        if (((Boolean) zzbe.zzc().OooO00o(c2148v6)).booleanValue()) {
                            C1847n1 c1847n1 = abstractC1433bs.f17105OooO0oO.f25807OooOo0O;
                            c90 c90Var = this.f20276OooO0Oo;
                            C2247xv c2247xv = (C2247xv) c1847n1.f21381OooOo0o;
                            c2247xv.f25808OooOo0o = c90Var;
                            c2247xv.f25806OooOo = this.f20278OooO0o0;
                        }
                        this.f20277OooO0o.addView(abstractC1433bs.OooO0Oo());
                        h90 h90Var = this.f20285OooOOOO;
                        if (h90Var != null) {
                            h90Var.OooO0o0(abstractC1433bs);
                        }
                        if (((Boolean) zzbe.zzc().OooO00o(c2148v6)).booleanValue()) {
                            Executor executor = this.f20274OooO0O0;
                            c90 c90Var2 = this.f20276OooO0Oo;
                            Objects.requireNonNull(c90Var2);
                            executor.execute(new b30(c90Var2, 8));
                        }
                        if (abstractC1433bs.OooO0O0() >= 0) {
                            this.f20284OooOOO0 = false;
                            this.f20280OooO0oo.o00000oo(abstractC1433bs.OooO0O0());
                            this.f20280OooO0oo.o0000(abstractC1433bs.OooO0OO());
                        } else {
                            this.f20284OooOOO0 = true;
                            this.f20280OooO0oo.o00000oo(abstractC1433bs.OooO0OO());
                        }
                    } catch (InterruptedException e) {
                        e = e;
                        OooO0Oo();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f20284OooOOO0 = true;
                        this.f20280OooO0oo.zza();
                    } catch (ExecutionException e2) {
                        e = e2;
                        OooO0Oo();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f20284OooOOO0 = true;
                        this.f20280OooO0oo.zza();
                    }
                } else if (this.OooOO0o != null) {
                    com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                    this.f20284OooOOO0 = true;
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.f20284OooOOO0 = true;
                    this.f20280OooO0oo.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0Oo() {
        this.OooOO0o = null;
        zze zzeVar = this.f20283OooOOO;
        this.f20283OooOOO = null;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0ooO0)).booleanValue() && zzeVar != null) {
            this.f20274OooO0O0.execute(new c60(4, this, zzeVar));
        }
        h90 h90Var = this.f20285OooOOOO;
        if (h90Var != null) {
            h90Var.mo13707zza();
        }
    }
}
