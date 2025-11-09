package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.kr */
/* loaded from: classes2.dex */
public final class C1762kr implements InterfaceC2042sb {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f20660OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1799lr f20661OooOo0o;

    public /* synthetic */ C1762kr(C1799lr c1799lr, int i) {
        this.f20660OooOo0O = i;
        this.f20661OooOo0o = c1799lr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2042sb
    public final void OooO0o0(Object obj, Map map) {
        switch (this.f20660OooOo0O) {
            case 0:
                if (map != null) {
                    String str = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str)) {
                        C1799lr c1799lr = this.f20661OooOo0o;
                        if (str.equals(c1799lr.f20935OooO00o)) {
                            c1799lr.f20937OooO0OO.execute(new RunnableC1442c1(this, 19));
                            break;
                        }
                    }
                }
                break;
            default:
                if (map != null) {
                    String str2 = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str2)) {
                        C1799lr c1799lr2 = this.f20661OooOo0o;
                        if (str2.equals(c1799lr2.f20935OooO00o)) {
                            c1799lr2.f20937OooO0OO.execute(new RunnableC1442c1(this, 20));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
