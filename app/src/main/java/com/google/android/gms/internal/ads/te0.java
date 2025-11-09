package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class te0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f24301OooO00o = new HashMap();

    public final se0 OooO00o(me0 me0Var, Context context, he0 he0Var, p80 p80Var) {
        ne0 ne0Var;
        HashMap map = this.f24301OooO00o;
        se0 se0Var = (se0) map.get(me0Var);
        if (se0Var != null) {
            return se0Var;
        }
        if (me0Var == me0.f21225OooOo0O) {
            ne0Var = new ne0(context, me0Var, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o00oooOo)).intValue(), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0O00000)).intValue(), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0000o)).intValue(), (String) zzbe.zzc().OooO00o(AbstractC1448c7.o0O000O), (String) zzbe.zzc().OooO00o(AbstractC1448c7.o00oooo), (String) zzbe.zzc().OooO00o(AbstractC1448c7.o00ooooo));
        } else if (me0Var == me0.f21226OooOo0o) {
            ne0Var = new ne0(context, me0Var, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o00oooo0)).intValue(), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0000O)).intValue(), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0O000)).intValue(), (String) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOoOo), (String) zzbe.zzc().OooO00o(AbstractC1448c7.o00ooooO), (String) zzbe.zzc().OooO00o(AbstractC1448c7.f3442o0));
        } else if (me0Var == me0.f21224OooOo) {
            ne0Var = new ne0(context, me0Var, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0O000o0)).intValue(), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOoOO)).intValue(), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0O000oo)).intValue(), (String) zzbe.zzc().OooO00o(AbstractC1448c7.o0O000Oo), (String) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOoOO), (String) zzbe.zzc().OooO00o(AbstractC1448c7.o0O000o));
        } else {
            ne0Var = null;
        }
        de0 de0Var = new de0(ne0Var);
        se0 se0Var2 = new se0(de0Var, new ab1(de0Var, he0Var, p80Var));
        map.put(me0Var, se0Var2);
        return se0Var2;
    }
}
