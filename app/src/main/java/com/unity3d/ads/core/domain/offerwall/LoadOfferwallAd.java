package com.unity3d.ads.core.domain.offerwall;

import com.unity3d.ads.core.data.manager.OfferwallManager;
import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;

/* loaded from: classes3.dex */
public final class LoadOfferwallAd {
    private final OfferwallManager offerwallManager;

    public LoadOfferwallAd(OfferwallManager offerwallManager) {
        OooOo.OooO0o0(offerwallManager, "offerwallManager");
        this.offerwallManager = offerwallManager;
    }

    public final Object invoke(String str, OooO0OO oooO0OO) {
        Object objLoadAd = this.offerwallManager.loadAd(str, oooO0OO);
        return objLoadAd == OooOo00.f31365OooOo0O ? objLoadAd : oo00o.OooOo.f33195OooO00o;
    }
}
