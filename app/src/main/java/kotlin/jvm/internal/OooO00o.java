package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class OooO00o implements OooOOO, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel = false;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public OooO00o(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        return this.isTopLevel == oooO00o.isTopLevel && this.arity == oooO00o.arity && this.flags == oooO00o.flags && OooOo.OooO00o(this.receiver, oooO00o.receiver) && OooOo.OooO00o(this.owner, oooO00o.owner) && this.name.equals(oooO00o.name) && this.signature.equals(oooO00o.signature);
    }

    @Override // kotlin.jvm.internal.OooOOO
    public int getArity() {
        return this.arity;
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

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((androidx.datastore.preferences.protobuf.OooO00o.OooO0O0(androidx.datastore.preferences.protobuf.OooO00o.OooO0O0((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        o0OO00O.f28878OooO00o.getClass();
        return oo0o0Oo.OooO00o(this);
    }
}
