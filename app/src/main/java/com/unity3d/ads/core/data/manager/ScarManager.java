package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import gatewayprotocol.p014v1.InitializationResponseOuterClass;
import java.util.List;
import o000ooOO.o000O0Oo;
import o00O0O0O.OooO0OO;
import o00O0ooo.o0OoOoOo;

/* loaded from: classes3.dex */
public interface ScarManager {
    Object getSignals(List<? extends InitializationResponseOuterClass.AdFormat> list, OooO0OO oooO0OO);

    Object getVersion(OooO0OO oooO0OO);

    Object loadAd(String str, String str2, String str3, String str4, String str5, int i, OooO0OO oooO0OO);

    o0OoOoOo loadBannerAd(Context context, BannerView bannerView, o000O0Oo o000o0oo2, UnityBannerSize unityBannerSize, String str);

    o0OoOoOo show(String str, String str2);
}
