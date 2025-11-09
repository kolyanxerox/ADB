package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.PersistAdSelectionResultRequest;
import android.adservices.adselection.ReportEventRequest;
import android.adservices.adselection.UpdateAdCounterHistogramRequest;
import android.adservices.common.AdFilters;
import android.adservices.common.AdTechIdentifier;
import android.adservices.common.FrequencyCapFilters;
import android.adservices.common.KeyedFrequencyCap;
import java.time.Duration;

/* loaded from: classes.dex */
public abstract /* synthetic */ class OooO00o {
    public static /* synthetic */ UpdateAdCounterHistogramRequest.Builder OooO(long j, int i, AdTechIdentifier adTechIdentifier) {
        return new UpdateAdCounterHistogramRequest.Builder(j, i, adTechIdentifier);
    }

    public static /* synthetic */ PersistAdSelectionResultRequest.Builder OooO00o() {
        return new PersistAdSelectionResultRequest.Builder();
    }

    public static /* synthetic */ ReportEventRequest.Builder OooO0o0(long j, String str, String str2, int i) {
        return new ReportEventRequest.Builder(j, str, str2, i);
    }

    public static /* synthetic */ android.adservices.adselection.ReportImpressionRequest OooO0oo(long j) {
        return new android.adservices.adselection.ReportImpressionRequest(j);
    }

    public static /* synthetic */ AdFilters.Builder OooOOO() {
        return new AdFilters.Builder();
    }

    public static /* synthetic */ FrequencyCapFilters.Builder OooOOo0() {
        return new FrequencyCapFilters.Builder();
    }

    public static /* synthetic */ void OooOo() {
    }

    public static /* synthetic */ KeyedFrequencyCap.Builder OooOo00(int i, int i2, Duration duration) {
        return new KeyedFrequencyCap.Builder(i, i2, duration);
    }

    public static /* synthetic */ void OooOoOO() {
    }

    public static /* synthetic */ void OooOoo() {
    }
}
