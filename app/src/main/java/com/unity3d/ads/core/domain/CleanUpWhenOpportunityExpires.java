package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import kotlin.jvm.internal.Oooo000;
import o00O0O0O.OooOOO0;
import o00O0oOo.o0000O0;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000OO0;
import o00O0oOo.o0000oo;
import o00O0oOo.o000OO;
import o00O0oOo.o00O0;
import o00O0oOo.o00O0O00;
import o00O0oOo.o00OOO00;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class CleanUpWhenOpportunityExpires {
    private final o0000O0 coroutineExceptionHandler;
    private final o000OO coroutineScope;

    /* renamed from: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$2 */
    public static final class C40912 extends Oooo000 implements o00O0Oo.Oooo000 {
        final /* synthetic */ o00O0O00 $job;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40912(o00O0O00 o00o0o00) {
            super(1);
            this.$job = o00o0o00;
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return OooOo.f33195OooO00o;
        }

        public final void invoke(Throwable th) {
            this.$job.OooO00o(null);
        }
    }

    public CleanUpWhenOpportunityExpires(o0000O00 defaultDispatcher) {
        kotlin.jvm.internal.OooOo.OooO0o0(defaultDispatcher, "defaultDispatcher");
        C4090xa5c277d3 c4090xa5c277d3 = new C4090xa5c277d3(o0000oo.f31508OooOo0O);
        this.coroutineExceptionHandler = c4090xa5c277d3;
        this.coroutineScope = o0000OO0.OooO0O0(OooO00o.OooO00o.OooOo00(o0000OO0.OooO0o0(), defaultDispatcher).plus(c4090xa5c277d3));
    }

    public final void invoke(AdObject adObject) {
        kotlin.jvm.internal.OooOo.OooO0o0(adObject, "adObject");
        if (adObject.getAdPlayer() == null) {
            throw new IllegalArgumentException("AdObject does not have an adPlayer.");
        }
        o00OOO00 o00ooo00OooOo0 = o0000OO0.OooOo0(this.coroutineScope, null, new CleanUpWhenOpportunityExpires$invoke$job$1(adObject, null), 3);
        OooOOO0 coroutineContext = adObject.getAdPlayer().getScope().getCoroutineContext();
        o00O0O00 o00o0o00 = (o00O0O00) coroutineContext.get(o00O0.f31523OooOo0O);
        if (o00o0o00 != null) {
            o00o0o00.OooO0oo(new C40912(o00ooo00OooOo0));
        } else {
            throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
        }
    }
}
