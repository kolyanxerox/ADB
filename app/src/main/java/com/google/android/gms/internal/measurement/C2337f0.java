package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C2051sk;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.f0 */
/* loaded from: classes2.dex */
public final class C2337f0 extends OooOOO0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final oO00Oo0 f26460OooOo;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final HashMap f26461OooOoO0;

    public C2337f0(oO00Oo0 oo00oo0) {
        super("require");
        this.f26461OooOoO0 = new HashMap();
        this.f26460OooOo = oo00oo0;
    }

    @Override // com.google.android.gms.internal.measurement.OooOOO0
    public final Oooo0 OooO00o(C2051sk c2051sk, List list) {
        Oooo0 oooo0;
        o00O0.o000OOo.OooOOO0("require", list, 1);
        String strZzc = ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) list.get(0)).zzc();
        HashMap map = this.f26461OooOoO0;
        if (map.containsKey(strZzc)) {
            return (Oooo0) map.get(strZzc);
        }
        HashMap map2 = (HashMap) this.f26460OooOo.f26700OooOo0O;
        if (map2.containsKey(strZzc)) {
            try {
                oooo0 = (Oooo0) ((Callable) map2.get(strZzc)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
            }
        } else {
            oooo0 = Oooo0.OooOO0o;
        }
        if (oooo0 instanceof OooOOO0) {
            map.put(strZzc, (OooOOO0) oooo0);
        }
        return oooo0;
    }
}
