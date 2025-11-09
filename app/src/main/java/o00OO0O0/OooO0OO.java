package o00OO0O0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o00O0Oo.o00Oo0;
import o00O0oOo.o0Oo0oo;
import o00O0oOo.o0oOOo;
import o00O0oOo.oo0o0Oo;
import o00OO000.o00Ooo;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class OooO0OO implements o0Oo0oo, o0oOOo {

    /* renamed from: OooOo0O */
    public final oo0o0Oo f32022OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ OooO0o f32023OooOo0o;

    public OooO0OO(OooO0o oooO0o, oo0o0Oo oo0o0oo) {
        this.f32023OooOo0o = oooO0o;
        this.f32022OooOo0O = oo0o0oo;
    }

    @Override // o00O0oOo.o0oOOo
    public final void OooO0O0(o00Ooo o00ooo2, int i) {
        this.f32022OooOo0O.OooO0O0(o00ooo2, i);
    }

    @Override // o00O0oOo.o0Oo0oo
    public final boolean OooO0oO(Throwable th) {
        return this.f32022OooOo0O.OooO0oO(th);
    }

    @Override // o00O0oOo.o0Oo0oo
    public final o000O0O0.OooO0O0 OooOOOO(Object obj, o00Oo0 o00oo0) {
        final OooO0o oooO0o = this.f32023OooOo0o;
        o00Oo0 o00oo02 = new o00Oo0() { // from class: o00OO0O0.OooO0O0
            @Override // o00O0Oo.o00Oo0
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO0o.f32024OooO0oO;
                this.getClass();
                OooO0o oooO0o2 = oooO0o;
                atomicReferenceFieldUpdater.set(oooO0o2, null);
                oooO0o2.OooO0o(null);
                return OooOo.f33195OooO00o;
            }
        };
        o000O0O0.OooO0O0 oooO0O0OooOooO = this.f32022OooOo0O.OooOooO((OooOo) obj, o00oo02);
        if (oooO0O0OooOooO != null) {
            OooO0o.f32024OooO0oO.set(oooO0o, null);
        }
        return oooO0O0OooOooO;
    }

    @Override // o00O0oOo.o0Oo0oo
    public final void OooOOo(Object obj) {
        this.f32022OooOo0O.OooOOo(obj);
    }

    @Override // o00O0O0O.OooO0OO
    public final o00O0O0O.OooOOO0 getContext() {
        return this.f32022OooOo0O.f31582OooOoO;
    }

    @Override // o00O0oOo.o0Oo0oo
    public final boolean isActive() {
        return this.f32022OooOo0O.isActive();
    }

    @Override // o00O0O0O.OooO0OO
    public final void resumeWith(Object obj) {
        this.f32022OooOo0O.resumeWith(obj);
    }
}
