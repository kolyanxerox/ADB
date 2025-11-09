package com.ironsource;

import com.ironsource.C3808wm;
import com.unity3d.mediation.LevelPlayInitListener;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0000Ooo implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C3216ib f28537OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28538OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ LevelPlayInitListener f28539OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C3535ps f28540OooOoO0;

    public /* synthetic */ o0000Ooo(LevelPlayInitListener levelPlayInitListener, C3216ib c3216ib, C3535ps c3535ps, int i) {
        this.f28538OooOo0O = i;
        this.f28539OooOo0o = levelPlayInitListener;
        this.f28537OooOo = c3216ib;
        this.f28540OooOoO0 = c3535ps;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.f28538OooOo0O) {
            case 0:
                C3808wm.a.m12921a(this.f28539OooOo0o, this.f28537OooOo, this.f28540OooOoO0);
                break;
            default:
                C3808wm.b.m12923a(this.f28539OooOo0o, this.f28537OooOo, this.f28540OooOoO0);
                break;
        }
    }
}
