package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class o000O00O extends o00000OO {

    /* renamed from: OooOoo */
    public static final Object[] f27010OooOoo;

    /* renamed from: OooOooO */
    public static final o000O00O f27011OooOooO;

    /* renamed from: OooOo */
    public final transient Object[] f27012OooOo;

    /* renamed from: OooOoO */
    public final transient Object[] f27013OooOoO;

    /* renamed from: OooOoO0 */
    public final transient int f27014OooOoO0;

    /* renamed from: OooOoOO */
    public final transient int f27015OooOoOO;

    /* renamed from: OooOoo0 */
    public final transient int f27016OooOoo0;

    static {
        Object[] objArr = new Object[0];
        f27010OooOoo = objArr;
        f27011OooOooO = new o000O00O(0, 0, 0, objArr, objArr);
    }

    public o000O00O(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f27012OooOo = objArr;
        this.f27014OooOoO0 = i;
        this.f27013OooOoO = objArr2;
        this.f27015OooOoOO = i2;
        this.f27016OooOoo0 = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final int OooO0o() {
        return this.f27016OooOoo0;
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final int OooO0o0(Object[] objArr) {
        Object[] objArr2 = this.f27012OooOo;
        int i = this.f27016OooOoo0;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final int OooO0oO() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final Object[] OooOO0O() {
        return this.f27012OooOo;
    }

    @Override // com.google.android.gms.internal.play_billing.o00000OO
    public final o000000 OooOOO0() {
        return o000000.OooOOO(this.f27016OooOoo0, this.f27012OooOo);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f27013OooOoO;
            if (objArr.length != 0) {
                int iOooO0O0 = o0O000Oo.OooO0O0(obj.hashCode());
                while (true) {
                    int i = iOooO0O0 & this.f27015OooOoOO;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iOooO0O0 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.o00000OO, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f27014OooOoO0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return OooO().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f27016OooOoo0;
    }
}
