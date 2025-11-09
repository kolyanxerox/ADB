package o0000Ooo;

import com.google.android.gms.internal.measurement.o0OOO0;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class o0O000O extends o0O00o0 {

    /* renamed from: OooOooO */
    public static final Object[] f29545OooOooO;

    /* renamed from: OooOooo */
    public static final o0O000O f29546OooOooo;

    /* renamed from: OooOoO */
    public final transient int f29547OooOoO;

    /* renamed from: OooOoO0 */
    public final transient Object[] f29548OooOoO0;

    /* renamed from: OooOoOO */
    public final transient Object[] f29549OooOoOO;

    /* renamed from: OooOoo */
    public final transient int f29550OooOoo;

    /* renamed from: OooOoo0 */
    public final transient int f29551OooOoo0;

    static {
        Object[] objArr = new Object[0];
        f29545OooOooO = objArr;
        f29546OooOooo = new o0O000O(0, 0, 0, objArr, objArr);
    }

    public o0O000O(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f29548OooOoO0 = objArr;
        this.f29547OooOoO = i;
        this.f29549OooOoOO = objArr2;
        this.f29551OooOoo0 = i2;
        this.f29550OooOoo = i3;
    }

    @Override // o0000Ooo.o0o0Oo
    public final int OooO() {
        return 0;
    }

    @Override // o0000Ooo.o0o0Oo
    public final Object[] OooO0o() {
        return this.f29548OooOoO0;
    }

    @Override // o0000Ooo.o0o0Oo
    public final int OooO0o0(Object[] objArr) {
        Object[] objArr2 = this.f29548OooOoO0;
        int i = this.f29550OooOoo;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // o0000Ooo.o0o0Oo
    public final int OooO0oO() {
        return this.f29550OooOoo;
    }

    @Override // o0000Ooo.o0O00o0
    public final o00Oo00 OooOOO0() {
        return o00Oo00.OooOO0(this.f29550OooOoo, this.f29548OooOoO0);
    }

    @Override // o0000Ooo.o0o0Oo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f29549OooOoOO;
            if (objArr.length != 0) {
                int iOooOO0 = o0OOO0.OooOO0(obj.hashCode());
                while (true) {
                    int i = iOooOO0 & this.f29551OooOoo0;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iOooOO0 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // o0000Ooo.o0O00o0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f29547OooOoO;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return OooOO0().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f29550OooOoo;
    }
}
