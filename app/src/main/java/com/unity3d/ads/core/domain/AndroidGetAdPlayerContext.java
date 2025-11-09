package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;

/* loaded from: classes3.dex */
public final class AndroidGetAdPlayerContext {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_GAME_ID = "gameId";
    private final DeviceInfoRepository deviceInfoRepository;
    private final SessionRepository sessionRepository;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidGetAdPlayerContext", m13472f = "AndroidGetAdPlayerContext.kt", m13473l = {15}, m13474m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1 */
    public static final class C40591 extends OooO0OO {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40591(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetAdPlayerContext.this.invoke(this);
        }
    }

    public AndroidGetAdPlayerContext(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository) {
        OooOo.OooO0o0(deviceInfoRepository, "deviceInfoRepository");
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(o00O0O0O.OooO0OO r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.C40591
            if (r0 == 0) goto L13
            r0 = r15
            com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.C40591) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.AndroidGetAdPlayerContext r0 = (com.unity3d.ads.core.domain.AndroidGetAdPlayerContext) r0
            o00O0.o000OOo.OooOO0O(r15)
            goto L44
        L2b:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L33:
            o00O0.o000OOo.OooOO0O(r15)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r15 = r14.deviceInfoRepository
            r0.L$0 = r14
            r0.label = r3
            java.lang.Object r15 = r15.staticDeviceInfo(r0)
            if (r15 != r1) goto L43
            return r1
        L43:
            r0 = r14
        L44:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r15 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) r15
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r1 = r0.deviceInfoRepository
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo r1 = r1.getDynamicDeviceInfo()
            com.unity3d.ads.core.data.repository.SessionRepository r0 = r0.sessionRepository
            java.lang.String r0 = r0.getGameId()
            if (r0 != 0) goto L56
            java.lang.String r0 = ""
        L56:
            java.lang.String r2 = r15.getBundleId()
            oo00o.OooOO0 r3 = new oo00o.OooOO0
            java.lang.String r4 = "bundleId"
            r3.<init>(r4, r2)
            java.lang.String r2 = r15.getBundleVersion()
            oo00o.OooOO0 r4 = new oo00o.OooOO0
            java.lang.String r5 = "bundleVersion"
            r4.<init>(r5, r2)
            oo00o.OooOO0 r5 = new oo00o.OooOO0
            java.lang.String r2 = "webviewHash"
            java.lang.String r6 = "unknown"
            r5.<init>(r2, r6)
            int r2 = com.unity3d.services.core.properties.SdkProperties.getVersionCode()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r2)
            r2 = r6
            oo00o.OooOO0 r6 = new oo00o.OooOO0
            java.lang.String r7 = "sdkVersion"
            r6.<init>(r7, r2)
            java.lang.String r2 = com.unity3d.services.core.properties.SdkProperties.getVersionName()
            oo00o.OooOO0 r7 = new oo00o.OooOO0
            java.lang.String r8 = "sdkVersionName"
            r7.<init>(r8, r2)
            java.lang.String r2 = r15.getOsVersion()
            oo00o.OooOO0 r8 = new oo00o.OooOO0
            java.lang.String r9 = "osVersion"
            r8.<init>(r9, r2)
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r2 = r2.toString()
            oo00o.OooOO0 r9 = new oo00o.OooOO0
            java.lang.String r10 = "systemLanguage"
            r9.<init>(r10, r2)
            java.lang.String r15 = r15.getDeviceModel()
            oo00o.OooOO0 r10 = new oo00o.OooOO0
            java.lang.String r2 = "deviceModel"
            r10.<init>(r2, r15)
            boolean r15 = r1.getLimitedTracking()
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            oo00o.OooOO0 r11 = new oo00o.OooOO0
            java.lang.String r2 = "limitAdTracking"
            r11.<init>(r2, r15)
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android r15 = r1.getAndroid()
            double r1 = r15.getMaxVolume()
            java.lang.Double r15 = new java.lang.Double
            r15.<init>(r1)
            oo00o.OooOO0 r12 = new oo00o.OooOO0
            java.lang.String r1 = "maxVolume"
            r12.<init>(r1, r15)
            oo00o.OooOO0 r13 = new oo00o.OooOO0
            java.lang.String r15 = "gameId"
            r13.<init>(r15, r0)
            oo00o.OooOO0[] r15 = new oo00o.OooOO0[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            java.util.Map r15 = o00O0.o0O0O00.OooOOo0(r15)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.invoke(o00O0O0O.OooO0OO):java.lang.Object");
    }
}
