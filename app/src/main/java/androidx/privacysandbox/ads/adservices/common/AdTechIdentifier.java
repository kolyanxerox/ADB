package androidx.privacysandbox.ads.adservices.common;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class AdTechIdentifier {
    private final String identifier;

    public AdTechIdentifier(String identifier) {
        OooOo.OooO0o0(identifier, "identifier");
        this.identifier = identifier;
    }

    public final android.adservices.common.AdTechIdentifier convertToAdServices$ads_adservices_release() {
        android.adservices.common.AdTechIdentifier adTechIdentifierFromString = android.adservices.common.AdTechIdentifier.fromString(this.identifier);
        OooOo.OooO0Oo(adTechIdentifierFromString, "fromString(identifier)");
        return adTechIdentifierFromString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdTechIdentifier) {
            return OooOo.OooO00o(this.identifier, ((AdTechIdentifier) obj).identifier);
        }
        return false;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        return this.identifier.hashCode();
    }

    public String toString() {
        return String.valueOf(this.identifier);
    }
}
