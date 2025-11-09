package com.ironsource;

import com.ironsource.mediationsdk.C3387e;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.d5 */
/* loaded from: classes2.dex */
public final class C3030d5 implements InterfaceC3913zp {

    /* renamed from: a */
    private final C3719u2 f7883a;

    /* renamed from: b */
    private final C3387e f7884b;

    /* renamed from: c */
    private boolean f7885c;

    public C3030d5(C3719u2 adTools, C3387e auctionHandler) {
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionHandler, "auctionHandler");
        this.f7883a = adTools;
        this.f7884b = auctionHandler;
    }

    /* renamed from: a */
    public static final void m8278a(C3030d5 this$0, ImpressionDataListener listener, ImpressionData impressionData) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "$listener");
        IronLog.CALLBACK.verbose(C3349m1.m9956a(this$0.f7883a, "onImpressionSuccess " + listener.getClass().getSimpleName() + ": " + impressionData, (String) null, 2, (Object) null));
        listener.onImpressionSuccess(impressionData);
    }

    /* renamed from: a */
    private final void m8279a(C3840xk c3840xk, C3353m5 c3353m5, String str) {
        if (c3353m5 == null) {
            IronLog.INTERNAL.error(C3349m1.m9956a(this.f7883a, "reportImpressionDataToPublisher - no auctionResponseItem or listener", (String) null, 2, (Object) null));
            this.f7883a.m9970e().m7911h().m9918g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
            return;
        }
        ImpressionData impressionDataM9983a = c3353m5.m9983a(str);
        if (impressionDataM9983a != null) {
            Iterator it = new HashSet(c3840xk.m13070a()).iterator();
            while (it.hasNext()) {
                this.f7883a.m13102e(new androidx.webkit.OooO00o(this, (ImpressionDataListener) it.next(), impressionDataM9983a, 22));
            }
        }
    }

    @Override // com.ironsource.InterfaceC3913zp
    /* renamed from: a */
    public void mo8280a(AbstractC3887z instance, String str, C3840xk publisherDataHolder) throws NumberFormatException {
        kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
        kotlin.jvm.internal.OooOo.OooO0o0(publisherDataHolder, "publisherDataHolder");
        this.f7884b.m10268a(instance.m13270h(), instance.m13278q(), instance.m13274l(), str);
        m8279a(publisherDataHolder, instance.m13270h(), str);
    }

    @Override // com.ironsource.InterfaceC3913zp
    /* renamed from: a */
    public void mo8281a(List<? extends AbstractC3887z> waterfallInstances, AbstractC3887z winnerInstance) throws NumberFormatException {
        kotlin.jvm.internal.OooOo.OooO0o0(waterfallInstances, "waterfallInstances");
        kotlin.jvm.internal.OooOo.OooO0o0(winnerInstance, "winnerInstance");
        if (this.f7885c) {
            return;
        }
        this.f7885c = true;
        C3353m5 c3353m5M13270h = winnerInstance.m13270h();
        this.f7884b.m10267a(c3353m5M13270h, winnerInstance.m13278q(), winnerInstance.m13274l());
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String, C3353m5> concurrentHashMap = new ConcurrentHashMap<>();
        for (AbstractC3887z abstractC3887z : waterfallInstances) {
            arrayList.add(abstractC3887z.m13276o());
            concurrentHashMap.put(abstractC3887z.m13276o(), abstractC3887z.m13270h());
        }
        this.f7884b.m10269a(arrayList, concurrentHashMap, winnerInstance.m13278q(), winnerInstance.m13274l(), c3353m5M13270h);
    }
}
