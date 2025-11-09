package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.zy */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2324zy implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f26387OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f26388OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f26389OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f26390OooOoO0;

    public /* synthetic */ RunnableC2324zy(int i, Object obj, int i2, Object obj2) {
        this.f26388OooOo0O = i2;
        this.f26387OooOo = obj;
        this.f26389OooOo0o = i;
        this.f26390OooOoO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26388OooOo0O) {
            case 0:
                Iterator it = ((CopyOnWriteArraySet) this.f26387OooOo).iterator();
                while (it.hasNext()) {
                    e00 e00Var = (e00) it.next();
                    if (!e00Var.f18444OooO0Oo) {
                        int i = this.f26389OooOo0o;
                        if (i != -1) {
                            e00Var.f18442OooO0O0.OooO0o(i);
                        }
                        e00Var.f18443OooO0OO = true;
                        ((InterfaceC1770kz) this.f26390OooOoO0).mo13701zza(e00Var.f18441OooO00o);
                    }
                }
                break;
            default:
                ((gp0) this.f26387OooOo).OooOo00(this.f26389OooOo0o, (o00000oO.OooOOO) this.f26390OooOoO0);
                break;
        }
    }
}
