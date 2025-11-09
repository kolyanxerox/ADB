package com.unity3d.ads.adplayer;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class AndroidShowOptions implements ShowOptions {
    private final WeakReference<Activity> activity;
    private final boolean isOfferwallAd;
    private final boolean isScarAd;
    private final String offerwallPlacementName;
    private final String placementId;
    private final String scarAdString;
    private final String scarAdUnitId;
    private final String scarQueryId;
    private final Map<String, Object> unityAdsShowOptions;

    public AndroidShowOptions(WeakReference<Activity> activity, Map<String, ? extends Object> map, String str, boolean z, String str2, String str3, String str4, boolean z2, String str5) {
        OooOo.OooO0o0(activity, "activity");
        this.activity = activity;
        this.unityAdsShowOptions = map;
        this.placementId = str;
        this.isScarAd = z;
        this.scarQueryId = str2;
        this.scarAdString = str3;
        this.scarAdUnitId = str4;
        this.isOfferwallAd = z2;
        this.offerwallPlacementName = str5;
    }

    public static /* synthetic */ AndroidShowOptions copy$default(AndroidShowOptions androidShowOptions, WeakReference weakReference, Map map, String str, boolean z, String str2, String str3, String str4, boolean z2, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            weakReference = androidShowOptions.activity;
        }
        if ((i & 2) != 0) {
            map = androidShowOptions.unityAdsShowOptions;
        }
        if ((i & 4) != 0) {
            str = androidShowOptions.placementId;
        }
        if ((i & 8) != 0) {
            z = androidShowOptions.isScarAd;
        }
        if ((i & 16) != 0) {
            str2 = androidShowOptions.scarQueryId;
        }
        if ((i & 32) != 0) {
            str3 = androidShowOptions.scarAdString;
        }
        if ((i & 64) != 0) {
            str4 = androidShowOptions.scarAdUnitId;
        }
        if ((i & 128) != 0) {
            z2 = androidShowOptions.isOfferwallAd;
        }
        if ((i & 256) != 0) {
            str5 = androidShowOptions.offerwallPlacementName;
        }
        boolean z3 = z2;
        String str6 = str5;
        String str7 = str3;
        String str8 = str4;
        String str9 = str2;
        String str10 = str;
        return androidShowOptions.copy(weakReference, map, str10, z, str9, str7, str8, z3, str6);
    }

    public final WeakReference<Activity> component1() {
        return this.activity;
    }

    public final Map<String, Object> component2() {
        return this.unityAdsShowOptions;
    }

    public final String component3() {
        return this.placementId;
    }

    public final boolean component4() {
        return this.isScarAd;
    }

    public final String component5() {
        return this.scarQueryId;
    }

    public final String component6() {
        return this.scarAdString;
    }

    public final String component7() {
        return this.scarAdUnitId;
    }

    public final boolean component8() {
        return this.isOfferwallAd;
    }

    public final String component9() {
        return this.offerwallPlacementName;
    }

    public final AndroidShowOptions copy(WeakReference<Activity> activity, Map<String, ? extends Object> map, String str, boolean z, String str2, String str3, String str4, boolean z2, String str5) {
        OooOo.OooO0o0(activity, "activity");
        return new AndroidShowOptions(activity, map, str, z, str2, str3, str4, z2, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidShowOptions)) {
            return false;
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) obj;
        return OooOo.OooO00o(this.activity, androidShowOptions.activity) && OooOo.OooO00o(this.unityAdsShowOptions, androidShowOptions.unityAdsShowOptions) && OooOo.OooO00o(this.placementId, androidShowOptions.placementId) && this.isScarAd == androidShowOptions.isScarAd && OooOo.OooO00o(this.scarQueryId, androidShowOptions.scarQueryId) && OooOo.OooO00o(this.scarAdString, androidShowOptions.scarAdString) && OooOo.OooO00o(this.scarAdUnitId, androidShowOptions.scarAdUnitId) && this.isOfferwallAd == androidShowOptions.isOfferwallAd && OooOo.OooO00o(this.offerwallPlacementName, androidShowOptions.offerwallPlacementName);
    }

    public final WeakReference<Activity> getActivity() {
        return this.activity;
    }

    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getScarAdString() {
        return this.scarAdString;
    }

    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    public final Map<String, Object> getUnityAdsShowOptions() {
        return this.unityAdsShowOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.activity.hashCode() * 31;
        Map<String, Object> map = this.unityAdsShowOptions;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.placementId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.isScarAd;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode3 + i) * 31;
        String str2 = this.scarQueryId;
        int iHashCode4 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scarAdUnitId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z2 = this.isOfferwallAd;
        int i3 = (iHashCode6 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str5 = this.offerwallPlacementName;
        return i3 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AndroidShowOptions(activity=");
        sb.append(this.activity);
        sb.append(", unityAdsShowOptions=");
        sb.append(this.unityAdsShowOptions);
        sb.append(", placementId=");
        sb.append(this.placementId);
        sb.append(", isScarAd=");
        sb.append(this.isScarAd);
        sb.append(", scarQueryId=");
        sb.append(this.scarQueryId);
        sb.append(", scarAdString=");
        sb.append(this.scarAdString);
        sb.append(", scarAdUnitId=");
        sb.append(this.scarAdUnitId);
        sb.append(", isOfferwallAd=");
        sb.append(this.isOfferwallAd);
        sb.append(", offerwallPlacementName=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.offerwallPlacementName, sb);
    }

    public /* synthetic */ AndroidShowOptions(WeakReference weakReference, Map map, String str, boolean z, String str2, String str3, String str4, boolean z2, String str5, int i, OooOO0O oooOO0O) {
        this(weakReference, map, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : str5);
    }
}
