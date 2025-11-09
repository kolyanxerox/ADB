package androidx.privacysandbox.ads.adservices.appsetid;

import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class AppSetId {
    public static final Companion Companion = new Companion(null);
    public static final int SCOPE_APP = 1;
    public static final int SCOPE_DEVELOPER = 2;

    /* renamed from: id */
    private final String f113id;
    private final int scope;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    public AppSetId(String id, int i) {
        OooOo.OooO0o0(id, "id");
        this.f113id = id;
        this.scope = i;
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("Scope undefined.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        return OooOo.OooO00o(this.f113id, appSetId.f113id) && this.scope == appSetId.scope;
    }

    public final String getId() {
        return this.f113id;
    }

    public final int getScope() {
        return this.scope;
    }

    public int hashCode() {
        return Integer.hashCode(this.scope) + (this.f113id.hashCode() * 31);
    }

    public String toString() {
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOO0(new StringBuilder("AppSetId: id="), this.f113id, ", scope=", this.scope == 1 ? "SCOPE_APP" : "SCOPE_DEVELOPER");
    }
}
