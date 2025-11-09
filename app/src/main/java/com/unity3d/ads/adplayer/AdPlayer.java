package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import com.unity3d.scar.adapter.common.OooO0O0;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import java.util.Map;
import o00O0O0O.OooO0OO;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oo.o0000oo;
import o00O0ooo.o0OO0oO0;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import oo00o.OooO;
import oo00o.OooOo;

/* loaded from: classes2.dex */
public interface AdPlayer {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
    public static final int SCAR_EVENT_QUEUE_SIZE = 10;

    public static final class Companion {
        public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
        public static final int SCAR_EVENT_QUEUE_SIZE = 10;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final o0OO0oO0 broadcastEventChannel = o0o0000.OooO00o((7 & 1) != 0 ? 0 : 100, (7 & 2) == 0 ? 64 : 0, o0000oo.f31602OooOo0O);

        private Companion() {
        }

        public final o0OO0oO0 getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }

    public static final class DefaultImpls {
        @CallSuper
        public static Object destroy(AdPlayer adPlayer, OooO0OO oooO0OO) {
            o0000OO0.OooO(adPlayer.getScope());
            return OooOo.f33195OooO00o;
        }

        public static void show(AdPlayer adPlayer, ShowOptions showOptions) {
            kotlin.jvm.internal.OooOo.OooO0o0(showOptions, "showOptions");
            throw new OooO("An operation is not implemented.");
        }
    }

    @CallSuper
    Object destroy(OooO0OO oooO0OO);

    void dispatchShowCompleted();

    o0OoOoOo getOnLoadEvent();

    o0OoOoOo getOnOfferwallEvent();

    o0OoOoOo getOnScarEvent();

    o0OoOoOo getOnShowEvent();

    o000OO getScope();

    WebViewContainer getWebViewContainer();

    Object onAllowedPiiChange(byte[] bArr, OooO0OO oooO0OO);

    Object onBroadcastEvent(String str, OooO0OO oooO0OO);

    Object requestShow(Map<String, ? extends Object> map, OooO0OO oooO0OO);

    Object sendActivityDestroyed(OooO0OO oooO0OO);

    Object sendFocusChange(boolean z, OooO0OO oooO0OO);

    Object sendGmaEvent(OooO0O0 oooO0O0, OooO0OO oooO0OO);

    Object sendMuteChange(boolean z, OooO0OO oooO0OO);

    Object sendOfferwallEvent(OfferwallEvent offerwallEvent, OooO0OO oooO0OO);

    Object sendPrivacyFsmChange(byte[] bArr, OooO0OO oooO0OO);

    Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, OooO0OO oooO0OO);

    Object sendUserConsentChange(byte[] bArr, OooO0OO oooO0OO);

    Object sendVisibilityChange(boolean z, OooO0OO oooO0OO);

    Object sendVolumeChange(double d, OooO0OO oooO0OO);

    void show(ShowOptions showOptions);
}
