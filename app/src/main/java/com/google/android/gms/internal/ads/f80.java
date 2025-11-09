package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f80 implements k60 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f18812OooO00o;

    /* renamed from: OooO0O0 */
    public final t10 f18813OooO0O0;

    /* renamed from: OooO0OO */
    public final Object f18814OooO0OO;

    public f80(s80 s80Var, t10 t10Var) {
        this.f18812OooO00o = 1;
        this.f18814OooO0OO = s80Var;
        this.f18813OooO0O0 = t10Var;
    }

    @Override // com.google.android.gms.internal.ads.k60
    public final l60 OooO00o(String str, JSONObject jSONObject) {
        l60 l60Var;
        InterfaceC1530eg interfaceC1530egOooO00o;
        switch (this.f18812OooO00o) {
            case 0:
                synchronized (this) {
                    try {
                        l60Var = (l60) ((HashMap) this.f18814OooO0OO).get(str);
                        if (l60Var == null) {
                            l60Var = new l60(this.f18813OooO0O0.OooO0O0(str, jSONObject), new f70(), str);
                            ((HashMap) this.f18814OooO0OO).put(str, l60Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return l60Var;
            default:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17827o000Oo0O)).booleanValue()) {
                    try {
                        interfaceC1530egOooO00o = this.f18813OooO0O0.OooO00o(str);
                    } catch (RemoteException e) {
                        zzo.zzh("Coundn't create RTB adapter: ", e);
                    }
                } else {
                    ConcurrentHashMap concurrentHashMap = ((s80) this.f18814OooO0OO).f24034OooO00o;
                    interfaceC1530egOooO00o = concurrentHashMap.containsKey(str) ? (InterfaceC1530eg) concurrentHashMap.get(str) : null;
                }
                if (interfaceC1530egOooO00o == null) {
                    return null;
                }
                return new l60(interfaceC1530egOooO00o, new e70(), str);
        }
    }

    public f80(t10 t10Var) {
        this.f18812OooO00o = 0;
        this.f18814OooO0OO = new HashMap();
        this.f18813OooO0O0 = t10Var;
    }
}
