package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import o00O0o0o.o00000OO;
import o00O0o0o.o0000Ooo;

/* loaded from: classes3.dex */
public abstract class OooO0o implements o00O0o0o.o00oO0o, Serializable {
    public static final Object NO_RECEIVER = OooO0OO.f28873OooOo0O;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient o00O0o0o.o00oO0o reflected;
    private final String signature;

    public OooO0o(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // o00O0o0o.o00oO0o
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // o00O0o0o.o00oO0o
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public o00O0o0o.o00oO0o compute() {
        o00O0o0o.o00oO0o o00oo0o = this.reflected;
        if (o00oo0o != null) {
            return o00oo0o;
        }
        o00O0o0o.o00oO0o o00oo0oComputeReflected = computeReflected();
        this.reflected = o00oo0oComputeReflected;
        return o00oo0oComputeReflected;
    }

    public abstract o00O0o0o.o00oO0o computeReflected();

    @Override // o00O0o0o.oo000o
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public o00O0o0o.o0OOO0o getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return o0OO00O.OooO00o(cls);
        }
        o0OO00O.f28878OooO00o.getClass();
        return new o0OoOo0(cls);
    }

    @Override // o00O0o0o.o00oO0o
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract o00O0o0o.o00oO0o getReflected();

    @Override // o00O0o0o.o00oO0o
    public o00000OO getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // o00O0o0o.o00oO0o
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // o00O0o0o.o00oO0o
    public o0000Ooo getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // o00O0o0o.o00oO0o
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // o00O0o0o.o00oO0o
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // o00O0o0o.o00oO0o
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // o00O0o0o.o00oO0o
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
