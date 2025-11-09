package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.ru */
/* loaded from: classes2.dex */
public final class C3607ru extends C3249ja {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3607ru(AbstractC3718u1 adUnitData, C3272jx waterfallInstances) {
        super(adUnitData, waterfallInstances);
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        kotlin.jvm.internal.OooOo.OooO0o0(waterfallInstances, "waterfallInstances");
    }

    /* renamed from: a */
    private final int m11765a(C3272jx c3272jx) {
        Integer num;
        List<AbstractC3887z> listM9559b = c3272jx.m9559b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM9559b) {
            if (((AbstractC3887z) obj).m13283v()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(m11766b((AbstractC3887z) it.next()));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(m11766b((AbstractC3887z) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    private final int m11766b(AbstractC3887z abstractC3887z) {
        return abstractC3887z.m13270h().m9995l();
    }

    @Override // com.ironsource.AbstractC3100f0
    /* renamed from: a */
    public boolean mo8585a(AbstractC3887z instance, C3272jx waterfallInstances) {
        kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
        kotlin.jvm.internal.OooOo.OooO0o0(waterfallInstances, "waterfallInstances");
        return m11765a(waterfallInstances) < m11766b(instance);
    }
}
