package com.unity3d.ads.core.domain;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import com.google.protobuf.ByteString;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import o00O.o0OoOo0;
import o00O0.o000OOo;
import o00O0.o0O0O00;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0Oo.o00Oo0;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0O00oO0;
import o00O0ooo.o0OO000;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0oO0O0o;
import o00O0ooo.oO00000o;
import oo00o.OooOO0;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class AndroidShow implements Show {
    private final AdRepository adRepository;
    private final GameServerIdReader gameServerIdReader;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1", m13472f = "AndroidShow.kt", m13473l = {IronSourceConstants.RETRY_LIMIT}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1 */
    public static final class C40881 extends OooOOOO implements o00O0O {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidShow this$0;

        @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$2", m13472f = "AndroidShow.kt", m13473l = {}, m13474m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends OooOOOO implements o00O0O {
            final /* synthetic */ Activity $activity;
            final /* synthetic */ AdObject $ad;
            final /* synthetic */ AdObject $adObject;
            final /* synthetic */ UnityAdsShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AdObject adObject, AndroidShow androidShow, AdObject adObject2, Activity activity, UnityAdsShowOptions unityAdsShowOptions, OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.$ad = adObject;
                this.this$0 = androidShow;
                this.$adObject = adObject2;
                this.$activity = activity;
                this.$showOptions = unityAdsShowOptions;
            }

            @Override // o00O0OO0.OooO00o
            public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
                return new AnonymousClass2(this.$ad, this.this$0, this.$adObject, this.$activity, this.$showOptions, oooO0OO);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
            @Override // o00O0OO0.OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                    int r0 = r13.label
                    if (r0 != 0) goto Lb9
                    o00O0.o000OOo.OooOO0O(r14)
                    com.unity3d.ads.core.data.model.AdObject r14 = r13.$ad
                    com.unity3d.ads.core.domain.AndroidShow r0 = r13.this$0
                    com.unity3d.ads.core.configuration.GameServerIdReader r0 = com.unity3d.ads.core.domain.AndroidShow.access$getGameServerIdReader$p(r0)
                    com.unity3d.services.core.misc.JsonStorage r1 = r0.getJsonStorage()
                    java.lang.String r2 = r0.getKey()
                    java.lang.Object r1 = r1.get(r2)
                    r2 = 0
                    if (r1 == 0) goto L28
                    boolean r3 = r1 instanceof java.lang.String
                    if (r3 == 0) goto L25
                    goto L26
                L25:
                    r1 = r2
                L26:
                    if (r1 != 0) goto L29
                L28:
                    r1 = r2
                L29:
                    com.unity3d.services.core.misc.JsonStorage r3 = r0.getJsonStorage()
                    java.lang.String r4 = r0.getKey()
                    java.lang.Object r3 = r3.get(r4)
                    if (r3 == 0) goto L42
                    com.unity3d.services.core.misc.JsonStorage r3 = r0.getJsonStorage()
                    java.lang.String r0 = r0.getKey()
                    r3.delete(r0)
                L42:
                    java.lang.String r1 = (java.lang.String) r1
                    r14.setPlayerServerId(r1)
                    com.unity3d.ads.core.data.model.AdObject r14 = r13.$adObject
                    o00O0ooo.o0OO r14 = r14.getState()
                    com.unity3d.ads.core.data.model.AdObjectState r0 = com.unity3d.ads.core.data.model.AdObjectState.SHOWING
                    o00O0ooo.oO00000o r14 = (o00O0ooo.oO00000o) r14
                    r14.OooO0oo(r0)
                    com.unity3d.ads.core.domain.AndroidShow r14 = r13.this$0
                    com.unity3d.ads.core.domain.SendDiagnosticEvent r3 = com.unity3d.ads.core.domain.AndroidShow.access$getSendDiagnosticEvent$p(r14)
                    com.unity3d.ads.core.data.model.AdObject r8 = r13.$adObject
                    r10 = 46
                    r11 = 0
                    java.lang.String r4 = "native_show_event_flow_started"
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r9 = 0
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                    com.unity3d.ads.core.data.model.AdObject r14 = r13.$ad
                    com.unity3d.ads.adplayer.AdPlayer r14 = r14.getAdPlayer()
                    java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
                    android.app.Activity r0 = r13.$activity
                    r4.<init>(r0)
                    com.unity3d.ads.UnityAdsShowOptions r0 = r13.$showOptions
                    if (r0 == 0) goto L83
                    org.json.JSONObject r0 = r0.getData()
                    if (r0 == 0) goto L83
                    java.util.Map r2 = com.unity3d.ads.core.extensions.JSONObjectExtensionsKt.toBuiltInMap(r0)
                L83:
                    r5 = r2
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    boolean r7 = r0.isScarAd()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r9 = r0.getScarAdString()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r8 = r0.getScarQueryId()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r10 = r0.getScarAdUnitId()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    boolean r11 = r0.isOfferwallAd()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r12 = r0.getOfferwallPlacementName()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r6 = r0.getPlacementId()
                    com.unity3d.ads.adplayer.AndroidShowOptions r3 = new com.unity3d.ads.adplayer.AndroidShowOptions
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                    r14.show(r3)
                    oo00o.OooOo r14 = oo00o.OooOo.f33195OooO00o
                    return r14
                Lb9:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidShow.C40881.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // o00O0Oo.o00O0O
            public final Object invoke(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                return ((AnonymousClass2) create(o0o000oo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }
        }

        @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$3", m13472f = "AndroidShow.kt", m13473l = {}, m13474m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends OooOOOO implements o00Oo0 {
            final /* synthetic */ AdObject $adObject;
            final /* synthetic */ ByteString $opportunityId;
            int label;
            final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(AndroidShow androidShow, AdObject adObject, ByteString byteString, OooO0OO oooO0OO) {
                super(3, oooO0OO);
                this.this$0 = androidShow;
                this.$adObject = adObject;
                this.$opportunityId = byteString;
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_event_flow_completed", null, null, null, this.$adObject, null, 46, null);
                ((oO00000o) this.$adObject.getState()).OooO0oo(AdObjectState.COMPLETED);
                this.this$0.adRepository.removeAd(this.$opportunityId);
                return OooOo.f33195OooO00o;
            }

            @Override // o00O0Oo.o00Oo0
            public final Object invoke(o0O000Oo o0o000oo, Throwable th, OooO0OO oooO0OO) {
                return new AnonymousClass3(this.this$0, this.$adObject, this.$opportunityId, oooO0OO).invokeSuspend(OooOo.f33195OooO00o);
            }
        }

        @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$4", m13472f = "AndroidShow.kt", m13473l = {59}, m13474m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends OooOOOO implements o00Oo0 {
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            public AnonymousClass4(OooO0OO oooO0OO) {
                super(3, oooO0OO);
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                ShowEvent showEvent;
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                int i = this.label;
                if (i == 0) {
                    o000OOo.OooOO0O(obj);
                    o0O000Oo o0o000oo = (o0O000Oo) this.L$0;
                    ShowEvent showEvent2 = (ShowEvent) this.L$1;
                    this.L$0 = showEvent2;
                    this.label = 1;
                    if (o0o000oo.emit(showEvent2, this) == oooOo00) {
                        return oooOo00;
                    }
                    showEvent = showEvent2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    showEvent = (ShowEvent) this.L$0;
                    o000OOo.OooOO0O(obj);
                }
                return Boolean.valueOf(((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) ? false : true);
            }

            @Override // o00O0Oo.o00Oo0
            public final Object invoke(o0O000Oo o0o000oo, ShowEvent showEvent, OooO0OO oooO0OO) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(oooO0OO);
                anonymousClass4.L$0 = o0o000oo;
                anonymousClass4.L$1 = showEvent;
                return anonymousClass4.invokeSuspend(OooOo.f33195OooO00o);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40881(AdObject adObject, AndroidShow androidShow, Activity activity, UnityAdsShowOptions unityAdsShowOptions, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$adObject = adObject;
            this.this$0 = androidShow;
            this.$activity = activity;
            this.$showOptions = unityAdsShowOptions;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C40881 c40881 = new C40881(this.$adObject, this.this$0, this.$activity, this.$showOptions, oooO0OO);
            c40881.L$0 = obj;
            return c40881;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                final o0O000Oo o0o000oo = (o0O000Oo) this.L$0;
                if (this.$adObject.getOpportunityId().isEmpty()) {
                    throw new IllegalArgumentException("No opportunityId");
                }
                ByteString opportunityId = this.$adObject.getOpportunityId();
                AdObject ad = this.this$0.adRepository.getAd(opportunityId);
                if (ad == null) {
                    throw new IllegalStateException("No ad associated with opportunityId");
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_started_ad_viewer", null, null, null, this.$adObject, null, 46, null);
                AdPlayer adPlayer = ad.getAdPlayer();
                if (adPlayer == null) {
                    throw new IllegalStateException("No adPlayer associated with ad");
                }
                o0OoOo0 o0oooo0 = new o0OoOo0(new o0OO000(new o0O00oO0(new o0oO0O0o(new AnonymousClass2(ad, this.this$0, this.$adObject, this.$activity, this.$showOptions, null), adPlayer.getOnShowEvent()), new AnonymousClass3(this.this$0, this.$adObject, opportunityId, null)), new AnonymousClass4(null), null));
                final AndroidShow androidShow = this.this$0;
                final AdObject adObject = this.$adObject;
                o0O000Oo o0o000oo2 = new o0O000Oo() { // from class: com.unity3d.ads.core.domain.AndroidShow.invoke.1.5
                    @Override // o00O0ooo.o0O000Oo
                    public final Object emit(ShowEvent showEvent, OooO0OO oooO0OO) {
                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidShow.sendDiagnosticEvent, "native_show_event_flow_collected", null, o0O0O00.OooOOOo(new OooOO0(NotificationCompat.CATEGORY_EVENT, showEvent.getClass().getSimpleName())), null, adObject, null, 42, null);
                        Object objEmit = o0o000oo.emit(showEvent, oooO0OO);
                        return objEmit == OooOo00.f31365OooOo0O ? objEmit : OooOo.f33195OooO00o;
                    }
                };
                this.label = 1;
                if (o0oooo0.collect(o0o000oo2, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
            return ((C40881) create(o0o000oo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public AndroidShow(AdRepository adRepository, GameServerIdReader gameServerIdReader, SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.OooOo.OooO0o0(adRepository, "adRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(gameServerIdReader, "gameServerIdReader");
        kotlin.jvm.internal.OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.adRepository = adRepository;
        this.gameServerIdReader = gameServerIdReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.Show
    public o0OoOoOo invoke(Activity activity, AdObject adObject, UnityAdsShowOptions unityAdsShowOptions) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        kotlin.jvm.internal.OooOo.OooO0o0(adObject, "adObject");
        return new o0OoOo0(new C40881(adObject, this, activity, unityAdsShowOptions, null));
    }

    @Override // com.unity3d.ads.core.domain.Show
    public Object terminate(AdObject adObject, OooO0OO oooO0OO) {
        Object objDestroy;
        AdPlayer adPlayer = adObject.getAdPlayer();
        return (adPlayer == null || (objDestroy = adPlayer.destroy(oooO0OO)) != OooOo00.f31365OooOo0O) ? OooOo.f33195OooO00o : objDestroy;
    }
}
