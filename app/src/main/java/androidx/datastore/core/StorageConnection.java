package androidx.datastore.core;

import o00O0O0O.OooO0OO;
import o00O0Oo.o00O0O;
import o00O0Oo.o00Oo0;

/* loaded from: classes.dex */
public interface StorageConnection<T> extends Closeable {
    InterProcessCoordinator getCoordinator();

    <R> Object readScope(o00Oo0 o00oo0, OooO0OO oooO0OO);

    Object writeScope(o00O0O o00o0o, OooO0OO oooO0OO);
}
