package OooOOo;

import OooOoO.o000oOoO;
import android.content.Context;

/* loaded from: classes2.dex */
public final class OooOOO0 extends OooOOOO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f13444OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o000oOoO f13445OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o000oOoO f13446OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f13447OooO0Oo;

    public OooOOO0(Context context, o000oOoO o000oooo2, o000oOoO o000oooo3, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f13444OooO00o = context;
        if (o000oooo2 == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f13445OooO0O0 = o000oooo2;
        if (o000oooo3 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f13446OooO0OO = o000oooo3;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f13447OooO0Oo = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooOOOO) {
            OooOOOO oooOOOO = (OooOOOO) obj;
            if (this.f13444OooO00o.equals(((OooOOO0) oooOOOO).f13444OooO00o)) {
                OooOOO0 oooOOO0 = (OooOOO0) oooOOOO;
                if (this.f13445OooO0O0.equals(oooOOO0.f13445OooO0O0) && this.f13446OooO0OO.equals(oooOOO0.f13446OooO0OO) && this.f13447OooO0Oo.equals(oooOOO0.f13447OooO0Oo)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f13444OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f13445OooO0O0.hashCode()) * 1000003) ^ this.f13446OooO0OO.hashCode()) * 1000003) ^ this.f13447OooO0Oo.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f13444OooO00o);
        sb.append(", wallClock=");
        sb.append(this.f13445OooO0O0);
        sb.append(", monotonicClock=");
        sb.append(this.f13446OooO0OO);
        sb.append(", backendName=");
        return OooO0oO.OooOo.OooOOOo(sb, this.f13447OooO0Oo, "}");
    }
}
