package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.to */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2092to implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f24367OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2166vo f24368OooOo0o;

    public /* synthetic */ RunnableC2092to(ViewTreeObserverOnGlobalLayoutListenerC2166vo viewTreeObserverOnGlobalLayoutListenerC2166vo, int i) {
        this.f24367OooOo0O = i;
        this.f24368OooOo0o = viewTreeObserverOnGlobalLayoutListenerC2166vo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24367OooOo0O) {
            case 0:
                this.f24368OooOo0o.destroy();
                break;
            case 1:
                this.f24368OooOo0o.OoooOOO();
                break;
            default:
                super/*android.webkit.WebView*/.destroy();
                break;
        }
    }
}
