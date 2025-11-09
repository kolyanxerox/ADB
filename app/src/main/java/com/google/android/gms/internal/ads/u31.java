package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class u31 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u31(String str) {
        super(str);
        Oooo00O.o000000O.OooO0o(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u31(String str, Throwable th) {
        super(str, th);
        Oooo00O.o000000O.OooO0o(str, "Detail message must not be empty");
    }
}
