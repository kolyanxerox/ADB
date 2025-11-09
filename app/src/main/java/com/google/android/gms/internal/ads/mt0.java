package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class mt0 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final Logger f21350OooO0OO = Logger.getLogger(mt0.class.getName());

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final mt0 f21351OooO0Oo = new mt0();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap f21352OooO00o = new ConcurrentHashMap();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap f21353OooO0O0 = new ConcurrentHashMap();

    public final synchronized void OooO00o(st0 st0Var) {
        OooO0O0(st0Var, 1);
    }

    public final synchronized void OooO0O0(st0 st0Var, int i) {
        if (!xh0.OooOo0O(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        OooO0Oo(st0Var);
    }

    public final synchronized st0 OooO0OO(String str) {
        if (!this.f21352OooO00o.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (st0) this.f21352OooO00o.get(str);
    }

    public final synchronized void OooO0Oo(st0 st0Var) {
        try {
            String str = st0Var.f24158OooO00o;
            if (this.f21353OooO0O0.containsKey(str) && !((Boolean) this.f21353OooO0O0.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            if (((st0) this.f21352OooO00o.get(str)) != null && !st0.class.equals(st0.class)) {
                f21350OooO0OO.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + st0.class.getName() + ", cannot be re-registered with " + st0.class.getName());
            }
            this.f21352OooO00o.putIfAbsent(str, st0Var);
            this.f21353OooO0O0.put(str, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }
}
