package o00OO00o;

import o00O0oOo.o0000OO0;

/* loaded from: classes3.dex */
public final class OooOOOO extends OooOOO {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Runnable f32005OooOo;

    public OooOOOO(long j, Runnable runnable, boolean z) {
        super(j, z);
        this.f32005OooOo = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32005OooOo.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f32005OooOo;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(o0000OO0.OooOOOo(runnable));
        sb.append(", ");
        sb.append(this.f32002OooOo0O);
        sb.append(", ");
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(']', this.f32003OooOo0o ? "Blocking" : "Non-blocking", sb);
    }
}
