package com.google.firebase.installations;

import OooO00o.OooO00o;
import OoooO0O.o0000O0O;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o0000O.OooOo00;
import o0000oOo.o0O00O0o;
import o0000oOo.o0OoO00O;
import o0000oo0.o00000OO;
import o0000oo0.o00Oo0;
import o0000oo0.o00Ooo;
import o0000oo0.oo0o0Oo;
import o0000ooO.o0O0OO0;
import o000OOoO.OooO;
import o000OOoO.OooOO0;
import o000Oo0O.Oooo0;
import o000Oo0O.Oooo000;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static Oooo0 lambda$getComponents$0(o00Ooo o00ooo2) {
        return new Oooo000((o0000o0.Oooo0) o00ooo2.get(o0000o0.Oooo0.class), o00ooo2.OooO0o0(OooOO0.class), (ExecutorService) o00ooo2.OooO0o(new o00000OO(o0OoO00O.class, ExecutorService.class)), new o0O0OO0((Executor) o00ooo2.OooO0o(new o00000OO(o0O00O0o.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<o00Oo0> getComponents() {
        o0000O0O o0000o0oOooO00o = o00Oo0.OooO00o(Oooo0.class);
        o0000o0oOooO00o.f13931OooO00o = LIBRARY_NAME;
        o0000o0oOooO00o.OooO0Oo(oo0o0Oo.OooO00o(o0000o0.Oooo0.class));
        o0000o0oOooO00o.OooO0Oo(new oo0o0Oo(0, 1, OooOO0.class));
        o0000o0oOooO00o.OooO0Oo(new oo0o0Oo(new o00000OO(o0OoO00O.class, ExecutorService.class), 1, 0));
        o0000o0oOooO00o.OooO0Oo(new oo0o0Oo(new o00000OO(o0O00O0o.class, Executor.class), 1, 0));
        o0000o0oOooO00o.f13935OooO0o = new OooOo00(25);
        o00Oo0 o00oo0OooO0o0 = o0000o0oOooO00o.OooO0o0();
        OooO oooO = new OooO(0);
        o0000O0O o0000o0oOooO00o2 = o00Oo0.OooO00o(OooO.class);
        o0000o0oOooO00o2.f13936OooO0o0 = 1;
        o0000o0oOooO00o2.f13935OooO0o = new OooO0oo.o00Oo0(oooO, 20);
        return Arrays.asList(o00oo0OooO0o0, o0000o0oOooO00o2.OooO0o0(), OooO00o.OooO0Oo(LIBRARY_NAME, "19.0.0"));
    }
}
