package com.unity3d.services;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.measurement.o0OOO0;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.mediationsdk.metadata.C3401a;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.p010om.OmFinishSession;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.p012di.IServiceComponent;
import com.unity3d.services.core.p012di.IServiceProvider;
import com.unity3d.services.core.p012di.ServiceProvider;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.o0OO00O;
import o00O0.o000OOo;
import o00O0.o0O0O00;
import o00O0O0O.OooOOO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oOo.o00O0O00;
import o00O0oOo.o00O0O0O;
import oo00o.OooO0OO;
import oo00o.OooO0o;
import oo00o.OooOO0;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class UnityAdsSDK implements IServiceComponent {
    private final IServiceProvider serviceProvider;

    @OooO(m13471c = "com.unity3d.services.UnityAdsSDK$finishOMIDSession$2", m13472f = "UnityAdsSDK.kt", m13473l = {InterfaceC3173h3.c.b.f8812d}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.services.UnityAdsSDK$finishOMIDSession$2 */
    public static final class C42052 extends OooOOOO implements o00O0O {
        final /* synthetic */ OooO0OO $getAdObject$delegate;
        final /* synthetic */ OooO0OO $omFinishSession$delegate;
        final /* synthetic */ o000OO $omidScope;
        final /* synthetic */ String $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42052(String str, o000OO o000oo2, OooO0OO oooO0OO, OooO0OO oooO0OO2, o00O0O0O.OooO0OO oooO0OO3) {
            super(2, oooO0OO3);
            this.$opportunityId = str;
            this.$omidScope = o000oo2;
            this.$getAdObject$delegate = oooO0OO;
            this.$omFinishSession$delegate = oooO0OO2;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return new C42052(this.$opportunityId, this.$omidScope, this.$getAdObject$delegate, this.$omFinishSession$delegate, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                AdObject adObjectInvoke = UnityAdsSDK.finishOMIDSession$lambda$18(this.$getAdObject$delegate).invoke(this.$opportunityId);
                if (adObjectInvoke != null) {
                    OmFinishSession omFinishSessionFinishOMIDSession$lambda$19 = UnityAdsSDK.finishOMIDSession$lambda$19(this.$omFinishSession$delegate);
                    this.label = 1;
                    if (omFinishSessionFinishOMIDSession$lambda$19.invoke(adObjectInvoke, this) == oooOo00) {
                        return oooOo00;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            o0000OO0.OooO(this.$omidScope);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C42052) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.services.UnityAdsSDK$getToken$1", m13472f = "UnityAdsSDK.kt", m13473l = {131}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.services.UnityAdsSDK$getToken$1 */
    public static final class C42061 extends OooOOOO implements o00O0O {
        int label;

        public C42061(o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return UnityAdsSDK.this.new C42061(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                return obj;
            }
            o000OOo.OooOO0O(obj);
            UnityAdsSDK unityAdsSDK = UnityAdsSDK.this;
            this.label = 1;
            Object objFetchToken = unityAdsSDK.fetchToken(C3401a.f9920g, this);
            return objFetchToken == oooOo00 ? oooOo00 : objFetchToken;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C42061) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.services.UnityAdsSDK$getToken$2", m13472f = "UnityAdsSDK.kt", m13473l = {147}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.services.UnityAdsSDK$getToken$2 */
    public static final class C42072 extends OooOOOO implements o00O0O {
        final /* synthetic */ OooO0OO $getAsyncHeaderBiddingToken$delegate;
        final /* synthetic */ o000OO $getTokenScope;
        final /* synthetic */ IUnityAdsTokenListener $listener;
        final /* synthetic */ TokenConfiguration $tokenConfiguration;
        final /* synthetic */ OooO0OO $tokenNumberProvider$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42072(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener, o000OO o000oo2, OooO0OO oooO0OO, OooO0OO oooO0OO2, o00O0O0O.OooO0OO oooO0OO3) {
            super(2, oooO0OO3);
            this.$tokenConfiguration = tokenConfiguration;
            this.$listener = iUnityAdsTokenListener;
            this.$getTokenScope = o000oo2;
            this.$getAsyncHeaderBiddingToken$delegate = oooO0OO;
            this.$tokenNumberProvider$delegate = oooO0OO2;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return new C42072(this.$tokenConfiguration, this.$listener, this.$getTokenScope, this.$getAsyncHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                GetAsyncHeaderBiddingToken token$lambda$8 = UnityAdsSDK.getToken$lambda$8(this.$getAsyncHeaderBiddingToken$delegate);
                int iInvoke = UnityAdsSDK.getToken$lambda$7(this.$tokenNumberProvider$delegate).invoke();
                TokenConfiguration tokenConfiguration = this.$tokenConfiguration;
                IUnityAdsTokenListener iUnityAdsTokenListener = this.$listener;
                this.label = 1;
                if (token$lambda$8.invoke(iInvoke, tokenConfiguration, iUnityAdsTokenListener, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            o0000OO0.OooO(this.$getTokenScope);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C42072) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.services.UnityAdsSDK$initialize$1", m13472f = "UnityAdsSDK.kt", m13473l = {87, 89}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.services.UnityAdsSDK$initialize$1 */
    public static final class C42081 extends OooOOOO implements o00O0O {
        final /* synthetic */ OooO0OO $alternativeFlowReader$delegate;
        final /* synthetic */ o000OO $initScope;
        final /* synthetic */ OooO0OO $initializeBoldSDK$delegate;
        final /* synthetic */ OooO0OO $initializeSDK$delegate;
        final /* synthetic */ String $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42081(String str, o000OO o000oo2, OooO0OO oooO0OO, OooO0OO oooO0OO2, OooO0OO oooO0OO3, o00O0O0O.OooO0OO oooO0OO4) {
            super(2, oooO0OO4);
            this.$source = str;
            this.$initScope = o000oo2;
            this.$alternativeFlowReader$delegate = oooO0OO;
            this.$initializeBoldSDK$delegate = oooO0OO2;
            this.$initializeSDK$delegate = oooO0OO3;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return new C42081(this.$source, this.$initScope, this.$alternativeFlowReader$delegate, this.$initializeBoldSDK$delegate, this.$initializeSDK$delegate, oooO0OO);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x003e, code lost:
        
            if (r5.invoke(r1, r4) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x004f, code lost:
        
            if (r5.mo13784invokegIAlus(r1, r4) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0051, code lost:
        
            return r0;
         */
        @Override // o00O0OO0.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                o00O0.o000OOo.OooOO0O(r5)
                oo00o.OooOOO0 r5 = (oo00o.OooOOO0) r5
                r5.getClass()
                goto L52
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1d:
                o00O0.o000OOo.OooOO0O(r5)
                goto L52
            L21:
                o00O0.o000OOo.OooOO0O(r5)
                oo00o.OooO0OO r5 = r4.$alternativeFlowReader$delegate
                com.unity3d.ads.core.configuration.AlternativeFlowReader r5 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$1(r5)
                boolean r5 = r5.invoke()
                if (r5 == 0) goto L41
                oo00o.OooO0OO r5 = r4.$initializeBoldSDK$delegate
                com.unity3d.ads.core.domain.InitializeBoldSDK r5 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$3(r5)
                java.lang.String r1 = r4.$source
                r4.label = r3
                java.lang.Object r5 = r5.invoke(r1, r4)
                if (r5 != r0) goto L52
                goto L51
            L41:
                oo00o.OooO0OO r5 = r4.$initializeSDK$delegate
                com.unity3d.services.core.domain.task.InitializeSDK r5 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$2(r5)
                com.unity3d.services.core.domain.task.EmptyParams r1 = com.unity3d.services.core.domain.task.EmptyParams.INSTANCE
                r4.label = r2
                java.lang.Object r5 = r5.mo13784invokegIAlus(r1, r4)
                if (r5 != r0) goto L52
            L51:
                return r0
            L52:
                o00O0oOo.o000OO r5 = r4.$initScope
                o00O0oOo.o0000OO0.OooO(r5)
                oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.UnityAdsSDK.C42081.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C42081) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.services.UnityAdsSDK$load$1", m13472f = "UnityAdsSDK.kt", m13473l = {InterfaceC3173h3.d.b.f8825h}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.services.UnityAdsSDK$load$1 */
    public static final class C42091 extends OooOOOO implements o00O0O {
        final /* synthetic */ UnityBannerSize $bannerSize;
        final /* synthetic */ OooO0OO $context$delegate;
        final /* synthetic */ IUnityAdsLoadListener $listener;
        final /* synthetic */ UnityAdsLoadOptions $loadOptions;
        final /* synthetic */ o000OO $loadScope;
        final /* synthetic */ String $placementId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42091(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, o000OO o000oo2, OooO0OO oooO0OO, o00O0O0O.OooO0OO oooO0OO2) {
            super(2, oooO0OO2);
            this.$placementId = str;
            this.$loadOptions = unityAdsLoadOptions;
            this.$listener = iUnityAdsLoadListener;
            this.$bannerSize = unityBannerSize;
            this.$loadScope = o000oo2;
            this.$context$delegate = oooO0OO;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return UnityAdsSDK.this.new C42091(this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this.$loadScope, this.$context$delegate, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            C42091 c42091;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                LegacyLoadUseCase legacyLoadUseCase = (LegacyLoadUseCase) UnityAdsSDK.this.getServiceProvider().getRegistry().getService("", o0OO00O.OooO00o(LegacyLoadUseCase.class));
                Context contextLoad$lambda$5 = UnityAdsSDK.load$lambda$5(this.$context$delegate);
                String str = this.$placementId;
                UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
                IUnityAdsLoadListener iUnityAdsLoadListener = this.$listener;
                UnityBannerSize unityBannerSize = this.$bannerSize;
                this.label = 1;
                c42091 = this;
                if (legacyLoadUseCase.invoke(contextLoad$lambda$5, str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, c42091) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                c42091 = this;
            }
            o0000OO0.OooO(c42091.$loadScope);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C42091) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.services.UnityAdsSDK$show$1", m13472f = "UnityAdsSDK.kt", m13473l = {120}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.services.UnityAdsSDK$show$1 */
    public static final class C42101 extends OooOOOO implements o00O0O {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Listeners $listener;
        final /* synthetic */ String $placementId;
        final /* synthetic */ LegacyShowUseCase $showBoldSDK;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        final /* synthetic */ o000OO $showScope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42101(LegacyShowUseCase legacyShowUseCase, Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$showBoldSDK = legacyShowUseCase;
            this.$activity = activity;
            this.$placementId = str;
            this.$showOptions = unityAdsShowOptions;
            this.$listener = listeners;
            this.$showScope = o000oo2;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return new C42101(this.$showBoldSDK, this.$activity, this.$placementId, this.$showOptions, this.$listener, this.$showScope, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            C42101 c42101;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                LegacyShowUseCase legacyShowUseCase = this.$showBoldSDK;
                Activity activity = this.$activity;
                String str = this.$placementId;
                UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
                Listeners listeners = this.$listener;
                this.label = 1;
                c42101 = this;
                if (legacyShowUseCase.invoke(activity, str, unityAdsShowOptions, listeners, c42101) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                c42101 = this;
            }
            o0000OO0.OooO(c42101.$showScope);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C42101) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public UnityAdsSDK() {
        this(null, 1, null);
    }

    public final Object fetchToken(String str, o00O0O0O.OooO0OO oooO0OO) {
        String str2;
        String str3;
        String str4;
        OooO0o oooO0o = OooO0o.f33184OooOo0o;
        OooO0OO OooO0oO2 = o0OOO0.OooO0oO(oooO0o, new UnityAdsSDK$fetchToken$$inlined$inject$default$1(this, ""));
        OooO0OO OooO0oO3 = o0OOO0.OooO0oO(oooO0o, new UnityAdsSDK$fetchToken$$inlined$inject$default$2(this, ""));
        OooO0OO OooO0oO4 = o0OOO0.OooO0oO(oooO0o, new UnityAdsSDK$fetchToken$$inlined$inject$default$3(this, ""));
        OooO0OO OooO0oO5 = o0OOO0.OooO0oO(oooO0o, new UnityAdsSDK$fetchToken$$inlined$inject$default$4(this, ""));
        long jOooO0O0 = o00O0oOO.OooOOOO.OooO0O0();
        SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$12(OooO0oO5), "native_gateway_token_started", null, o0O0O00.OooOOo0(new OooOO0("sync", str), new OooOO0("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$11(OooO0oO4), false, 1, null).toString())), null, null, null, 58, null);
        if (GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$11(OooO0oO4), false, 1, null) != InitializationState.INITIALIZED) {
            str2 = "not_initialized";
            str3 = null;
            str4 = null;
        } else {
            try {
                str4 = (String) o0000OO0.OooOoO(OooOOO.f31358OooOo0O, new UnityAdsSDK$fetchToken$token$1(OooO0oO3, OooO0oO2, null));
                str2 = null;
                str3 = null;
            } catch (Exception e) {
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null);
                str2 = "uncaught_exception";
                str3 = shortenedStackTrace$default;
                str4 = null;
            }
        }
        SendDiagnosticEvent sendDiagnosticEventFetchToken$lambda$12 = fetchToken$lambda$12(OooO0oO5);
        String str5 = str4 == null ? "native_gateway_token_failure_time" : "native_gateway_token_success_time";
        Double d = new Double(TimeExtensionsKt.elapsedMillis(new o00O0oOO.OooOo(jOooO0O0)));
        o00O0O00.OooOO0 oooOO0OooOOO0 = o0O0O00.OooOOO0();
        oooOO0OooOOO0.put("sync", str);
        oooOO0OooOOO0.put("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$11(OooO0oO4), false, 1, null).toString());
        if (str2 != null) {
        }
        if (str3 != null) {
            oooOO0OooOOO0.put("reason_debug", str3);
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEventFetchToken$lambda$12, str5, d, o0O0O00.OooOO0o(oooOO0OooOOO0), null, null, new Integer(fetchToken$lambda$9(OooO0oO2).invoke()), 24, null);
        return str4;
    }

    public static final GetHeaderBiddingToken fetchToken$lambda$10(OooO0OO oooO0OO) {
        return (GetHeaderBiddingToken) oooO0OO.getValue();
    }

    private static final GetInitializationState fetchToken$lambda$11(OooO0OO oooO0OO) {
        return (GetInitializationState) oooO0OO.getValue();
    }

    private static final SendDiagnosticEvent fetchToken$lambda$12(OooO0OO oooO0OO) {
        return (SendDiagnosticEvent) oooO0OO.getValue();
    }

    public static final TokenNumberProvider fetchToken$lambda$9(OooO0OO oooO0OO) {
        return (TokenNumberProvider) oooO0OO.getValue();
    }

    private static final AlternativeFlowReader finishOMIDSession$lambda$16(OooO0OO oooO0OO) {
        return (AlternativeFlowReader) oooO0OO.getValue();
    }

    public static final GetAdObject finishOMIDSession$lambda$18(OooO0OO oooO0OO) {
        return (GetAdObject) oooO0OO.getValue();
    }

    public static final OmFinishSession finishOMIDSession$lambda$19(OooO0OO oooO0OO) {
        return (OmFinishSession) oooO0OO.getValue();
    }

    private static final GetGameId getToken$lambda$6(OooO0OO oooO0OO) {
        return (GetGameId) oooO0OO.getValue();
    }

    public static final TokenNumberProvider getToken$lambda$7(OooO0OO oooO0OO) {
        return (TokenNumberProvider) oooO0OO.getValue();
    }

    public static final GetAsyncHeaderBiddingToken getToken$lambda$8(OooO0OO oooO0OO) {
        return (GetAsyncHeaderBiddingToken) oooO0OO.getValue();
    }

    public static /* synthetic */ o00O0O00 initialize$default(UnityAdsSDK unityAdsSDK, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "api";
        }
        return unityAdsSDK.initialize(str, str2);
    }

    private static final ShouldAllowInitialization initialize$lambda$0(OooO0OO oooO0OO) {
        return (ShouldAllowInitialization) oooO0OO.getValue();
    }

    public static final AlternativeFlowReader initialize$lambda$1(OooO0OO oooO0OO) {
        return (AlternativeFlowReader) oooO0OO.getValue();
    }

    public static final InitializeSDK initialize$lambda$2(OooO0OO oooO0OO) {
        return (InitializeSDK) oooO0OO.getValue();
    }

    public static final InitializeBoldSDK initialize$lambda$3(OooO0OO oooO0OO) {
        return (InitializeBoldSDK) oooO0OO.getValue();
    }

    public static /* synthetic */ o00O0O00 load$default(UnityAdsSDK unityAdsSDK, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, int i, Object obj) {
        if ((i & 8) != 0) {
            unityBannerSize = null;
        }
        return unityAdsSDK.load(str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize);
    }

    private static final GetGameId load$lambda$4(OooO0OO oooO0OO) {
        return (GetGameId) oooO0OO.getValue();
    }

    public static final Context load$lambda$5(OooO0OO oooO0OO) {
        return (Context) oooO0OO.getValue();
    }

    private static final AlternativeFlowReader sendBannerDestroyed$lambda$20(OooO0OO oooO0OO) {
        return (AlternativeFlowReader) oooO0OO.getValue();
    }

    private static final SendDiagnosticEvent sendBannerDestroyed$lambda$21(OooO0OO oooO0OO) {
        return (SendDiagnosticEvent) oooO0OO.getValue();
    }

    public final o00O0O00 finishOMIDSession(String opportunityId) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.OooOo.OooO0o0(opportunityId, "opportunityId");
        OooO0o oooO0o = OooO0o.f33184OooOo0o;
        if (!finishOMIDSession$lambda$16(o0OOO0.OooO0oO(oooO0o, new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$1(this, ""))).invoke()) {
            o00O0O0O o00o0o0oOooO0OO = o0000OO0.OooO0OO();
            o00o0o0oOooO0OO.Oooo0oO(OooOo.f33195OooO00o);
            return o00o0o0oOooO0OO;
        }
        OooO0OO OooO0oO2 = o0OOO0.OooO0oO(oooO0o, new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$2(this, ""));
        OooO0OO OooO0oO3 = o0OOO0.OooO0oO(oooO0o, new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$3(this, ""));
        o000OO o000oo2 = (o000OO) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_OMID_SCOPE, o0OO00O.OooO00o(o000OO.class));
        return o0000OO0.OooOo0(o000oo2, null, new C42052(opportunityId, o000oo2, OooO0oO2, OooO0oO3, null), 3);
    }

    @Override // com.unity3d.services.core.p012di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return this.serviceProvider;
    }

    public final String getToken() {
        return (String) o0000OO0.OooOoO(OooOOO.f31358OooOo0O, new C42061(null));
    }

    public final synchronized o00O0O00 initialize(String str, String source) {
        kotlin.jvm.internal.OooOo.OooO0o0(source, "source");
        OooO0o oooO0o = OooO0o.f33184OooOo0o;
        if (!initialize$lambda$0(o0OOO0.OooO0oO(oooO0o, new UnityAdsSDK$initialize$$inlined$inject$default$1(this, ""))).invoke(str)) {
            return o0000OO0.OooO0OO();
        }
        OooO0OO OooO0oO2 = o0OOO0.OooO0oO(oooO0o, new UnityAdsSDK$initialize$$inlined$inject$default$2(this, ""));
        OooO0OO OooO0oO3 = o0OOO0.OooO0oO(oooO0o, new UnityAdsSDK$initialize$$inlined$inject$default$3(this, ""));
        OooO0OO OooO0oO4 = o0OOO0.OooO0oO(oooO0o, new UnityAdsSDK$initialize$$inlined$inject$default$4(this, ""));
        o000OO o000oo2 = (o000OO) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_INIT_SCOPE, o0OO00O.OooO00o(o000OO.class));
        return o0000OO0.OooOo0(o000oo2, null, new C42081(source, o000oo2, OooO0oO2, OooO0oO4, OooO0oO3, null), 3);
    }

    public final o00O0O00 load(String str, UnityAdsLoadOptions loadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize) {
        kotlin.jvm.internal.OooOo.OooO0o0(loadOptions, "loadOptions");
        OooO0o oooO0o = OooO0o.f33184OooOo0o;
        initialize(load$lambda$4(o0OOO0.OooO0oO(oooO0o, new UnityAdsSDK$load$$inlined$inject$default$1(this, ""))).invoke(), "load");
        o000OO o000oo2 = (o000OO) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_LOAD_SCOPE, o0OO00O.OooO00o(o000OO.class));
        return o0000OO0.OooOo0(o000oo2, null, new C42091(str, loadOptions, iUnityAdsLoadListener, unityBannerSize, o000oo2, o0OOO0.OooO0oO(oooO0o, new UnityAdsSDK$load$$inlined$inject$default$2(this, "")), null), 3);
    }

    public final void sendBannerDestroyed() {
        OooO0o oooO0o = OooO0o.f33184OooOo0o;
        if (sendBannerDestroyed$lambda$20(o0OOO0.OooO0oO(oooO0o, new UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$1(this, ""))).invoke()) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendBannerDestroyed$lambda$21(o0OOO0.OooO0oO(oooO0o, new UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$2(this, ""))), "native_banner_destroyed", null, null, null, null, null, 62, null);
        }
    }

    public final o00O0O00 show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        o000OO o000oo2 = (o000OO) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_SHOW_SCOPE, o0OO00O.OooO00o(o000OO.class));
        return o0000OO0.OooOo0(o000oo2, null, new C42101((LegacyShowUseCase) getServiceProvider().getRegistry().getService("", o0OO00O.OooO00o(LegacyShowUseCase.class)), activity, str, unityAdsShowOptions, listener, o000oo2, null), 3);
    }

    public UnityAdsSDK(IServiceProvider serviceProvider) {
        kotlin.jvm.internal.OooOo.OooO0o0(serviceProvider, "serviceProvider");
        this.serviceProvider = serviceProvider;
    }

    public /* synthetic */ UnityAdsSDK(IServiceProvider iServiceProvider, int i, OooOO0O oooOO0O) {
        this((i & 1) != 0 ? ServiceProvider.INSTANCE : iServiceProvider);
    }

    public final o00O0O00 getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        return getToken(null, iUnityAdsTokenListener);
    }

    public final o00O0O00 getToken(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener) {
        OooO0o oooO0o = OooO0o.f33184OooOo0o;
        initialize(getToken$lambda$6(o0OOO0.OooO0oO(oooO0o, new UnityAdsSDK$getToken$$inlined$inject$default$1(this, ""))).invoke(), "get_token");
        OooO0OO OooO0oO2 = o0OOO0.OooO0oO(oooO0o, new UnityAdsSDK$getToken$$inlined$inject$default$2(this, ""));
        OooO0OO OooO0oO3 = o0OOO0.OooO0oO(oooO0o, new UnityAdsSDK$getToken$$inlined$inject$default$3(this, ""));
        o000OO o000oo2 = (o000OO) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_GET_TOKEN_SCOPE, o0OO00O.OooO00o(o000OO.class));
        return o0000OO0.OooOo0(o000oo2, null, new C42072(tokenConfiguration, iUnityAdsTokenListener, o000oo2, OooO0oO3, OooO0oO2, null), 3);
    }
}
