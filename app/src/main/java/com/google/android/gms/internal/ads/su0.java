package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class su0 implements vu0 {

    /* renamed from: OooO00o */
    public final String f24163OooO00o;

    /* renamed from: OooO0O0 */
    public final az0 f24164OooO0O0;

    /* renamed from: OooO0OO */
    public final jz0 f24165OooO0OO;

    /* renamed from: OooO0Oo */
    public final int f24166OooO0Oo;

    /* renamed from: OooO0o */
    public final Integer f24167OooO0o;

    /* renamed from: OooO0o0 */
    public final fy0 f24168OooO0o0;

    public su0(String str, az0 az0Var, jz0 jz0Var, int i, fy0 fy0Var, Integer num) {
        this.f24163OooO00o = str;
        this.f24164OooO0O0 = az0Var;
        this.f24165OooO0OO = jz0Var;
        this.f24166OooO0Oo = i;
        this.f24168OooO0o0 = fy0Var;
        this.f24167OooO0o = num;
    }

    public static su0 OooO00o(String str, jz0 jz0Var, int i, fy0 fy0Var, Integer num) throws GeneralSecurityException {
        if (fy0Var == fy0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new su0(str, zu0.OooO00o(str), jz0Var, i, fy0Var, num);
    }
}
