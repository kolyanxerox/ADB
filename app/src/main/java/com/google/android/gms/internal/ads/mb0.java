package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class mb0 {

    /* renamed from: OooO00o */
    public final Context f21180OooO00o;

    /* renamed from: OooO0O0 */
    public final Set f21181OooO0O0;

    /* renamed from: OooO0OO */
    public final cq0 f21182OooO0OO;

    /* renamed from: OooO0Oo */
    public final mf0 f21183OooO0Oo;

    /* renamed from: OooO0o0 */
    public final h20 f21185OooO0o0;

    /* renamed from: OooO0o */
    public long f21184OooO0o = 0;

    /* renamed from: OooO0oO */
    public int f21186OooO0oO = 0;

    public mb0(Context context, cq0 cq0Var, Set set, mf0 mf0Var, h20 h20Var) {
        this.f21180OooO00o = context;
        this.f21182OooO0OO = cq0Var;
        this.f21181OooO0O0 = set;
        this.f21183OooO0Oo = mf0Var;
        this.f21185OooO0o0 = h20Var;
    }

    public final pp0 OooO00o(final Object obj, final Bundle bundle, final boolean z) {
        jf0 jf0VarOooO0oO = ze0.OooO0oO(this.f21180OooO00o, 8);
        jf0VarOooO0oO.zzi();
        Set<kb0> set = this.f21181OooO0O0;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        C2148v6 c2148v6 = AbstractC1448c7.o0OoooO;
        if (!((String) zzbe.zzc().OooO00o(c2148v6)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) zzbe.zzc().OooO00o(c2148v6)).split(","));
        }
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        this.f21184OooO0o = SystemClock.elapsedRealtime();
        Bundle bundle2 = new Bundle();
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17849o000oo0O)).booleanValue() && bundle != null) {
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (obj instanceof C1581fu) {
                bundle.putLong("client-signals-start", jCurrentTimeMillis);
            } else {
                bundle.putLong("gms-signals-start", jCurrentTimeMillis);
            }
        }
        for (kb0 kb0Var : set) {
            if (!arrayList2.contains(String.valueOf(kb0Var.zza()))) {
                ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                o00000oO.OooOOO oooOOOZzb = kb0Var.zzb();
                Bundle bundle3 = bundle2;
                oooOOOZzb.addListener(new RunnableC1832mn(this, jElapsedRealtime, kb0Var, bundle3), AbstractC2200wl.f25327OooO0oO);
                arrayList.add(oooOOOZzb);
                bundle2 = bundle3;
            }
        }
        final Bundle bundle4 = bundle2;
        rm0 rm0VarOooOOOO = rm0.OooOOOO(arrayList);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.lb0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle5;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    obj2 = obj;
                    if (!zHasNext) {
                        break;
                    }
                    jb0 jb0Var = (jb0) ((o00000oO.OooOOO) it.next()).get();
                    if (jb0Var != null) {
                        jb0Var.zzb(obj2);
                        if (z) {
                            jb0Var.zza(obj2);
                        }
                    }
                }
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17849o000oo0O)).booleanValue() && (bundle5 = bundle) != null) {
                    ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    boolean z2 = obj2 instanceof C1581fu;
                    Bundle bundle6 = bundle4;
                    if (z2) {
                        bundle5.putLong("client-signals-end", jCurrentTimeMillis2);
                        bundle5.putBundle("client_sig_latency_key", bundle6);
                        return obj2;
                    }
                    bundle5.putLong("gms-signals-end", jCurrentTimeMillis2);
                    bundle5.putBundle("gms_sig_latency_key", bundle6);
                }
                return obj2;
            }
        };
        pp0 pp0Var = new pp0(rm0VarOooOOOO, true, false);
        pp0Var.f23398Oooo0OO = new op0(pp0Var, callable, this.f21182OooO0OO);
        pp0Var.OooOo0o();
        if (nf0.OooO00o()) {
            af0.OoooooO(pp0Var, this.f21183OooO0Oo, jf0VarOooO0oO, false);
        }
        return pp0Var;
    }
}
