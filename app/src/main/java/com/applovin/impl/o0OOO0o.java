package com.applovin.impl;

import io.flutter.plugin.common.EventChannel;

/* loaded from: classes.dex */
public final /* synthetic */ class o0OOO0o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15791OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15792OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f15793OooOo0o;

    public /* synthetic */ o0OOO0o(Object obj, boolean z, int i) {
        this.f15792OooOo0O = i;
        this.f15791OooOo = obj;
        this.f15793OooOo0o = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15792OooOo0O) {
            case 0:
                ((C1055i4) this.f15791OooOo).m979a(this.f15793OooOo0o);
                break;
            default:
                EventChannel.EventSink eventSink = ((o000oOoo.o0000OO0) this.f15791OooOo).f30998OooOoo;
                if (eventSink != null) {
                    eventSink.success(Boolean.valueOf(this.f15793OooOo0o));
                    break;
                }
                break;
        }
    }
}
