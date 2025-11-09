package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class xb0 implements Callable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f25599OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f25600OooOo0o;

    public /* synthetic */ xb0(yp0 yp0Var) {
        this.f25599OooOo0O = 0;
        yp0 yp0Var2 = yp0.f25991OooOo0o;
        this.f25600OooOo0o = yp0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object obj = this.f25600OooOo0o;
        switch (this.f25599OooOo0O) {
            case 0:
                String str = (String) ((yp0) obj).f25992OooOo0O;
                yp0 yp0Var = yp0.f25991OooOo0o;
                return new pa0(2, str, null);
            case 1:
                return new wa0((List) ((o90) obj).f22369OooO0OO, 2);
            default:
                ((cf0) obj).mo13703zza();
                return null;
        }
    }

    public /* synthetic */ xb0(Object obj, int i) {
        this.f25599OooOo0O = i;
        this.f25600OooOo0o = obj;
    }
}
