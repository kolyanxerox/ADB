package com.ironsource;

import android.os.Handler;
import com.ironsource.C3696te;

/* renamed from: com.ironsource.ue */
/* loaded from: classes2.dex */
public final class C3731ue {

    /* renamed from: com.ironsource.ue$a */
    public static final class a implements C3696te.a {

        /* renamed from: a */
        final /* synthetic */ Handler f12234a;

        public a(Handler handler) {
            this.f12234a = handler;
        }

        @Override // com.ironsource.C3696te.a
        /* renamed from: a */
        public void mo12423a(Runnable runnable, long j) {
            kotlin.jvm.internal.OooOo.OooO0o0(runnable, "runnable");
            this.f12234a.postDelayed(runnable, j);
        }
    }

    /* renamed from: a */
    public static final C3696te.a m12670a(Handler handler) {
        kotlin.jvm.internal.OooOo.OooO0o0(handler, "<this>");
        return new a(handler);
    }
}
