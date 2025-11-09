package com.ironsource.adqualitysdk.sdk.p009i;

import java.math.BigDecimal;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ek */
/* loaded from: classes2.dex */
public abstract class AbstractC2761ek extends AbstractC2756ef {
    public AbstractC2761ek(AbstractC2755ee abstractC2755ee, AbstractC2755ee abstractC2755ee2, C2736dm c2736dm) {
        super(abstractC2755ee, abstractC2755ee2, c2736dm);
    }

    /* renamed from: ﻛ */
    public abstract boolean mo6773(int i);

    /* renamed from: ﻛ */
    public abstract boolean mo6774(Object obj, Object obj2);

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee
    /* renamed from: ｋ */
    public final C2744du mo6724(C2741dr c2741dr, C2712cp c2712cp) {
        Object objM6717 = m6765().m6760(c2741dr, c2712cp).m6717();
        Object objM67172 = m6764().m6760(c2741dr, c2712cp).m6717();
        try {
            return new C2744du(Boolean.valueOf(mo6773(new BigDecimal(objM6717.toString()).compareTo(new BigDecimal(objM67172.toString())))));
        } catch (Exception unused) {
            return ((objM6717 instanceof String) && (objM67172 instanceof String)) ? new C2744du(Boolean.valueOf(mo6775((String) objM6717, (String) objM67172))) : new C2744du(Boolean.valueOf(mo6774(objM6717, objM67172)));
        }
    }

    /* renamed from: ﾇ */
    public abstract boolean mo6775(String str, String str2);
}
