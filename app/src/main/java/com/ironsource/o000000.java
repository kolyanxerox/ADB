package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* loaded from: classes2.dex */
public final /* synthetic */ class o000000 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LevelPlayAdInfo f28510OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28511OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C3564qm f28512OooOo0o;

    public /* synthetic */ o000000(C3564qm c3564qm, LevelPlayAdInfo levelPlayAdInfo, int i) {
        this.f28511OooOo0O = i;
        this.f28512OooOo0o = c3564qm;
        this.f28510OooOo = levelPlayAdInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28511OooOo0O) {
            case 0:
                C3564qm.m11573b(this.f28512OooOo0o, this.f28510OooOo);
                break;
            default:
                C3564qm.m11570a(this.f28512OooOo0o, this.f28510OooOo);
                break;
        }
    }
}
