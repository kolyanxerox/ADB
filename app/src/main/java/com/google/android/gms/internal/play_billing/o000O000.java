package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o000O000 extends o00000OO {

    /* renamed from: OooOo */
    public final transient o000O00 f27007OooOo;

    /* renamed from: OooOoO */
    public final transient int f27008OooOoO;

    /* renamed from: OooOoO0 */
    public final transient Object[] f27009OooOoO0;

    public o000O000(o000O00 o000o002, Object[] objArr, int i) {
        this.f27007OooOo = o000o002;
        this.f27009OooOoO0 = objArr;
        this.f27008OooOoO = i;
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final int OooO0o0(Object[] objArr) {
        return OooO().OooO0o0(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.o00000OO
    public final o000000 OooOOO0() {
        return new o000(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f27007OooOo.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return OooO().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f27008OooOoO;
    }
}
