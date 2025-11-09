package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* loaded from: classes2.dex */
public final /* synthetic */ class o00oO0o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C3423ml f28556OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28557OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ LevelPlayAdInfo f28558OooOo0o;

    public /* synthetic */ o00oO0o(LevelPlayAdInfo levelPlayAdInfo, C3423ml c3423ml, int i) {
        this.f28557OooOo0O = i;
        this.f28558OooOo0o = levelPlayAdInfo;
        this.f28556OooOo = c3423ml;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28557OooOo0O) {
            case 0:
                C3423ml.m10840e(this.f28558OooOo0o, this.f28556OooOo);
                break;
            case 1:
                C3423ml.m10838d(this.f28558OooOo0o, this.f28556OooOo);
                break;
            case 2:
                C3423ml.m10834b(this.f28558OooOo0o, this.f28556OooOo);
                break;
            case 3:
                C3423ml.m10836c(this.f28558OooOo0o, this.f28556OooOo);
                break;
            default:
                C3423ml.m10830a(this.f28558OooOo0o, this.f28556OooOo);
                break;
        }
    }
}
