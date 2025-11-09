package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.gn */
/* loaded from: classes2.dex */
public final class C1611gn implements Iterable {

    /* renamed from: OooOo0O */
    public final ArrayList f19387OooOo0O = new ArrayList();

    public final boolean OooO0Oo(InterfaceC1722jo interfaceC1722jo) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f19387OooOo0O;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            C1574fn c1574fn = (C1574fn) obj;
            if (c1574fn.f18981OooO0O0 == interfaceC1722jo) {
                arrayList.add(c1574fn);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            ((C1574fn) obj2).f18982OooO0OO.OooOO0();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f19387OooOo0O.iterator();
    }
}
