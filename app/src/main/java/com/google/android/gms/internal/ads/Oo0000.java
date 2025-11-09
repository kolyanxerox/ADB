package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* loaded from: classes2.dex */
public final class Oo0000 extends FilterInputStream implements AutoCloseable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final HttpURLConnection f16772OooOo0O;

    /* JADX WARN: Illegal instructions before constructor call */
    public Oo0000(HttpURLConnection httpURLConnection) throws IOException {
        InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        super(errorStream);
        this.f16772OooOo0O = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f16772OooOo0O.disconnect();
    }
}
