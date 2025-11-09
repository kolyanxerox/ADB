package com.google.firebase.sessions;

import OooO00o.OooO00o;
import OooOOO.OooO;
import OooOOoo.o0000OO0;
import OoooO0O.o0000O0O;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.datastore.core.MultiProcessDataStoreFactory;
import com.google.android.gms.internal.ads.C1386ai;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.jvm.internal.OooOo;
import o0000o0.Oooo0;
import o0000oOo.o0O00O0o;
import o0000oOo.o0OoO00O;
import o0000oo0.o00000OO;
import o0000oo0.o00Oo0;
import o0000oo0.o00Ooo;
import o0000oo0.oo0o0Oo;
import o000O0Oo.OooO0o;
import o000Oo00.OooOOO;
import o000Oo0O.OooOo00;
import o000o00o.o00;
import o000o00o.o00000;
import o000o00o.o000000;
import o000o00o.o000000O;
import o000o00o.o00000O;
import o000o00o.o00000O0;
import o000o00o.o000OOo;
import o000o00o.o000oOoO;
import o000o00o.o0O0O00;
import o000o00o.o0OOO0o;
import o000o0O0.OooOO0O;
import o00O0O0O.OooOOO0;
import o00O0oOo.o0000O00;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final o00000O Companion = new o00000O();
    private static final o00000OO appContext = o00000OO.OooO00o(Context.class);
    private static final o00000OO firebaseApp = o00000OO.OooO00o(Oooo0.class);
    private static final o00000OO firebaseInstallationsApi = o00000OO.OooO00o(o000Oo0O.Oooo0.class);
    private static final o00000OO backgroundDispatcher = new o00000OO(o0OoO00O.class, o0000O00.class);
    private static final o00000OO blockingDispatcher = new o00000OO(o0O00O0o.class, o0000O00.class);
    private static final o00000OO transportFactory = o00000OO.OooO00o(OooO.class);
    private static final o00000OO firebaseSessionsComponent = o00000OO.OooO00o(o0O0O00.class);

    static {
        try {
            MultiProcessDataStoreFactory.INSTANCE.getClass();
        } catch (NoClassDefFoundError unused) {
            Log.w("FirebaseSessions", "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    public static final o0OOO0o getComponents$lambda$0(o00Ooo o00ooo2) {
        return (o0OOO0o) ((o000oOoO) ((o0O0O00) o00ooo2.OooO0o(firebaseSessionsComponent))).f30821OooOOOo.get();
    }

    public static final o0O0O00 getComponents$lambda$1(o00Ooo o00ooo2) {
        Object objOooO0o = o00ooo2.OooO0o(appContext);
        OooOo.OooO0Oo(objOooO0o, "get(...)");
        Object objOooO0o2 = o00ooo2.OooO0o(backgroundDispatcher);
        OooOo.OooO0Oo(objOooO0o2, "get(...)");
        Object objOooO0o3 = o00ooo2.OooO0o(blockingDispatcher);
        OooOo.OooO0Oo(objOooO0o3, "get(...)");
        Object objOooO0o4 = o00ooo2.OooO0o(firebaseApp);
        OooOo.OooO0Oo(objOooO0o4, "get(...)");
        Object objOooO0o5 = o00ooo2.OooO0o(firebaseInstallationsApi);
        OooOo.OooO0Oo(objOooO0o5, "get(...)");
        OooOOO oooOOOOooO0O0 = o00ooo2.OooO0O0(transportFactory);
        OooOo.OooO0Oo(oooOOOOooO0O0, "getProvider(...)");
        o000oOoO o000oooo2 = new o000oOoO();
        o000oooo2.f30808OooO00o = o0000OO0.OooO00o((Oooo0) objOooO0o4);
        o0000OO0 o0000oo0OooO00o = o0000OO0.OooO00o((Context) objOooO0o);
        o000oooo2.f30809OooO0O0 = o0000oo0OooO00o;
        o000oooo2.f30810OooO0OO = OooOO0O.OooO00o(new o000o00o.o00Ooo(o0000oo0OooO00o, 1));
        o000oooo2.f30811OooO0Oo = OooOO0O.OooO00o(o00000.f30737OooO00o);
        o000oooo2.f30813OooO0o0 = o0000OO0.OooO00o((o000Oo0O.Oooo0) objOooO0o5);
        o000oooo2.f30812OooO0o = OooOO0O.OooO00o(new o000OOo(o000oooo2.f30808OooO00o, 0));
        o0000OO0 o0000oo0OooO00o2 = o0000OO0.OooO00o((OooOOO0) objOooO0o3);
        o000oooo2.f30814OooO0oO = o0000oo0OooO00o2;
        o000oooo2.f30815OooO0oo = OooOO0O.OooO00o(new OooOo00(8, o000oooo2.f30812OooO0o, o0000oo0OooO00o2));
        o000oooo2.f30807OooO = o0000OO0.OooO00o((OooOOO0) objOooO0o2);
        o000oooo2.f30816OooOO0 = OooOO0O.OooO00o(new o000000(o000oooo2.f30810OooO0OO, OooOO0O.OooO00o(new o00(o000oooo2.f30811OooO0Oo, o000oooo2.f30813OooO0o0, o000oooo2.f30812OooO0o, o000oooo2.f30815OooO0oo, OooOO0O.OooO00o(new o000000O(o000oooo2.f30807OooO, o000oooo2.f30811OooO0Oo, OooOO0O.OooO00o(new o000000(o000oooo2.f30809OooO0O0, o000oooo2.f30814OooO0oO, 0)), 1)), 1)), 3));
        o000o0O0.OooOOO oooOOOOooO00o = OooOO0O.OooO00o(o00000.f30738OooO0O0);
        o000oooo2.f30817OooOO0O = oooOOOOooO00o;
        o000oooo2.OooOO0o = OooOO0O.OooO00o(new o000000(o000oooo2.f30811OooO0Oo, oooOOOOooO00o, 2));
        o000oooo2.f30819OooOOO0 = OooOO0O.OooO00o(new o00(o000oooo2.f30808OooO00o, o000oooo2.f30813OooO0o0, o000oooo2.f30816OooOO0, OooOO0O.OooO00o(new o000o00o.o00Ooo(o0000OO0.OooO00o(oooOOOOooO0O0), 0)), o000oooo2.f30807OooO, 0));
        o000oooo2.f30818OooOOO = OooOO0O.OooO00o(new o000000O(o000oooo2.f30809OooO0O0, o000oooo2.f30814OooO0oO, OooOO0O.OooO00o(new o000OOo(o000oooo2.OooOO0o, 1)), 0));
        o000o0O0.OooOOO oooOOOOooO00o2 = OooOO0O.OooO00o(new OooO0o(o000oooo2.f30816OooOO0, o000oooo2.OooOO0o, o000oooo2.f30819OooOOO0, o000oooo2.f30811OooO0Oo, o000oooo2.f30818OooOOO, OooOO0O.OooO00o(new o000000(o000oooo2.f30809OooO0O0, o000oooo2.f30817OooOO0O, 1)), o000oooo2.f30807OooO, 8));
        o000oooo2.f30820OooOOOO = oooOOOOooO00o2;
        o000oooo2.f30821OooOOOo = OooOO0O.OooO00o(new C1386ai(o000oooo2.f30808OooO00o, o000oooo2.f30816OooOO0, o000oooo2.f30807OooO, OooOO0O.OooO00o(new o000OOo(oooOOOOooO00o2, 2)), 23));
        return o000oooo2;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<o00Oo0> getComponents() {
        o0000O0O o0000o0oOooO00o = o00Oo0.OooO00o(o0OOO0o.class);
        o0000o0oOooO00o.f13931OooO00o = LIBRARY_NAME;
        o0000o0oOooO00o.OooO0Oo(oo0o0Oo.OooO0O0(firebaseSessionsComponent));
        o0000o0oOooO00o.f13935OooO0o = new o0000O.OooOo00(29);
        o0000o0oOooO00o.OooO0o();
        o00Oo0 o00oo0OooO0o0 = o0000o0oOooO00o.OooO0o0();
        o0000O0O o0000o0oOooO00o2 = o00Oo0.OooO00o(o0O0O00.class);
        o0000o0oOooO00o2.f13931OooO00o = "fire-sessions-component";
        o0000o0oOooO00o2.OooO0Oo(oo0o0Oo.OooO0O0(appContext));
        o0000o0oOooO00o2.OooO0Oo(oo0o0Oo.OooO0O0(backgroundDispatcher));
        o0000o0oOooO00o2.OooO0Oo(oo0o0Oo.OooO0O0(blockingDispatcher));
        o0000o0oOooO00o2.OooO0Oo(oo0o0Oo.OooO0O0(firebaseApp));
        o0000o0oOooO00o2.OooO0Oo(oo0o0Oo.OooO0O0(firebaseInstallationsApi));
        o0000o0oOooO00o2.OooO0Oo(new oo0o0Oo(transportFactory, 1, 1));
        o0000o0oOooO00o2.f13935OooO0o = new o00000O0(0);
        return o00O0.OooOo.OooOOo(o00oo0OooO0o0, o0000o0oOooO00o2.OooO0o0(), OooO00o.OooO0Oo(LIBRARY_NAME, "3.0.0"));
    }
}
