package com.google.firebase.analytics.connector.internal;

import OooO00o.OooO00o;
import Oooo00O.o000000O;
import OoooO0O.o0000O0O;
import OoooOOO.o0O00000;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.o00O00OO;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import o0000oO0.Oooo0;
import o0000oO0.o000oOoO;
import o0000oo0.o000OOo;
import o0000oo0.o00Oo0;
import o0000oo0.o00Ooo;
import o0000oo0.oo0o0Oo;
import o000OOo0.OooO0OO;

@Keep
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static Oooo0 lambda$getComponents$0(o00Ooo o00ooo2) {
        o0000o0.Oooo0 oooo0 = (o0000o0.Oooo0) o00ooo2.get(o0000o0.Oooo0.class);
        Context context = (Context) o00ooo2.get(Context.class);
        OooO0OO oooO0OO = (OooO0OO) o00ooo2.get(OooO0OO.class);
        o000000O.OooO0oo(oooo0);
        o000000O.OooO0oo(context);
        o000000O.OooO0oo(oooO0OO);
        o000000O.OooO0oo(context.getApplicationContext());
        if (o000oOoO.f29639OooO0OO == null) {
            synchronized (o000oOoO.class) {
                try {
                    if (o000oOoO.f29639OooO0OO == null) {
                        Bundle bundle = new Bundle(1);
                        oooo0.OooO00o();
                        if ("[DEFAULT]".equals(oooo0.f29589OooO0O0)) {
                            ((o000OOo) oooO0OO).OooO0O0();
                            bundle.putBoolean("dataCollectionDefaultEnabled", oooo0.OooOO0());
                        }
                        o000oOoO.f29639OooO0OO = new o000oOoO(o00O00OO.OooO0o0(context, bundle).f26526OooO0O0);
                    }
                } finally {
                }
            }
        }
        return o000oOoO.f29639OooO0OO;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<o00Oo0> getComponents() {
        o0000O0O o0000o0oOooO00o = o00Oo0.OooO00o(Oooo0.class);
        o0000o0oOooO00o.OooO0Oo(oo0o0Oo.OooO00o(o0000o0.Oooo0.class));
        o0000o0oOooO00o.OooO0Oo(oo0o0Oo.OooO00o(Context.class));
        o0000o0oOooO00o.OooO0Oo(oo0o0Oo.OooO00o(OooO0OO.class));
        o0000o0oOooO00o.f13935OooO0o = o0O00000.f14221Oooo000;
        o0000o0oOooO00o.OooO0o();
        return Arrays.asList(o0000o0oOooO00o.OooO0o0(), OooO00o.OooO0Oo("fire-analytics", "23.0.0"));
    }
}
