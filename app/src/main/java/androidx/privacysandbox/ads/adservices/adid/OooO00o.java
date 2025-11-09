package androidx.privacysandbox.ads.adservices.adid;

import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.AdSelectionManager;
import android.adservices.adselection.AdSelectionOutcome;
import android.adservices.adselection.ReportImpressionRequest;
import android.adservices.appsetid.AppSetIdManager;

/* loaded from: classes.dex */
public abstract /* synthetic */ class OooO00o {
    public static /* bridge */ /* synthetic */ android.adservices.adid.AdId OooO0O0(Object obj) {
        return (android.adservices.adid.AdId) obj;
    }

    public static /* bridge */ /* synthetic */ android.adservices.adid.AdIdManager OooO0Oo(Object obj) {
        return (android.adservices.adid.AdIdManager) obj;
    }

    public static /* synthetic */ AdSelectionConfig.Builder OooO0o0() {
        return new AdSelectionConfig.Builder();
    }

    public static /* bridge */ /* synthetic */ AdSelectionOutcome OooOOO(Object obj) {
        return (AdSelectionOutcome) obj;
    }

    public static /* bridge */ /* synthetic */ AdSelectionManager OooOOO0(Object obj) {
        return (AdSelectionManager) obj;
    }

    public static /* synthetic */ ReportImpressionRequest OooOOOO(long j, AdSelectionConfig adSelectionConfig) {
        return new ReportImpressionRequest(j, adSelectionConfig);
    }

    public static /* bridge */ /* synthetic */ AppSetIdManager OooOOo0(Object obj) {
        return (AppSetIdManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class OooOOoo() {
        return android.adservices.adid.AdIdManager.class;
    }

    public static /* synthetic */ void OooOo0() {
    }

    public static /* bridge */ /* synthetic */ void OooOoO0(Object obj) {
    }

    public static /* bridge */ /* synthetic */ Class OooOoo() {
        return AdSelectionManager.class;
    }

    public static /* bridge */ /* synthetic */ Class OooOooO() {
        return AppSetIdManager.class;
    }
}
