package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.PushbackInputStream;

/* renamed from: com.google.android.gms.internal.ads.n4 */
/* loaded from: classes2.dex */
public final class C1850n4 extends PushbackInputStream implements AutoCloseable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ de0 f21409OooOo0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1850n4(de0 de0Var, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        this.f21409OooOo0O = de0Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        com.google.android.gms.internal.measurement.o0OOO00.OooO0o0((com.google.android.gms.internal.measurement.o0OOO00) this.f21409OooOo0O.f18243OooOoO0);
        super.close();
    }
}
