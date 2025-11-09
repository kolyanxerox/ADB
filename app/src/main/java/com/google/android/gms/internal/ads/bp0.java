package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class bp0 {
    public static /* synthetic */ boolean OooO00o(Unsafe unsafe, ap0 ap0Var, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(ap0Var, j, obj, obj2)) {
            if (unsafe.getObject(ap0Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
