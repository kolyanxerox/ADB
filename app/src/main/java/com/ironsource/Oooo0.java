package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* loaded from: classes2.dex */
public final /* synthetic */ class Oooo0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LevelPlayAdInfo f28484OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28485OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C3192hm f28486OooOo0o;

    public /* synthetic */ Oooo0(C3192hm c3192hm, LevelPlayAdInfo levelPlayAdInfo, int i) {
        this.f28485OooOo0O = i;
        this.f28486OooOo0o = c3192hm;
        this.f28484OooOo = levelPlayAdInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28485OooOo0O) {
            case 0:
                C3192hm.m9177b(this.f28486OooOo0o, this.f28484OooOo);
                break;
            case 1:
                C3192hm.m9181c(this.f28486OooOo0o, this.f28484OooOo);
                break;
            default:
                C3192hm.m9172a(this.f28486OooOo0o, this.f28484OooOo);
                break;
        }
    }
}
