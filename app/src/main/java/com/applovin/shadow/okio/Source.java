package com.applovin.shadow.okio;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface Source extends Closeable, AutoCloseable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(Buffer buffer, long j) throws IOException;

    Timeout timeout();
}
