package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.nq */
/* loaded from: classes2.dex */
public final class C1872nq {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Map f21565OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Map f21566OooO0O0;

    public /* synthetic */ C1872nq(Map map, Map map2) {
        this.f21565OooO00o = map;
        this.f21566OooO0O0 = map2;
    }

    public Enum OooO00o(Object obj) throws GeneralSecurityException {
        Enum r0 = (Enum) this.f21566OooO0O0.get(obj);
        if (r0 != null) {
            return r0;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public Object OooO0O0(Enum r3) throws GeneralSecurityException {
        Object obj = this.f21565OooO00o.get(r3);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r3)));
    }
}
