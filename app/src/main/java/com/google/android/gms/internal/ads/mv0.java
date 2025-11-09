package com.google.android.gms.internal.ads;

import com.ironsource.InterfaceC3771vj;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes2.dex */
public class mv0 extends hn0 {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f21356OooOo0o;

    public mv0() {
        this.f21356OooOo0o = 1;
    }

    public static mv0 OooO00o(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? InterfaceC3771vj.b.f12380b : iOException instanceof InterruptedIOException ? 1004 : (message == null || !xh0.OooOOo0(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new bv0("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007, 1) : new mv0(iOException, i2, i);
    }

    public mv0(IOException iOException, int i, int i2) {
        super(iOException, i == 2000 ? i2 != 1 ? 2000 : 2001 : i);
        this.f21356OooOo0o = i2;
    }

    public mv0(String str, int i, int i2) {
        super(str, i == 2000 ? i2 != 1 ? 2000 : 2001 : i);
        this.f21356OooOo0o = i2;
    }

    public mv0(String str, IOException iOException, int i, int i2) {
        super(i == 2000 ? i2 != 1 ? 2000 : 2001 : i, str, iOException);
        this.f21356OooOo0o = i2;
    }
}
