package com.google.firebase;

import OooO00o.OooO00o;
import OoooO0O.o0000O0O;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import o0000O.OooOo00;
import o0000o0.Oooo0;
import o0000oOo.o0OoO00O;
import o0000oo0.o00000OO;
import o0000oo0.o00Oo0;
import o0000oo0.oo0o0Oo;
import o000OOoO.OooO0O0;
import o000OOoO.OooOO0;
import o000OOoO.OooOO0O;
import o000Ooo0.OooO;
import o000Ooo0.OooO0o;

/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String OooO00o(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        o0000O0O o0000o0oOooO00o = o00Oo0.OooO00o(OooO.class);
        o0000o0oOooO00o.OooO0Oo(new oo0o0Oo(2, 0, OooO0o.class));
        o0000o0oOooO00o.f13935OooO0o = new OooOo00(26);
        arrayList.add(o0000o0oOooO00o.OooO0o0());
        o00000OO o00000oo2 = new o00000OO(o0OoO00O.class, Executor.class);
        o0000O0O o0000o0o2 = new o0000O0O(o000OOoO.OooO0o.class, new Class[]{OooOO0.class, OooOO0O.class});
        o0000o0o2.OooO0Oo(oo0o0Oo.OooO00o(Context.class));
        o0000o0o2.OooO0Oo(oo0o0Oo.OooO00o(Oooo0.class));
        o0000o0o2.OooO0Oo(new oo0o0Oo(2, 0, o000OOoO.OooO.class));
        o0000o0o2.OooO0Oo(new oo0o0Oo(1, 1, OooO.class));
        o0000o0o2.OooO0Oo(new oo0o0Oo(o00000oo2, 1, 0));
        o0000o0o2.f13935OooO0o = new OooO0O0(o00000oo2, 0);
        arrayList.add(o0000o0o2.OooO0o0());
        arrayList.add(OooO00o.OooO0Oo("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(OooO00o.OooO0Oo("fire-core", "22.0.0"));
        arrayList.add(OooO00o.OooO0Oo("device-name", OooO00o(Build.PRODUCT)));
        arrayList.add(OooO00o.OooO0Oo("device-model", OooO00o(Build.DEVICE)));
        arrayList.add(OooO00o.OooO0Oo("device-brand", OooO00o(Build.BRAND)));
        arrayList.add(OooO00o.OooO0oo("android-target-sdk", new OooOo00(5)));
        arrayList.add(OooO00o.OooO0oo("android-min-sdk", new OooOo00(6)));
        arrayList.add(OooO00o.OooO0oo("android-platform", new OooOo00(7)));
        arrayList.add(OooO00o.OooO0oo("android-installer", new OooOo00(8)));
        try {
            oo00o.OooO0O0.f33180OooOo0o.getClass();
            str = "2.2.0";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(OooO00o.OooO0Oo("kotlin", str));
        }
        return arrayList;
    }
}
