package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import java.util.List;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;
import o00O0o00.OooOOO;
import o00O0o0o.o00000O;
import o00O0oOo.o000OO;

/* loaded from: classes.dex */
public final class PreferenceDataStoreSingletonDelegate implements OooOOO {
    private volatile DataStore<Preferences> INSTANCE;
    private final ReplaceFileCorruptionHandler<Preferences> corruptionHandler;
    private final Object lock;
    private final String name;
    private final Oooo000 produceMigrations;
    private final o000OO scope;

    public PreferenceDataStoreSingletonDelegate(String name, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, Oooo000 produceMigrations, o000OO scope) {
        OooOo.OooO0o0(name, "name");
        OooOo.OooO0o0(produceMigrations, "produceMigrations");
        OooOo.OooO0o0(scope, "scope");
        this.name = name;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // o00O0o00.OooOOO
    public DataStore<Preferences> getValue(Context thisRef, o00000O property) {
        DataStore<Preferences> dataStore;
        OooOo.OooO0o0(thisRef, "thisRef");
        OooOo.OooO0o0(property, "property");
        DataStore<Preferences> dataStore2 = this.INSTANCE;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    PreferenceDataStoreFactory preferenceDataStoreFactory = PreferenceDataStoreFactory.INSTANCE;
                    ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler = this.corruptionHandler;
                    Oooo000 oooo000 = this.produceMigrations;
                    OooOo.OooO0Oo(applicationContext, "applicationContext");
                    this.INSTANCE = preferenceDataStoreFactory.create(replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) oooo000.invoke(applicationContext), this.scope, new PreferenceDataStoreSingletonDelegate$getValue$1$1(applicationContext, this));
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
