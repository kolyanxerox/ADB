package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class tm0 extends lm0 {

    /* renamed from: OooO0o */
    public int f24347OooO0o;

    /* renamed from: OooO0o0 */
    public Object[] f24348OooO0o0;

    public final void OooO(Iterable iterable) {
        iterable.getClass();
        if (this.f24348OooO0o0 == null) {
            OooO0Oo(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            OooO0oo(it.next());
        }
    }

    @Override // com.google.android.gms.internal.ads.lm0
    public final /* bridge */ /* synthetic */ lm0 OooO0O0(Object obj) {
        OooO0oo(obj);
        return this;
    }

    public final void OooO0oo(Object obj) {
        obj.getClass();
        if (this.f24348OooO0o0 != null) {
            int iOooOOO0 = um0.OooOOO0(this.f20906OooO0OO);
            Object[] objArr = this.f24348OooO0o0;
            if (iOooOOO0 <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iOooO00o = ii0.OooO00o(iHashCode);
                while (true) {
                    int i = iOooO00o & length;
                    Object[] objArr2 = this.f24348OooO0o0;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.f24347OooO0o += iHashCode;
                        OooO00o(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iOooO00o = i + 1;
                    }
                }
            }
        }
        this.f24348OooO0o0 = null;
        OooO00o(obj);
    }

    public final um0 OooOO0() {
        um0 um0VarOooOOOo;
        int i = this.f20906OooO0OO;
        if (i == 0) {
            return nn0.f21519OooOooo;
        }
        if (i == 1) {
            Object obj = this.f20905OooO0O0[0];
            Objects.requireNonNull(obj);
            return new tn0(obj);
        }
        if (this.f24348OooO0o0 == null || um0.OooOOO0(i) != this.f24348OooO0o0.length) {
            um0VarOooOOOo = um0.OooOOOo(this.f20906OooO0OO, this.f20905OooO0O0);
            this.f20906OooO0OO = um0VarOooOOOo.size();
        } else {
            int i2 = this.f20906OooO0OO;
            Object[] objArrCopyOf = this.f20905OooO0O0;
            int length = objArrCopyOf.length;
            if (i2 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            um0VarOooOOOo = new nn0(this.f24347OooO0o, r8.length - 1, this.f20906OooO0OO, objArrCopyOf, this.f24348OooO0o0);
        }
        this.f20907OooO0Oo = true;
        this.f24348OooO0o0 = null;
        return um0VarOooOOOo;
    }
}
