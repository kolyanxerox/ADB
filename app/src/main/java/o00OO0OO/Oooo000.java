package o00OO0oo;

import o00OO0OO.OooO00o;

/* loaded from: classes3.dex */
public final class Oooo000 implements OooO00o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f32070OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo0 f32071OooO0O0;

    public Oooo000(OooO00o serializer) {
        kotlin.jvm.internal.OooOo.OooO0o0(serializer, "serializer");
        this.f32070OooO00o = serializer;
        this.f32071OooO0O0 = new o00Oo0(serializer.OooO0Oo());
    }

    @Override // o00OO0OO.OooO00o
    public final void OooO00o(o00OO.OooOo00 oooOo00, Object obj) {
        if (obj != null) {
            oooOo00.OooO(this.f32070OooO00o, obj);
        } else {
            oooOo00.OooO0o();
        }
    }

    @Override // o00OO0OO.OooO00o
    public final Object OooO0OO(com.google.android.material.datepicker.OooO0o oooO0o) {
        if (oooO0o.OooO0oo()) {
            return oooO0o.OooOO0O(this.f32070OooO00o);
        }
        return null;
    }

    @Override // o00OO0OO.OooO00o
    public final o00OO0o.OooO OooO0Oo() {
        return this.f32071OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Oooo000.class == obj.getClass() && kotlin.jvm.internal.OooOo.OooO00o(this.f32070OooO00o, ((Oooo000) obj).f32070OooO00o);
    }

    public final int hashCode() {
        return this.f32070OooO00o.hashCode();
    }
}
