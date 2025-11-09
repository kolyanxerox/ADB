package com.google.firebase.abt.component;

import OooO00o.OooO00o;
import OoooO0O.o0000O0O;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import o0000O.OooOo00;
import o0000o0o.OooOO0O;
import o0000oO0.Oooo0;
import o0000oo0.o00Oo0;
import o0000oo0.o00Ooo;
import o0000oo0.oo0o0Oo;

@Keep
/* loaded from: classes2.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ OooOO0O lambda$getComponents$0(o00Ooo o00ooo2) {
        return new OooOO0O((Context) o00ooo2.get(Context.class), o00ooo2.OooO0o0(Oooo0.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<o00Oo0> getComponents() {
        o0000O0O o0000o0oOooO00o = o00Oo0.OooO00o(OooOO0O.class);
        o0000o0oOooO00o.f13931OooO00o = LIBRARY_NAME;
        o0000o0oOooO00o.OooO0Oo(oo0o0Oo.OooO00o(Context.class));
        o0000o0oOooO00o.OooO0Oo(new oo0o0Oo(0, 1, Oooo0.class));
        o0000o0oOooO00o.f13935OooO0o = new OooOo00(9);
        return Arrays.asList(o0000o0oOooO00o.OooO0o0(), OooO00o.OooO0Oo(LIBRARY_NAME, "21.1.1"));
    }
}
