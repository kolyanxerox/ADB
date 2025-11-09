package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class kq0 extends TimeoutException {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f20659OooOo0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kq0(String str, int i) {
        super(str);
        this.f20659OooOo0O = i;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i = this.f20659OooOo0O;
        synchronized (this) {
            switch (i) {
                case 0:
                    setStackTrace(new StackTraceElement[0]);
                    return this;
                default:
                    setStackTrace(new StackTraceElement[0]);
                    return this;
            }
        }
    }
}
