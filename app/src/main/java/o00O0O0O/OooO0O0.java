package o00O0O0O;

import com.ironsource.C3034d9;
import java.io.Serializable;
import kotlin.jvm.internal.OooOo;
import o00O.o00oO0o;
import o00O0Oo.o00O0O;

/* loaded from: classes3.dex */
public final class OooO0O0 implements OooOOO0, Serializable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final OooOOO0 f31355OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final OooOO0 f31356OooOo0o;

    public OooO0O0(OooOO0 element, OooOOO0 left) {
        OooOo.OooO0o0(left, "left");
        OooOo.OooO0o0(element, "element");
        this.f31355OooOo0O = left;
        this.f31356OooOo0o = element;
    }

    public final boolean equals(Object obj) {
        boolean zOooO00o;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooO0O0) {
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            oooO0O0.getClass();
            int i = 2;
            OooO0O0 oooO0O02 = oooO0O0;
            int i2 = 2;
            while (true) {
                OooOOO0 oooOOO0 = oooO0O02.f31355OooOo0O;
                oooO0O02 = oooOOO0 instanceof OooO0O0 ? (OooO0O0) oooOOO0 : null;
                if (oooO0O02 == null) {
                    break;
                }
                i2++;
            }
            OooO0O0 oooO0O03 = this;
            while (true) {
                OooOOO0 oooOOO02 = oooO0O03.f31355OooOo0O;
                oooO0O03 = oooOOO02 instanceof OooO0O0 ? (OooO0O0) oooOOO02 : null;
                if (oooO0O03 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                OooO0O0 oooO0O04 = this;
                while (true) {
                    OooOO0 oooOO0 = oooO0O04.f31356OooOo0o;
                    if (!OooOo.OooO00o(oooO0O0.get(oooOO0.getKey()), oooOO0)) {
                        zOooO00o = false;
                        break;
                    }
                    OooOOO0 oooOOO03 = oooO0O04.f31355OooOo0O;
                    if (!(oooOOO03 instanceof OooO0O0)) {
                        OooOo.OooO0OO(oooOOO03, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        OooOO0 oooOO02 = (OooOO0) oooOOO03;
                        zOooO00o = OooOo.OooO00o(oooO0O0.get(oooOO02.getKey()), oooOO02);
                        break;
                    }
                    oooO0O04 = (OooO0O0) oooOOO03;
                }
                if (zOooO00o) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o00O0O0O.OooOOO0
    public final Object fold(Object obj, o00O0O o00o0o) {
        return o00o0o.invoke(this.f31355OooOo0O.fold(obj, o00o0o), this.f31356OooOo0o);
    }

    @Override // o00O0O0O.OooOOO0
    public final OooOO0 get(OooOO0O key) {
        OooOo.OooO0o0(key, "key");
        OooO0O0 oooO0O0 = this;
        while (true) {
            OooOO0 oooOO0 = oooO0O0.f31356OooOo0o.get(key);
            if (oooOO0 != null) {
                return oooOO0;
            }
            OooOOO0 oooOOO0 = oooO0O0.f31355OooOo0O;
            if (!(oooOOO0 instanceof OooO0O0)) {
                return oooOOO0.get(key);
            }
            oooO0O0 = (OooO0O0) oooOOO0;
        }
    }

    public final int hashCode() {
        return this.f31356OooOo0o.hashCode() + this.f31355OooOo0O.hashCode();
    }

    @Override // o00O0O0O.OooOOO0
    public final OooOOO0 minusKey(OooOO0O key) {
        OooOo.OooO0o0(key, "key");
        OooOO0 oooOO0 = this.f31356OooOo0o;
        OooOO0 oooOO02 = oooOO0.get(key);
        OooOOO0 oooOOO0 = this.f31355OooOo0O;
        if (oooOO02 != null) {
            return oooOOO0;
        }
        OooOOO0 oooOOO0MinusKey = oooOOO0.minusKey(key);
        return oooOOO0MinusKey == oooOOO0 ? this : oooOOO0MinusKey == OooOOO.f31358OooOo0O ? oooOO0 : new OooO0O0(oooOO0, oooOOO0MinusKey);
    }

    @Override // o00O0O0O.OooOOO0
    public final OooOOO0 plus(OooOOO0 context) {
        OooOo.OooO0o0(context, "context");
        return context == OooOOO.f31358OooOo0O ? this : (OooOOO0) context.fold(this, new o00oO0o(2));
    }

    public final String toString() {
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(']', (String) fold("", new o00oO0o(1)), new StringBuilder(C3034d9.i.f8177d));
    }
}
