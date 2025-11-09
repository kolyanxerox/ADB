package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzv;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class m20 {

    /* renamed from: OooO0o, reason: collision with root package name */
    public final k20 f21036OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final String f21037OooO0o0;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f21033OooO0O0 = new ArrayList();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public boolean f21034OooO0OO = false;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f21035OooO0Oo = false;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final zzj f21032OooO00o = zzv.zzp().OooO0Oo();

    public m20(String str, k20 k20Var) {
        this.f21037OooO0o0 = str;
        this.f21036OooO0o = k20Var;
    }

    public final synchronized void OooO00o(String str, String str2) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17845o000oOoo)).booleanValue()) {
            HashMap mapOooO0o0 = OooO0o0();
            mapOooO0o0.put("action", "adapter_init_finished");
            mapOooO0o0.put("ancn", str);
            mapOooO0o0.put("rqe", str2);
            this.f21033OooO0O0.add(mapOooO0o0);
        }
    }

    public final synchronized void OooO0O0(String str) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17845o000oOoo)).booleanValue()) {
            HashMap mapOooO0o0 = OooO0o0();
            mapOooO0o0.put("action", "adapter_init_started");
            mapOooO0o0.put("ancn", str);
            this.f21033OooO0O0.add(mapOooO0o0);
        }
    }

    public final synchronized void OooO0OO(String str) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17845o000oOoo)).booleanValue()) {
            HashMap mapOooO0o0 = OooO0o0();
            mapOooO0o0.put("action", "adapter_init_finished");
            mapOooO0o0.put("ancn", str);
            this.f21033OooO0O0.add(mapOooO0o0);
        }
    }

    public final synchronized void OooO0Oo() {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17845o000oOoo)).booleanValue() && !this.f21034OooO0OO) {
            HashMap mapOooO0o0 = OooO0o0();
            mapOooO0o0.put("action", "init_started");
            this.f21033OooO0O0.add(mapOooO0o0);
            this.f21034OooO0OO = true;
        }
    }

    public final HashMap OooO0o0() {
        k20 k20Var = this.f21036OooO0o;
        k20Var.getClass();
        HashMap map = new HashMap(k20Var.f20416OooO00o);
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        map.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        map.put(ScarConstants.TOKEN_ID_KEY, this.f21032OooO00o.zzN() ? "" : this.f21037OooO0o0);
        return map;
    }
}
