package oo00o;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class OooOO0O implements Serializable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Throwable f33187OooOo0O;

    public OooOO0O(Throwable exception) {
        kotlin.jvm.internal.OooOo.OooO0o0(exception, "exception");
        this.f33187OooOo0O = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OooOO0O) {
            return kotlin.jvm.internal.OooOo.OooO00o(this.f33187OooOo0O, ((OooOO0O) obj).f33187OooOo0O);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33187OooOo0O.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f33187OooOo0O + ')';
    }
}
