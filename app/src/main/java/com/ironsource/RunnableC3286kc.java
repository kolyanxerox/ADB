package com.ironsource;

import android.util.Pair;
import com.ironsource.InterfaceC2936ag;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;

/* renamed from: com.ironsource.kc */
/* loaded from: classes2.dex */
public class RunnableC3286kc implements Runnable {

    /* renamed from: e */
    private static final String f9254e = "Content-Type";

    /* renamed from: f */
    private static final String f9255f = "application/json";

    /* renamed from: a */
    private InterfaceC2936ag f9256a;

    /* renamed from: b */
    String f9257b;

    /* renamed from: c */
    String f9258c;

    /* renamed from: d */
    ArrayList<C3899zb> f9259d;

    public RunnableC3286kc(InterfaceC2936ag interfaceC2936ag, String str, String str2, ArrayList<C3899zb> arrayList) {
        this.f9256a = interfaceC2936ag;
        this.f9257b = str;
        this.f9258c = str2;
        this.f9259d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceC2936ag.a aVarM7760a;
        InterfaceC2936ag.a aVar = new InterfaceC2936ag.a(this.f9259d);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            C3232ir c3232irM13338b = C3904zg.m13338b(this.f9258c, this.f9257b, arrayList);
            aVarM7760a = aVar.m7761a(c3232irM13338b.m9378a()).m7759a(c3232irM13338b.f9047a);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error("EventsSender failed to send events - " + e.getLocalizedMessage());
            aVarM7760a = aVar.m7761a(e instanceof C3230ip).m7760a(e);
        }
        InterfaceC2936ag interfaceC2936ag = this.f9256a;
        if (interfaceC2936ag != null) {
            interfaceC2936ag.mo7758a(aVarM7760a);
        }
    }
}
