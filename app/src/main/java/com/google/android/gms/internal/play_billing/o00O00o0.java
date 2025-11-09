package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class o00O00o0 {
    public static /* synthetic */ boolean OooO00o(Unsafe unsafe, o00O00O o00o00o, long j, Object obj, Object obj2) {
        while (!o00O00OO.OooO00o(unsafe, o00o00o, j, obj, obj2)) {
            if (unsafe.getObject(o00o00o, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
