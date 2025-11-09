package com.ironsource;

import com.ironsource.mediationsdk.C3368d;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.ironsource.n5 */
/* loaded from: classes2.dex */
public final class C3442n5 {

    /* renamed from: a */
    private final String f10377a;

    /* renamed from: b */
    private final C3368d f10378b;

    public C3442n5(String serverData) {
        kotlin.jvm.internal.OooOo.OooO0o0(serverData, "serverData");
        this.f10377a = serverData;
        this.f10378b = C3368d.m10127b();
    }

    /* renamed from: a */
    public static /* synthetic */ C3442n5 m10945a(C3442n5 c3442n5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3442n5.f10377a;
        }
        return c3442n5.m10947a(str);
    }

    /* renamed from: c */
    private final String m10946c() {
        return this.f10377a;
    }

    /* renamed from: b */
    public final Map<String, String> m10949b() throws JSONException {
        Map<String, String> mapM10135b = this.f10378b.m10135b(this.f10377a);
        kotlin.jvm.internal.OooOo.OooO0Oo(mapM10135b, "auctionDataUtils.getAuct…verDataParams(serverData)");
        return mapM10135b;
    }

    /* renamed from: d */
    public final String m10950d() throws JSONException {
        String strM10136c = this.f10378b.m10136c(this.f10377a);
        kotlin.jvm.internal.OooOo.OooO0Oo(strM10136c, "auctionDataUtils.getDyna…romServerData(serverData)");
        return strM10136c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3442n5) && kotlin.jvm.internal.OooOo.OooO00o(this.f10377a, ((C3442n5) obj).f10377a);
    }

    public int hashCode() {
        return this.f10377a.hashCode();
    }

    public String toString() {
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f10377a, new StringBuilder("AuctionServerData(serverData="));
    }

    /* renamed from: a */
    public final C3442n5 m10947a(String serverData) {
        kotlin.jvm.internal.OooOo.OooO0o0(serverData, "serverData");
        return new C3442n5(serverData);
    }

    /* renamed from: a */
    public final String m10948a() {
        String strM10129a = this.f10378b.m10129a(this.f10377a);
        kotlin.jvm.internal.OooOo.OooO0Oo(strM10129a, "auctionDataUtils.getAdmFromServerData(serverData)");
        return strM10129a;
    }
}
