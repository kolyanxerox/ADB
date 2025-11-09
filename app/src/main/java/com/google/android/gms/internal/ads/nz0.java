package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class nz0 {

    /* renamed from: OooO00o */
    public int f21616OooO00o;

    /* renamed from: OooO0O0 */
    public Object f21617OooO0O0;

    public static int OooO0O0(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long OooO0OO(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static com.google.crypto.tink.shaded.protobuf.OooOOO OooO0o(byte[] bArr, int i, int i2, boolean z) {
        com.google.crypto.tink.shaded.protobuf.OooOOO oooOOO = new com.google.crypto.tink.shaded.protobuf.OooOOO(bArr, i, i2, z);
        try {
            oooOOO.OooO0oo(i2);
            return oooOOO;
        } catch (com.google.crypto.tink.shaded.protobuf.o000OOo e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int OooOoo(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long OooOooO(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static kz0 OooOooo(byte[] bArr, int i, int i2) {
        kz0 kz0Var = new kz0(bArr, i, i2);
        try {
            kz0Var.Oooo0(i2);
            return kz0Var;
        } catch (k01 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract boolean OooO();

    public abstract void OooO00o(int i);

    public abstract int OooO0Oo();

    public abstract boolean OooO0o0();

    public abstract void OooO0oO(int i);

    public abstract int OooO0oo(int i);

    public abstract com.google.crypto.tink.shaded.protobuf.OooOO0O OooOO0();

    public abstract double OooOO0O();

    public abstract int OooOO0o();

    public abstract long OooOOO();

    public abstract int OooOOO0();

    public abstract float OooOOOO();

    public abstract int OooOOOo();

    public abstract int OooOOo();

    public abstract long OooOOo0();

    public abstract long OooOOoo();

    public abstract int OooOo();

    public abstract long OooOo0();

    public abstract int OooOo00();

    public abstract String OooOo0O();

    public abstract String OooOo0o();

    public abstract long OooOoO();

    public abstract int OooOoO0();

    public abstract boolean OooOoOO();

    public abstract boolean OooOoo0();

    public abstract int Oooo();

    public abstract int Oooo0(int i);

    public abstract double Oooo000();

    public abstract float Oooo00O();

    public abstract int Oooo00o();

    public abstract int Oooo0O0();

    public abstract int Oooo0OO();

    public abstract int Oooo0o();

    public abstract int Oooo0o0();

    public abstract int Oooo0oO();

    public abstract int Oooo0oo();

    public abstract long OoooO();

    public abstract long OoooO0();

    public abstract long OoooO00();

    public abstract long OoooO0O();

    public abstract long OoooOO0();

    public abstract String OoooOOO();

    public abstract String OoooOOo();

    public abstract void OoooOo0();

    public abstract void OoooOoO(int i);

    public abstract hz0 o000oOoO();
}
