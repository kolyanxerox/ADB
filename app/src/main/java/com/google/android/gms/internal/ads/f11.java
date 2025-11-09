package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class f11 extends jz0 {

    /* renamed from: OooOoo, reason: collision with root package name */
    public static final int[] f18756OooOoo = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: OooOo, reason: collision with root package name */
    public final int f18757OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final jz0 f18758OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final jz0 f18759OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final int f18760OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final int f18761OooOoo0;

    public f11(jz0 jz0Var, jz0 jz0Var2) {
        this.f18759OooOoO0 = jz0Var;
        this.f18758OooOoO = jz0Var2;
        int iOooOO0 = jz0Var.OooOO0();
        this.f18760OooOoOO = iOooOO0;
        this.f18757OooOo = jz0Var2.OooOO0() + iOooOO0;
        this.f18761OooOoo0 = Math.max(jz0Var.OooOO0o(), jz0Var2.OooOO0o()) + 1;
    }

    public static int OooOo0o(int i) {
        int[] iArr = f18756OooOoo;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public final byte OooO0o(int i) {
        jz0.OooOo0O(i, this.f18757OooOo);
        return OooO0oO(i);
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public final byte OooO0oO(int i) {
        int i2 = this.f18760OooOoOO;
        return i < i2 ? this.f18759OooOoO0.OooO0oO(i) : this.f18758OooOoO.OooO0oO(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public final int OooOO0() {
        return this.f18757OooOo;
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public final void OooOO0O(int i, byte[] bArr, int i2, int i3) {
        int i4 = i + i3;
        jz0 jz0Var = this.f18759OooOoO0;
        int i5 = this.f18760OooOoOO;
        if (i4 <= i5) {
            jz0Var.OooOO0O(i, bArr, i2, i3);
            return;
        }
        jz0 jz0Var2 = this.f18758OooOoO;
        if (i >= i5) {
            jz0Var2.OooOO0O(i - i5, bArr, i2, i3);
            return;
        }
        int i6 = i5 - i;
        jz0Var.OooOO0O(i, bArr, i2, i6);
        jz0Var2.OooOO0O(0, bArr, i2 + i6, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public final int OooOO0o() {
        return this.f18761OooOoo0;
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public final int OooOOO(int i, int i2, int i3) {
        int i4 = i2 + i3;
        jz0 jz0Var = this.f18759OooOoO0;
        int i5 = this.f18760OooOoOO;
        if (i4 <= i5) {
            return jz0Var.OooOOO(i, i2, i3);
        }
        jz0 jz0Var2 = this.f18758OooOoO;
        if (i2 >= i5) {
            return jz0Var2.OooOOO(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return jz0Var2.OooOOO(jz0Var.OooOOO(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public final boolean OooOOO0() {
        return this.f18757OooOo >= OooOo0o(this.f18761OooOoo0);
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public final jz0 OooOOOO(int i, int i2) {
        int i3 = this.f18757OooOo;
        int iOooOOo = jz0.OooOOo(i, i2, i3);
        if (iOooOOo == 0) {
            return jz0.f20406OooOo0o;
        }
        if (iOooOOo == i3) {
            return this;
        }
        jz0 jz0Var = this.f18759OooOoO0;
        int i4 = this.f18760OooOoOO;
        if (i2 <= i4) {
            return jz0Var.OooOOOO(i, i2);
        }
        jz0 jz0Var2 = this.f18758OooOoO;
        if (i < i4) {
            return new f11(jz0Var.OooOOOO(i, jz0Var.OooOO0()), jz0Var2.OooOOOO(0, i2 - i4));
        }
        return jz0Var2.OooOOOO(i - i4, i2 - i4);
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public final nz0 OooOOOo() {
        hz0 hz0Var;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f18761OooOoo0);
        arrayDeque.push(this);
        jz0 jz0Var = this.f18759OooOoO0;
        while (jz0Var instanceof f11) {
            f11 f11Var = (f11) jz0Var;
            arrayDeque.push(f11Var);
            jz0Var = f11Var.f18759OooOoO0;
        }
        hz0 hz0Var2 = (hz0) jz0Var;
        while (true) {
            if (!(hz0Var2 != null)) {
                int size = arrayList.size();
                int i = 0;
                int iRemaining = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    iRemaining += byteBuffer.remaining();
                    i = byteBuffer.hasArray() ? i | 1 : byteBuffer.isDirect() ? i | 2 : i | 4;
                }
                if (i == 2) {
                    return new lz0(iRemaining, arrayList);
                }
                l01 l01Var = new l01();
                l01Var.f20758OooOo0o = arrayList.iterator();
                l01Var.f20760OooOoO0 = 0;
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    l01Var.f20760OooOoO0++;
                }
                l01Var.f20759OooOoO = -1;
                if (!l01Var.OooO0Oo()) {
                    l01Var.f20756OooOo = i01.f19890OooO0OO;
                    l01Var.f20759OooOoO = 0;
                    l01Var.f20761OooOoOO = 0;
                    l01Var.f20765OooOooo = 0L;
                }
                return new mz0(l01Var);
            }
            if (hz0Var2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                if (arrayDeque.isEmpty()) {
                    hz0Var = null;
                    break;
                }
                jz0 jz0Var2 = ((f11) arrayDeque.pop()).f18758OooOoO;
                while (jz0Var2 instanceof f11) {
                    f11 f11Var2 = (f11) jz0Var2;
                    arrayDeque.push(f11Var2);
                    jz0Var2 = f11Var2.f18759OooOoO0;
                }
                hz0Var = (hz0) jz0Var2;
                if (hz0Var.OooOO0() != 0) {
                    break;
                }
            }
            arrayList.add(ByteBuffer.wrap(hz0Var2.f19882OooOo, hz0Var2.OooOo0o(), hz0Var2.OooOO0()).asReadOnlyBuffer());
            hz0Var2 = hz0Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public final void OooOOo0(rz0 rz0Var) {
        this.f18759OooOoO0.OooOOo0(rz0Var);
        this.f18758OooOoO.OooOOo0(rz0Var);
    }

    @Override // com.google.android.gms.internal.ads.jz0
    /* renamed from: OooOOoo */
    public final vn0 iterator() {
        return new d11(this);
    }

    @Override // com.google.android.gms.internal.ads.jz0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jz0) {
            jz0 jz0Var = (jz0) obj;
            int iOooOO0 = jz0Var.OooOO0();
            int i = this.f18757OooOo;
            if (i == iOooOO0) {
                if (i == 0) {
                    return true;
                }
                int i2 = this.f20407OooOo0O;
                int i3 = jz0Var.f20407OooOo0O;
                if (i2 == 0 || i3 == 0 || i2 == i3) {
                    e11 e11Var = new e11(this);
                    hz0 next = e11Var.next();
                    e11 e11Var2 = new e11(jz0Var);
                    hz0 next2 = e11Var2.next();
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        int iOooOO02 = next.OooOO0() - i4;
                        int iOooOO03 = next2.OooOO0() - i5;
                        int iMin = Math.min(iOooOO02, iOooOO03);
                        if (!(i4 == 0 ? next.OooOo(next2, i5, iMin) : next2.OooOo(next, i4, iMin))) {
                            break;
                        }
                        i6 += iMin;
                        if (i6 >= i) {
                            if (i6 == i) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == iOooOO02) {
                            next = e11Var.next();
                            i4 = 0;
                        } else {
                            i4 += iMin;
                        }
                        if (iMin == iOooOO03) {
                            next2 = e11Var2.next();
                            i5 = 0;
                        } else {
                            i5 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.jz0, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new d11(this);
    }
}
