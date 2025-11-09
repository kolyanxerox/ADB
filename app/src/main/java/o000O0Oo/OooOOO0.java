package o000O0oO;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import kotlin.jvm.internal.OooO0o;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.o00Oo0;
import kotlin.jvm.internal.o0OO00O;
import o00O0Oo.Oooo000;
import o00O0o0o.o00000O;

/* loaded from: classes2.dex */
public final class OooOOO0 {

    /* renamed from: OooO0Oo */
    public static final /* synthetic */ o00000O[] f30151OooO0Oo;

    /* renamed from: OooO00o */
    public final String f30152OooO00o;

    /* renamed from: OooO0O0 */
    public final ThreadLocal f30153OooO0O0;

    /* renamed from: OooO0OO */
    public final DataStore f30154OooO0OO;

    static {
        o00Oo0 o00oo0 = new o00Oo0(OooO0o.NO_RECEIVER, OooOOO0.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        o0OO00O.f28878OooO00o.getClass();
        f30151OooO0Oo = new o00000O[]{o00oo0};
    }

    public OooOOO0(Context context, String name) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(name, "name");
        this.f30152OooO00o = name;
        this.f30153OooO0O0 = new ThreadLocal();
        this.f30154OooO0OO = (DataStore) PreferenceDataStoreDelegateKt.preferencesDataStore$default(name, null, new com.ironsource.sdk.controller.OooO0o(this, 1), null, 10, null).getValue(context, f30151OooO0Oo[0]);
    }

    public final void OooO00o(Oooo000 oooo000) {
    }
}
