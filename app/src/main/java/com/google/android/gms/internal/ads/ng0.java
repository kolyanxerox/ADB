package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class ng0 extends zzch {

    /* renamed from: OooOo0O */
    public final rg0 f21488OooOo0O;

    public ng0(rg0 rg0Var) {
        this.f21488OooOo0O = rg0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final InterfaceC2256y3 zze(String str) {
        InterfaceC2256y3 interfaceC2256y3;
        rg0 rg0Var = this.f21488OooOo0O;
        synchronized (rg0Var) {
            interfaceC2256y3 = (InterfaceC2256y3) rg0Var.OooO0o0(InterfaceC2256y3.class, str, AdFormat.APP_OPEN_AD).orElse(null);
        }
        return interfaceC2256y3;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final zzby zzf(String str) {
        zzby zzbyVar;
        rg0 rg0Var = this.f21488OooOo0O;
        synchronized (rg0Var) {
            zzbyVar = (zzby) rg0Var.OooO0o0(zzby.class, str, AdFormat.INTERSTITIAL).orElse(null);
        }
        return zzbyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final InterfaceC2050sj zzg(String str) {
        InterfaceC2050sj interfaceC2050sj;
        rg0 rg0Var = this.f21488OooOo0O;
        synchronized (rg0Var) {
            interfaceC2050sj = (InterfaceC2050sj) rg0Var.OooO0o0(InterfaceC2050sj.class, str, AdFormat.REWARDED).orElse(null);
        }
        return interfaceC2050sj;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzh(InterfaceC2156ve interfaceC2156ve) {
        rg0 rg0Var = this.f21488OooOo0O;
        rg0Var.f23856OooO0OO.f24977OooO0o0 = interfaceC2156ve;
        if (rg0Var.f23858OooO0o == null) {
            synchronized (rg0Var) {
                if (rg0Var.f23858OooO0o == null) {
                    try {
                        rg0Var.f23858OooO0o = (ConnectivityManager) rg0Var.f23859OooO0o0.getSystemService("connectivity");
                    } catch (ClassCastException e) {
                        zzo.zzk("Failed to get connectivity manager", e);
                    }
                }
            }
        }
        if (!Oooo0OO.o00oO0o.OooO0oo() || rg0Var.f23858OooO0o == null) {
            rg0Var.f23861OooO0oo = new AtomicInteger(((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17732OooOoO0)).intValue());
            return;
        }
        try {
            rg0Var.f23858OooO0o.registerDefaultNetworkCallback(new C1810m1(rg0Var, 2));
        } catch (RuntimeException e2) {
            zzo.zzk("Failed to register network callback", e2);
            rg0Var.f23861OooO0oo = new AtomicInteger(((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17732OooOoO0)).intValue());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzi(List list, zzcf zzcfVar) {
        EnumMap enumMap;
        AdFormat adFormat;
        rg0 rg0Var = this.f21488OooOo0O;
        synchronized (rg0Var) {
            try {
                ArrayList arrayListOooO0Oo = rg0Var.OooO0Oo(list);
                enumMap = new EnumMap(AdFormat.class);
                int size = arrayListOooO0Oo.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListOooO0Oo.get(i);
                    i++;
                    zzft zzftVar = (zzft) obj;
                    String str = zzftVar.zza;
                    adFormat = AdFormat.getAdFormat(zzftVar.zzb);
                    kg0 kg0VarOooO00o = rg0Var.f23856OooO0OO.OooO00o(zzftVar, zzcfVar);
                    if (adFormat != null && kg0VarOooO00o != null) {
                        AtomicInteger atomicInteger = rg0Var.f23861OooO0oo;
                        if (atomicInteger != null) {
                            int i2 = atomicInteger.get();
                            synchronized (kg0VarOooO00o) {
                                Oooo00O.o000000O.OooO0O0(i2 >= 5);
                                lg0 lg0Var = kg0VarOooO00o.f20591OooO;
                                synchronized (lg0Var) {
                                    Oooo00O.o000000O.OooO0O0(i2 > 0);
                                    lg0Var.f20885OooO0Oo = i2;
                                }
                            }
                        }
                        kg0VarOooO00o.f20602OooOOO = rg0Var.f23857OooO0Oo;
                        String strOooO00o = rg0.OooO00o(str, adFormat);
                        synchronized (rg0Var) {
                            synchronized (kg0VarOooO00o) {
                                kg0VarOooO00o.f20601OooOO0O.submit(new tg0(kg0VarOooO00o, 0));
                            }
                            rg0Var.f23854OooO00o.put(strOooO00o, kg0VarOooO00o);
                        }
                    }
                }
                sj0 sj0Var = rg0Var.f23857OooO0Oo;
                ((Oooo0OO.oo000o) rg0Var.f23860OooO0oO).getClass();
                sj0Var.OooOOOO(enumMap, System.currentTimeMillis());
                zzv.zzb().OooO0O0(new C1555f4(rg0Var, 1));
                return;
            } catch (Throwable th) {
                throw th;
            }
        }
        enumMap.put((EnumMap) adFormat, (AdFormat) Integer.valueOf(((Integer) enumMap.getOrDefault(adFormat, 0)).intValue() + 1));
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzj(String str) {
        boolean zOooO0oO;
        rg0 rg0Var = this.f21488OooOo0O;
        synchronized (rg0Var) {
            zOooO0oO = rg0Var.OooO0oO(str, AdFormat.APP_OPEN_AD);
        }
        return zOooO0oO;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzk(String str) {
        boolean zOooO0oO;
        rg0 rg0Var = this.f21488OooOo0O;
        synchronized (rg0Var) {
            zOooO0oO = rg0Var.OooO0oO(str, AdFormat.INTERSTITIAL);
        }
        return zOooO0oO;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzl(String str) {
        boolean zOooO0oO;
        rg0 rg0Var = this.f21488OooOo0O;
        synchronized (rg0Var) {
            zOooO0oO = rg0Var.OooO0oO(str, AdFormat.REWARDED);
        }
        return zOooO0oO;
    }
}
