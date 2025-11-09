package com.applovin.shadow.okio;

import java.io.EOFException;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
final class BlackholeSink implements Sink {
    @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // com.applovin.shadow.okio.Sink
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(Buffer source, long j) throws EOFException {
        OooOo.OooO0o0(source, "source");
        source.skip(j);
    }
}
