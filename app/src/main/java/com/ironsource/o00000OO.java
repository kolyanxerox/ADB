package com.ironsource;

import com.ironsource.C3792w6;

/* loaded from: classes2.dex */
public final /* synthetic */ class o00000OO implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ long f28521OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28522OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C3719u2 f28523OooOo0o;

    public /* synthetic */ o00000OO(C3719u2 c3719u2, long j, int i) {
        this.f28522OooOo0O = i;
        this.f28523OooOo0o = c3719u2;
        this.f28521OooOo = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28522OooOo0O) {
            case 0:
                C3792w6.a.m12841a(this.f28523OooOo0o, this.f28521OooOo);
                break;
            case 1:
                C3792w6.a.m12843b(this.f28523OooOo0o, this.f28521OooOo);
                break;
            case 2:
                C3792w6.a.m12844c(this.f28523OooOo0o, this.f28521OooOo);
                break;
            default:
                C3792w6.a.m12845d(this.f28523OooOo0o, this.f28521OooOo);
                break;
        }
    }
}
