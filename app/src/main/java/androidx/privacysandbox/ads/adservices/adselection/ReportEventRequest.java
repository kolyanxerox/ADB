package androidx.privacysandbox.ads.adservices.adselection;

import android.util.Log;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

@ExperimentalFeatures.Ext8OptIn
/* loaded from: classes.dex */
public final class ReportEventRequest {
    public static final Companion Companion = new Companion(null);
    public static final int FLAG_REPORTING_DESTINATION_BUYER = 2;
    public static final int FLAG_REPORTING_DESTINATION_SELLER = 1;
    private final long adSelectionId;
    private final String eventData;
    private final String eventKey;
    private final InputEvent inputEvent;
    private final int reportingDestinations;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Ext10Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(OooOO0O oooOO0O) {
                this();
            }

            public final android.adservices.adselection.ReportEventRequest convertReportEventRequest(ReportEventRequest request) {
                OooOo.OooO0o0(request, "request");
                OooO00o.OooOo();
                android.adservices.adselection.ReportEventRequest reportEventRequestBuild = OooO00o.OooO0o0(request.getAdSelectionId(), request.getEventKey(), request.getEventData(), request.getReportingDestinations()).setInputEvent(request.getInputEvent()).build();
                OooOo.OooO0Oo(reportEventRequestBuild, "Builder(\n               …                 .build()");
                return reportEventRequestBuild;
            }

            private Companion() {
            }
        }

        private Ext10Impl() {
        }
    }

    public static final class Ext8Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(OooOO0O oooOO0O) {
                this();
            }

            public final android.adservices.adselection.ReportEventRequest convertReportEventRequest(ReportEventRequest request) {
                OooOo.OooO0o0(request, "request");
                if (request.getInputEvent() != null) {
                    Log.w("ReportEventRequest", "inputEvent is ignored. Min version to use inputEvent is API 31 ext 10");
                }
                OooO00o.OooOo();
                android.adservices.adselection.ReportEventRequest reportEventRequestBuild = OooO00o.OooO0o0(request.getAdSelectionId(), request.getEventKey(), request.getEventData(), request.getReportingDestinations()).build();
                OooOo.OooO0Oo(reportEventRequestBuild, "Builder(\n               …                 .build()");
                return reportEventRequestBuild;
            }

            private Companion() {
            }
        }

        private Ext8Impl() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ReportingDestination {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReportEventRequest(long j, String eventKey, String eventData, int i) {
        this(j, eventKey, eventData, i, null, 16, null);
        OooOo.OooO0o0(eventKey, "eventKey");
        OooOo.OooO0o0(eventData, "eventData");
    }

    @ExperimentalFeatures.Ext10OptIn
    public static /* synthetic */ void getInputEvent$annotations() {
    }

    public final android.adservices.adselection.ReportEventRequest convertToAdServices$ads_adservices_release() {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        return (adServicesInfo.adServicesVersion() >= 10 || adServicesInfo.extServicesVersionS() >= 10) ? Ext10Impl.Companion.convertReportEventRequest(this) : Ext8Impl.Companion.convertReportEventRequest(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportEventRequest)) {
            return false;
        }
        ReportEventRequest reportEventRequest = (ReportEventRequest) obj;
        return this.adSelectionId == reportEventRequest.adSelectionId && OooOo.OooO00o(this.eventKey, reportEventRequest.eventKey) && OooOo.OooO00o(this.eventData, reportEventRequest.eventData) && this.reportingDestinations == reportEventRequest.reportingDestinations && OooOo.OooO00o(this.inputEvent, reportEventRequest.inputEvent);
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public final String getEventData() {
        return this.eventData;
    }

    public final String getEventKey() {
        return this.eventKey;
    }

    public final InputEvent getInputEvent() {
        return this.inputEvent;
    }

    public final int getReportingDestinations() {
        return this.reportingDestinations;
    }

    public int hashCode() {
        int iOooO00o = androidx.datastore.preferences.protobuf.OooO00o.OooO00o(this.reportingDestinations, androidx.datastore.preferences.protobuf.OooO00o.OooO0O0(androidx.datastore.preferences.protobuf.OooO00o.OooO0O0(Long.hashCode(this.adSelectionId) * 31, 31, this.eventKey), 31, this.eventData), 31);
        InputEvent inputEvent = this.inputEvent;
        return iOooO00o + (inputEvent != null ? inputEvent.hashCode() : 0);
    }

    public String toString() {
        return "ReportEventRequest: adSelectionId=" + this.adSelectionId + ", eventKey=" + this.eventKey + ", eventData=" + this.eventData + ", reportingDestinations=" + this.reportingDestinations + "inputEvent=" + this.inputEvent;
    }

    public ReportEventRequest(long j, String eventKey, String eventData, int i, InputEvent inputEvent) {
        OooOo.OooO0o0(eventKey, "eventKey");
        OooOo.OooO0o0(eventData, "eventData");
        this.adSelectionId = j;
        this.eventKey = eventKey;
        this.eventData = eventData;
        this.reportingDestinations = i;
        this.inputEvent = inputEvent;
        if (i <= 0 || i > 3) {
            throw new IllegalArgumentException("Invalid reporting destinations bitfield.");
        }
    }

    public /* synthetic */ ReportEventRequest(long j, String str, String str2, int i, InputEvent inputEvent, int i2, OooOO0O oooOO0O) {
        this(j, str, str2, i, (i2 & 16) != 0 ? null : inputEvent);
    }
}
