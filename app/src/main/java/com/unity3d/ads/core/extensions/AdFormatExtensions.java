package com.unity3d.ads.core.extensions;

import OooOOO0.OooO00o;
import com.unity3d.ads.AdFormat;
import gatewayprotocol.p014v1.InitializationResponseOuterClass;
import kotlin.jvm.internal.OooOo;
import o000ooOO.o000OO0O;

/* loaded from: classes3.dex */
public final class AdFormatExtensions {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InitializationResponseOuterClass.AdFormat.values().length];
            try {
                iArr[InitializationResponseOuterClass.AdFormat.AD_FORMAT_REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitializationResponseOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitializationResponseOuterClass.AdFormat.AD_FORMAT_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AdFormat.values().length];
            try {
                iArr2[AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final InitializationResponseOuterClass.AdFormat toProtoAdFormat(AdFormat adFormat) {
        OooOo.OooO0o0(adFormat, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[adFormat.ordinal()];
        if (i == 1) {
            return InitializationResponseOuterClass.AdFormat.AD_FORMAT_BANNER;
        }
        if (i == 2) {
            return InitializationResponseOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL;
        }
        if (i == 3) {
            return InitializationResponseOuterClass.AdFormat.AD_FORMAT_REWARDED;
        }
        throw new OooO00o();
    }

    public static final o000OO0O toUnityAdFormat(InitializationResponseOuterClass.AdFormat adFormat) {
        OooOo.OooO0o0(adFormat, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[adFormat.ordinal()];
        if (i == 1) {
            return o000OO0O.f31120OooOo0o;
        }
        if (i == 2) {
            return o000OO0O.f31119OooOo0O;
        }
        if (i != 3) {
            return null;
        }
        return o000OO0O.f31118OooOo;
    }

    public static final o000OO0O toUnityAdFormat(AdFormat adFormat) {
        OooOo.OooO0o0(adFormat, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[adFormat.ordinal()];
        if (i == 1) {
            return o000OO0O.f31118OooOo;
        }
        if (i == 2) {
            return o000OO0O.f31119OooOo0O;
        }
        if (i == 3) {
            return o000OO0O.f31120OooOo0o;
        }
        throw new OooO00o();
    }
}
