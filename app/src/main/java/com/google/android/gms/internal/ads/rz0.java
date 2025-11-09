package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class rz0 extends ii0 {

    /* renamed from: OooOo */
    public static final Logger f23958OooOo = Logger.getLogger(rz0.class.getName());

    /* renamed from: OooOoO0 */
    public static final boolean f23959OooOoO0 = q11.f23485OooO0o0;

    /* renamed from: OooOo0o */
    public rh0 f23960OooOo0o;

    public static int o00oO0o(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int o00ooo(String str) {
        int length;
        try {
            length = s11.OooO0OO(str);
        } catch (r11 unused) {
            length = str.getBytes(i01.f19888OooO00o).length;
        }
        return oo000o(length) + length;
    }

    public static int oo000o(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public abstract void o00000(int i, int i2);

    public abstract void o000000(int i, bz0 bz0Var, g11 g11Var);

    public abstract void o000000O(int i, String str);

    public abstract void o000000o(int i, int i2);

    public abstract void o00000O(int i, long j);

    public abstract void o00000O0(int i);

    public abstract void o00000OO(long j);

    public abstract void o000OOo(int i);

    public final void o00oO0O(String str, r11 r11Var) throws pz0 {
        f23958OooOo.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) r11Var);
        byte[] bytes = str.getBytes(i01.f19888OooO00o);
        try {
            int length = bytes.length;
            o00000O0(length);
            OooOOo0(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new pz0(e);
        }
    }

    public abstract void o0O0O00(int i, int i2);

    public abstract void o0OO00O(int i, long j);

    public abstract void o0OOO0o(int i, int i2);

    public abstract void o0Oo0oo(int i);

    public abstract void o0ooOO0(byte b);

    public abstract void o0ooOOo(int i, boolean z);

    public abstract void o0ooOoO(int i, jz0 jz0Var);

    public abstract void oo0o0Oo(long j);
}
