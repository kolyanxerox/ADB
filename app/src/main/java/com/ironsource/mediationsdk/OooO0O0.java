package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f28495OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28496OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AdapterBaseInterface f28497OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List f28498OooOoO0;

    public /* synthetic */ OooO0O0(AdapterBaseInterface adapterBaseInterface, String str, List list, int i) {
        this.f28496OooOo0O = i;
        this.f28497OooOo0o = adapterBaseInterface;
        this.f28495OooOo = str;
        this.f28498OooOoO0 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28496OooOo0O) {
            case 0:
                C3367c.m10087a(this.f28497OooOo0o, this.f28495OooOo, this.f28498OooOoO0);
                break;
            default:
                C3367c.m10103b(this.f28497OooOo0o, this.f28495OooOo, this.f28498OooOoO0);
                break;
        }
    }
}
