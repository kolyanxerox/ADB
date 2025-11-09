package com.ironsource;

import android.p001os.OutcomeReceiver;
import androidx.annotation.RequiresApi;

/* renamed from: com.ironsource.r3 */
/* loaded from: classes2.dex */
public final class C3580r3 {

    /* renamed from: com.ironsource.r3$a */
    public static final class a implements OutcomeReceiver {

        /* renamed from: a */
        final /* synthetic */ o00O0O0O.OooO0OO f11176a;

        public a(o00O0O0O.OooO0OO oooO0OO) {
            this.f11176a = oooO0OO;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception error) {
            kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
            this.f11176a.resumeWith(o00O0.o000OOo.OooO0O0(error));
        }

        public void onResult(Object obj) {
            this.f11176a.resumeWith(oo00o.OooOo.f33195OooO00o);
        }
    }

    @RequiresApi(31)
    /* renamed from: a */
    public static final OutcomeReceiver m11707a(o00O0O0O.OooO0OO oooO0OO) {
        kotlin.jvm.internal.OooOo.OooO0o0(oooO0OO, "<this>");
        return new a(oooO0OO);
    }
}
