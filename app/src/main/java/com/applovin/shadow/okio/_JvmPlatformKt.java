package com.applovin.shadow.okio;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.OooO0O0;
import o00O0oO.o0OO00O;

/* loaded from: classes2.dex */
public final class _JvmPlatformKt {
    public static final byte[] asUtf8ToByteArray(String str) {
        OooOo.OooO0o0(str, "<this>");
        byte[] bytes = str.getBytes(o0OO00O.f31451OooO00o);
        OooOo.OooO0Oo(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final ReentrantLock newLock() {
        return new ReentrantLock();
    }

    public static final String toUtf8String(byte[] bArr) {
        OooOo.OooO0o0(bArr, "<this>");
        return new String(bArr, o0OO00O.f31451OooO00o);
    }

    public static final <T> T withLock(ReentrantLock reentrantLock, OooO0O0 action) {
        OooOo.OooO0o0(reentrantLock, "<this>");
        OooOo.OooO0o0(action, "action");
        reentrantLock.lock();
        try {
            return (T) action.invoke();
        } finally {
            reentrantLock.unlock();
        }
    }
}
