package o000o00o;

import androidx.datastore.preferences.protobuf.OooO00o;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class OooOO0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f30682OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f30683OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f30684OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f30685OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f30686OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final o0000OO0 f30687OooO0o0;

    public OooOO0O(String str, String versionName, String appBuildVersion, String str2, o0000OO0 o0000oo02, ArrayList arrayList) {
        kotlin.jvm.internal.OooOo.OooO0o0(versionName, "versionName");
        kotlin.jvm.internal.OooOo.OooO0o0(appBuildVersion, "appBuildVersion");
        this.f30682OooO00o = str;
        this.f30683OooO0O0 = versionName;
        this.f30684OooO0OO = appBuildVersion;
        this.f30685OooO0Oo = str2;
        this.f30687OooO0o0 = o0000oo02;
        this.f30686OooO0o = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOO0O)) {
            return false;
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        return this.f30682OooO00o.equals(oooOO0O.f30682OooO00o) && kotlin.jvm.internal.OooOo.OooO00o(this.f30683OooO0O0, oooOO0O.f30683OooO0O0) && kotlin.jvm.internal.OooOo.OooO00o(this.f30684OooO0OO, oooOO0O.f30684OooO0OO) && this.f30685OooO0Oo.equals(oooOO0O.f30685OooO0Oo) && this.f30687OooO0o0.equals(oooOO0O.f30687OooO0o0) && this.f30686OooO0o.equals(oooOO0O.f30686OooO0o);
    }

    public final int hashCode() {
        return this.f30686OooO0o.hashCode() + ((this.f30687OooO0o0.hashCode() + OooO00o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(this.f30682OooO00o.hashCode() * 31, 31, this.f30683OooO0O0), 31, this.f30684OooO0OO), 31, this.f30685OooO0Oo)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f30682OooO00o + ", versionName=" + this.f30683OooO0O0 + ", appBuildVersion=" + this.f30684OooO0OO + ", deviceManufacturer=" + this.f30685OooO0Oo + ", currentProcessDetails=" + this.f30687OooO0o0 + ", appProcessDetails=" + this.f30686OooO0o + ')';
    }
}
