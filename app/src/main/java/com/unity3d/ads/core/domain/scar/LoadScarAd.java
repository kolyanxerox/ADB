package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.core.data.manager.ScarManager;
import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;

/* loaded from: classes3.dex */
public final class LoadScarAd {
    private final ScarManager scarManager;

    public LoadScarAd(ScarManager scarManager) {
        OooOo.OooO0o0(scarManager, "scarManager");
        this.scarManager = scarManager;
    }

    public final Object invoke(String str, String str2, String str3, String str4, String str5, int i, OooO0OO oooO0OO) {
        Object objLoadAd;
        boolean zOooO00o = OooOo.OooO00o(str, "banner");
        oo00o.OooOo oooOo = oo00o.OooOo.f33195OooO00o;
        return (!zOooO00o && (objLoadAd = this.scarManager.loadAd(str, str2, str4, str3, str5, i, oooO0OO)) == OooOo00.f31365OooOo0O) ? objLoadAd : oooOo;
    }
}
