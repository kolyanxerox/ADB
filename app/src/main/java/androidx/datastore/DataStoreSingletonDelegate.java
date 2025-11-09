package androidx.datastore;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.core.okio.OkioSerializer;
import androidx.datastore.core.okio.OkioStorage;
import java.util.List;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;
import o00O0o00.OooOOO;
import o00O0o0o.o00000O;
import o00O0oOo.o000OO;
import o00OOOoO.o0000O;

/* loaded from: classes.dex */
public final class DataStoreSingletonDelegate<T> implements OooOOO {
    private volatile DataStore<T> INSTANCE;
    private final ReplaceFileCorruptionHandler<T> corruptionHandler;
    private final String fileName;
    private final Object lock;
    private final Oooo000 produceMigrations;
    private final o000OO scope;
    private final OkioSerializer<T> serializer;

    public DataStoreSingletonDelegate(String fileName, OkioSerializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, Oooo000 produceMigrations, o000OO scope) {
        OooOo.OooO0o0(fileName, "fileName");
        OooOo.OooO0o0(serializer, "serializer");
        OooOo.OooO0o0(produceMigrations, "produceMigrations");
        OooOo.OooO0o0(scope, "scope");
        this.fileName = fileName;
        this.serializer = serializer;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // o00O0o00.OooOOO
    public DataStore<T> getValue(Context thisRef, o00000O property) {
        DataStore<T> dataStore;
        OooOo.OooO0o0(thisRef, "thisRef");
        OooOo.OooO0o0(property, "property");
        DataStore<T> dataStore2 = this.INSTANCE;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    DataStoreFactory dataStoreFactory = DataStoreFactory.INSTANCE;
                    OkioStorage okioStorage = new OkioStorage(o0000O.f32552OooO00o, this.serializer, null, new DataStoreSingletonDelegate$getValue$1$1(applicationContext, this), 4, null);
                    ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler = this.corruptionHandler;
                    Oooo000 oooo000 = this.produceMigrations;
                    OooOo.OooO0Oo(applicationContext, "applicationContext");
                    this.INSTANCE = dataStoreFactory.create(okioStorage, replaceFileCorruptionHandler, (List) oooo000.invoke(applicationContext), this.scope);
                }
                dataStore = this.INSTANCE;
                OooOo.OooO0O0(dataStore);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dataStore;
    }
}
