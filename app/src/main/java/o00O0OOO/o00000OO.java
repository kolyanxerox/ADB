package o00O0oOo;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class o00000OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Object f31484OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o0OOO0o f31485OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o00O0Oo.o00Oo0 f31486OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f31487OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Throwable f31488OooO0o0;

    public o00000OO(Object obj, o0OOO0o o0ooo0o, o00O0Oo.o00Oo0 o00oo0, Object obj2, Throwable th) {
        this.f31484OooO00o = obj;
        this.f31485OooO0O0 = o0ooo0o;
        this.f31486OooO0OO = o00oo0;
        this.f31487OooO0Oo = obj2;
        this.f31488OooO0o0 = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static o00000OO OooO00o(o00000OO o00000oo2, o0OOO0o o0ooo0o, CancellationException cancellationException, int i) {
        Object obj = o00000oo2.f31484OooO00o;
        if ((i & 2) != 0) {
            o0ooo0o = o00000oo2.f31485OooO0O0;
        }
        o0OOO0o o0ooo0o2 = o0ooo0o;
        o00O0Oo.o00Oo0 o00oo0 = o00000oo2.f31486OooO0OO;
        Object obj2 = o00000oo2.f31487OooO0Oo;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = o00000oo2.f31488OooO0o0;
        }
        o00000oo2.getClass();
        return new o00000OO(obj, o0ooo0o2, o00oo0, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00000OO)) {
            return false;
        }
        o00000OO o00000oo2 = (o00000OO) obj;
        return OooOo.OooO00o(this.f31484OooO00o, o00000oo2.f31484OooO00o) && OooOo.OooO00o(this.f31485OooO0O0, o00000oo2.f31485OooO0O0) && OooOo.OooO00o(this.f31486OooO0OO, o00000oo2.f31486OooO0OO) && OooOo.OooO00o(this.f31487OooO0Oo, o00000oo2.f31487OooO0Oo) && OooOo.OooO00o(this.f31488OooO0o0, o00000oo2.f31488OooO0o0);
    }

    public final int hashCode() {
        Object obj = this.f31484OooO00o;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        o0OOO0o o0ooo0o = this.f31485OooO0O0;
        int iHashCode2 = (iHashCode + (o0ooo0o == null ? 0 : o0ooo0o.hashCode())) * 31;
        o00O0Oo.o00Oo0 o00oo0 = this.f31486OooO0OO;
        int iHashCode3 = (iHashCode2 + (o00oo0 == null ? 0 : o00oo0.hashCode())) * 31;
        Object obj2 = this.f31487OooO0Oo;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f31488OooO0o0;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f31484OooO00o + ", cancelHandler=" + this.f31485OooO0O0 + ", onCancellation=" + this.f31486OooO0OO + ", idempotentResume=" + this.f31487OooO0Oo + ", cancelCause=" + this.f31488OooO0o0 + ')';
    }

    public /* synthetic */ o00000OO(Object obj, o0OOO0o o0ooo0o, o00O0Oo.o00Oo0 o00oo0, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : o0ooo0o, (i & 4) != 0 ? null : o00oo0, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
