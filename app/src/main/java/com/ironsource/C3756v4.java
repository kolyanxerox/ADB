package com.ironsource;

import com.ironsource.mediationsdk.C3368d;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.v4 */
/* loaded from: classes2.dex */
public final class C3756v4 implements InterfaceC3790w4 {

    /* renamed from: a */
    private final C3044dj f12289a;

    /* renamed from: b */
    private final C3368d f12290b;

    /* renamed from: c */
    private final C2995c5 f12291c;

    public C3756v4(C3044dj instanceInfo, C3368d auctionDataUtils, C2995c5 c2995c5) {
        kotlin.jvm.internal.OooOo.OooO0o0(instanceInfo, "instanceInfo");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionDataUtils, "auctionDataUtils");
        this.f12289a = instanceInfo;
        this.f12290b = auctionDataUtils;
        this.f12291c = c2995c5;
    }

    @Override // com.ironsource.InterfaceC3790w4
    /* renamed from: a */
    public void mo12733a(String methodName) {
        List<String> listM8092b;
        kotlin.jvm.internal.OooOo.OooO0o0(methodName, "methodName");
        C2995c5 c2995c5 = this.f12291c;
        if (c2995c5 == null || (listM8092b = c2995c5.m8092b()) == null) {
            listM8092b = o00O0.oo000o.f31251OooOo0O;
        }
        m12732a(listM8092b, methodName);
    }

    @Override // com.ironsource.InterfaceC3790w4
    /* renamed from: b */
    public void mo12734b(String methodName) {
        List<String> listM8094c;
        kotlin.jvm.internal.OooOo.OooO0o0(methodName, "methodName");
        C2995c5 c2995c5 = this.f12291c;
        if (c2995c5 == null || (listM8094c = c2995c5.m8094c()) == null) {
            listM8094c = o00O0.oo000o.f31251OooOo0O;
        }
        m12732a(listM8094c, methodName);
    }

    @Override // com.ironsource.InterfaceC3790w4
    /* renamed from: c */
    public void mo12735c(String methodName) {
        List<String> listM8090a;
        kotlin.jvm.internal.OooOo.OooO0o0(methodName, "methodName");
        C2995c5 c2995c5 = this.f12291c;
        if (c2995c5 == null || (listM8090a = c2995c5.m8090a()) == null) {
            listM8090a = o00O0.oo000o.f31251OooOo0O;
        }
        m12732a(listM8090a, methodName);
    }

    /* renamed from: a */
    private final void m12732a(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f12290b.m10133a(str, this.f12289a.m8325e(), C3368d.m10127b().m10131a(it.next(), this.f12289a.m8325e(), this.f12289a.m8326f(), this.f12289a.m8324d(), "", "", "", ""));
        }
    }
}
