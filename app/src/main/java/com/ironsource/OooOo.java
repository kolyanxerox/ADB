package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooOo implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C3192hm f28480OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28481OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ LevelPlayAdError f28482OooOo0o;

    public /* synthetic */ OooOo(C3192hm c3192hm, LevelPlayAdError levelPlayAdError) {
        this.f28481OooOo0O = 1;
        this.f28482OooOo0o = levelPlayAdError;
        this.f28480OooOo = c3192hm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28481OooOo0O) {
            case 0:
                C3192hm.m9169a(this.f28480OooOo, this.f28482OooOo0o);
                break;
            case 1:
                C3192hm.m9174a(this.f28482OooOo0o, this.f28480OooOo);
                break;
            case 2:
                C3192hm.m9176b(this.f28480OooOo, this.f28482OooOo0o);
                break;
            default:
                C3192hm.m9180c(this.f28480OooOo, this.f28482OooOo0o);
                break;
        }
    }

    public /* synthetic */ OooOo(C3192hm c3192hm, LevelPlayAdError levelPlayAdError, int i) {
        this.f28481OooOo0O = i;
        this.f28480OooOo = c3192hm;
        this.f28482OooOo0o = levelPlayAdError;
    }
}
