package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class oO0O000o extends AbstractMap {

    /* renamed from: OooOo */
    public Map f26724OooOo;

    /* renamed from: OooOo0O */
    public Object[] f26725OooOo0O;

    /* renamed from: OooOo0o */
    public int f26726OooOo0o;

    /* renamed from: OooOoO */
    public volatile oO0O00o0 f26727OooOoO;

    /* renamed from: OooOoO0 */
    public boolean f26728OooOoO0;

    /* renamed from: OooOoOO */
    public Map f26729OooOoOO;

    public oO0O000o() {
        Map map = Collections.EMPTY_MAP;
        this.f26724OooOo = map;
        this.f26729OooOoOO = map;
    }

    public final oO0O00 OooO00o(int i) {
        if (i < this.f26726OooOo0o) {
            return (oO0O00) this.f26725OooOo0O[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set OooO0O0() {
        return this.f26724OooOo.isEmpty() ? Collections.EMPTY_SET : this.f26724OooOo.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: OooO0OO */
    public final Object put(Comparable comparable, Object obj) {
        OooO0oO();
        int iOooO0o = OooO0o(comparable);
        if (iOooO0o >= 0) {
            return ((oO0O00) this.f26725OooOo0O[iOooO0o]).setValue(obj);
        }
        OooO0oO();
        if (this.f26725OooOo0O == null) {
            this.f26725OooOo0O = new Object[16];
        }
        int i = -(iOooO0o + 1);
        if (i >= 16) {
            return OooO0oo().put(comparable, obj);
        }
        if (this.f26726OooOo0o == 16) {
            oO0O00 oo0o00 = (oO0O00) this.f26725OooOo0O[15];
            this.f26726OooOo0o = 15;
            OooO0oo().put(oo0o00.f26721OooOo0O, oo0o00.f26722OooOo0o);
        }
        Object[] objArr = this.f26725OooOo0O;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f26725OooOo0O[i] = new oO0O00(this, comparable, obj);
        this.f26726OooOo0o++;
        return null;
    }

    public final Object OooO0Oo(int i) {
        OooO0oO();
        Object[] objArr = this.f26725OooOo0O;
        Object obj = ((oO0O00) objArr[i]).f26722OooOo0o;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f26726OooOo0o - i) - 1);
        this.f26726OooOo0o--;
        if (!this.f26724OooOo.isEmpty()) {
            Iterator it = OooO0oo().entrySet().iterator();
            Object[] objArr2 = this.f26725OooOo0O;
            int i2 = this.f26726OooOo0o;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new oO0O00(this, (Comparable) entry.getKey(), entry.getValue());
            this.f26726OooOo0o++;
            it.remove();
        }
        return obj;
    }

    public final int OooO0o(Comparable comparable) {
        int i = this.f26726OooOo0o;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((oO0O00) this.f26725OooOo0O[i2]).f26721OooOo0O);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((oO0O00) this.f26725OooOo0O[i4]).f26721OooOo0O);
            if (iCompareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    public final void OooO0oO() {
        if (this.f26728OooOoO0) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap OooO0oo() {
        OooO0oO();
        if (this.f26724OooOo.isEmpty() && !(this.f26724OooOo instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f26724OooOo = treeMap;
            this.f26729OooOoOO = treeMap.descendingMap();
        }
        return (SortedMap) this.f26724OooOo;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        OooO0oO();
        if (this.f26726OooOo0o != 0) {
            this.f26725OooOo0O = null;
            this.f26726OooOo0o = 0;
        }
        if (this.f26724OooOo.isEmpty()) {
            return;
        }
        this.f26724OooOo.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return OooO0o(comparable) >= 0 || this.f26724OooOo.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f26727OooOoO == null) {
            this.f26727OooOoO = new oO0O00o0(this, 0);
        }
        return this.f26727OooOoO;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oO0O000o)) {
            return super.equals(obj);
        }
        oO0O000o oo0o000o = (oO0O000o) obj;
        int size = size();
        if (size == oo0o000o.size()) {
            int i = this.f26726OooOo0o;
            if (i != oo0o000o.f26726OooOo0o) {
                return entrySet().equals(oo0o000o.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (OooO00o(i2).equals(oo0o000o.OooO00o(i2))) {
                }
            }
            if (i != size) {
                return this.f26724OooOo.equals(oo0o000o.f26724OooOo);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iOooO0o = OooO0o(comparable);
        return iOooO0o >= 0 ? ((oO0O00) this.f26725OooOo0O[iOooO0o]).f26722OooOo0o : this.f26724OooOo.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f26726OooOo0o;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f26725OooOo0O[i2].hashCode();
        }
        return this.f26724OooOo.size() > 0 ? this.f26724OooOo.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        OooO0oO();
        Comparable comparable = (Comparable) obj;
        int iOooO0o = OooO0o(comparable);
        if (iOooO0o >= 0) {
            return OooO0Oo(iOooO0o);
        }
        if (this.f26724OooOo.isEmpty()) {
            return null;
        }
        return this.f26724OooOo.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f26724OooOo.size() + this.f26726OooOo0o;
    }
}
