package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class eb0 implements kb0 {

    /* renamed from: OooOO0O, reason: collision with root package name */
    public static final pa0 f18546OooOO0O = new pa0(1, new JSONArray().toString(), new Bundle());

    /* renamed from: OooO, reason: collision with root package name */
    public final int f18547OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final C2163vl f18548OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ScheduledExecutorService f18549OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final u80 f18550OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f18551OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final s80 f18552OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final vd0 f18553OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final t10 f18554OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final e30 f18555OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final String f18556OooOO0;

    public eb0(C2163vl c2163vl, ScheduledExecutorService scheduledExecutorService, String str, u80 u80Var, Context context, vd0 vd0Var, s80 s80Var, t10 t10Var, e30 e30Var, int i) {
        this.f18548OooO00o = c2163vl;
        this.f18549OooO0O0 = scheduledExecutorService;
        this.f18556OooOO0 = str;
        this.f18550OooO0OO = u80Var;
        this.f18551OooO0Oo = context;
        this.f18553OooO0o0 = vd0Var;
        this.f18552OooO0o = s80Var;
        this.f18554OooO0oO = t10Var;
        this.f18555OooO0oo = e30Var;
        this.f18547OooO = i;
    }

    public final tp0 OooO00o(String str, List list, Bundle bundle, boolean z, boolean z2) {
        db0 db0Var = new db0(this, str, list, bundle, z, z2);
        C2163vl c2163vl = this.f18548OooO00o;
        tp0 tp0VarOooOOo = tp0.OooOOo(ii0.Oooooo(db0Var, c2163vl));
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17819o000OO0o)).booleanValue()) {
            tp0VarOooOOo = (tp0) ii0.o00Oo0(tp0VarOooOOo, ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17810o000O0O0)).longValue(), TimeUnit.MILLISECONDS, this.f18549OooO0O0);
        }
        return ii0.OoooOOO(tp0VarOooOOo, Throwable.class, new C1857nb(str, 3), c2163vl);
    }

    public final void OooO0O0(ArrayList arrayList, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            x80 x80Var = (x80) ((Map.Entry) it.next()).getValue();
            String str = x80Var.f25560OooO00o;
            Bundle bundle = this.f18553OooO0o0.f24954OooO0Oo.zzm;
            arrayList.add(OooO00o(str, Collections.singletonList(x80Var.f25564OooO0o0), bundle != null ? bundle.getBundle(str) : null, x80Var.f25561OooO0O0, x80Var.f25562OooO0OO));
        }
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final o00000oO.OooOOO zzb() {
        int i = this.f18547OooO;
        pa0 pa0Var = f18546OooOO0O;
        if (i == 2) {
            return ii0.OooooOO(pa0Var);
        }
        vd0 vd0Var = this.f18553OooO0o0;
        if (vd0Var.f24965OooOOo) {
            if (!Arrays.asList(((String) zzbe.zzc().OooO00o(AbstractC1448c7.f17828o000Oo0o)).split(",")).contains(zzaa.zzb(zzaa.zzc(vd0Var.f24954OooO0Oo)))) {
                return ii0.OooooOO(pa0Var);
            }
        }
        return ii0.Oooooo(new p80(this, 24), this.f18548OooO00o);
    }
}
