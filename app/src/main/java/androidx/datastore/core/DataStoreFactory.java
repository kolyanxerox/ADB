package androidx.datastore.core;

import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.List;
import kotlin.jvm.internal.OooOo;
import o00O0.oo000o;
import o00O0Oo.OooO0O0;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0O0;
import o00O0oOo.o000OO;
import o00OO00o.OooO;
import o00OO00o.OooO0o;

/* loaded from: classes.dex */
public final class DataStoreFactory {
    public static final DataStoreFactory INSTANCE = new DataStoreFactory();

    private DataStoreFactory() {
    }

    public static /* synthetic */ DataStore create$default(DataStoreFactory dataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, o000OO o000oo2, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            list = oo000o.f31251OooOo0O;
        }
        if ((i & 8) != 0) {
            o000oo2 = o0000OO0.OooO0O0(Actual_jvmKt.ioDispatcher().plus(o0000OO0.OooO0o0()));
        }
        return dataStoreFactory.create(storage, replaceFileCorruptionHandler, list, o000oo2);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, OooO0O0 produceFile) {
        OooOo.OooO0o0(serializer, "serializer");
        OooOo.OooO0o0(migrations, "migrations");
        OooOo.OooO0o0(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, migrations, null, produceFile, 8, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, OooO0O0 produceFile) {
        OooOo.OooO0o0(serializer, "serializer");
        OooOo.OooO0o0(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, null, null, produceFile, 12, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, OooO0O0 produceFile) {
        OooOo.OooO0o0(serializer, "serializer");
        OooOo.OooO0o0(produceFile, "produceFile");
        return create$default(this, serializer, null, null, null, produceFile, 14, null);
    }

    public static DataStore create$default(DataStoreFactory dataStoreFactory, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, o000OO o000oo2, OooO0O0 oooO0O0, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        ReplaceFileCorruptionHandler replaceFileCorruptionHandler2 = replaceFileCorruptionHandler;
        if ((i & 4) != 0) {
            list = oo000o.f31251OooOo0O;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            OooO oooO = o000O0O0.f31514OooO00o;
            o000oo2 = o0000OO0.OooO0O0(OooO0o.f31999OooOo0O.plus(o0000OO0.OooO0o0()));
        }
        return dataStoreFactory.create(serializer, replaceFileCorruptionHandler2, list2, o000oo2, oooO0O0);
    }

    public final <T> DataStore<T> create(Storage<T> storage) {
        OooOo.OooO0o0(storage, "storage");
        return create$default(this, storage, null, null, null, 14, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler) {
        OooOo.OooO0o0(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, null, null, 12, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations) {
        OooOo.OooO0o0(storage, "storage");
        OooOo.OooO0o0(migrations, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, migrations, null, 8, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, o000OO scope, OooO0O0 produceFile) {
        OooOo.OooO0o0(serializer, "serializer");
        OooOo.OooO0o0(migrations, "migrations");
        OooOo.OooO0o0(scope, "scope");
        OooOo.OooO0o0(produceFile, "produceFile");
        return create(new FileStorage(serializer, null, produceFile, 2, null), replaceFileCorruptionHandler, migrations, scope);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, o000OO scope) {
        OooOo.OooO0o0(storage, "storage");
        OooOo.OooO0o0(migrations, "migrations");
        OooOo.OooO0o0(scope, "scope");
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(storage, o0OO0O0.OooOO0o(DataMigrationInitializer.Companion.getInitializer(migrations)), replaceFileCorruptionHandler, scope);
    }
}
