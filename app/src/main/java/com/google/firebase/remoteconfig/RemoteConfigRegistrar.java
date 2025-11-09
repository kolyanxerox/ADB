package com.google.firebase.remoteconfig;

import OooO00o.OooO00o;
import OoooO0O.o0000O0O;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import o0000o0.Oooo0;
import o0000o0O.OooOO0;
import o0000o0o.OooOO0O;
import o0000oOo.o0O00O0o;
import o0000oo0.o00000OO;
import o0000oo0.o00Oo0;
import o0000oo0.o00Ooo;
import o0000oo0.oo0o0Oo;
import o000OOoO.OooO0O0;
import o000OooO.o0OO00O;
import o000o00.o0O00o0;

@Keep
/* loaded from: classes2.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static o0OO00O lambda$getComponents$0(o00000OO o00000oo2, o00Ooo o00ooo2) {
        OooOO0 oooOO0;
        Context context = (Context) o00ooo2.get(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) o00ooo2.OooO0o(o00000oo2);
        Oooo0 oooo0 = (Oooo0) o00ooo2.get(Oooo0.class);
        o000Oo0O.Oooo0 oooo02 = (o000Oo0O.Oooo0) o00ooo2.get(o000Oo0O.Oooo0.class);
        OooOO0O oooOO0O = (OooOO0O) o00ooo2.get(OooOO0O.class);
        synchronized (oooOO0O) {
            try {
                if (!oooOO0O.f29621OooO00o.containsKey("frc")) {
                    oooOO0O.f29621OooO00o.put("frc", new OooOO0(oooOO0O.f29622OooO0O0));
                }
                oooOO0 = (OooOO0) oooOO0O.f29621OooO00o.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new o0OO00O(context, scheduledExecutorService, oooo0, oooo02, oooOO0, o00ooo2.OooO0o0(o0000oO0.Oooo0.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<o00Oo0> getComponents() {
        o00000OO o00000oo2 = new o00000OO(o0O00O0o.class, ScheduledExecutorService.class);
        o0000O0O o0000o0o2 = new o0000O0O(o0OO00O.class, new Class[]{o0O00o0.class});
        o0000o0o2.f13931OooO00o = LIBRARY_NAME;
        o0000o0o2.OooO0Oo(oo0o0Oo.OooO00o(Context.class));
        o0000o0o2.OooO0Oo(new oo0o0Oo(o00000oo2, 1, 0));
        o0000o0o2.OooO0Oo(oo0o0Oo.OooO00o(Oooo0.class));
        o0000o0o2.OooO0Oo(oo0o0Oo.OooO00o(o000Oo0O.Oooo0.class));
        o0000o0o2.OooO0Oo(oo0o0Oo.OooO00o(OooOO0O.class));
        o0000o0o2.OooO0Oo(new oo0o0Oo(0, 1, o0000oO0.Oooo0.class));
        o0000o0o2.f13935OooO0o = new OooO0O0(o00000oo2, 1);
        o0000o0o2.OooO0o();
        return Arrays.asList(o0000o0o2.OooO0o0(), OooO00o.OooO0Oo(LIBRARY_NAME, "23.0.0"));
    }
}
