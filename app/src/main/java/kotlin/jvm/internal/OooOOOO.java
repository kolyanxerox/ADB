package kotlin.jvm.internal;

import com.google.android.gms.internal.ads.rp0;

/* loaded from: classes3.dex */
public abstract class OooOOOO extends OooO0o implements OooOOO, o00O0o0o.o0Oo0oo {
    private final int arity;
    private final int flags;

    public OooOOOO(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.OooO0o
    public o00O0o0o.o00oO0o computeReflected() {
        o0OO00O.f28878OooO00o.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooOOOO) {
            OooOOOO oooOOOO = (OooOOOO) obj;
            return getName().equals(oooOOOO.getName()) && getSignature().equals(oooOOOO.getSignature()) && this.flags == oooOOOO.flags && this.arity == oooOOOO.arity && OooOo.OooO00o(getBoundReceiver(), oooOOOO.getBoundReceiver()) && OooOo.OooO00o(getOwner(), oooOOOO.getOwner());
        }
        if (obj instanceof o00O0o0o.o0Oo0oo) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.OooOOO
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // o00O0o0o.o0Oo0oo
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // o00O0o0o.o0Oo0oo
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // o00O0o0o.o0Oo0oo
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // o00O0o0o.o0Oo0oo
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.OooO0o, o00O0o0o.o00oO0o
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        o00O0o0o.o00oO0o o00oo0oCompute = compute();
        if (o00oo0oCompute != this) {
            return o00oo0oCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.OooO0o
    public o00O0o0o.o0Oo0oo getReflected() {
        o00O0o0o.o00oO0o o00oo0oCompute = compute();
        if (o00oo0oCompute != this) {
            return (o00O0o0o.o0Oo0oo) o00oo0oCompute;
        }
        throw new rp0("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
