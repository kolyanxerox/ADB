package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class WebTriggerRegistrationRequest {
    private final Uri destination;
    private final List<WebTriggerParams> webTriggerParams;

    public WebTriggerRegistrationRequest(List<WebTriggerParams> webTriggerParams, Uri destination) {
        OooOo.OooO0o0(webTriggerParams, "webTriggerParams");
        OooOo.OooO0o0(destination, "destination");
        this.webTriggerParams = webTriggerParams;
        this.destination = destination;
    }

    public final android.adservices.measurement.WebTriggerRegistrationRequest convertToAdServices$ads_adservices_release() {
        OooO00o.OooOooO();
        android.adservices.measurement.WebTriggerRegistrationRequest webTriggerRegistrationRequestBuild = OooO00o.OooOO0(WebTriggerParams.Companion.convertWebTriggerParams$ads_adservices_release(this.webTriggerParams), this.destination).build();
        OooOo.OooO0Oo(webTriggerRegistrationRequestBuild, "Builder(\n               …   )\n            .build()");
        return webTriggerRegistrationRequestBuild;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebTriggerRegistrationRequest)) {
            return false;
        }
        WebTriggerRegistrationRequest webTriggerRegistrationRequest = (WebTriggerRegistrationRequest) obj;
        return OooOo.OooO00o(this.webTriggerParams, webTriggerRegistrationRequest.webTriggerParams) && OooOo.OooO00o(this.destination, webTriggerRegistrationRequest.destination);
    }

    public final Uri getDestination() {
        return this.destination;
    }

    public final List<WebTriggerParams> getWebTriggerParams() {
        return this.webTriggerParams;
    }

    public int hashCode() {
        return this.destination.hashCode() + (this.webTriggerParams.hashCode() * 31);
    }

    public String toString() {
        return "WebTriggerRegistrationRequest { WebTriggerParams=" + this.webTriggerParams + ", Destination=" + this.destination;
    }
}
