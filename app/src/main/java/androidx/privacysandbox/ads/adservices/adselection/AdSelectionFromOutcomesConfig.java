package androidx.privacysandbox.ads.adservices.adselection;

import OooO0o0.OooO0O0;
import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.List;
import kotlin.jvm.internal.OooOo;

@ExperimentalFeatures.Ext10OptIn
/* loaded from: classes.dex */
public final class AdSelectionFromOutcomesConfig {
    private final List<Long> adSelectionIds;
    private final AdSelectionSignals adSelectionSignals;
    private Uri selectionLogicUri;
    private final AdTechIdentifier seller;

    public AdSelectionFromOutcomesConfig(AdTechIdentifier seller, List<Long> adSelectionIds, AdSelectionSignals adSelectionSignals, Uri selectionLogicUri) {
        OooOo.OooO0o0(seller, "seller");
        OooOo.OooO0o0(adSelectionIds, "adSelectionIds");
        OooOo.OooO0o0(adSelectionSignals, "adSelectionSignals");
        OooOo.OooO0o0(selectionLogicUri, "selectionLogicUri");
        this.seller = seller;
        this.adSelectionIds = adSelectionIds;
        this.adSelectionSignals = adSelectionSignals;
        this.selectionLogicUri = selectionLogicUri;
    }

    public final android.adservices.adselection.AdSelectionFromOutcomesConfig convertToAdServices$ads_adservices_release() {
        android.adservices.adselection.AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfigBuild = OooO0O0.OooO0O0().setSelectionSignals(this.adSelectionSignals.convertToAdServices$ads_adservices_release()).setAdSelectionIds(this.adSelectionIds).setSelectionLogicUri(this.selectionLogicUri).setSeller(this.seller.convertToAdServices$ads_adservices_release()).build();
        OooOo.OooO0Oo(adSelectionFromOutcomesConfigBuild, "Builder()\n            .s…s())\n            .build()");
        return adSelectionFromOutcomesConfigBuild;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionFromOutcomesConfig)) {
            return false;
        }
        AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig = (AdSelectionFromOutcomesConfig) obj;
        return OooOo.OooO00o(this.seller, adSelectionFromOutcomesConfig.seller) && OooOo.OooO00o(this.adSelectionIds, adSelectionFromOutcomesConfig.adSelectionIds) && OooOo.OooO00o(this.adSelectionSignals, adSelectionFromOutcomesConfig.adSelectionSignals) && OooOo.OooO00o(this.selectionLogicUri, adSelectionFromOutcomesConfig.selectionLogicUri);
    }

    public final List<Long> getAdSelectionIds() {
        return this.adSelectionIds;
    }

    public final AdSelectionSignals getAdSelectionSignals() {
        return this.adSelectionSignals;
    }

    public final Uri getSelectionLogicUri() {
        return this.selectionLogicUri;
    }

    public final AdTechIdentifier getSeller() {
        return this.seller;
    }

    public int hashCode() {
        return this.selectionLogicUri.hashCode() + ((this.adSelectionSignals.hashCode() + ((this.adSelectionIds.hashCode() + (this.seller.hashCode() * 31)) * 31)) * 31);
    }

    public final void setSelectionLogicUri(Uri uri) {
        OooOo.OooO0o0(uri, "<set-?>");
        this.selectionLogicUri = uri;
    }

    public String toString() {
        return "AdSelectionFromOutcomesConfig: seller=" + this.seller + ", adSelectionIds='" + this.adSelectionIds + "', adSelectionSignals=" + this.adSelectionSignals + ", selectionLogicUri=" + this.selectionLogicUri;
    }
}
