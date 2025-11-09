package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerParams;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public abstract /* synthetic */ class OooO00o {
    public static /* synthetic */ WebSourceRegistrationRequest.Builder OooO0o0(List list, Uri uri) {
        return new WebSourceRegistrationRequest.Builder(list, uri);
    }

    public static /* synthetic */ WebTriggerParams.Builder OooO0oo(Uri uri) {
        return new WebTriggerParams.Builder(uri);
    }

    public static /* synthetic */ WebTriggerRegistrationRequest.Builder OooOO0(List list, Uri uri) {
        return new WebTriggerRegistrationRequest.Builder(list, uri);
    }

    public static /* synthetic */ GetTopicsRequest.Builder OooOO0o() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ Topic OooOOo(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse OooOOo0(Object obj) {
        return (GetTopicsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Class OooOo0() {
        return TopicsManager.class;
    }

    public static /* bridge */ /* synthetic */ TopicsManager OooOo00(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* synthetic */ void OooOo0o() {
    }

    public static /* synthetic */ void OooOoo() {
    }

    public static /* synthetic */ void OooOooO() {
    }
}
