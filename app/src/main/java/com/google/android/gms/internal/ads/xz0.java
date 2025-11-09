package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class xz0 implements Cloneable {

    /* renamed from: OooOo0O */
    public final zz0 f25821OooOo0O;

    /* renamed from: OooOo0o */
    public zz0 f25822OooOo0o;

    public xz0(zz0 zz0Var) {
        this.f25821OooOo0O = zz0Var;
        if (zz0Var.OooOOo()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f25822OooOo0o = zz0Var.OooOOO();
    }

    public static void OooO0o0(int i, List list) {
        String strOooO0oO = OooO0oO.OooOo.OooO0oO(list.size() - i, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(strOooO0oO);
            }
            list.remove(size);
        }
    }

    public final void OooO00o(byte[] bArr, tz0 tz0Var) throws k01 {
        int length = bArr.length;
        OooO0Oo();
        try {
            a11.f16875OooO0OO.OooO00o(this.f25822OooOo0o.getClass()).OooO0OO(this.f25822OooOo0o, bArr, 0, length, new ez0(tz0Var));
        } catch (k01 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new k01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final zz0 OooO0O0() {
        zz0 zz0VarOooO0OO = OooO0OO();
        zz0VarOooO0OO.getClass();
        if (zz0.OooOo0O(zz0VarOooO0OO, true)) {
            return zz0VarOooO0OO;
        }
        throw new k11();
    }

    public final zz0 OooO0OO() {
        if (!this.f25822OooOo0o.OooOOo()) {
            return this.f25822OooOo0o;
        }
        zz0 zz0Var = this.f25822OooOo0o;
        zz0Var.getClass();
        a11.f16875OooO0OO.OooO00o(zz0Var.getClass()).OooO00o(zz0Var);
        zz0Var.OooOO0();
        return this.f25822OooOo0o;
    }

    public final void OooO0Oo() {
        if (this.f25822OooOo0o.OooOOo()) {
            return;
        }
        zz0 zz0VarOooOOO = this.f25821OooOo0O.OooOOO();
        a11.f16875OooO0OO.OooO00o(zz0VarOooOOO.getClass()).OooO0O0(zz0VarOooOOO, this.f25822OooOo0o);
        this.f25822OooOo0o = zz0VarOooOOO;
    }

    public final Object clone() {
        xz0 xz0Var = (xz0) this.f25821OooOo0O.OooOOoo(5, null);
        xz0Var.f25822OooOo0o = OooO0OO();
        return xz0Var;
    }
}
