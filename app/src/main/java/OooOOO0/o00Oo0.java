package OooOOo0;

import com.google.android.gms.internal.measurement.o0OO00OO;

/* loaded from: classes2.dex */
public final class o00Oo0 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f13509OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Runnable f13510OooOo0o;

    public /* synthetic */ o00Oo0(Runnable runnable, int i) {
        this.f13509OooOo0O = i;
        this.f13510OooOo0o = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13509OooOo0O) {
            case 0:
                try {
                    this.f13510OooOo0o.run();
                    break;
                } catch (Exception e) {
                    o0OO00OO.OooOo00("Executor", "Background execution failure.", e);
                    return;
                }
            default:
                this.f13510OooOo0o.run();
                break;
        }
    }

    public String toString() {
        switch (this.f13509OooOo0O) {
            case 1:
                return this.f13510OooOo0o.toString();
            default:
                return super.toString();
        }
    }
}
