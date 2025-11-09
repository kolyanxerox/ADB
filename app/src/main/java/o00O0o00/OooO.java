package o00O0O00;

import com.ironsource.C3037dc;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class OooO implements Map.Entry, o00O0OoO.OooO {

    /* renamed from: OooOo */
    public final int f31316OooOo;

    /* renamed from: OooOo0O */
    public final OooOO0 f31317OooOo0O;

    /* renamed from: OooOo0o */
    public final int f31318OooOo0o;

    public OooO(OooOO0 map, int i) {
        OooOo.OooO0o0(map, "map");
        this.f31317OooOo0O = map;
        this.f31318OooOo0o = i;
        this.f31316OooOo = map.f31345OooOoo;
    }

    public final void OooO00o() {
        if (this.f31317OooOo0O.f31345OooOoo != this.f31316OooOo) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return OooOo.OooO00o(entry.getKey(), getKey()) && OooOo.OooO00o(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        OooO00o();
        return this.f31317OooOo0O.f31340OooOo0O[this.f31318OooOo0o];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        OooO00o();
        Object[] objArr = this.f31317OooOo0O.f31341OooOo0o;
        OooOo.OooO0O0(objArr);
        return objArr[this.f31318OooOo0o];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        OooO00o();
        OooOO0 oooOO0 = this.f31317OooOo0O;
        oooOO0.OooO0O0();
        Object[] objArr = oooOO0.f31341OooOo0o;
        if (objArr == null) {
            int length = oooOO0.f31340OooOo0O.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            oooOO0.f31341OooOo0o = objArr;
        }
        int i = this.f31318OooOo0o;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append(C3037dc.f8244T);
        sb.append(getValue());
        return sb.toString();
    }
}
