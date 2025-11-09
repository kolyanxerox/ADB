package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zt0 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final zt0 f26384OooO0O0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f26385OooO00o = new HashMap();

    static {
        mr0 mr0Var = new mr0(9);
        zt0 zt0Var = new zt0();
        try {
            zt0Var.OooO0O0(mr0Var, vt0.class);
            f26384OooO0O0 = zt0Var;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final ii0 OooO00o(yq0 yq0Var, Integer num) {
        ii0 ii0VarOooO00o;
        synchronized (this) {
            mr0 mr0Var = (mr0) this.f26385OooO00o.get(yq0Var.getClass());
            if (mr0Var == null) {
                throw new GeneralSecurityException("Cannot create a new key for parameters " + yq0Var.toString() + ": no key creator for this class was registered.");
            }
            ii0VarOooO00o = mr0Var.OooO00o(yq0Var, num);
        }
        return ii0VarOooO00o;
    }

    public final synchronized void OooO0O0(mr0 mr0Var, Class cls) {
        try {
            mr0 mr0Var2 = (mr0) this.f26385OooO00o.get(cls);
            if (mr0Var2 != null && !mr0Var2.equals(mr0Var)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
            }
            this.f26385OooO00o.put(cls, mr0Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
