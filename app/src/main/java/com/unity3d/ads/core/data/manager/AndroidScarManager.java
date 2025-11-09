package com.unity3d.ads.core.data.manager;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.p012di.ServiceProvider;
import gatewayprotocol.p014v1.InitializationResponseOuterClass;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o000ooOO.o000O0Oo;
import o00O.o0OoOo0;
import o00O0.OooOOO;
import o00O0.Oooo000;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0Oo.o00Oo0;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oOo.oo0o0Oo;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0OO000;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import o00O0ooo.o0oO0O0o;
import o00O0ooo.oO000O0;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class AndroidScarManager implements ScarManager {
    private final GMAScarAdapterBridge gmaBridge;
    private final CommonScarEventReceiver scarEventReceiver;
    private final ScarTimeHackFixer scarTimeHackFixer;

    @OooO(m13471c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2", m13472f = "AndroidScarManager.kt", m13473l = {130}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2 */
    public static final class C40242 extends OooOOOO implements o00O0O {
        final /* synthetic */ List<InitializationResponseOuterClass.AdFormat> $adFormat;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AndroidScarManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C40242(List<? extends InitializationResponseOuterClass.AdFormat> list, AndroidScarManager androidScarManager, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$adFormat = list;
            this.this$0 = androidScarManager;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C40242(this.$adFormat, this.this$0, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, Resources.NotFoundException, PackageManager.NameNotFoundException, ClassNotFoundException, IllegalArgumentException, Oooo.OooOOOO, InvocationTargetException {
            ArrayList arrayList;
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
            List<InitializationResponseOuterClass.AdFormat> list = this.$adFormat;
            AndroidScarManager androidScarManager = this.this$0;
            this.L$0 = list;
            this.L$1 = androidScarManager;
            this.label = 1;
            final oo0o0Oo oo0o0oo = new oo0o0Oo(1, Oooo0o0.OooO.OooOOOO(this));
            oo0o0oo.OooOOo0();
            if (list != null) {
                arrayList = new ArrayList(Oooo000.OooOo0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AdFormatExtensions.toUnityAdFormat((InitializationResponseOuterClass.AdFormat) it.next()));
                }
            } else {
                arrayList = null;
            }
            androidScarManager.gmaBridge.getSCARBiddingSignals(arrayList, new BiddingSignalsHandler(true, new IBiddingSignalsListener() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2$1$1
                @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                public void onSignalsFailure(String str) {
                    oo0o0oo.resumeWith(o000OOo.OooO0O0(new Exception(str)));
                }

                @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                public void onSignalsReady(BiddingSignals biddingSignals) {
                    oo0o0oo.resumeWith(biddingSignals);
                }
            }));
            Object objOooOOOo = oo0o0oo.OooOOOo();
            OooOo00 oooOo002 = OooOo00.f31365OooOo0O;
            return objOooOOOo == oooOo00 ? oooOo00 : objOooOOOo;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C40242) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2", m13472f = "AndroidScarManager.kt", m13473l = {42}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2 */
    public static final class C40252 extends OooOOOO implements o00O0O {
        int label;

        @OooO(m13471c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1", m13472f = "AndroidScarManager.kt", m13473l = {}, m13474m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends OooOOOO implements o00O0O {
            int label;
            final /* synthetic */ AndroidScarManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidScarManager androidScarManager, OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.this$0 = androidScarManager;
            }

            @Override // o00O0OO0.OooO00o
            public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
                return new AnonymousClass1(this.this$0, oooO0OO);
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                this.this$0.gmaBridge.getVersion();
                return OooOo.f33195OooO00o;
            }

            @Override // o00O0Oo.o00O0O
            public final Object invoke(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                return ((AnonymousClass1) create(o0o000oo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }
        }

        public C40252(OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return AndroidScarManager.this.new C40252(oooO0OO);
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
            oO000O0 oo000o0 = new oO000O0(AndroidScarManager.this.scarEventReceiver.getVersionFlow(), new AnonymousClass1(AndroidScarManager.this, null));
            this.label = 1;
            Object objOooOO0o = o0o0000.OooOO0o(oo000o0, this);
            return objOooOO0o == oooOo00 ? oooOo00 : objOooOO0o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C40252) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.manager.AndroidScarManager", m13472f = "AndroidScarManager.kt", m13473l = {89}, m13474m = "loadAd")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 */
    public static final class C40261 extends o00O0OO0.OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C40261(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidScarManager.this.loadAd(null, null, null, null, null, 0, this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2", m13472f = "AndroidScarManager.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2 */
    public static final class C40272 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $adString;
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ boolean $canSkip;
        final /* synthetic */ String $placementId;
        final /* synthetic */ String $queryId;
        final /* synthetic */ int $videoLength;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40272(boolean z, String str, String str2, String str3, String str4, int i, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$canSkip = z;
            this.$placementId = str;
            this.$queryId = str2;
            this.$adString = str3;
            this.$adUnitId = str4;
            this.$videoLength = i;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return AndroidScarManager.this.new C40272(this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, this.$videoLength, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            AndroidScarManager.this.gmaBridge.load(this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, AndroidScarManager.this.scarTimeHackFixer.invoke(this.$videoLength));
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
            return ((C40272) create(o0o000oo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3", m13472f = "AndroidScarManager.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3 */
    public static final class C40283 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $placementId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40283(String str, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$placementId = str;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C40283 c40283 = new C40283(this.$placementId, oooO0OO);
            c40283.L$0 = obj;
            return c40283;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(GmaEventData gmaEventData, OooO0OO oooO0OO) {
            return ((C40283) create(gmaEventData, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            GmaEventData gmaEventData = (GmaEventData) this.L$0;
            return Boolean.valueOf((o00O0.OooOo.OooOOo(com.unity3d.scar.adapter.common.OooO0O0.f28634Oooo000, com.unity3d.scar.adapter.common.OooO0O0.f28637Oooo0O0).contains(gmaEventData.getGmaEvent()) && kotlin.jvm.internal.OooOo.OooO00o(gmaEventData.getPlacementId(), this.$placementId)) || o00O0.OooOo.OooOOo(com.unity3d.scar.adapter.common.OooO0O0.f28651OoooOoO, com.unity3d.scar.adapter.common.OooO0O0.f28624OooOo0o, com.unity3d.scar.adapter.common.OooO0O0.f28633Oooo0).contains(gmaEventData.getGmaEvent()));
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1", m13472f = "AndroidScarManager.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1 */
    public static final class C40291 extends OooOOOO implements o00O0O {
        final /* synthetic */ UnityBannerSize $bannerSize;
        final /* synthetic */ BannerView $bannerView;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $opportunityId;
        final /* synthetic */ o000O0Oo $scarAdMetadata;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40291(Context context, BannerView bannerView, String str, o000O0Oo o000o0oo2, UnityBannerSize unityBannerSize, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$context = context;
            this.$bannerView = bannerView;
            this.$opportunityId = str;
            this.$scarAdMetadata = o000o0oo2;
            this.$bannerSize = unityBannerSize;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return AndroidScarManager.this.new C40291(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            AndroidScarManager.this.gmaBridge.loadBanner(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
            return ((C40291) create(o0o000oo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$1", m13472f = "AndroidScarManager.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$show$1 */
    public static final class C40301 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $placementId;
        final /* synthetic */ String $queryId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40301(String str, String str2, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$placementId = str;
            this.$queryId = str2;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return AndroidScarManager.this.new C40301(this.$placementId, this.$queryId, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            AndroidScarManager.this.gmaBridge.show(this.$placementId, this.$queryId);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
            return ((C40301) create(o0o000oo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$2", m13472f = "AndroidScarManager.kt", m13473l = {123}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$show$2 */
    public static final class C40312 extends OooOOOO implements o00Oo0 {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C40312(OooO0OO oooO0OO) {
            super(3, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            GmaEventData gmaEventData;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o0O000Oo o0o000oo = (o0O000Oo) this.L$0;
                GmaEventData gmaEventData2 = (GmaEventData) this.L$1;
                this.L$0 = gmaEventData2;
                this.label = 1;
                if (o0o000oo.emit(gmaEventData2, this) == oooOo00) {
                    return oooOo00;
                }
                gmaEventData = gmaEventData2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gmaEventData = (GmaEventData) this.L$0;
                o000OOo.OooOO0O(obj);
            }
            return Boolean.valueOf(!OooOOO.Oooo00O(new com.unity3d.scar.adapter.common.OooO0O0[]{com.unity3d.scar.adapter.common.OooO0O0.f28650OoooOo0, com.unity3d.scar.adapter.common.OooO0O0.f28638Oooo0OO, com.unity3d.scar.adapter.common.OooO0O0.f28632Oooo, com.unity3d.scar.adapter.common.OooO0O0.f28642Oooo0oo}, gmaEventData.getGmaEvent()));
        }

        @Override // o00O0Oo.o00Oo0
        public final Object invoke(o0O000Oo o0o000oo, GmaEventData gmaEventData, OooO0OO oooO0OO) {
            C40312 c40312 = new C40312(oooO0OO);
            c40312.L$0 = o0o000oo;
            c40312.L$1 = gmaEventData;
            return c40312.invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public AndroidScarManager(CommonScarEventReceiver scarEventReceiver, GMAScarAdapterBridge gmaBridge, ScarTimeHackFixer scarTimeHackFixer) {
        kotlin.jvm.internal.OooOo.OooO0o0(scarEventReceiver, "scarEventReceiver");
        kotlin.jvm.internal.OooOo.OooO0o0(gmaBridge, "gmaBridge");
        kotlin.jvm.internal.OooOo.OooO0o0(scarTimeHackFixer, "scarTimeHackFixer");
        this.scarEventReceiver = scarEventReceiver;
        this.gmaBridge = gmaBridge;
        this.scarTimeHackFixer = scarTimeHackFixer;
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public Object getSignals(List<? extends InitializationResponseOuterClass.AdFormat> list, OooO0OO oooO0OO) {
        return o0000OO0.Oooo00o(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, new C40242(list, this, null), oooO0OO);
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public Object getVersion(OooO0OO oooO0OO) {
        return o0000OO0.Oooo00o(5000L, new C40252(null), oooO0OO);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // com.unity3d.ads.core.data.manager.ScarManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadAd(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, o00O0O0O.OooO0OO r21) throws com.unity3d.ads.core.data.model.exception.LoadException {
        /*
            r14 = this;
            r0 = r21
            boolean r2 = r0 instanceof com.unity3d.ads.core.data.manager.AndroidScarManager.C40261
            if (r2 == 0) goto L16
            r2 = r0
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 r2 = (com.unity3d.ads.core.data.manager.AndroidScarManager.C40261) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
        L14:
            r9 = r2
            goto L1c
        L16:
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 r2 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1
            r2.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.result
            o00O0O0o.OooOo00 r10 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r9.label
            r11 = 0
            r12 = 1
            if (r2 == 0) goto L34
            if (r2 != r12) goto L2c
            o00O0.o000OOo.OooOO0O(r0)
            goto L69
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L34:
            o00O0.o000OOo.OooOO0O(r0)
            java.lang.String r0 = "INTERSTITIAL"
            boolean r2 = o00O0oO.o0000O00.Oooo000(r15, r0)
            com.unity3d.ads.core.domain.scar.CommonScarEventReceiver r0 = r14.scarEventReceiver
            o00O0ooo.o0OOO0OO r13 = r0.getGmaEventFlow()
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2 r0 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2
            r8 = 0
            r1 = r14
            r3 = r16
            r5 = r17
            r6 = r18
            r4 = r19
            r7 = r20
            r0.<init>(r2, r3, r4, r5, r6, r7, r8)
            o00O0ooo.oO000O0 r1 = new o00O0ooo.oO000O0
            r1.<init>(r13, r0)
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3 r0 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3
            r3 = r16
            r0.<init>(r3, r11)
            r9.label = r12
            java.lang.Object r0 = o00O0ooo.o0o0000.OooOOO0(r1, r0, r9)
            if (r0 != r10) goto L69
            return r10
        L69:
            r1 = r0
            com.unity3d.ads.core.domain.scar.GmaEventData r1 = (com.unity3d.ads.core.domain.scar.GmaEventData) r1
            com.unity3d.scar.adapter.common.OooO0O0 r1 = r1.getGmaEvent()
            com.unity3d.scar.adapter.common.OooO0O0 r2 = com.unity3d.scar.adapter.common.OooO0O0.f28634Oooo000
            if (r1 == r2) goto L75
            r11 = r0
        L75:
            com.unity3d.ads.core.domain.scar.GmaEventData r11 = (com.unity3d.ads.core.domain.scar.GmaEventData) r11
            if (r11 == 0) goto L98
            com.unity3d.ads.core.data.model.exception.LoadException r0 = new com.unity3d.ads.core.data.model.exception.LoadException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error loading SCAR ad: "
            r1.<init>(r2)
            java.lang.String r2 = r11.getErrorMessage()
            if (r2 != 0) goto L8c
            com.unity3d.scar.adapter.common.OooO0O0 r2 = r11.getGmaEvent()
        L8c:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r0.<init>(r2, r1)
            throw r0
        L98:
            oo00o.OooOo r0 = oo00o.OooOo.f33195OooO00o
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager.loadAd(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, o00O0O0O.OooO0OO):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public o0OoOoOo loadBannerAd(Context context, BannerView bannerView, o000O0Oo scarAdMetadata, UnityBannerSize bannerSize, final String opportunityId) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(bannerView, "bannerView");
        kotlin.jvm.internal.OooOo.OooO0o0(scarAdMetadata, "scarAdMetadata");
        kotlin.jvm.internal.OooOo.OooO0o0(bannerSize, "bannerSize");
        kotlin.jvm.internal.OooOo.OooO0o0(opportunityId, "opportunityId");
        final o0oO0O0o o0oo0o0o = new o0oO0O0o(new C40291(context, bannerView, opportunityId, scarAdMetadata, bannerSize, null), this.scarEventReceiver.getGmaEventFlow());
        return new o0OoOoOo() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1

            /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2 */
            public static final class C40232<T> implements o0O000Oo {
                final /* synthetic */ String $opportunityId$inlined;
                final /* synthetic */ o0O000Oo $this_unsafeFlow;

                @OooO(m13471c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2", m13472f = "AndroidScarManager.kt", m13473l = {223}, m13474m = "emit")
                /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends o00O0OO0.OooO0OO {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(OooO0OO oooO0OO) {
                        super(oooO0OO);
                    }

                    @Override // o00O0OO0.OooO00o
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C40232.this.emit(null, this);
                    }
                }

                public C40232(o0O000Oo o0o000oo, String str) {
                    this.$this_unsafeFlow = o0o000oo;
                    this.$opportunityId$inlined = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // o00O0ooo.o0O000Oo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, o00O0O0O.OooO0OO r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.C40232.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.C40232.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        o00O0.o000OOo.OooOO0O(r8)
                        goto L54
                    L27:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L2f:
                        o00O0.o000OOo.OooOO0O(r8)
                        o00O0ooo.o0O000Oo r8 = r6.$this_unsafeFlow
                        r2 = r7
                        com.unity3d.ads.core.domain.scar.GmaEventData r2 = (com.unity3d.ads.core.domain.scar.GmaEventData) r2
                        com.unity3d.scar.adapter.common.OooO0O0 r4 = r2.getGmaEvent()
                        com.unity3d.scar.adapter.common.OooO0O0 r5 = com.unity3d.scar.adapter.common.OooO0O0.f28652OoooOoo
                        if (r4 != r5) goto L54
                        java.lang.String r2 = r2.getOpportunityId()
                        java.lang.String r4 = r6.$opportunityId$inlined
                        boolean r2 = kotlin.jvm.internal.OooOo.OooO00o(r2, r4)
                        if (r2 == 0) goto L54
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L54
                        return r1
                    L54:
                        oo00o.OooOo r7 = oo00o.OooOo.f33195OooO00o
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.C40232.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                }
            }

            @Override // o00O0ooo.o0OoOoOo
            public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                Object objCollect = o0oo0o0o.collect(new C40232(o0o000oo, opportunityId), oooO0OO);
                return objCollect == OooOo00.f31365OooOo0O ? objCollect : OooOo.f33195OooO00o;
            }
        };
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public o0OoOoOo show(String placementId, String queryId) {
        kotlin.jvm.internal.OooOo.OooO0o0(placementId, "placementId");
        kotlin.jvm.internal.OooOo.OooO0o0(queryId, "queryId");
        return new o0OoOo0(new o0OO000(new oO000O0(this.scarEventReceiver.getGmaEventFlow(), new C40301(placementId, queryId, null)), new C40312(null), null));
    }
}
