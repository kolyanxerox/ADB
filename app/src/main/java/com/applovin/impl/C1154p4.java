package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.AbstractC1150p0;
import com.applovin.impl.C1143o2;

/* renamed from: com.applovin.impl.p4 */
/* loaded from: classes.dex */
public class C1154p4 extends C1143o2 {

    /* renamed from: n */
    private final AbstractC1150p0.a f1718n;

    /* renamed from: o */
    private final Context f1719o;

    /* renamed from: p */
    private final boolean f1720p;

    public C1154p4(AbstractC1150p0.a aVar, boolean z, Context context) {
        super(C1143o2.c.RIGHT_DETAIL);
        this.f1718n = aVar;
        this.f1719o = context;
        this.f1572c = new SpannedString(aVar.m2050a());
        this.f1720p = z;
    }

    @Override // com.applovin.impl.C1143o2
    /* renamed from: f */
    public SpannedString mo1983f() {
        return new SpannedString(this.f1718n.m2051a(this.f1719o));
    }

    @Override // com.applovin.impl.C1143o2
    /* renamed from: o */
    public boolean mo1440o() {
        return false;
    }

    @Override // com.applovin.impl.C1143o2
    /* renamed from: p */
    public boolean mo1989p() {
        Boolean boolM2052b = this.f1718n.m2052b(this.f1719o);
        if (boolM2052b != null) {
            return boolM2052b.equals(Boolean.valueOf(this.f1720p));
        }
        return false;
    }
}
