package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.oo000o;

/* loaded from: classes.dex */
public final class DeletionRequest {
    public static final Companion Companion = new Companion(null);
    public static final int DELETION_MODE_ALL = 0;
    public static final int DELETION_MODE_EXCLUDE_INTERNAL_DATA = 1;
    public static final int MATCH_BEHAVIOR_DELETE = 0;
    public static final int MATCH_BEHAVIOR_PRESERVE = 1;
    private final int deletionMode;
    private final List<Uri> domainUris;
    private final Instant end;
    private final int matchBehavior;
    private final List<Uri> originUris;
    private final Instant start;

    public static final class Builder {
        private final int deletionMode;
        private List<? extends Uri> domainUris;
        private Instant end;
        private final int matchBehavior;
        private List<? extends Uri> originUris;
        private Instant start;

        public Builder(int i, int i2) {
            this.deletionMode = i;
            this.matchBehavior = i2;
            Instant MIN = Instant.MIN;
            OooOo.OooO0Oo(MIN, "MIN");
            this.start = MIN;
            Instant MAX = Instant.MAX;
            OooOo.OooO0Oo(MAX, "MAX");
            this.end = MAX;
            oo000o oo000oVar = oo000o.f31251OooOo0O;
            this.domainUris = oo000oVar;
            this.originUris = oo000oVar;
        }

        public final DeletionRequest build() {
            return new DeletionRequest(this.deletionMode, this.matchBehavior, this.start, this.end, this.domainUris, this.originUris);
        }

        public final Builder setDomainUris(List<? extends Uri> domainUris) {
            OooOo.OooO0o0(domainUris, "domainUris");
            this.domainUris = domainUris;
            return this;
        }

        public final Builder setEnd(Instant end) {
            OooOo.OooO0o0(end, "end");
            this.end = end;
            return this;
        }

        public final Builder setOriginUris(List<? extends Uri> originUris) {
            OooOo.OooO0o0(originUris, "originUris");
            this.originUris = originUris;
            return this;
        }

        public final Builder setStart(Instant start) {
            OooOo.OooO0o0(start, "start");
            this.start = start;
            return this;
        }
    }

    public static final class Companion {

        @Retention(RetentionPolicy.SOURCE)
        public @interface DeletionMode {
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface MatchBehavior {
        }

        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeletionRequest(int i, int i2, Instant start, Instant end, List<? extends Uri> domainUris, List<? extends Uri> originUris) {
        OooOo.OooO0o0(start, "start");
        OooOo.OooO0o0(end, "end");
        OooOo.OooO0o0(domainUris, "domainUris");
        OooOo.OooO0o0(originUris, "originUris");
        this.deletionMode = i;
        this.matchBehavior = i2;
        this.start = start;
        this.end = end;
        this.domainUris = domainUris;
        this.originUris = originUris;
    }

    public final android.adservices.measurement.DeletionRequest convertToAdServices$ads_adservices_release() {
        android.adservices.measurement.DeletionRequest deletionRequestBuild = androidx.privacysandbox.ads.adservices.customaudience.OooO00o.OooO0oO().setDeletionMode(this.deletionMode).setMatchBehavior(this.matchBehavior).setStart(this.start).setEnd(this.end).setDomainUris(this.domainUris).setOriginUris(this.originUris).build();
        OooOo.OooO0Oo(deletionRequestBuild, "Builder()\n            .s…ris)\n            .build()");
        return deletionRequestBuild;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeletionRequest)) {
            return false;
        }
        DeletionRequest deletionRequest = (DeletionRequest) obj;
        return this.deletionMode == deletionRequest.deletionMode && new HashSet(this.domainUris).equals(new HashSet(deletionRequest.domainUris)) && new HashSet(this.originUris).equals(new HashSet(deletionRequest.originUris)) && OooOo.OooO00o(this.start, deletionRequest.start) && OooOo.OooO00o(this.end, deletionRequest.end) && this.matchBehavior == deletionRequest.matchBehavior;
    }

    public final int getDeletionMode() {
        return this.deletionMode;
    }

    public final List<Uri> getDomainUris() {
        return this.domainUris;
    }

    public final Instant getEnd() {
        return this.end;
    }

    public final int getMatchBehavior() {
        return this.matchBehavior;
    }

    public final List<Uri> getOriginUris() {
        return this.originUris;
    }

    public final Instant getStart() {
        return this.start;
    }

    public int hashCode() {
        return Integer.hashCode(this.matchBehavior) + ((this.end.hashCode() + ((this.start.hashCode() + ((this.originUris.hashCode() + ((this.domainUris.hashCode() + (Integer.hashCode(this.deletionMode) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sbOooOOo0 = androidx.datastore.preferences.protobuf.OooO00o.OooOOo0("DeletionRequest { DeletionMode=", this.deletionMode == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA", ", MatchBehavior=", this.matchBehavior == 0 ? "MATCH_BEHAVIOR_DELETE" : "MATCH_BEHAVIOR_PRESERVE", ", Start=");
        sbOooOOo0.append(this.start);
        sbOooOOo0.append(", End=");
        sbOooOOo0.append(this.end);
        sbOooOOo0.append(", DomainUris=");
        sbOooOOo0.append(this.domainUris);
        sbOooOOo0.append(", OriginUris=");
        sbOooOOo0.append(this.originUris);
        sbOooOOo0.append(" }");
        return sbOooOOo0.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeletionRequest(int i, int i2, Instant MIN, Instant MAX, List list, List list2, int i3, OooOO0O oooOO0O) {
        if ((i3 & 4) != 0) {
            MIN = Instant.MIN;
            OooOo.OooO0Oo(MIN, "MIN");
        }
        Instant instant = MIN;
        if ((i3 & 8) != 0) {
            MAX = Instant.MAX;
            OooOo.OooO0Oo(MAX, "MAX");
        }
        Instant instant2 = MAX;
        int i4 = i3 & 16;
        oo000o oo000oVar = oo000o.f31251OooOo0O;
        this(i, i2, instant, instant2, i4 != 0 ? oo000oVar : list, (i3 & 32) != 0 ? oo000oVar : list2);
    }
}
