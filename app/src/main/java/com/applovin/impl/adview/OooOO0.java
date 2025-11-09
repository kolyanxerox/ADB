package com.applovin.impl.adview;

import android.view.KeyEvent;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15612OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f15613OooOo0o;

    public /* synthetic */ OooOO0(KeyEvent.Callback callback, int i) {
        this.f15612OooOo0O = i;
        this.f15613OooOo0o = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15612OooOo0O) {
            case 0:
                ((DialogC0971f) this.f15613OooOo0o).m286e();
                break;
            case 1:
                ((DialogC0971f) this.f15613OooOo0o).m287f();
                break;
            default:
                ((WebView) this.f15613OooOo0o).setVisibility(0);
                break;
        }
    }
}
