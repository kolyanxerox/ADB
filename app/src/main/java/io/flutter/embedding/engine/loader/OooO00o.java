package io.flutter.embedding.engine.loader;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Context f28701OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28702OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FlutterLoader f28703OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Handler f28704OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String[] f28705OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Runnable f28706OooOoOO;

    public /* synthetic */ OooO00o(FlutterLoader flutterLoader, Context context, String[] strArr, Handler handler, Runnable runnable, int i) {
        this.f28702OooOo0O = i;
        this.f28703OooOo0o = flutterLoader;
        this.f28701OooOo = context;
        this.f28705OooOoO0 = strArr;
        this.f28704OooOoO = handler;
        this.f28706OooOoOO = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f28702OooOo0O) {
            case 0:
                this.f28703OooOo0o.lambda$ensureInitializationCompleteAsync$1(this.f28701OooOo, this.f28705OooOoO0, this.f28704OooOoO, this.f28706OooOoOO);
                break;
            default:
                this.f28703OooOo0o.lambda$ensureInitializationCompleteAsync$0(this.f28701OooOo, this.f28705OooOoO0, this.f28704OooOoO, this.f28706OooOoOO);
                break;
        }
    }
}
