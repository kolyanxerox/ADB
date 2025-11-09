package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import com.unity3d.ads.adplayer.AdPlayer;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import oo00o.OooOo;

/* loaded from: classes2.dex */
public interface FullscreenAdPlayer extends AdPlayer {

    public static final class DefaultImpls {
        @CallSuper
        public static Object destroy(FullscreenAdPlayer fullscreenAdPlayer, OooO0OO oooO0OO) {
            Object objDestroy = AdPlayer.DefaultImpls.destroy(fullscreenAdPlayer, oooO0OO);
            return objDestroy == OooOo00.f31365OooOo0O ? objDestroy : OooOo.f33195OooO00o;
        }

        public static void show(FullscreenAdPlayer fullscreenAdPlayer, ShowOptions showOptions) {
            kotlin.jvm.internal.OooOo.OooO0o0(showOptions, "showOptions");
            AdPlayer.DefaultImpls.show(fullscreenAdPlayer, showOptions);
        }
    }
}
