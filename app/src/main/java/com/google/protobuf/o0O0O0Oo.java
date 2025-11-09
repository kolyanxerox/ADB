package com.google.protobuf;

import com.google.android.gms.internal.measurement.oO0O00o0;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class o0O0O0Oo extends AbstractMap {

    /* renamed from: OooOoo */
    public static final /* synthetic */ int f28317OooOoo = 0;

    /* renamed from: OooOo */
    public Map f28318OooOo;

    /* renamed from: OooOo0O */
    public final int f28319OooOo0O;

    /* renamed from: OooOo0o */
    public List f28320OooOo0o = Collections.EMPTY_LIST;

    /* renamed from: OooOoO */
    public volatile oO0O00o0 f28321OooOoO;

    /* renamed from: OooOoO0 */
    public boolean f28322OooOoO0;

    /* renamed from: OooOoOO */
    public Map f28323OooOoOO;

    /* renamed from: OooOoo0 */
    public volatile o0O0OO0 f28324OooOoo0;

    public o0O0O0Oo(int i) {
        this.f28319OooOo0O = i;
        Map map = Collections.EMPTY_MAP;
        this.f28318OooOo = map;
        this.f28323OooOoOO = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO00o(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f28320OooOo0o
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f28320OooOo0o
            java.lang.Object r2 = r2.get(r1)
            com.google.protobuf.oo0OOoo r2 = (com.google.protobuf.oo0OOoo) r2
            java.lang.Comparable r2 = r2.f28439OooOo0O
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f28320OooOo0o
            java.lang.Object r3 = r3.get(r2)
            com.google.protobuf.oo0OOoo r3 = (com.google.protobuf.oo0OOoo) r3
            java.lang.Comparable r3 = r3.f28439OooOo0O
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o0O0O0Oo.OooO00o(java.lang.Comparable):int");
    }

    public final void OooO0O0() {
        if (this.f28322OooOoO0) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry OooO0OO(int i) {
        return (Map.Entry) this.f28320OooOo0o.get(i);
    }

    public final Iterable OooO0Oo() {
        return this.f28318OooOo.isEmpty() ? o0OOO0.f28368OooO0OO : this.f28318OooOo.entrySet();
    }

    public final SortedMap OooO0o() {
        OooO0O0();
        if (this.f28318OooOo.isEmpty() && !(this.f28318OooOo instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f28318OooOo = treeMap;
            this.f28323OooOoOO = treeMap.descendingMap();
        }
        return (SortedMap) this.f28318OooOo;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: OooO0oO */
    public final Object put(Comparable comparable, Object obj) {
        OooO0O0();
        int iOooO00o = OooO00o(comparable);
        if (iOooO00o >= 0) {
            return ((oo0OOoo) this.f28320OooOo0o.get(iOooO00o)).setValue(obj);
        }
        OooO0O0();
        boolean zIsEmpty = this.f28320OooOo0o.isEmpty();
        int i = this.f28319OooOo0O;
        if (zIsEmpty && !(this.f28320OooOo0o instanceof ArrayList)) {
            this.f28320OooOo0o = new ArrayList(i);
        }
        int i2 = -(iOooO00o + 1);
        if (i2 >= i) {
            return OooO0o().put(comparable, obj);
        }
        if (this.f28320OooOo0o.size() == i) {
            oo0OOoo oo0oooo = (oo0OOoo) this.f28320OooOo0o.remove(i - 1);
            OooO0o().put(oo0oooo.f28439OooOo0O, oo0oooo.f28440OooOo0o);
        }
        this.f28320OooOo0o.add(i2, new oo0OOoo(this, comparable, obj));
        return null;
    }

    public final Object OooO0oo(int i) {
        OooO0O0();
        Object obj = ((oo0OOoo) this.f28320OooOo0o.remove(i)).f28440OooOo0o;
        if (!this.f28318OooOo.isEmpty()) {
            Iterator it = OooO0o().entrySet().iterator();
            List list = this.f28320OooOo0o;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new oo0OOoo(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        OooO0O0();
        if (!this.f28320OooOo0o.isEmpty()) {
            this.f28320OooOo0o.clear();
        }
        if (this.f28318OooOo.isEmpty()) {
            return;
        }
        this.f28318OooOo.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return OooO00o(comparable) >= 0 || this.f28318OooOo.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f28321OooOoO == null) {
            this.f28321OooOoO = new oO0O00o0(this, 1);
        }
        return this.f28321OooOoO;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0O0O0Oo)) {
            return super.equals(obj);
        }
        o0O0O0Oo o0o0o0oo = (o0O0O0Oo) obj;
        int size = size();
        if (size == o0o0o0oo.size()) {
            int size2 = this.f28320OooOo0o.size();
            if (size2 != o0o0o0oo.f28320OooOo0o.size()) {
                return ((AbstractSet) entrySet()).equals(o0o0o0oo.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (OooO0OO(i).equals(o0o0o0oo.OooO0OO(i))) {
                }
            }
            if (size2 != size) {
                return this.f28318OooOo.equals(o0o0o0oo.f28318OooOo);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iOooO00o = OooO00o(comparable);
        return iOooO00o >= 0 ? ((oo0OOoo) this.f28320OooOo0o.get(iOooO00o)).f28440OooOo0o : this.f28318OooOo.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f28320OooOo0o.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((oo0OOoo) this.f28320OooOo0o.get(i)).hashCode();
        }
        return this.f28318OooOo.size() > 0 ? this.f28318OooOo.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        OooO0O0();
        Comparable comparable = (Comparable) obj;
        int iOooO00o = OooO00o(comparable);
        if (iOooO00o >= 0) {
            return OooO0oo(iOooO00o);
        }
        if (this.f28318OooOo.isEmpty()) {
            return null;
        }
        return this.f28318OooOo.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f28318OooOo.size() + this.f28320OooOo0o.size();
    }
}
