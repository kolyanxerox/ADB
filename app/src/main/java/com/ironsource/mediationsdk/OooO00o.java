package com.ironsource.mediationsdk;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f28491OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28492OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractAdapter f28493OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List f28494OooOoO0;

    public /* synthetic */ OooO00o(AbstractAdapter abstractAdapter, String str, List list, int i) {
        this.f28492OooOo0O = i;
        this.f28493OooOo0o = abstractAdapter;
        this.f28491OooOo = str;
        this.f28494OooOoO0 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28492OooOo0O) {
            case 0:
                C3367c.m10084a(this.f28493OooOo0o, this.f28491OooOo, this.f28494OooOoO0);
                break;
            default:
                C3367c.m10101b(this.f28493OooOo0o, this.f28491OooOo, this.f28494OooOoO0);
                break;
        }
    }
}
