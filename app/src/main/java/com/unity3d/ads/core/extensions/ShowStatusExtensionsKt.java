package com.unity3d.ads.core.extensions;

import OooOOO0.OooO00o;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.adplayer.model.ShowStatus;
import gatewayprotocol.p014v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class ShowStatusExtensionsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NativeConfigurationOuterClass.ShowCompletionState.values().length];
            try {
                iArr[NativeConfigurationOuterClass.ShowCompletionState.SHOW_COMPLETION_STATE_COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NativeConfigurationOuterClass.ShowCompletionState.SHOW_COMPLETION_STATE_SKIPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ShowStatus.values().length];
            try {
                iArr2[ShowStatus.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ShowStatus.SKIPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ShowStatus.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final UnityAds.UnityAdsShowCompletionState toUnityAdsShowCompletionState(ShowStatus showStatus, NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState) {
        OooOo.OooO0o0(showStatus, "<this>");
        OooOo.OooO0o0(defaultShowCompletionState, "defaultShowCompletionState");
        int i = WhenMappings.$EnumSwitchMapping$1[showStatus.ordinal()];
        if (i == 1) {
            return UnityAds.UnityAdsShowCompletionState.COMPLETED;
        }
        if (i == 2) {
            return UnityAds.UnityAdsShowCompletionState.SKIPPED;
        }
        if (i != 3) {
            throw new OooO00o();
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[defaultShowCompletionState.ordinal()];
        return i2 != 1 ? i2 != 2 ? UnityAds.UnityAdsShowCompletionState.COMPLETED : UnityAds.UnityAdsShowCompletionState.SKIPPED : UnityAds.UnityAdsShowCompletionState.COMPLETED;
    }
}
