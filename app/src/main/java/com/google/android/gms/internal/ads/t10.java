package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t10 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final de0 f24226OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final s10 f24227OooO0O0;

    public t10(de0 de0Var, s10 s10Var) {
        this.f24226OooO00o = de0Var;
        this.f24227OooO0O0 = s10Var;
    }

    public final InterfaceC1530eg OooO00o(String str) throws RemoteException {
        InterfaceC2156ve interfaceC2156ve = (InterfaceC2156ve) ((AtomicReference) this.f24226OooO00o.f18243OooOoO0).get();
        if (interfaceC2156ve == null) {
            zzo.zzj("Unexpected call to adapter creator.");
            throw new RemoteException();
        }
        InterfaceC1530eg interfaceC1530egOooO0o0 = interfaceC2156ve.OooO0o0(str);
        s10 s10Var = this.f24227OooO0O0;
        synchronized (s10Var) {
            if (s10Var.f23973OooO00o.containsKey(str)) {
                return interfaceC1530egOooO0o0;
            }
            try {
                s10Var.f23973OooO00o.put(str, new r10(str, interfaceC1530egOooO0o0.zzf(), interfaceC1530egOooO0o0.zzg(), true));
                return interfaceC1530egOooO0o0;
            } catch (Throwable unused) {
                return interfaceC1530egOooO0o0;
            }
        }
    }

    public final ee0 OooO0O0(String str, JSONObject jSONObject) {
        InterfaceC2230xe interfaceC2230xeZzb;
        s10 s10Var = this.f24227OooO0O0;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                interfaceC2230xeZzb = new BinderC1824mf(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                interfaceC2230xeZzb = new BinderC1824mf(new zzbrw());
            } else {
                InterfaceC2156ve interfaceC2156ve = (InterfaceC2156ve) ((AtomicReference) this.f24226OooO00o.f18243OooOoO0).get();
                if (interfaceC2156ve == null) {
                    zzo.zzj("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        interfaceC2230xeZzb = interfaceC2156ve.zze(string) ? interfaceC2156ve.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : interfaceC2156ve.OooO0o(string) ? interfaceC2156ve.zzb(string) : interfaceC2156ve.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        zzo.zzh("Invalid custom event.", e);
                    }
                } else {
                    interfaceC2230xeZzb = interfaceC2156ve.zzb(str);
                }
            }
            ee0 ee0Var = new ee0(interfaceC2230xeZzb);
            s10Var.OooO0O0(str, ee0Var);
            return ee0Var;
        } catch (Throwable th) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOoO0)).booleanValue()) {
                s10Var.OooO0O0(str, null);
            }
            throw new yd0(th);
        }
    }
}
