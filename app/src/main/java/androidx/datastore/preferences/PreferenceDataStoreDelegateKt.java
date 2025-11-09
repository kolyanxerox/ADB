package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.Preferences;
import java.util.List;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0.oo000o;
import o00O0o00.OooOOO;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0O0;
import o00O0oOo.o000OO;
import o00OO00o.OooO;
import o00OO00o.OooO0o;

/* loaded from: classes.dex */
public final class PreferenceDataStoreDelegateKt {

    /* renamed from: androidx.datastore.preferences.PreferenceDataStoreDelegateKt$preferencesDataStore$1 */
    public static final class C03401 extends Oooo000 implements o00O0Oo.Oooo000 {
        public static final C03401 INSTANCE = new C03401();

        public C03401() {
            super(1);
        }

        @Override // o00O0Oo.Oooo000
        public final List<DataMigration<Preferences>> invoke(Context it) {
            OooOo.OooO0o0(it, "it");
            return oo000o.f31251OooOo0O;
        }
    }

    public static final OooOOO preferencesDataStore(String name, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, o00O0Oo.Oooo000 produceMigrations, o000OO scope) {
        OooOo.OooO0o0(name, "name");
        OooOo.OooO0o0(produceMigrations, "produceMigrations");
        OooOo.OooO0o0(scope, "scope");
        return new PreferenceDataStoreSingletonDelegate(name, replaceFileCorruptionHandler, produceMigrations, scope);
    }

    public static OooOOO preferencesDataStore$default(String str, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, o00O0Oo.Oooo000 oooo000, o000OO o000oo2, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            oooo000 = C03401.INSTANCE;
        }
        if ((i & 8) != 0) {
            OooO oooO = o000O0O0.f31514OooO00o;
            o000oo2 = o0000OO0.OooO0O0(OooO0o.f31999OooOo0O.plus(o0000OO0.OooO0o0()));
        }
        return preferencesDataStore(str, replaceFileCorruptionHandler, oooo000, o000oo2);
    }
}
