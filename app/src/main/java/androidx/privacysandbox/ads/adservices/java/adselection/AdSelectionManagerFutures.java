package androidx.privacysandbox.ads.adservices.java.adselection;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager;
import androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest;
import androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest;
import androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest;
import androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest;
import androidx.privacysandbox.ads.adservices.adselection.UpdateAdCounterHistogramRequest;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00000oO.OooOOO;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0O0;

/* loaded from: classes.dex */
public abstract class AdSelectionManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final AdSelectionManagerFutures from(Context context) {
            OooOo.OooO0o0(context, "context");
            AdSelectionManager adSelectionManagerObtain = AdSelectionManager.Companion.obtain(context);
            if (adSelectionManagerObtain != null) {
                return new Api33Ext4JavaImpl(adSelectionManagerObtain);
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final AdSelectionManagerFutures from(Context context) {
        return Companion.from(context);
    }

    @ExperimentalFeatures.Ext10OptIn
    public abstract OooOOO getAdSelectionDataAsync(GetAdSelectionDataRequest getAdSelectionDataRequest);

    @ExperimentalFeatures.Ext10OptIn
    public abstract OooOOO persistAdSelectionResultAsync(PersistAdSelectionResultRequest persistAdSelectionResultRequest);

    @ExperimentalFeatures.Ext8OptIn
    public abstract OooOOO reportEventAsync(ReportEventRequest reportEventRequest);

    public abstract OooOOO reportImpressionAsync(ReportImpressionRequest reportImpressionRequest);

    public abstract OooOOO selectAdsAsync(AdSelectionConfig adSelectionConfig);

    @ExperimentalFeatures.Ext10OptIn
    public abstract OooOOO selectAdsAsync(AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig);

    @ExperimentalFeatures.Ext8OptIn
    public abstract OooOOO updateAdCounterHistogramAsync(UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest);

    public static final class Api33Ext4JavaImpl extends AdSelectionManagerFutures {
        private final AdSelectionManager mAdSelectionManager;

        public Api33Ext4JavaImpl(AdSelectionManager adSelectionManager) {
            this.mAdSelectionManager = adSelectionManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public OooOOO getAdSelectionDataAsync(GetAdSelectionDataRequest getAdSelectionDataRequest) {
            OooOo.OooO0o0(getAdSelectionDataRequest, "getAdSelectionDataRequest");
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(o000O0O0.f31514OooO00o), new C0630x63036bbf(this, getAdSelectionDataRequest, null)), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public OooOOO persistAdSelectionResultAsync(PersistAdSelectionResultRequest persistAdSelectionResultRequest) {
            OooOo.OooO0o0(persistAdSelectionResultRequest, "persistAdSelectionResultRequest");
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(o000O0O0.f31514OooO00o), new C0631xcfbf2aea(this, persistAdSelectionResultRequest, null)), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public OooOOO reportEventAsync(ReportEventRequest reportEventRequest) {
            OooOo.OooO0o0(reportEventRequest, "reportEventRequest");
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(o000O0O0.f31514OooO00o), new AdSelectionManagerFutures$Api33Ext4JavaImpl$reportEventAsync$1(this, reportEventRequest, null)), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public OooOOO reportImpressionAsync(ReportImpressionRequest reportImpressionRequest) {
            OooOo.OooO0o0(reportImpressionRequest, "reportImpressionRequest");
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(o000O0O0.f31514OooO00o), new C0632x3453cbdf(this, reportImpressionRequest, null)), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public OooOOO selectAdsAsync(AdSelectionConfig adSelectionConfig) {
            OooOo.OooO0o0(adSelectionConfig, "adSelectionConfig");
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(o000O0O0.f31514OooO00o), new AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1(this, adSelectionConfig, null)), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public OooOOO updateAdCounterHistogramAsync(UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest) {
            OooOo.OooO0o0(updateAdCounterHistogramRequest, "updateAdCounterHistogramRequest");
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(o000O0O0.f31514OooO00o), new C0633x64bcb5a8(this, updateAdCounterHistogramRequest, null)), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public OooOOO selectAdsAsync(AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig) {
            OooOo.OooO0o0(adSelectionFromOutcomesConfig, "adSelectionFromOutcomesConfig");
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(o000O0O0.f31514OooO00o), new AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2(this, adSelectionFromOutcomesConfig, null)), null, 1, null);
        }
    }
}
