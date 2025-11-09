package com.ironsource.adqualitysdk.sdk.p009i;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.adqualitysdk.sdk.p009i.C2670ba;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.bb */
/* loaded from: classes2.dex */
public final class C2671bb {

    /* renamed from: ﾇ */
    private Map<String, C2670ba> f5083 = new HashMap();

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.bb$1, reason: invalid class name */
    public class AnonymousClass1 extends AbstractRunnableC2878it {

        /* renamed from: ｋ */
        private /* synthetic */ String f5085;

        /* renamed from: ﾒ */
        private /* synthetic */ C2670ba.c f5086;

        public AnonymousClass1(String str, C2670ba.c cVar) {
            this.f5085 = str;
            this.f5086 = cVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            C2670ba c2670baM5434 = C2671bb.m5434(C2671bb.this, this.f5085);
            if (c2670baM5434 != null) {
                c2670baM5434.m5424(this.f5086);
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.bb$3, reason: invalid class name */
    public class AnonymousClass3 extends AbstractRunnableC2878it {

        /* renamed from: ﻛ */
        private /* synthetic */ String f5092;

        /* renamed from: ｋ */
        private /* synthetic */ C2670ba.b f5093;

        public AnonymousClass3(String str, C2670ba.b bVar) {
            this.f5092 = str;
            this.f5093 = bVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            C2670ba c2670baM5434 = C2671bb.m5434(C2671bb.this, this.f5092);
            if (c2670baM5434 != null) {
                c2670baM5434.m5425(this.f5093);
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.bb$e */
    public interface e extends InterfaceC2923p {
    }

    public C2671bb() {
        new Handler(Looper.getMainLooper());
    }

    /* renamed from: ｋ */
    public static /* synthetic */ C2670ba m5434(C2671bb c2671bb, String str) {
        Map<String, C2670ba> map = c2671bb.f5083;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* renamed from: ﻛ */
    public final String m5436(String str) {
        Map<String, C2670ba> map = this.f5083;
        C2670ba c2670ba = map != null ? map.get(str) : null;
        if (c2670ba != null) {
            return c2670ba.m5428();
        }
        return null;
    }

    /* renamed from: ﾇ */
    public final synchronized boolean m5437() {
        ArrayList arrayList = new ArrayList(this.f5083.values());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((C2670ba) obj).m5427()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ﾒ */
    public final void m5438(String str) {
        this.f5083.put(str, new C2670ba(str));
    }
}
