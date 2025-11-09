package OoooO0O;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class o000OOo0 extends o000O0O0 {

    /* renamed from: OooOoo */
    public static final Object[] f13979OooOoo;

    /* renamed from: OooOooO */
    public static final o000OOo0 f13980OooOooO;

    /* renamed from: OooOo */
    public final transient Object[] f13981OooOo;

    /* renamed from: OooOoO */
    public final transient Object[] f13982OooOoO;

    /* renamed from: OooOoO0 */
    public final transient int f13983OooOoO0;

    /* renamed from: OooOoOO */
    public final transient int f13984OooOoOO;

    /* renamed from: OooOoo0 */
    public final transient int f13985OooOoo0;

    static {
        Object[] objArr = new Object[0];
        f13979OooOoo = objArr;
        f13980OooOooO = new o000OOo0(0, 0, 0, objArr, objArr);
    }

    public o000OOo0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f13981OooOo = objArr;
        this.f13983OooOoO0 = i;
        this.f13982OooOoO = objArr2;
        this.f13984OooOoOO = i2;
        this.f13985OooOoo0 = i3;
    }

    @Override // OoooO0O.o000O00O
    public final Object[] OooO() {
        return this.f13981OooOo;
    }

    @Override // OoooO0O.o000O00O
    public final int OooO0o() {
        return this.f13985OooOoo0;
    }

    @Override // OoooO0O.o000O00O
    public final int OooO0o0(Object[] objArr) {
        Object[] objArr2 = this.f13981OooOo;
        int i = this.f13985OooOoo0;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // OoooO0O.o000O00O
    public final int OooO0oO() {
        return 0;
    }

    @Override // OoooO0O.o000O00O, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f13982OooOoO;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i = iRotateLeft & this.f13984OooOoOO;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i + 1;
        }
    }

    @Override // OoooO0O.o000O0O0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f13983OooOoO0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        o000OO0O o000oo002 = this.f13963OooOo0o;
        if (o000oo002 == null) {
            o000O0 o000o0 = o000OO0O.f13974OooOo0o;
            int i = this.f13985OooOoo0;
            o000oo002 = i == 0 ? o000OO00.f13971OooOoO : new o000OO00(i, this.f13981OooOo);
            this.f13963OooOo0o = o000oo002;
        }
        return o000oo002.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13985OooOoo0;
    }
}
