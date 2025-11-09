package o000OO00;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class OooO0OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f30195OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Map f30196OooO0O0;

    public OooO0OO(String str, Map map) {
        this.f30195OooO00o = str;
        this.f30196OooO0O0 = map;
    }

    public static OooO0OO OooO00o(String str) {
        return new OooO0OO(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0OO)) {
            return false;
        }
        OooO0OO oooO0OO = (OooO0OO) obj;
        return this.f30195OooO00o.equals(oooO0OO.f30195OooO00o) && this.f30196OooO0O0.equals(oooO0OO.f30196OooO0O0);
    }

    public final int hashCode() {
        return this.f30196OooO0O0.hashCode() + (this.f30195OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f30195OooO00o + ", properties=" + this.f30196OooO0O0.values() + "}";
    }
}
