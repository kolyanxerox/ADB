package com.unity3d.ads.beta;

import android.app.Activity;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class RewardedAd {
    public static final Companion Companion = new Companion(null);
    private final AdObject adObject;
    private final LoadOptions loadOptions;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final void load(LoadOptions options, LoadListener<RewardedAd> listener) {
            OooOo.OooO0o0(options, "options");
            OooOo.OooO0o0(listener, "listener");
        }

        private Companion() {
        }
    }

    public RewardedAd(AdObject adObject, LoadOptions loadOptions) {
        OooOo.OooO0o0(adObject, "adObject");
        OooOo.OooO0o0(loadOptions, "loadOptions");
        this.adObject = adObject;
        this.loadOptions = loadOptions;
    }

    public static final void load(LoadOptions loadOptions, LoadListener<RewardedAd> loadListener) {
        Companion.load(loadOptions, loadListener);
    }

    public static /* synthetic */ void show$default(RewardedAd rewardedAd, Activity activity, ShowOptions showOptions, RewardedShowListener rewardedShowListener, int i, Object obj) {
        if ((i & 2) != 0) {
            showOptions = null;
        }
        rewardedAd.show(activity, showOptions, rewardedShowListener);
    }

    public final void show(Activity activity, ShowOptions showOptions, RewardedShowListener listener) {
        OooOo.OooO0o0(activity, "activity");
        OooOo.OooO0o0(listener, "listener");
    }
}
