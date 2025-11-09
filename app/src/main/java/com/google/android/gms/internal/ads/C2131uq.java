package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3037dc;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.uq */
/* loaded from: classes2.dex */
public final class C2131uq implements InterfaceC1946pq {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f24760OooO00o;

    /* renamed from: OooO0O0 */
    public final Object f24761OooO0O0;

    public /* synthetic */ C2131uq(Object obj, int i) {
        this.f24760OooO00o = i;
        this.f24761OooO0O0 = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1946pq
    public final void OooO00o(HashMap map) {
        switch (this.f24760OooO00o) {
            case 0:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oOo0o0)).booleanValue()) {
                    ii0.OoooOoO(tp0.OooOOo(((h60) this.f24761OooO0O0).OooO00o(true)), Throwable.class, new C2094tq(0), AbstractC2200wl.f25321OooO00o);
                    return;
                }
                return;
            case 1:
                String str = (String) map.get("render_in_browser");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    ((jd0) this.f24761OooO0O0).OooO00o(Boolean.parseBoolean(str));
                    return;
                } catch (Exception e) {
                    throw new IllegalStateException("Invalid render_in_browser state", e);
                }
            default:
                CookieManager cookieManager = (CookieManager) this.f24761OooO0O0;
                if (cookieManager == null) {
                    return;
                }
                if (((String) map.get("clear")) == null) {
                    String str2 = (String) map.get("cookie");
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    cookieManager.setCookie((String) zzbe.zzc().OooO00o(AbstractC1448c7.f17787o0000OO0), str2);
                    return;
                }
                String str3 = (String) zzbe.zzc().OooO00o(AbstractC1448c7.f17787o0000OO0);
                String cookie = cookieManager.getCookie(str3);
                if (cookie != null) {
                    List listOooO0Oo = ni0.OooO0O0(new uk0(';')).OooO0Oo(cookie);
                    for (int i = 0; i < listOooO0Oo.size(); i++) {
                        String str4 = (String) listOooO0Oo.get(i);
                        ni0 ni0VarOooO0O0 = ni0.OooO0O0(new uk0(C3037dc.f8244T));
                        str4.getClass();
                        gl0 gl0Var = (gl0) ((hl0) ni0VarOooO0O0.f21493OooOo0o).OooO0Oo(ni0VarOooO0O0, str4);
                        if (!gl0Var.hasNext()) {
                            throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
                        }
                        cookieManager.setCookie(str3, String.valueOf((String) gl0Var.next()).concat(String.valueOf((String) zzbe.zzc().OooO00o(AbstractC1448c7.f17778o00000Oo))));
                    }
                    return;
                }
                return;
        }
    }

    public C2131uq(Context context) {
        this.f24760OooO00o = 2;
        this.f24761OooO0O0 = zzv.zzr().zza(context);
    }
}
