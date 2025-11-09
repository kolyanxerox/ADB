package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class au0 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final au0 f17117OooO0O0 = new au0();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f17118OooO00o = new HashMap();

    public final synchronized void OooO00o(lr0 lr0Var, Class cls) {
        try {
            lr0 lr0Var2 = (lr0) this.f17118OooO00o.get(cls);
            if (lr0Var2 != null && !lr0Var2.equals(lr0Var)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f17118OooO00o.put(cls, lr0Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
