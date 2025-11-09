package com.ironsource.adqualitysdk.sdk.p009i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.hu */
/* loaded from: classes2.dex */
public final class C2852hu {

    /* renamed from: ﻐ */
    private List<List<Field>> f6660;

    /* renamed from: ﾇ */
    private int f6661;

    public C2852hu() {
        ArrayList arrayList = new ArrayList();
        this.f6660 = arrayList;
        int i = (-1) + 1;
        this.f6661 = i;
        arrayList.add(i, new ArrayList());
    }

    /* renamed from: ﻐ */
    public final void m6936() {
        this.f6660.remove(this.f6661);
        this.f6661--;
    }

    /* renamed from: ｋ */
    public final List<List<Field>> m6937() {
        return this.f6660;
    }

    /* renamed from: ﾇ */
    public final void m6939(Field field) {
        this.f6660.get(this.f6661).add(field);
    }

    /* renamed from: ﾒ */
    public final void m6940(Field field) {
        this.f6660.get(this.f6661).remove(field);
    }

    /* renamed from: ﾇ */
    public final void m6938() {
        int i = this.f6661 + 1;
        this.f6661 = i;
        this.f6660.add(i, new ArrayList());
    }
}
