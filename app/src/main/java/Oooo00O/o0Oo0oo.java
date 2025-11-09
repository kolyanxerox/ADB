package Oooo00O;

import OooOooo.o000Oo0;
import android.os.Bundle;

/* loaded from: classes2.dex */
public abstract class o0Oo0oo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public Boolean f13829OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public boolean f13830OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f13831OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f13832OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f13833OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Bundle f13834OooO0o0;

    public o0Oo0oo(OooOO0O oooOO0O, int i, Bundle bundle) {
        this.f13833OooO0o = oooOO0O;
        Boolean bool = Boolean.TRUE;
        this.f13831OooO0OO = oooOO0O;
        this.f13829OooO00o = bool;
        this.f13830OooO0O0 = false;
        this.f13832OooO0Oo = i;
        this.f13834OooO0o0 = bundle;
    }

    public abstract void OooO00o(o000Oo0 o000oo02);

    public abstract boolean OooO0O0();

    public final void OooO0OO() {
        synchronized (this) {
            this.f13829OooO00o = null;
        }
        synchronized (this.f13831OooO0OO.f13752Oooo0o) {
            this.f13831OooO0OO.f13752Oooo0o.remove(this);
        }
    }
}
