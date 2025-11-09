package com.unity3d.ads.core.data.model;

import androidx.datastore.preferences.protobuf.OooO00o;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import gatewayprotocol.p014v1.DiagnosticEventRequestOuterClass;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0ooo.o0OO;
import o00O0ooo.o0o0000;

/* loaded from: classes3.dex */
public final class AdObject {
    private final AdPlayer adPlayer;
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isOfferwallAd;
    private boolean isScarAd;
    private final UnityAdsLoadOptions loadOptions;
    private String offerwallPlacementName;
    private final ByteString opportunityId;
    private final String placementId;
    private String playerServerId;
    private String scarAdString;
    private String scarAdUnitId;
    private String scarQueryId;
    private o0OO state;
    private ByteString trackingToken;
    private o0OO ttl;

    public AdObject(ByteString opportunityId, String placementId, ByteString trackingToken, boolean z, String str, String str2, String str3, boolean z2, String str4, AdPlayer adPlayer, String str5, UnityAdsLoadOptions loadOptions, boolean z3, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, o0OO ttl, o0OO state) {
        OooOo.OooO0o0(opportunityId, "opportunityId");
        OooOo.OooO0o0(placementId, "placementId");
        OooOo.OooO0o0(trackingToken, "trackingToken");
        OooOo.OooO0o0(loadOptions, "loadOptions");
        OooOo.OooO0o0(adType, "adType");
        OooOo.OooO0o0(ttl, "ttl");
        OooOo.OooO0o0(state, "state");
        this.opportunityId = opportunityId;
        this.placementId = placementId;
        this.trackingToken = trackingToken;
        this.isScarAd = z;
        this.scarQueryId = str;
        this.scarAdUnitId = str2;
        this.scarAdString = str3;
        this.isOfferwallAd = z2;
        this.offerwallPlacementName = str4;
        this.adPlayer = adPlayer;
        this.playerServerId = str5;
        this.loadOptions = loadOptions;
        this.isHeaderBidding = z3;
        this.adType = adType;
        this.ttl = ttl;
        this.state = state;
    }

    public final ByteString component1() {
        return this.opportunityId;
    }

    public final AdPlayer component10() {
        return this.adPlayer;
    }

    public final String component11() {
        return this.playerServerId;
    }

    public final UnityAdsLoadOptions component12() {
        return this.loadOptions;
    }

