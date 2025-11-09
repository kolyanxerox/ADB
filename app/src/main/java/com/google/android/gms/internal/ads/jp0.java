package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public abstract class jp0 extends wo0 {

    /* renamed from: OooOooo */
    public static final xh0 f20346OooOooo;

    /* renamed from: Oooo000 */
    public static final bq0 f20347Oooo000 = new bq0(jp0.class, 0);

    /* renamed from: OooOoo */
    public volatile Set f20348OooOoo;

    /* renamed from: OooOooO */
    public volatile int f20349OooOooO;

    static {
        Throwable th;
        xh0 ip0Var;
        try {
            ip0Var = new hp0(AtomicReferenceFieldUpdater.newUpdater(jp0.class, Set.class, "OooOoo"), AtomicIntegerFieldUpdater.newUpdater(jp0.class, "OooOooO"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            ip0Var = new ip0(15);
        }
        Throwable th3 = th;
        f20346OooOooo = ip0Var;
        if (th3 != null) {
            f20347Oooo000.OooO00o().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }
}
