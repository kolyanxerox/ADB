package com.google.firebase.datatransport;

import OooOOO.OooO;
import OooOOOO.OooO00o;
import OooOOo0.o0Oo0oo;
import OoooO0O.o0000O0O;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import o0000O.OooOo00;
import o0000oo0.o00000OO;
import o0000oo0.o00Oo0;
import o0000oo0.o00Ooo;
import o0000oo0.oo0o0Oo;
import o000O0oo.OooOOOO;

@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ OooO lambda$getComponents$0(o00Ooo o00ooo2) {
        o0Oo0oo.OooO0O0((Context) o00ooo2.get(Context.class));
        return o0Oo0oo.OooO00o().OooO0OO(OooO00o.f13323OooO0o);
    }

    public static /* synthetic */ OooO lambda$getComponents$1(o00Ooo o00ooo2) {
        o0Oo0oo.OooO0O0((Context) o00ooo2.get(Context.class));
        return o0Oo0oo.OooO00o().OooO0OO(OooO00o.f13323OooO0o);
    }

    public static /* synthetic */ OooO lambda$getComponents$2(o00Ooo o00ooo2) {
        o0Oo0oo.OooO0O0((Context) o00ooo2.get(Context.class));
        return o0Oo0oo.OooO00o().OooO0OO(OooO00o.f13324OooO0o0);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<o00Oo0> getComponents() {
        o0000O0O o0000o0oOooO00o = o00Oo0.OooO00o(OooO.class);
        o0000o0oOooO00o.f13931OooO00o = LIBRARY_NAME;
        o0000o0oOooO00o.OooO0Oo(oo0o0Oo.OooO00o(Context.class));
        o0000o0oOooO00o.f13935OooO0o = new OooOo00(21);
        o00Oo0 o00oo0OooO0o0 = o0000o0oOooO00o.OooO0o0();
        o0000O0O o0000o0oOooO0O0 = o00Oo0.OooO0O0(new o00000OO(OooOOOO.class, OooO.class));
        o0000o0oOooO0O0.OooO0Oo(oo0o0Oo.OooO00o(Context.class));
        o0000o0oOooO0O0.f13935OooO0o = new OooOo00(22);
        o00Oo0 o00oo0OooO0o02 = o0000o0oOooO0O0.OooO0o0();
        o0000O0O o0000o0oOooO0O02 = o00Oo0.OooO0O0(new o00000OO(o000O0oo.OooOo00.class, OooO.class));
        o0000o0oOooO0O02.OooO0Oo(oo0o0Oo.OooO00o(Context.class));
        o0000o0oOooO0O02.f13935OooO0o = new OooOo00(23);
        return Arrays.asList(o00oo0OooO0o0, o00oo0OooO0o02, o0000o0oOooO0O02.OooO0o0(), OooO00o.OooO00o.OooO0Oo(LIBRARY_NAME, "19.0.0"));
    }
}
