package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class dn0 extends bm0 implements Serializable {

    /* renamed from: OooOoO */
    public transient int f18274OooOoO;

    /* renamed from: OooOoO0 */
    public final transient Map f18275OooOoO0;

    /* renamed from: OooOoOO */
    public final transient ll0 f18276OooOoOO;

    public dn0(Map map, ll0 ll0Var) {
        ii0.OoooOo0(map.isEmpty());
        this.f18275OooOoO0 = map;
        this.f18276OooOoOO = ll0Var;
    }

    public final void OooO0O0() {
        Map map = this.f18275OooOoO0;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f18274OooOoO = 0;
    }
}
