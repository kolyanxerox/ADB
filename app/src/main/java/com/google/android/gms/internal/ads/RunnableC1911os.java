package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;

/* renamed from: com.google.android.gms.internal.ads.os */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1911os implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f23098OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1722jo f23099OooOo0o;

    public /* synthetic */ RunnableC1911os(InterfaceC1722jo interfaceC1722jo, int i) {
        this.f23098OooOo0O = i;
        this.f23099OooOo0o = interfaceC1722jo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23098OooOo0O) {
            case 0:
                this.f23099OooOo0o.onResume();
                break;
            case 1:
                this.f23099OooOo0o.onPause();
                break;
            case 2:
                this.f23099OooOo0o.destroy();
                break;
            case 3:
                this.f23099OooOo0o.OooO0o("onSdkImpression", new ArrayMap());
                break;
            case 4:
                this.f23099OooOo0o.destroy();
                break;
            default:
                this.f23099OooOo0o.OooOo00();
                break;
        }
    }
}
