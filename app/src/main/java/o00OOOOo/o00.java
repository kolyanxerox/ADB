package o00OOOoO;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes3.dex */
public interface o00 extends Closeable, Flushable, AutoCloseable {
    void OooOO0(long j, o0000 o0000Var);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    o00O000 timeout();
}
