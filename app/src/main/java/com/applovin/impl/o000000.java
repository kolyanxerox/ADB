package com.applovin.impl;

import androidx.arch.core.util.Function;
import com.applovin.impl.C1153p3;
import com.applovin.impl.C1170q4;
import com.applovin.impl.C1246t0;

/* loaded from: classes.dex */
public final /* synthetic */ class o000000 implements Function, C1170q4.b, C1153p3.b, C1246t0.c {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15702OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15703OooOo0o;

    public /* synthetic */ o000000(Object obj, int i) {
        this.f15702OooOo0O = i;
        this.f15703OooOo0o = obj;
    }

    @Override // com.applovin.impl.C1153p3.b
    /* renamed from: a */
    public Object mo1a(Object obj) {
        return C1178r3.m2315a((Long) this.f15703OooOo0o, (Long) obj);
    }

    @Override // androidx.arch.core.util.Function, OooOOO.OooO0o
    public Object apply(Object obj) {
        switch (this.f15702OooOo0O) {
            case 0:
                return ((C1088l7) this.f15703OooOo0o).m1342t((C1026f5) obj);
            default:
                return ((AbstractC1266v2) this.f15703OooOo0o).m3499c((C1026f5) obj);
        }
    }

    @Override // com.applovin.impl.C1246t0.c
    /* renamed from: a */
    public void mo63a(C1246t0.b bVar) {
        ((C1246t0) this.f15703OooOo0o).m3271a(bVar);
    }

    @Override // com.applovin.impl.C1170q4.b
    /* renamed from: a */
    public void mo3a(boolean z, Object obj, Object obj2) {
        switch (this.f15702OooOo0O) {
            case 1:
                C1170q4.m2259a((C1170q4.a) this.f15703OooOo0o, z, obj, obj2);
                break;
            case 2:
                C1170q4.m2261a((Runnable) this.f15703OooOo0o, z, obj, obj2);
                break;
            default:
                ((AbstractC1265v1) this.f15703OooOo0o).m3434a(z, (Void) obj, (Void) obj2);
                break;
        }
    }
}
