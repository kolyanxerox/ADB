package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.iq */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1688iq implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Runnable f20083OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f20084OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ BinderC1761kq f20085OooOo0o;

    public /* synthetic */ RunnableC1688iq(BinderC1761kq binderC1761kq, Runnable runnable, int i) {
        this.f20084OooOo0O = i;
        this.f20085OooOo0o = binderC1761kq;
        this.f20083OooOo = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yd0 yd0Var;
        switch (this.f20084OooOo0O) {
            case 0:
                BinderC1761kq binderC1761kq = this.f20085OooOo0o;
                Oooo00O.o000000O.OooO0Oo("Adapters must be initialized on the main thread.");
                HashMap map = zzv.zzp().OooO0Oo().zzg().f21505OooO0OO;
                if (map.isEmpty()) {
                    return;
                }
                Runnable runnable = this.f20083OooOo;
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        zzo.zzk("Could not initialize rewarded ads.", th);
                        return;
                    }
                }
                if (((InterfaceC2156ve) ((AtomicReference) binderC1761kq.f20643OooOo.f24226OooO00o.f18243OooOoO0).get()) != null) {
                    HashMap map2 = new HashMap();
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        for (C1934pe c1934pe : ((C1971qe) it.next()).f23580OooO00o) {
                            String str = c1934pe.f23327OooO0O0;
                            for (String str2 : c1934pe.f23326OooO00o) {
                                if (!map2.containsKey(str2)) {
                                    map2.put(str2, new ArrayList());
                                }
                                if (str != null) {
                                    ((List) map2.get(str2)).add(str);
                                }
                            }
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map2.entrySet()) {
                        String str3 = (String) entry.getKey();
                        try {
                            l60 l60VarOooO00o = binderC1761kq.f20647OooOoO0.OooO00o(str3, jSONObject);
                            if (l60VarOooO00o != null) {
                                ee0 ee0Var = (ee0) l60VarOooO00o.f20809OooO0O0;
                                boolean zOooO00o = ee0Var.OooO00o();
                                InterfaceC2230xe interfaceC2230xe = ee0Var.f18580OooO00o;
                                if (!zOooO00o) {
                                    try {
                                        if (interfaceC2230xe.zzM()) {
                                            try {
                                                interfaceC2230xe.o0ooOOo(new Oooo0o.OooO0OO(binderC1761kq.f20644OooOo0O), (f70) l60VarOooO00o.f20810OooO0OO, (List) entry.getValue());
                                                zzo.zze("Initialized rewarded video mediation adapter " + str3);
                                            } finally {
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } catch (yd0 e) {
                            zzo.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                        }
                    }
                    return;
                }
                return;
            default:
                AbstractC2200wl.f25325OooO0o.execute(new RunnableC1688iq(this.f20085OooOo0o, this.f20083OooOo, 0));
                return;
        }
    }
}
