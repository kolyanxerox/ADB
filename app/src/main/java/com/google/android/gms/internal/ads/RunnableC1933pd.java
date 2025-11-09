package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.pd */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1933pd implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C1822md f23318OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f23319OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C2192wd f23320OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ long f23321OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f23322OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C2229xd f23323OooOoOO;

    public /* synthetic */ RunnableC1933pd(C2229xd c2229xd, C2192wd c2192wd, C1822md c1822md, ArrayList arrayList, long j, int i) {
        this.f23319OooOo0O = i;
        this.f23323OooOoOO = c2229xd;
        this.f23320OooOo0o = c2192wd;
        this.f23318OooOo = c1822md;
        this.f23322OooOoO0 = arrayList;
        this.f23321OooOoO = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23319OooOo0O) {
            case 0:
                C2229xd c2229xd = this.f23323OooOoOO;
                C2192wd c2192wd = this.f23320OooOo0o;
                C1822md c1822md = this.f23318OooOo;
                ArrayList arrayList = this.f23322OooOoO0;
                long j = this.f23321OooOoO;
                c2229xd.getClass();
                zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
                synchronized (c2229xd.f25607OooO0Oo) {
                    try {
                        zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                        if (((AtomicInteger) c2192wd.f13857OooO0O0).get() != -1 && ((AtomicInteger) c2192wd.f13857OooO0O0).get() != 1) {
                            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0o0OO)).booleanValue()) {
                                c2192wd.OooOO0("SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener", new TimeoutException("Unable to receive /jsLoaded GMSG."));
                            } else {
                                c2192wd.OooO();
                            }
                            AbstractC2200wl.f25325OooO0o.execute(new RunnableC1897od(c1822md, 0));
                            String strValueOf = String.valueOf(zzbe.zzc().OooO00o(AbstractC1448c7.f17711OooO0O0));
                            int i = ((AtomicInteger) c2192wd.f13857OooO0O0).get();
                            int i2 = c2229xd.f25606OooO0OO;
                            String strValueOf2 = String.valueOf(arrayList.get(0));
                            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                            zze.zza("Could not receive /jsLoaded in " + strValueOf + " ms. JS engine session reference status(onEngLoadedTimeout) is " + i + ". Update status(onEngLoadedTimeout) is " + i2 + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + strValueOf2 + " ms. Total latency(onEngLoadedTimeout) is " + (System.currentTimeMillis() - j) + " ms. Rejecting.");
                            zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                            return;
                        }
                        zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
                        return;
                    } finally {
                    }
                }
            default:
                zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
                synchronized (this.f23323OooOoOO.f25607OooO0Oo) {
                    try {
                        zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                        if (((AtomicInteger) this.f23320OooOo0o.f13857OooO0O0).get() != -1 && ((AtomicInteger) this.f23320OooOo0o.f13857OooO0O0).get() != 1) {
                            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0o0OO)).booleanValue()) {
                                this.f23320OooOo0o.OooOO0("SdkJavascriptFactory.loadJavascriptEngine.Runnable", new TimeoutException("Unable to fully load JS engine."));
                            } else {
                                this.f23320OooOo0o.OooO();
                            }
                            AbstractC2200wl.f25325OooO0o.execute(new RunnableC1897od(this.f23318OooOo, 1));
                            String strValueOf3 = String.valueOf(zzbe.zzc().OooO00o(AbstractC1448c7.f17712OooO0OO));
                            int i3 = ((AtomicInteger) this.f23320OooOo0o.f13857OooO0O0).get();
                            int i4 = this.f23323OooOoOO.f25606OooO0OO;
                            String strConcat = this.f23322OooOoO0.isEmpty() ? ". Still waiting for the engine to be loaded" : ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ".concat(String.valueOf(this.f23322OooOoO0.get(0)));
                            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                            zze.zza("Could not finish the full JS engine loading in " + strValueOf3 + " ms. JS engine session reference status(fullLoadTimeout) is " + i3 + ". Update status(fullLoadTimeout) is " + i4 + strConcat + " ms. Total latency(fullLoadTimeout) is " + (System.currentTimeMillis() - this.f23321OooOoO) + " ms at timeout. Rejecting.");
                            zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                            return;
                        }
                        zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
                        return;
                    } finally {
                    }
                }
        }
    }
}
