package oo00o;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class OooOOO0 implements Serializable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Object f33191OooOo0O;

    public /* synthetic */ OooOOO0(Object obj) {
        this.f33191OooOo0O = obj;
    }

    public static final Throwable OooO00o(Object obj) {
        if (obj instanceof OooOO0O) {
            return ((OooOO0O) obj).f33187OooOo0O;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OooOOO0) {
            return kotlin.jvm.internal.OooOo.OooO00o(this.f33191OooOo0O, ((OooOOO0) obj).f33191OooOo0O);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f33191OooOo0O;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f33191OooOo0O;
        if (obj instanceof OooOO0O) {
            return ((OooOO0O) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
