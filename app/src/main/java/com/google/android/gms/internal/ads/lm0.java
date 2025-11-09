package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class lm0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f20904OooO00o = 1;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public Object[] f20905OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f20906OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f20907OooO0Oo;

    public lm0() {
        com.google.android.gms.internal.play_billing.o0O000Oo.OooO0oo(4, "initialCapacity");
        this.f20905OooO0O0 = new Object[4];
        this.f20906OooO0OO = 0;
    }

    public static int OooO0OO(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public static int OooO0o(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public final void OooO00o(Object obj) {
        switch (this.f20904OooO00o) {
            case 0:
                obj.getClass();
                OooO0oO(1);
                Object[] objArr = this.f20905OooO0O0;
                int i = this.f20906OooO0OO;
                this.f20906OooO0OO = i + 1;
                objArr[i] = obj;
                break;
            default:
                obj.getClass();
                OooO0o0(1);
                Object[] objArr2 = this.f20905OooO0O0;
                int i2 = this.f20906OooO0OO;
                this.f20906OooO0OO = i2 + 1;
                objArr2[i2] = obj;
                break;
        }
    }

    public abstract lm0 OooO0O0(Object obj);

    public void OooO0Oo(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            OooO0oO(collection.size());
            if (collection instanceof mm0) {
                this.f20906OooO0OO = ((mm0) collection).OooO0o0(this.f20906OooO0OO, this.f20905OooO0O0);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            OooO0O0(it.next());
        }
    }

    public void OooO0o0(int i) {
        int length = this.f20905OooO0O0.length;
        int iOooO0OO = OooO0OO(length, this.f20906OooO0OO + i);
        if (iOooO0OO > length || this.f20907OooO0Oo) {
            this.f20905OooO0O0 = Arrays.copyOf(this.f20905OooO0O0, iOooO0OO);
            this.f20907OooO0Oo = false;
        }
    }

    public void OooO0oO(int i) {
        int length = this.f20905OooO0O0.length;
        int iOooO0o = OooO0o(length, this.f20906OooO0OO + i);
        if (iOooO0o > length || this.f20907OooO0Oo) {
            this.f20905OooO0O0 = Arrays.copyOf(this.f20905OooO0O0, iOooO0o);
            this.f20907OooO0Oo = false;
        }
    }

    public lm0(int i) {
        xh0.OooOOoo(i, "initialCapacity");
        this.f20905OooO0O0 = new Object[i];
        this.f20906OooO0OO = 0;
    }
}
