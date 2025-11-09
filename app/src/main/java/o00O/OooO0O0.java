package o00O;

import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class OooO0O0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public int f31167OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public OooO0o[] f31168OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f31169OooOo0o;

    public final OooO0o OooO0OO() {
        OooO0o oooO0oOooO0Oo;
        synchronized (this) {
            try {
                OooO0o[] oooO0oArrOooO0o0 = this.f31168OooOo0O;
                if (oooO0oArrOooO0o0 == null) {
                    oooO0oArrOooO0o0 = OooO0o0();
                    this.f31168OooOo0O = oooO0oArrOooO0o0;
                } else if (this.f31169OooOo0o >= oooO0oArrOooO0o0.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(oooO0oArrOooO0o0, oooO0oArrOooO0o0.length * 2);
                    kotlin.jvm.internal.OooOo.OooO0Oo(objArrCopyOf, "copyOf(...)");
                    this.f31168OooOo0O = (OooO0o[]) objArrCopyOf;
                    oooO0oArrOooO0o0 = (OooO0o[]) objArrCopyOf;
                }
                int i = this.f31167OooOo;
                do {
                    oooO0oOooO0Oo = oooO0oArrOooO0o0[i];
                    if (oooO0oOooO0Oo == null) {
                        oooO0oOooO0Oo = OooO0Oo();
                        oooO0oArrOooO0o0[i] = oooO0oOooO0Oo;
                    }
                    i++;
                    if (i >= oooO0oArrOooO0o0.length) {
                        i = 0;
                    }
                } while (!oooO0oOooO0Oo.OooO00o(this));
                this.f31167OooOo = i;
                this.f31169OooOo0o++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oooO0oOooO0Oo;
    }

    public abstract OooO0o OooO0Oo();

    public final void OooO0o(OooO0o oooO0o) {
        int i;
        o00O0O0O.OooO0OO[] oooO0OOArrOooO0O0;
        synchronized (this) {
            try {
                int i2 = this.f31169OooOo0o - 1;
                this.f31169OooOo0o = i2;
                if (i2 == 0) {
                    this.f31167OooOo = 0;
                }
                kotlin.jvm.internal.OooOo.OooO0OO(oooO0o, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                oooO0OOArrOooO0O0 = oooO0o.OooO0O0(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (o00O0O0O.OooO0OO oooO0OO : oooO0OOArrOooO0O0) {
            if (oooO0OO != null) {
                oooO0OO.resumeWith(oo00o.OooOo.f33195OooO00o);
            }
        }
    }

    public abstract OooO0o[] OooO0o0();
}
