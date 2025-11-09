package kotlin.jvm.internal;

import com.google.android.gms.internal.ads.rp0;
import o00O0o0o.o00000O;

/* loaded from: classes3.dex */
public abstract class o00Ooo extends OooO0o implements o00000O {
    private final boolean syntheticJavaProperty;

    public o00Ooo(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.OooO0o
    public o00O0o0o.o00oO0o compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00Ooo) {
            o00Ooo o00ooo2 = (o00Ooo) obj;
            return getOwner().equals(o00ooo2.getOwner()) && getName().equals(o00ooo2.getName()) && getSignature().equals(o00ooo2.getSignature()) && OooOo.OooO00o(getBoundReceiver(), o00ooo2.getBoundReceiver());
        }
        if (obj instanceof o00000O) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // o00O0o0o.o00000O
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // o00O0o0o.o00000O
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        o00O0o0o.o00oO0o o00oo0oCompute = compute();
        if (o00oo0oCompute != this) {
            return o00oo0oCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.OooO0o
    public o00000O getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        o00O0o0o.o00oO0o o00oo0oCompute = compute();
        if (o00oo0oCompute != this) {
            return (o00000O) o00oo0oCompute;
        }
        throw new rp0("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
