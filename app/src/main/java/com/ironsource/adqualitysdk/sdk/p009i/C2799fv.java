package com.ironsource.adqualitysdk.sdk.p009i;

import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.fv */
/* loaded from: classes2.dex */
public final class C2799fv extends AbstractC2794fq {

    /* renamed from: ﻛ */
    private C2762el f6403;

    /* renamed from: ｋ */
    private C2788fk f6404;

    /* renamed from: ﾇ */
    private C2788fk f6405;

    public C2799fv(C2788fk c2788fk, C2788fk c2788fk2, C2762el c2762el) {
        this.f6404 = c2788fk;
        this.f6405 = c2788fk2;
        this.f6403 = c2762el;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2799fv.class == obj.getClass()) {
            C2799fv c2799fv = (C2799fv) obj;
            C2788fk c2788fk = this.f6404;
            if (c2788fk == null ? c2799fv.f6404 != null : !c2788fk.equals(c2799fv.f6404)) {
                return false;
            }
            C2788fk c2788fk2 = this.f6405;
            if (c2788fk2 == null ? c2799fv.f6405 != null : !c2788fk2.equals(c2799fv.f6405)) {
                return false;
            }
            C2762el c2762el = this.f6403;
            C2762el c2762el2 = c2799fv.f6403;
            if (c2762el != null) {
                return c2762el.equals(c2762el2);
            }
            if (c2762el2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        C2788fk c2788fk = this.f6404;
        int iHashCode = (c2788fk != null ? c2788fk.hashCode() : 0) * 31;
        C2788fk c2788fk2 = this.f6405;
        int iHashCode2 = (iHashCode + (c2788fk2 != null ? c2788fk2.hashCode() : 0)) * 31;
        C2762el c2762el = this.f6403;
        return iHashCode2 + (c2762el != null ? c2762el.hashCode() : 0);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2794fq
    /* renamed from: ｋ */
    public final C2744du mo6796(C2741dr c2741dr, C2712cp c2712cp) {
        try {
            C2788fk c2788fk = this.f6404;
            if (c2788fk != null) {
                return c2788fk.mo6796(new C2741dr(c2741dr), c2712cp);
            }
        } catch (Throwable th) {
            if (this.f6405 != null) {
                HashMap map = new HashMap();
                C2762el c2762el = this.f6403;
                if (c2762el != null) {
                    map.put(C2746dw.m6725(c2762el.m6777()), th);
                }
                return this.f6405.mo6796(new C2741dr(map, c2741dr), c2712cp);
            }
        }
        return new C2744du(null);
    }
}
