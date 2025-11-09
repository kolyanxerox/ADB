package androidx.datastore.preferences.core;

import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.Storage;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.core.okio.OkioStorage;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0.oo000o;
import o00O0Oo.OooO0O0;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0O0;
import o00O0oOo.o000OO;
import o00OO00o.OooO;
import o00OO00o.OooO0o;
import o00OOOoO.o0000O;
import o00OOOoO.o000O0Oo;

/* loaded from: classes.dex */
public final class PreferenceDataStoreFactory {
    public static final PreferenceDataStoreFactory INSTANCE = new PreferenceDataStoreFactory();

    /* renamed from: androidx.datastore.preferences.core.PreferenceDataStoreFactory$createWithPath$1 */
    public static final class C03471 extends Oooo000 implements OooO0O0 {
        final /* synthetic */ OooO0O0 $produceFile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03471(OooO0O0 oooO0O0) {
            super(0);
            this.$produceFile = oooO0O0;
        }

        @Override // o00O0Oo.OooO0O0
        public final File invoke() {
            return ((o000O0Oo) this.$produceFile.invoke()).OooO0o0();
        }
    }

    private PreferenceDataStoreFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, o000OO o000oo2, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            list = oo000o.f31251OooOo0O;
        }
        if ((i & 8) != 0) {
            o000oo2 = o0000OO0.OooO0O0(Actual_jvmKt.ioDispatcher().plus(o0000OO0.OooO0o0()));
        }
        return preferenceDataStoreFactory.create((Storage<Preferences>) storage, (ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, o000oo2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore createWithPath$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, o000OO o000oo2, OooO0O0 oooO0O0, int i, Object obj) {
        if ((i & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 2) != 0) {
            list = oo000o.f31251OooOo0O;
        }
        if ((i & 4) != 0) {
            o000oo2 = o0000OO0.OooO0O0(Actual_jvmKt.ioDispatcher().plus(o0000OO0.OooO0o0()));
        }
        return preferenceDataStoreFactory.createWithPath(replaceFileCorruptionHandler, list, o000oo2, oooO0O0);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage) {
        OooOo.OooO0o0(storage, "storage");
        return create$default(this, storage, (ReplaceFileCorruptionHandler) null, (List) null, (o000OO) null, 14, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, OooO0O0 produceFile) {
        OooOo.OooO0o0(migrations, "migrations");
        OooOo.OooO0o0(produceFile, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, migrations, null, produceFile, 4, null);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler) {
        OooOo.OooO0o0(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, (List) null, (o000OO) null, 12, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, OooO0O0 produceFile) {
        OooOo.OooO0o0(produceFile, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, null, null, produceFile, 6, null);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations) {
        OooOo.OooO0o0(storage, "storage");
        OooOo.OooO0o0(migrations, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, migrations, (o000OO) null, 8, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(OooO0O0 produceFile) {
        OooOo.OooO0o0(produceFile, "produceFile");
        return createWithPath$default(this, null, null, null, produceFile, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, o000OO o000oo2, OooO0O0 oooO0O0, int i, Object obj) {
        if ((i & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 2) != 0) {
            list = oo000o.f31251OooOo0O;
        }
        if ((i & 4) != 0) {
            OooO oooO = o000O0O0.f31514OooO00o;
            o000oo2 = o0000OO0.OooO0O0(OooO0o.f31999OooOo0O.plus(o0000OO0.OooO0o0()));
        }
        return preferenceDataStoreFactory.create((ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, o000oo2, oooO0O0);
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, OooO0O0 produceFile) {
        OooOo.OooO0o0(migrations, "migrations");
        OooOo.OooO0o0(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, migrations, (o000OO) null, produceFile, 4, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, o000OO scope, OooO0O0 produceFile) {
        OooOo.OooO0o0(migrations, "migrations");
        OooOo.OooO0o0(scope, "scope");
        OooOo.OooO0o0(produceFile, "produceFile");
        return create(replaceFileCorruptionHandler, migrations, scope, new C03471(produceFile));
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, OooO0O0 produceFile) {
        OooOo.OooO0o0(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, (List) null, (o000OO) null, produceFile, 6, (Object) null);
    }

    public final DataStore<Preferences> create(OooO0O0 produceFile) {
        OooOo.OooO0o0(produceFile, "produceFile");
        return create$default(this, (ReplaceFileCorruptionHandler) null, (List) null, (o000OO) null, produceFile, 7, (Object) null);
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, o000OO scope, OooO0O0 produceFile) {
        OooOo.OooO0o0(migrations, "migrations");
        OooOo.OooO0o0(scope, "scope");
        OooOo.OooO0o0(produceFile, "produceFile");
        return new PreferenceDataStore(create(new OkioStorage(o0000O.f32552OooO00o, PreferencesSerializer.INSTANCE, null, new PreferenceDataStoreFactory$create$delegate$1(produceFile), 4, null), replaceFileCorruptionHandler, migrations, scope));
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, o000OO scope) {
        OooOo.OooO0o0(storage, "storage");
        OooOo.OooO0o0(migrations, "migrations");
        OooOo.OooO0o0(scope, "scope");
        return new PreferenceDataStore(DataStoreFactory.INSTANCE.create(storage, replaceFileCorruptionHandler, migrations, scope));
    }
}
