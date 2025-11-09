package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.properties.SdkProperties;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class TriggerInitializeListener {
    private final o0000O00 coroutineDispatcher;

    @OooO(m13471c = "com.unity3d.ads.core.domain.TriggerInitializeListener$error$1", m13472f = "TriggerInitializeListener.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.TriggerInitializeListener$error$1 */
    public static final class C41201 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $errorMsg;
        final /* synthetic */ UnityAds.UnityAdsInitializationError $unityAdsInitializationError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41201(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$unityAdsInitializationError = unityAdsInitializationError;
            this.$errorMsg = str;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C41201(this.$unityAdsInitializationError, this.$errorMsg, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            SdkProperties.notifyInitializationFailed(this.$unityAdsInitializationError, this.$errorMsg);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C41201) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.TriggerInitializeListener$success$1", m13472f = "TriggerInitializeListener.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.TriggerInitializeListener$success$1 */
    public static final class C41211 extends OooOOOO implements o00O0O {
        int label;

        public C41211(OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C41211(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            SdkProperties.notifyInitializationComplete();
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C41211) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public TriggerInitializeListener(o0000O00 coroutineDispatcher) {
        kotlin.jvm.internal.OooOo.OooO0o0(coroutineDispatcher, "coroutineDispatcher");
        this.coroutineDispatcher = coroutineDispatcher;
    }

    public final void error(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String errorMsg) {
        kotlin.jvm.internal.OooOo.OooO0o0(unityAdsInitializationError, "unityAdsInitializationError");
        kotlin.jvm.internal.OooOo.OooO0o0(errorMsg, "errorMsg");
        o0000OO0.OooOo0(o0000OO0.OooO0O0(this.coroutineDispatcher), null, new C41201(unityAdsInitializationError, errorMsg, null), 3);
    }

    public final void success() {
        o0000OO0.OooOo0(o0000OO0.OooO0O0(this.coroutineDispatcher), null, new C41211(null), 3);
    }
}
