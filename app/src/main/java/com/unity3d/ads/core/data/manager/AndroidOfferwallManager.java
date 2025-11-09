package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationTargetException;
import o00O.o0OoOo0;
import o00O0.OooOOO;
import o00O0.o000OOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0Oo.o00Oo0;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0OO000;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.oO000O0;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class AndroidOfferwallManager implements OfferwallManager {
    private final OfferwallAdapterBridge offerwallBridge;

    @OooO(m13471c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager", m13472f = "AndroidOfferwallManager.kt", m13473l = {28}, m13474m = "loadAd")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1 */
    public static final class C40181 extends OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C40181(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidOfferwallManager.this.loadAd(null, this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2", m13472f = "AndroidOfferwallManager.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2 */
    public static final class C40192 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $placementName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40192(String str, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$placementName = str;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return AndroidOfferwallManager.this.new C40192(this.$placementName, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            AndroidOfferwallManager.this.offerwallBridge.loadAd(this.$placementName);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o0O000Oo o0o000oo, o00O0O0O.OooO0OO oooO0OO) {
            return ((C40192) create(o0o000oo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3", m13472f = "AndroidOfferwallManager.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3 */
    public static final class C40203 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $placementName;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40203(String str, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$placementName = str;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            C40203 c40203 = new C40203(this.$placementName, oooO0OO);
            c40203.L$0 = obj;
            return c40203;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(OfferwallEventData offerwallEventData, o00O0O0O.OooO0OO oooO0OO) {
            return ((C40203) create(offerwallEventData, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            OfferwallEventData offerwallEventData = (OfferwallEventData) this.L$0;
            return Boolean.valueOf(o00O0.OooOo.OooOOo(OfferwallEvent.REQUEST_SUCCESS, OfferwallEvent.REQUEST_FAILED).contains(offerwallEventData.getOfferwallEvent()) && kotlin.jvm.internal.OooOo.OooO00o(offerwallEventData.getPlacementName(), this.$placementName));
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1", m13472f = "AndroidOfferwallManager.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1 */
    public static final class C40211 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $placementName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40211(String str, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$placementName = str;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return AndroidOfferwallManager.this.new C40211(this.$placementName, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            AndroidOfferwallManager.this.offerwallBridge.showAd(this.$placementName);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o0O000Oo o0o000oo, o00O0O0O.OooO0OO oooO0OO) {
            return ((C40211) create(o0o000oo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2", m13472f = "AndroidOfferwallManager.kt", m13473l = {44}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2 */
    public static final class C40222 extends OooOOOO implements o00Oo0 {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C40222(o00O0O0O.OooO0OO oooO0OO) {
            super(3, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OfferwallEventData offerwallEventData;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o0O000Oo o0o000oo = (o0O000Oo) this.L$0;
                OfferwallEventData offerwallEventData2 = (OfferwallEventData) this.L$1;
                this.L$0 = offerwallEventData2;
                this.label = 1;
                if (o0o000oo.emit(offerwallEventData2, this) == oooOo00) {
                    return oooOo00;
                }
                offerwallEventData = offerwallEventData2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                offerwallEventData = (OfferwallEventData) this.L$0;
                o000OOo.OooOO0O(obj);
            }
            return Boolean.valueOf(!OooOOO.Oooo00O(new OfferwallEvent[]{OfferwallEvent.ON_CONTENT_DISMISS, OfferwallEvent.SHOW_FAILED}, offerwallEventData.getOfferwallEvent()));
        }

        @Override // o00O0Oo.o00Oo0
        public final Object invoke(o0O000Oo o0o000oo, OfferwallEventData offerwallEventData, o00O0O0O.OooO0OO oooO0OO) {
            C40222 c40222 = new C40222(oooO0OO);
            c40222.L$0 = o0o000oo;
            c40222.L$1 = offerwallEventData;
            return c40222.invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public AndroidOfferwallManager(OfferwallAdapterBridge offerwallBridge) {
        kotlin.jvm.internal.OooOo.OooO0o0(offerwallBridge, "offerwallBridge");
        this.offerwallBridge = offerwallBridge;
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object getVersion(o00O0O0O.OooO0OO oooO0OO) {
        return this.offerwallBridge.getVersion();
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object isAdReady(String str, o00O0O0O.OooO0OO oooO0OO) {
        return Boolean.valueOf(this.offerwallBridge.isAdReady(str));
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object isConnected(o00O0O0O.OooO0OO oooO0OO) {
        return Boolean.valueOf(this.offerwallBridge.isConnected());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadAd(java.lang.String r7, o00O0O0O.OooO0OO r8) throws java.lang.IllegalAccessException, com.unity3d.ads.core.data.model.exception.LoadException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.data.manager.AndroidOfferwallManager.C40181
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1 r0 = (com.unity3d.ads.core.data.manager.AndroidOfferwallManager.C40181) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1 r0 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            o00O0.o000OOo.OooOO0O(r8)
            goto L62
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            o00O0.o000OOo.OooOO0O(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "Offerwall Manager - loadAd: "
            r8.<init>(r2)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.unity3d.services.core.log.DeviceLog.debug(r8)
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r8 = r6.offerwallBridge
            o00O0ooo.o0OOO0OO r8 = r8.getOfferwallEventFlow()
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2 r2 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2
            r2.<init>(r7, r4)
            o00O0ooo.oO000O0 r5 = new o00O0ooo.oO000O0
            r5.<init>(r8, r2)
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3 r8 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3
            r8.<init>(r7, r4)
            r0.label = r3
            java.lang.Object r8 = o00O0ooo.o0o0000.OooOOO0(r5, r8, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            r7 = r8
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r7 = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) r7
            com.unity3d.services.ads.offerwall.OfferwallEvent r7 = r7.getOfferwallEvent()
            com.unity3d.services.ads.offerwall.OfferwallEvent r0 = com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_SUCCESS
            if (r7 == r0) goto L6e
            r4 = r8
        L6e:
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r4 = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) r4
            if (r4 == 0) goto L91
            com.unity3d.ads.core.data.model.exception.LoadException r7 = new com.unity3d.ads.core.data.model.exception.LoadException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Error loading offerwall ad: "
            r8.<init>(r0)
            java.lang.String r0 = r4.getErrorMessage()
            if (r0 != 0) goto L85
            com.unity3d.services.ads.offerwall.OfferwallEvent r0 = r4.getOfferwallEvent()
        L85:
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r0 = 0
            r7.<init>(r0, r8)
            throw r7
        L91:
            oo00o.OooOo r7 = oo00o.OooOo.f33195OooO00o
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidOfferwallManager.loadAd(java.lang.String, o00O0O0O.OooO0OO):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public o0OoOoOo showAd(String placementName) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.OooOo.OooO0o0(placementName, "placementName");
        DeviceLog.debug("Offerwall Manager - showAd: ".concat(placementName));
        return new o0OoOo0(new o0OO000(new oO000O0(this.offerwallBridge.getOfferwallEventFlow(), new C40211(placementName, null)), new C40222(null), null));
    }
}
