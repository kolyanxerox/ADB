package org.apache.tika.sax;

/* loaded from: classes3.dex */
public interface WriteLimiter {
    int getWriteLimit();

    boolean isThrowOnWriteLimitReached();
}
