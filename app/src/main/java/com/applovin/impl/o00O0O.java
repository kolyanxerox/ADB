package com.applovin.impl;

import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class o00O0O implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15775OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1035g4 f15776OooOo0o;

    public /* synthetic */ o00O0O(C1035g4 c1035g4, int i) {
        this.f15775OooOo0O = i;
        this.f15776OooOo0o = c1035g4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f15775OooOo0O) {
            case 0:
                this.f15776OooOo0o.m780f();
                break;
            default:
                this.f15776OooOo0o.m781g();
                break;
        }
    }
}
