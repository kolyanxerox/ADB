package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.customaudience.FetchAndJoinCustomAudienceRequest;
import android.adservices.topics.EncryptedTopic;
import android.app.ApplicationStartInfo;
import android.net.Uri;

/* loaded from: classes.dex */
public abstract /* synthetic */ class OooO0O0 {
    public static /* synthetic */ FetchAndJoinCustomAudienceRequest.Builder OooO0Oo(Uri uri) {
        return new FetchAndJoinCustomAudienceRequest.Builder(uri);
    }

    public static /* bridge */ /* synthetic */ EncryptedTopic OooO0o(Object obj) {
        return (EncryptedTopic) obj;
    }

    public static /* bridge */ /* synthetic */ ApplicationStartInfo OooO0oO(Object obj) {
        return (ApplicationStartInfo) obj;
    }

    public static /* synthetic */ void OooOOO() {
    }
}
