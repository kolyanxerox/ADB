package androidx.datastore;

import android.content.Context;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
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
public final class DataStoreDelegateKt {

    /* renamed from: androidx.datastore.DataStoreDelegateKt$dataStore$1 */
    public static final class C02851 extends Oooo000 implements o00O0Oo.Oooo000 {
        public static final C02851 INSTANCE = new C02851();

        public C02851() {
            super(1);
        }

        @Override // o00O0Oo.Oooo000
        public final List invoke(Context it) {
            OooOo.OooO0o0(it, "it");
            return oo000o.f31251OooOo0O;
        }
    }

    public static final <T> OooOOO dataStore(String fileName, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, o00O0Oo.Oooo000 produceMigrations, o000OO scope) {
        OooOo.OooO0o0(fileName, "fileName");
        OooOo.OooO0o0(serializer, "serializer");
        OooOo.OooO0o0(produceMigrations, "produceMigrations");
        OooOo.OooO0o0(scope, "scope");
        return new DataStoreSingletonDelegate(fileName, new OkioSerializerWrapper(serializer), replaceFileCorruptionHandler, produceMigrations, scope);
    }

    public static OooOOO dataStore$default(String str, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, o00O0Oo.Oooo000 oooo000, o000OO o000oo2, int i, Object obj) {
        if ((i & 4) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 8) != 0) {
            oooo000 = C02851.INSTANCE;
        }
        if ((i & 16) != 0) {
            OooO oooO = o000O0O0.f31514OooO00o;
            o000oo2 = o0000OO0.OooO0O0(OooO0o.f31999OooOo0O.plus(o0000OO0.OooO0o0()));
        }
        return dataStore(str, serializer, replaceFileCorruptionHandler, oooo000, o000oo2);
    }
}
