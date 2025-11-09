package androidx.datastore.core;

import androidx.datastore.core.MulticastFileObserver;
import o00O0Oo.Oooo000;
import o00O0oOo.o000OO00;
import o00O0oo0.o0Oo0oo;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements o000OO00 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15266OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15267OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15268OooOo0o;

    public /* synthetic */ OooO00o(int i, Object obj, Object obj2) {
        this.f15267OooOo0O = i;
        this.f15268OooOo0o = obj;
        this.f15266OooOo = obj2;
    }

    @Override // o00O0oOo.o000OO00
    public final void dispose() {
        switch (this.f15267OooOo0O) {
            case 0:
                MulticastFileObserver.Companion.observe$lambda$4((String) this.f15268OooOo0o, (Oooo000) this.f15266OooOo);
                break;
            default:
                ((o0Oo0oo) this.f15268OooOo0o).f31653OooOo0O.removeCallbacks((Runnable) this.f15266OooOo);
                break;
        }
    }
}
