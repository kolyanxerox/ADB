package com.applovin.impl;

import com.applovin.impl.C1043h2;

/* loaded from: classes.dex */
public final /* synthetic */ class oo000o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15803OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15804OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f15805OooOo0o;

    public /* synthetic */ oo000o(Object obj, int i, int i2) {
        this.f15804OooOo0O = i2;
        this.f15803OooOo = obj;
        this.f15805OooOo0o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15804OooOo0O) {
            case 0:
                ((C1043h2.b) this.f15803OooOo).m876a(this.f15805OooOo0o);
                break;
            default:
                ((C1093m2) this.f15803OooOo).m1445a(this.f15805OooOo0o);
                break;
        }
    }
}
