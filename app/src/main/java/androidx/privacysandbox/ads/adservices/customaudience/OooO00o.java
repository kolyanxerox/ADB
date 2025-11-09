package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceParams;
import android.net.Uri;

/* loaded from: classes.dex */
public abstract /* synthetic */ class OooO00o {
    public static /* synthetic */ DeletionRequest.Builder OooO0oO() {
        return new DeletionRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ MeasurementManager OooOOO0(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* synthetic */ WebSourceParams.Builder OooOOOO(Uri uri) {
        return new WebSourceParams.Builder(uri);
    }

    public static /* bridge */ /* synthetic */ Class OooOOo() {
        return MeasurementManager.class;
    }

    public static /* synthetic */ void OooOOoo() {
    }
}
