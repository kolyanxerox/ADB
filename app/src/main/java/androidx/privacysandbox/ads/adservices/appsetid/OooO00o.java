package androidx.privacysandbox.ads.adservices.appsetid;

import android.adservices.common.AdData;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;

/* loaded from: classes.dex */
public abstract /* synthetic */ class OooO00o {
    public static /* synthetic */ CustomAudience.Builder OooO() {
        return new CustomAudience.Builder();
    }

    public static /* bridge */ /* synthetic */ android.adservices.appsetid.AppSetId OooO0O0(Object obj) {
        return (android.adservices.appsetid.AppSetId) obj;
    }

    public static /* synthetic */ AdData.Builder OooO0OO() {
        return new AdData.Builder();
    }

    public static /* bridge */ /* synthetic */ CustomAudienceManager OooOOoo(Object obj) {
        return (CustomAudienceManager) obj;
    }

    public static /* synthetic */ LeaveCustomAudienceRequest.Builder OooOo0() {
        return new LeaveCustomAudienceRequest.Builder();
    }

    public static /* synthetic */ JoinCustomAudienceRequest.Builder OooOo00() {
        return new JoinCustomAudienceRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ Class OooOoO() {
        return CustomAudienceManager.class;
    }

    public static /* synthetic */ TrustedBiddingData.Builder OooOoO0() {
        return new TrustedBiddingData.Builder();
    }
}
