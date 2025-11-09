package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class nn0 extends um0 {

    /* renamed from: OooOooO, reason: collision with root package name */
    public static final Object[] f21518OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public static final nn0 f21519OooOooo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final transient int f21520OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final transient Object[] f21521OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final transient Object[] f21522OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final transient int f21523OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final transient int f21524OooOoo0;

    static {
        Object[] objArr = new Object[0];
        f21518OooOooO = objArr;
        f21519OooOooo = new nn0(0, 0, 0, objArr, objArr);
    }

    public nn0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f21521OooOoO0 = objArr;
        this.f21520OooOoO = i;
        this.f21522OooOoOO = objArr2;
        this.f21524OooOoo0 = i2;
        this.f21523OooOoo = i3;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final int OooO0o() {
        return this.f21523OooOoo;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final int OooO0o0(int i, Object[] objArr) {
        Object[] objArr2 = this.f21521OooOoO0;
        int i2 = this.f21523OooOoo;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final int OooO0oO() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final vn0 OooOO0() {
        return OooO().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final boolean OooOO0O() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final Object[] OooOO0o() {
        return this.f21521OooOoO0;
    }

    @Override // com.google.android.gms.internal.ads.um0
    public final rm0 OooOOO() {
        return rm0.OooOOO(this.f21523OooOoo, this.f21521OooOoO0);
    }

    @Override // com.google.android.gms.internal.ads.mm0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f21522OooOoOO;
            if (objArr.length != 0) {
                int iOooOo = ii0.OooOo(obj);
                while (true) {
                    int i = iOooOo & this.f21524OooOoo0;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iOooOo = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.um0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f21520OooOoO;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return OooO().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f21523OooOoo;
    }
}
