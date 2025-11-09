package androidx.privacysandbox.ads.adservices.common;

import android.adservices.common.AdData;
import android.net.Uri;
import android.util.Log;
import androidx.privacysandbox.ads.adservices.appsetid.OooO00o;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import java.util.Set;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.o0ooOOo;

/* loaded from: classes.dex */
public final class AdData {
    private final Set<Integer> adCounterKeys;
    private final AdFilters adFilters;
    private final String adRenderId;
    private final String metadata;
    private final Uri renderUri;

    public static final class Ext10Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(OooOO0O oooOO0O) {
                this();
            }

            public final android.adservices.common.AdData convertAdData(AdData adData) {
                OooOo.OooO0o0(adData, "adData");
                AdData.Builder adCounterKeys = OooO00o.OooO0OO().setMetadata(adData.getMetadata()).setRenderUri(adData.getRenderUri()).setAdCounterKeys(adData.getAdCounterKeys());
                AdFilters adFilters = adData.getAdFilters();
                android.adservices.common.AdData adDataBuild = adCounterKeys.setAdFilters(adFilters != null ? adFilters.convertToAdServices$ads_adservices_release() : null).setAdRenderId(adData.getAdRenderId()).build();
                OooOo.OooO0Oo(adDataBuild, "Builder()\n              …                 .build()");
                return adDataBuild;
            }

            private Companion() {
            }
        }

        private Ext10Impl() {
        }
    }

    public static final class Ext4Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(OooOO0O oooOO0O) {
                this();
            }

            public final android.adservices.common.AdData convertAdData(AdData adData) {
                OooOo.OooO0o0(adData, "adData");
                if (!adData.getAdCounterKeys().isEmpty()) {
                    Log.w("AdData", "adCounterKeys is ignored. Min version to use adCounterKeys is API 33 ext 8 or API 31/32 ext 9");
                }
                if (adData.getAdFilters() != null) {
                    Log.w("AdData", "adFilters is ignored. Min version to use adFilters is API 33 ext 8 or API 31/32 ext 9");
                }
                if (adData.getAdRenderId() != null) {
                    Log.w("AdData", "adRenderId is ignored. Min version to use adRenderId is API 31 ext 10");
                }
                android.adservices.common.AdData adDataBuild = OooO00o.OooO0OO().setMetadata(adData.getMetadata()).setRenderUri(adData.getRenderUri()).build();
                OooOo.OooO0Oo(adDataBuild, "Builder()\n              …                 .build()");
                return adDataBuild;
            }

            private Companion() {
            }
        }

        private Ext4Impl() {
        }
    }

    public static final class Ext8Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(OooOO0O oooOO0O) {
                this();
            }

            public final android.adservices.common.AdData convertAdData(AdData adData) {
                OooOo.OooO0o0(adData, "adData");
                if (adData.getAdRenderId() != null) {
                    Log.w("AdData", "adRenderId is ignored. Min version to use adRenderId is API 31 ext 10");
                }
                AdData.Builder adCounterKeys = OooO00o.OooO0OO().setMetadata(adData.getMetadata()).setRenderUri(adData.getRenderUri()).setAdCounterKeys(adData.getAdCounterKeys());
                AdFilters adFilters = adData.getAdFilters();
                android.adservices.common.AdData adDataBuild = adCounterKeys.setAdFilters(adFilters != null ? adFilters.convertToAdServices$ads_adservices_release() : null).build();
                OooOo.OooO0Oo(adDataBuild, "Builder()\n              …                 .build()");
                return adDataBuild;
            }

            private Companion() {
            }
        }

        private Ext8Impl() {
        }
    }

    @ExperimentalFeatures.Ext10OptIn
    public AdData(Uri renderUri, String metadata, Set<Integer> adCounterKeys, AdFilters adFilters, String str) {
        OooOo.OooO0o0(renderUri, "renderUri");
        OooOo.OooO0o0(metadata, "metadata");
        OooOo.OooO0o0(adCounterKeys, "adCounterKeys");
        this.renderUri = renderUri;
        this.metadata = metadata;
        this.adCounterKeys = adCounterKeys;
        this.adFilters = adFilters;
        this.adRenderId = str;
    }

    public final android.adservices.common.AdData convertToAdServices$ads_adservices_release() {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        return (adServicesInfo.adServicesVersion() >= 10 || adServicesInfo.extServicesVersionS() >= 10) ? Ext10Impl.Companion.convertAdData(this) : (adServicesInfo.adServicesVersion() >= 8 || adServicesInfo.extServicesVersionS() >= 9) ? Ext8Impl.Companion.convertAdData(this) : Ext4Impl.Companion.convertAdData(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdData)) {
            return false;
        }
        AdData adData = (AdData) obj;
        return OooOo.OooO00o(this.renderUri, adData.renderUri) && OooOo.OooO00o(this.metadata, adData.metadata) && OooOo.OooO00o(this.adCounterKeys, adData.adCounterKeys) && OooOo.OooO00o(this.adFilters, adData.adFilters) && OooOo.OooO00o(this.adRenderId, adData.adRenderId);
    }

    public final Set<Integer> getAdCounterKeys() {
        return this.adCounterKeys;
    }

    public final AdFilters getAdFilters() {
        return this.adFilters;
    }

    public final String getAdRenderId() {
        return this.adRenderId;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final Uri getRenderUri() {
        return this.renderUri;
    }

    public int hashCode() {
        int iHashCode = (this.adCounterKeys.hashCode() + androidx.datastore.preferences.protobuf.OooO00o.OooO0O0(this.renderUri.hashCode() * 31, 31, this.metadata)) * 31;
        AdFilters adFilters = this.adFilters;
        int iHashCode2 = (iHashCode + (adFilters != null ? adFilters.hashCode() : 0)) * 31;
        String str = this.adRenderId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "AdData: renderUri=" + this.renderUri + ", metadata='" + this.metadata + "', adCounterKeys=" + this.adCounterKeys + ", adFilters=" + this.adFilters + ", adRenderId=" + this.adRenderId;
    }

    public /* synthetic */ AdData(Uri uri, String str, Set set, AdFilters adFilters, String str2, int i, OooOO0O oooOO0O) {
        this(uri, str, (i & 4) != 0 ? o0ooOOo.f31250OooOo0O : set, (i & 8) != 0 ? null : adFilters, (i & 16) != 0 ? null : str2);
    }

    public /* synthetic */ AdData(Uri uri, String str, Set set, AdFilters adFilters, int i, OooOO0O oooOO0O) {
        this(uri, str, (i & 4) != 0 ? o0ooOOo.f31250OooOo0O : set, (i & 8) != 0 ? null : adFilters);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @ExperimentalFeatures.Ext8OptIn
    public AdData(Uri renderUri, String metadata, Set<Integer> adCounterKeys, AdFilters adFilters) {
        this(renderUri, metadata, adCounterKeys, adFilters, null);
        OooOo.OooO0o0(renderUri, "renderUri");
        OooOo.OooO0o0(metadata, "metadata");
        OooOo.OooO0o0(adCounterKeys, "adCounterKeys");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdData(Uri renderUri, String metadata) {
        this(renderUri, metadata, o0ooOOo.f31250OooOo0O, null);
        OooOo.OooO0o0(renderUri, "renderUri");
        OooOo.OooO0o0(metadata, "metadata");
    }
}
