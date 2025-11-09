package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class d30 {

    /* renamed from: OooO */
    public final cq0 f18139OooO;

    /* renamed from: OooO0Oo */
    public final long f18143OooO0Oo;

    /* renamed from: OooO0o */
    public final Context f18144OooO0o;

    /* renamed from: OooO0oO */
    public final WeakReference f18146OooO0oO;

    /* renamed from: OooO0oo */
    public final t10 f18147OooO0oo;

    /* renamed from: OooOO0 */
    public final Executor f18148OooOO0;

    /* renamed from: OooOO0O */
    public final ScheduledExecutorService f18149OooOO0O;
    public final m20 OooOO0o;

    /* renamed from: OooOOO0 */
    public final VersionInfoParcel f18151OooOOO0;

    /* renamed from: OooOOOO */
    public final C1915ow f18152OooOOOO;

    /* renamed from: OooOOOo */
    public final nf0 f18153OooOOOo;

    /* renamed from: OooO00o */
    public boolean f18140OooO00o = false;

    /* renamed from: OooO0O0 */
    public boolean f18141OooO0O0 = false;

    /* renamed from: OooO0OO */
    public boolean f18142OooO0OO = false;

    /* renamed from: OooO0o0 */
    public final C2274yl f18145OooO0o0 = new C2274yl();

    /* renamed from: OooOOO */
    public final ConcurrentHashMap f18150OooOOO = new ConcurrentHashMap();

    /* renamed from: OooOOo0 */
    public boolean f18154OooOOo0 = true;

    public d30(Executor executor, Context context, WeakReference weakReference, cq0 cq0Var, t10 t10Var, ScheduledExecutorService scheduledExecutorService, m20 m20Var, VersionInfoParcel versionInfoParcel, C1915ow c1915ow, nf0 nf0Var) {
        this.f18147OooO0oo = t10Var;
        this.f18144OooO0o = context;
        this.f18146OooO0oO = weakReference;
        this.f18139OooO = cq0Var;
        this.f18149OooOO0O = scheduledExecutorService;
        this.f18148OooOO0 = executor;
        this.OooOO0o = m20Var;
        this.f18151OooOOO0 = versionInfoParcel;
        this.f18152OooOOOO = c1915ow;
        this.f18153OooOOOo = nf0Var;
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        this.f18143OooO0Oo = SystemClock.elapsedRealtime();
        OooO0Oo("com.google.android.gms.ads.MobileAds", 0, "", false);
    }

    public final ArrayList OooO00o() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.f18150OooOOO;
        for (String str : concurrentHashMap.keySet()) {
            C2080tc c2080tc = (C2080tc) concurrentHashMap.get(str);
            arrayList.add(new C2080tc(str, c2080tc.zzc, c2080tc.zzd, c2080tc.zzb));
        }
        return arrayList;
    }

    public final void OooO0O0() {
        if (!((Boolean) AbstractC1854n8.f21431OooO00o.OooOOO()).booleanValue()) {
            if (this.f18151OooOOO0.clientJarVersion >= ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17835o000o00)).intValue() && this.f18154OooOOo0) {
                if (this.f18140OooO00o) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f18140OooO00o) {
                            return;
                        }
                        this.OooOO0o.OooO0Oo();
                        this.f18152OooOOOO.zzf();
                        final int i = 1;
                        this.f18145OooO0o0.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.z20

                            /* renamed from: OooOo0o, reason: collision with root package name */
                            public final /* synthetic */ d30 f26069OooOo0o;

                            {
                                this.f26069OooOo0o = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i) {
                                    case 0:
                                        d30 d30Var = this.f26069OooOo0o;
                                        synchronized (d30Var) {
                                            try {
                                                if (d30Var.f18142OooO0OO) {
                                                    return;
                                                }
                                                ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                                                d30Var.OooO0Oo("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - d30Var.f18143OooO0Oo), "Timeout.", false);
                                                d30Var.OooOO0o.OooO00o("com.google.android.gms.ads.MobileAds", "timeout");
                                                d30Var.f18152OooOOOO.OooO00o("com.google.android.gms.ads.MobileAds", "timeout");
                                                d30Var.f18145OooO0o0.zzd(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                    default:
                                        d30 d30Var2 = this.f26069OooOo0o;
                                        m20 m20Var = d30Var2.OooOO0o;
                                        synchronized (m20Var) {
                                            try {
                                                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17845o000oOoo)).booleanValue() && !m20Var.f21035OooO0Oo) {
                                                    HashMap mapOooO0o0 = m20Var.OooO0o0();
                                                    mapOooO0o0.put("action", "init_finished");
                                                    m20Var.f21033OooO0O0.add(mapOooO0o0);
                                                    ArrayList arrayList = m20Var.f21033OooO0O0;
                                                    int size = arrayList.size();
                                                    int i2 = 0;
                                                    while (i2 < size) {
                                                        Object obj = arrayList.get(i2);
                                                        i2++;
                                                        m20Var.f21036OooO0o.OooO0O0((Map) obj, false);
                                                    }
                                                    m20Var.f21035OooO0Oo = true;
                                                }
                                            } finally {
                                            }
                                        }
                                        d30Var2.f18152OooOOOO.zze();
                                        d30Var2.f18141OooO0O0 = true;
                                        return;
                                }
                            }
                        }, this.f18139OooO);
                        this.f18140OooO00o = true;
                        o00000oO.OooOOO oooOOOOooO0OO = OooO0OO();
                        final int i2 = 0;
                        this.f18149OooOO0O.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.z20

                            /* renamed from: OooOo0o, reason: collision with root package name */
                            public final /* synthetic */ d30 f26069OooOo0o;

                            {
                                this.f26069OooOo0o = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i2) {
                                    case 0:
                                        d30 d30Var = this.f26069OooOo0o;
                                        synchronized (d30Var) {
                                            try {
                                                if (d30Var.f18142OooO0OO) {
                                                    return;
                                                }
                                                ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                                                d30Var.OooO0Oo("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - d30Var.f18143OooO0Oo), "Timeout.", false);
                                                d30Var.OooOO0o.OooO00o("com.google.android.gms.ads.MobileAds", "timeout");
                                                d30Var.f18152OooOOOO.OooO00o("com.google.android.gms.ads.MobileAds", "timeout");
                                                d30Var.f18145OooO0o0.zzd(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                    default:
                                        d30 d30Var2 = this.f26069OooOo0o;
                                        m20 m20Var = d30Var2.OooOO0o;
                                        synchronized (m20Var) {
                                            try {
                                                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17845o000oOoo)).booleanValue() && !m20Var.f21035OooO0Oo) {
                                                    HashMap mapOooO0o0 = m20Var.OooO0o0();
                                                    mapOooO0o0.put("action", "init_finished");
                                                    m20Var.f21033OooO0O0.add(mapOooO0o0);
                                                    ArrayList arrayList = m20Var.f21033OooO0O0;
                                                    int size = arrayList.size();
                                                    int i22 = 0;
                                                    while (i22 < size) {
                                                        Object obj = arrayList.get(i22);
                                                        i22++;
                                                        m20Var.f21036OooO0o.OooO0O0((Map) obj, false);
                                                    }
                                                    m20Var.f21035OooO0Oo = true;
                                                }
                                            } finally {
                                            }
                                        }
                                        d30Var2.f18152OooOOOO.zze();
                                        d30Var2.f18141OooO0O0 = true;
                                        return;
                                }
                            }
                        }, ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17838o000o00o)).longValue(), TimeUnit.SECONDS);
                        wj0 wj0Var = new wj0(this, 21);
                        oooOOOOooO0OO.addListener(new wp0(0, oooOOOOooO0OO, wj0Var), this.f18139OooO);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.f18140OooO00o) {
            return;
        }
        OooO0Oo("com.google.android.gms.ads.MobileAds", 0, "", true);
        this.f18145OooO0o0.zzc(Boolean.FALSE);
        this.f18140OooO00o = true;
        this.f18141OooO0O0 = true;
    }

    public final synchronized o00000oO.OooOOO OooO0OO() {
        String str = zzv.zzp().OooO0Oo().zzg().f21508OooO0o0;
        if (!TextUtils.isEmpty(str)) {
            return ii0.OooooOO(str);
        }
        C2274yl c2274yl = new C2274yl();
        zzv.zzp().OooO0Oo().zzo(new wp0(24, this, c2274yl));
        return c2274yl;
    }

    public final void OooO0Oo(String str, int i, String str2, boolean z) {
        this.f18150OooOOO.put(str, new C2080tc(str, i, str2, z));
    }
}
