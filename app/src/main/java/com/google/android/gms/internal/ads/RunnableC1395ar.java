package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;

/* renamed from: com.google.android.gms.internal.ads.ar */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1395ar implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Throwable f17087OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f17088OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1468cr f17089OooOo0o;

    public /* synthetic */ RunnableC1395ar(C1468cr c1468cr, Throwable th, int i) {
        this.f17088OooOo0O = i;
        this.f17089OooOo0o = c1468cr;
        this.f17087OooOo = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17088OooOo0O) {
            case 0:
                C1468cr c1468cr = this.f17089OooOo0o;
                c1468cr.getClass();
                boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0OO)).booleanValue();
                Context context = c1468cr.f18044OooO00o;
                Throwable th = this.f17087OooOo;
                if (!zBooleanValue) {
                    InterfaceC1680ii interfaceC1680iiOooO0OO = C1643hi.OooO0OO(context);
                    c1468cr.f18051OooO0oo = interfaceC1680iiOooO0OO;
                    interfaceC1680iiOooO0OO.OooO00o("AttributionReportingSampled", th);
                    break;
                } else {
                    InterfaceC1680ii interfaceC1680iiOooO0o0 = C1643hi.OooO0o0(context);
                    c1468cr.f18043OooO = interfaceC1680iiOooO0o0;
                    interfaceC1680iiOooO0o0.OooO00o("AttributionReporting", th);
                    break;
                }
            default:
                C1468cr c1468cr2 = this.f17089OooOo0o;
                c1468cr2.getClass();
                boolean zBooleanValue2 = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0OO)).booleanValue();
                Context context2 = c1468cr2.f18044OooO00o;
                Throwable th2 = this.f17087OooOo;
                if (!zBooleanValue2) {
                    InterfaceC1680ii interfaceC1680iiOooO0OO2 = C1643hi.OooO0OO(context2);
                    c1468cr2.f18051OooO0oo = interfaceC1680iiOooO0OO2;
                    interfaceC1680iiOooO0OO2.OooO00o("AttributionReportingSampled.getUpdatedUrlAndRegisterSource", th2);
                    break;
                } else {
                    InterfaceC1680ii interfaceC1680iiOooO0o02 = C1643hi.OooO0o0(context2);
                    c1468cr2.f18043OooO = interfaceC1680iiOooO0o02;
                    interfaceC1680iiOooO0o02.OooO00o("AttributionReporting.getUpdatedUrlAndRegisterSource", th2);
                    break;
                }
        }
    }
}
