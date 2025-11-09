package OooO0o0;

import android.adservices.adselection.AdSelectionFromOutcomesConfig;
import android.adservices.adselection.GetAdSelectionDataOutcome;
import android.adservices.adselection.GetAdSelectionDataRequest;
import android.adservices.signals.UpdateSignalsRequest;
import android.net.Uri;
import android.os.ProfilingManager;

/* loaded from: classes.dex */
public abstract /* synthetic */ class OooO0O0 {
    public static /* synthetic */ GetAdSelectionDataRequest.Builder OooO() {
        return new GetAdSelectionDataRequest.Builder();
    }

    public static /* synthetic */ AdSelectionFromOutcomesConfig.Builder OooO0O0() {
        return new AdSelectionFromOutcomesConfig.Builder();
    }

    public static /* bridge */ /* synthetic */ GetAdSelectionDataOutcome OooO0oo(Object obj) {
        return (GetAdSelectionDataOutcome) obj;
    }

    public static /* synthetic */ UpdateSignalsRequest.Builder OooOOOO(Uri uri) {
        return new UpdateSignalsRequest.Builder(uri);
    }

    public static /* bridge */ /* synthetic */ Class OooOOo() {
        return ProfilingManager.class;
    }

    public static /* bridge */ /* synthetic */ ProfilingManager OooOOo0(Object obj) {
        return (ProfilingManager) obj;
    }

    public static /* synthetic */ void OooOOoo() {
    }
}
