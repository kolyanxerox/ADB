package com.ironsource;

import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.LevelPlayInitListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class o00000O implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f28515OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28516OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f28517OooOo0o;

    public /* synthetic */ o00000O(int i, Object obj, Object obj2) {
        this.f28516OooOo0O = i;
        this.f28517OooOo0o = obj;
        this.f28515OooOo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28516OooOo0O) {
            case 0:
                C3713tv.m12491a((C3713tv) this.f28517OooOo0o, (TestSuiteActivity) this.f28515OooOo);
                break;
            case 1:
                C3808wm.m12904a((C3535ps) this.f28517OooOo0o, (LevelPlayInitListener) this.f28515OooOo);
                break;
            case 2:
                C3808wm.m12909a((LevelPlayInitListener) this.f28517OooOo0o, (C3122fm) this.f28515OooOo);
                break;
            case 3:
                C3817wv.m12977a((C3817wv) this.f28517OooOo0o, (String) this.f28515OooOo);
                break;
            default:
                C3825x5.m13019a((C3825x5) this.f28517OooOo0o, (InterfaceC3852xw) this.f28515OooOo);
                break;
        }
    }
}
