package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final class rg0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap f23854OooO00o = new ConcurrentHashMap();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap f23855OooO0O0 = new ConcurrentHashMap();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final vg0 f23856OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final sj0 f23857OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public volatile ConnectivityManager f23858OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Context f23859OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final Oooo0OO.o00Ooo f23860OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public AtomicInteger f23861OooO0oo;

    public rg0(vg0 vg0Var, sj0 sj0Var, Context context, Oooo0OO.o00Ooo o00ooo2) {
        this.f23856OooO0OO = vg0Var;
        this.f23857OooO0Oo = sj0Var;
        this.f23859OooO0o0 = context;
        this.f23860OooO0oO = o00ooo2;
    }

    public static String OooO00o(String str, AdFormat adFormat) {
        return OooO0oO.OooOo.OooOoo(str, "#", adFormat == null ? "NULL" : adFormat.name());
    }

    public static void OooO0O0(rg0 rg0Var, boolean z) {
        synchronized (rg0Var) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17728OooOo00)).booleanValue()) {
                rg0Var.OooO0o(z);
            }
        }
    }

    public final synchronized kg0 OooO0OO(String str, AdFormat adFormat) {
        return (kg0) this.f23854OooO00o.get(OooO00o(str, adFormat));
    }

    public final synchronized ArrayList OooO0Oo(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzft zzftVar = (zzft) it.next();
                String strOooO00o = OooO00o(zzftVar.zza, AdFormat.getAdFormat(zzftVar.zzb));
                hashSet.add(strOooO00o);
                kg0 kg0Var = (kg0) this.f23854OooO00o.get(strOooO00o);
                if (kg0Var != null) {
                    if (kg0Var.f20597OooO0o0.equals(zzftVar)) {
                        kg0Var.OooOO0(zzftVar.zzd);
                    } else {
                        this.f23855OooO0O0.put(strOooO00o, kg0Var);
                        this.f23854OooO00o.remove(strOooO00o);
                    }
                } else if (this.f23855OooO0O0.containsKey(strOooO00o)) {
                    kg0 kg0Var2 = (kg0) this.f23855OooO0O0.get(strOooO00o);
                    if (kg0Var2.f20597OooO0o0.equals(zzftVar)) {
                        kg0Var2.OooOO0(zzftVar.zzd);
                        kg0Var2.OooO();
                        this.f23854OooO00o.put(strOooO00o, kg0Var2);
                        this.f23855OooO0O0.remove(strOooO00o);
                    }
                } else {
                    arrayList.add(zzftVar);
                }
            }
            Iterator it2 = this.f23854OooO00o.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.f23855OooO0O0.put((String) entry.getKey(), (kg0) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.f23855OooO0O0.entrySet().iterator();
            while (it3.hasNext()) {
                kg0 kg0Var3 = (kg0) ((Map.Entry) it3.next()).getValue();
                boolean z = false;
                kg0Var3.f20596OooO0o.set(false);
                kg0Var3.OooOO0o.set(false);
                synchronized (kg0Var3) {
                    kg0Var3.OooO00o();
                    if (!kg0Var3.f20599OooO0oo.isEmpty()) {
                        z = true;
                    }
                }
                if (!z) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized void OooO0o(boolean z) {
        try {
            if (z) {
                Iterator it = this.f23854OooO00o.values().iterator();
                while (it.hasNext()) {
                    ((kg0) it.next()).OooO();
                }
            } else {
                Iterator it2 = this.f23854OooO00o.values().iterator();
                while (it2.hasNext()) {
                    ((kg0) it2.next()).f20596OooO0o.set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Optional OooO0o0(final Class cls, String str, final AdFormat adFormat) {
        ((Oooo0OO.oo000o) this.f23860OooO0oO).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        sj0 sj0Var = this.f23857OooO0Oo;
        sj0Var.getClass();
        sj0Var.OooOOOo(adFormat, Optional.of("poll_ad"), "ppac_ts", jCurrentTimeMillis, Optional.empty());
        kg0 kg0VarOooO0OO = OooO0OO(str, adFormat);
        if (kg0VarOooO0OO == null) {
            return Optional.empty();
        }
        try {
            final Optional optionalOooO0o = kg0VarOooO0OO.OooO0o();
            Optional map = Optional.ofNullable(kg0VarOooO0OO.OooO0o0()).map(new Function() { // from class: com.google.android.gms.internal.ads.pg0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return cls.cast(obj);
                }
            });
            map.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.qg0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    rg0 rg0Var = this.f23611OooOo0O;
                    ((Oooo0OO.oo000o) rg0Var.f23860OooO0oO).getClass();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    sj0 sj0Var2 = rg0Var.f23857OooO0Oo;
                    sj0Var2.getClass();
                    sj0Var2.OooOOOo(adFormat, Optional.of("poll_ad"), "ppla_ts", jCurrentTimeMillis2, optionalOooO0o);
                }
            });
            return map;
        } catch (ClassCastException e) {
            zzv.zzp().OooO0oo("PreloadAdManager.pollAd", e);
            zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e);
            return Optional.empty();
        }
    }

    public final synchronized boolean OooO0oO(String str, AdFormat adFormat) {
        boolean z;
        Optional optionalEmpty;
        boolean z2;
        try {
            ((Oooo0OO.oo000o) this.f23860OooO0oO).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            kg0 kg0VarOooO0OO = OooO0OO(str, adFormat);
            z = false;
            if (kg0VarOooO0OO != null) {
                synchronized (kg0VarOooO0OO) {
                    kg0VarOooO0OO.OooO00o();
                    z2 = !kg0VarOooO0OO.f20599OooO0oo.isEmpty();
                }
                if (z2) {
                    z = true;
                }
            }
            if (z) {
                ((Oooo0OO.oo000o) this.f23860OooO0oO).getClass();
                optionalEmpty = Optional.of(Long.valueOf(System.currentTimeMillis()));
            } else {
                optionalEmpty = Optional.empty();
            }
            this.f23857OooO0Oo.OooO0Oo(adFormat, jCurrentTimeMillis, optionalEmpty, kg0VarOooO0OO == null ? Optional.empty() : kg0VarOooO0OO.OooO0o());
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }
}
