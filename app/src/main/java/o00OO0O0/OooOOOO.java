package o00OO0O0;

import java.util.concurrent.atomic.AtomicReferenceArray;
import o00OO000.o00Ooo;

/* loaded from: classes3.dex */
public final class OooOOOO extends o00Ooo {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f32039OooOoO;

    public OooOOOO(long j, OooOOOO oooOOOO, int i) {
        super(j, oooOOOO, i);
        this.f32039OooOoO = new AtomicReferenceArray(OooOOO.f32031OooO0o);
    }

    @Override // o00OO000.o00Ooo
    public final int OooO0oO() {
        return OooOOO.f32031OooO0o;
    }

    @Override // o00OO000.o00Ooo
    public final void OooO0oo(int i, o00O0O0O.OooOOO0 oooOOO0) {
        this.f32039OooOoO.set(i, OooOOO.f32032OooO0o0);
        OooO();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f31964OooOo + ", hashCode=" + hashCode() + ']';
    }
}
