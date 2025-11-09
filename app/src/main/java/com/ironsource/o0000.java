package com.ironsource;

import android.content.Context;
import com.ironsource.C3808wm;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0000 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C3465ns f28502OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28503OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ LevelPlayInitRequest f28504OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C3216ib f28505OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Context f28506OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ LevelPlayInitListener f28507OooOoOO;

    public /* synthetic */ o0000(LevelPlayInitRequest levelPlayInitRequest, C3465ns c3465ns, Context context, C3216ib c3216ib, LevelPlayInitListener levelPlayInitListener, int i) {
        this.f28503OooOo0O = i;
        this.f28504OooOo0o = levelPlayInitRequest;
        this.f28502OooOo = c3465ns;
        this.f28506OooOoO0 = context;
        this.f28505OooOoO = c3216ib;
        this.f28507OooOoOO = levelPlayInitListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28503OooOo0O) {
            case 0:
                C3808wm.a.m12922a(this.f28504OooOo0o, this.f28502OooOo, this.f28506OooOoO0, this.f28505OooOoO, this.f28507OooOoOO);
                break;
            default:
                C3808wm.b.m12924a(this.f28504OooOo0o, this.f28502OooOo, this.f28506OooOoO0, this.f28505OooOoO, this.f28507OooOoOO);
                break;
        }
    }
}
