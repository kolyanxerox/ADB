package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

/* renamed from: com.ironsource.y7 */
/* loaded from: classes2.dex */
public class CallableC3861y7 implements Callable<C2998c8> {

    /* renamed from: a */
    private final int f12720a;

    /* renamed from: b */
    private final String f12721b;

    /* renamed from: c */
    private final AdData f12722c;

    /* renamed from: d */
    private final InterfaceC2634a8 f12723d;

    /* renamed from: e */
    private final InterfaceC3895z7 f12724e;

    /* renamed from: f */
    private final NetworkSettings f12725f;

    /* renamed from: com.ironsource.y7$a */
    public class a implements BiddingDataCallback {

        /* renamed from: a */
        final /* synthetic */ C3216ib f12726a;

        /* renamed from: b */
        final /* synthetic */ BlockingQueue f12727b;

        public a(C3216ib c3216ib, BlockingQueue blockingQueue) {
            this.f12726a = c3216ib;
            this.f12727b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(String str) {
            this.f12727b.add(new C2998c8(CallableC3861y7.this.m13175d(), CallableC3861y7.this.m13174c(), null, C3216ib.m9304a(this.f12726a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(Map<String, Object> map) {
            this.f12727b.add(new C2998c8(CallableC3861y7.this.m13175d(), CallableC3861y7.this.m13174c(), map, C3216ib.m9304a(this.f12726a), null));
        }
    }

    public CallableC3861y7(int i, String str, AdData adData, InterfaceC2634a8 interfaceC2634a8, InterfaceC3895z7 interfaceC3895z7, NetworkSettings networkSettings) {
        this.f12720a = i;
        this.f12721b = str;
        this.f12722c = adData;
        this.f12723d = interfaceC2634a8;
        this.f12724e = interfaceC3895z7;
        this.f12725f = networkSettings;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075 A[PHI: r0 r2
  0x0075: PHI (r0v4 java.lang.String) = (r0v3 java.lang.String), (r0v7 java.lang.String) binds: [B:10:0x0058, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]
  0x0075: PHI (r2v8 com.ironsource.z7) = (r2v7 com.ironsource.z7), (r2v12 com.ironsource.z7) binds: [B:10:0x0058, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.ironsource.C2998c8 call() throws java.lang.Exception {
        /*
            r4 = this;
            com.ironsource.ib r0 = new com.ironsource.ib
            r0.<init>()
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.m13174c()
            r2.append(r3)
            java.lang.String r3 = " fetching bidding data"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.verbose(r2)
            java.util.concurrent.ArrayBlockingQueue r1 = new java.util.concurrent.ArrayBlockingQueue
            r2 = 1
            r1.<init>(r2)
            com.ironsource.y7$a r2 = new com.ironsource.y7$a
            r2.<init>(r0, r1)
            com.ironsource.a8 r0 = r4.m13173b()     // Catch: java.lang.NoClassDefFoundError -> L34 java.lang.Exception -> L36
            com.ironsource.mediationsdk.adunit.adapter.utility.AdData r3 = r4.f12722c     // Catch: java.lang.NoClassDefFoundError -> L34 java.lang.Exception -> L36
            r0.collectBiddingData(r3, r2)     // Catch: java.lang.NoClassDefFoundError -> L34 java.lang.Exception -> L36
            goto L78
        L34:
            r0 = move-exception
            goto L38
        L36:
            r0 = move-exception
            goto L5b
        L38:
            com.ironsource.q9 r2 = com.ironsource.C3551q9.m11517d()
            r2.m11519a(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error while calling collectBiddingData - "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r2.error(r0)
            com.ironsource.z7 r2 = r4.f12724e
            if (r2 == 0) goto L78
            goto L75
        L5b:
            java.lang.String r2 = "Exception while calling collectBiddingData - "
            java.lang.StringBuilder r2 = com.google.android.gms.internal.ads.AbstractC2183w4.OooOOO0(r0, r2)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r2.error(r0)
            com.ironsource.z7 r2 = r4.f12724e
            if (r2 == 0) goto L78
        L75:
            r2.mo11271a(r0)
        L78:
            com.ironsource.z7 r0 = r4.f12724e
            if (r0 == 0) goto L81
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r4.f12725f
            r0.mo11270a(r2)
        L81:
            java.lang.Object r0 = r1.take()
            com.ironsource.c8 r0 = (com.ironsource.C2998c8) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.CallableC3861y7.call():com.ironsource.c8");
    }

    /* renamed from: b */
    public InterfaceC2634a8 m13173b() {
        return this.f12723d;
    }

    /* renamed from: c */
    public String m13174c() {
        return this.f12721b;
    }

    /* renamed from: d */
    public int m13175d() {
        return this.f12720a;
    }
}