    public final boolean component13() {
        return this.isHeaderBidding;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType component14() {
        return this.adType;
    }

    public final o0OO component15() {
        return this.ttl;
    }

    public final o0OO component16() {
        return this.state;
    }

    public final String component2() {
        return this.placementId;
    }

    public final ByteString component3() {
        return this.trackingToken;
    }

    public final boolean component4() {
        return this.isScarAd;
    }

    public final String component5() {
        return this.scarQueryId;
    }

    public final String component6() {
        return this.scarAdUnitId;
    }

    public final String component7() {
        return this.scarAdString;
    }

    public final boolean component8() {
        return this.isOfferwallAd;
    }

    public final String component9() {
        return this.offerwallPlacementName;
    }

    public final AdObject copy(ByteString opportunityId, String placementId, ByteString trackingToken, boolean z, String str, String str2, String str3, boolean z2, String str4, AdPlayer adPlayer, String str5, UnityAdsLoadOptions loadOptions, boolean z3, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, o0OO ttl, o0OO state) {
        OooOo.OooO0o0(opportunityId, "opportunityId");
        OooOo.OooO0o0(placementId, "placementId");
        OooOo.OooO0o0(trackingToken, "trackingToken");
        OooOo.OooO0o0(loadOptions, "loadOptions");
        OooOo.OooO0o0(adType, "adType");
        OooOo.OooO0o0(ttl, "ttl");
        OooOo.OooO0o0(state, "state");
        return new AdObject(opportunityId, placementId, trackingToken, z, str, str2, str3, z2, str4, adPlayer, str5, loadOptions, z3, adType, ttl, state);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) obj;
        return OooOo.OooO00o(this.opportunityId, adObject.opportunityId) && OooOo.OooO00o(this.placementId, adObject.placementId) && OooOo.OooO00o(this.trackingToken, adObject.trackingToken) && this.isScarAd == adObject.isScarAd && OooOo.OooO00o(this.scarQueryId, adObject.scarQueryId) && OooOo.OooO00o(this.scarAdUnitId, adObject.scarAdUnitId) && OooOo.OooO00o(this.scarAdString, adObject.scarAdString) && this.isOfferwallAd == adObject.isOfferwallAd && OooOo.OooO00o(this.offerwallPlacementName, adObject.offerwallPlacementName) && OooOo.OooO00o(this.adPlayer, adObject.adPlayer) && OooOo.OooO00o(this.playerServerId, adObject.playerServerId) && OooOo.OooO00o(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType && OooOo.OooO00o(this.ttl, adObject.ttl) && OooOo.OooO00o(this.state, adObject.state);
    }

    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getPlayerServerId() {
        return this.playerServerId;
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

    public final o0OO getState() {
        return this.state;
    }

    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    public final o0OO getTtl() {
        return this.ttl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = (this.trackingToken.hashCode() + OooO00o.OooO0O0(this.opportunityId.hashCode() * 31, 31, this.placementId)) * 31;
        boolean z = this.isScarAd;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        String str = this.scarQueryId;
        int iHashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scarAdUnitId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z2 = this.isOfferwallAd;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (iHashCode4 + i3) * 31;
        String str4 = this.offerwallPlacementName;
        int iHashCode5 = (i4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AdPlayer adPlayer = this.adPlayer;
        int iHashCode6 = (iHashCode5 + (adPlayer == null ? 0 : adPlayer.hashCode())) * 31;
        String str5 = this.playerServerId;
        int iHashCode7 = (this.loadOptions.hashCode() + ((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31)) * 31;
        boolean z3 = this.isHeaderBidding;
        return this.state.hashCode() + ((this.ttl.hashCode() + ((this.adType.hashCode() + ((iHashCode7 + (z3 ? 1 : z3 ? 1 : 0)) * 31)) * 31)) * 31);
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public final void setOfferwallAd(boolean z) {
        this.isOfferwallAd = z;
    }

    public final void setOfferwallPlacementName(String str) {
        this.offerwallPlacementName = str;
    }

    public final void setPlayerServerId(String str) {
        this.playerServerId = str;
    }

    public final void setScarAd(boolean z) {
        this.isScarAd = z;
    }

    public final void setScarAdString(String str) {
        this.scarAdString = str;
    }

    public final void setScarAdUnitId(String str) {
        this.scarAdUnitId = str;
    }

    public final void setScarQueryId(String str) {
        this.scarQueryId = str;
    }

    public final void setState(o0OO o0oo) {
        OooOo.OooO0o0(o0oo, "<set-?>");
        this.state = o0oo;
    }

    public final void setTrackingToken(ByteString byteString) {
        OooOo.OooO0o0(byteString, "<set-?>");
        this.trackingToken = byteString;
    }

    public final void setTtl(o0OO o0oo) {
        OooOo.OooO0o0(o0oo, "<set-?>");
        this.ttl = o0oo;
    }

    public String toString() {
        return "AdObject(opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdUnitId=" + this.scarAdUnitId + ", scarAdString=" + this.scarAdString + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ", ttl=" + this.ttl + ", state=" + this.state + ')';
    }

    public /* synthetic */ AdObject(ByteString byteString, String str, ByteString byteString2, boolean z, String str2, String str3, String str4, boolean z2, String str5, AdPlayer adPlayer, String str6, UnityAdsLoadOptions unityAdsLoadOptions, boolean z3, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, o0OO o0oo, o0OO o0oo2, int i, OooOO0O oooOO0O) {
        this(byteString, str, byteString2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : adPlayer, (i & 1024) != 0 ? null : str6, unityAdsLoadOptions, z3, diagnosticAdType, (i & 16384) != 0 ? o0o0000.OooO0OO(null) : o0oo, (i & 32768) != 0 ? o0o0000.OooO0OO(AdObjectState.INIT) : o0oo2);
    }
}
