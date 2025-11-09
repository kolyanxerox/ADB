package androidx.datastore.core;

import o00O0O0O.OooO0OO;

/* loaded from: classes.dex */
public interface DataMigration<T> {
    Object cleanUp(OooO0OO oooO0OO);

    Object migrate(T t, OooO0OO oooO0OO);

    Object shouldMigrate(T t, OooO0OO oooO0OO);
}
