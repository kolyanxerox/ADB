package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.appset.AppSetIdInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0O0o00O implements wk0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f21977OooO00o;

    public /* synthetic */ o0O0o00O(int i) {
        this.f21977OooO00o = i;
    }

    @Override // com.google.android.gms.internal.ads.wk0
    public final Object apply(Object obj) {
        switch (this.f21977OooO00o) {
            case 0:
                return (o0OO00OO) obj;
            case 1:
                return (o0OO00OO) obj;
            case 2:
                Throwable th = (Throwable) obj;
                C1820mb c1820mb = AbstractC2005rb.f23817OooO00o;
                if (((Boolean) AbstractC1596g8.f19259OooO.OooOOO()).booleanValue()) {
                    zzv.zzp().OooO0oo("prepareClickUrl.attestation1", th);
                }
                return "failure_click_attok";
            case 3:
                List list = C1718jk.OooOO0o;
                return null;
            case 4:
                return "failure_click_attok";
            case 5:
                return new C1543et((List) obj);
            case 6:
                return new C1543et((AbstractC1397at) obj);
            case 7:
                ArrayList arrayList = new ArrayList();
                for (BinderC2298z8 binderC2298z8 : (List) obj) {
                    if (binderC2298z8 != null) {
                        arrayList.add(binderC2298z8);
                    }
                }
                return arrayList;
            case 8:
                ArrayList arrayList2 = new ArrayList();
                for (d00 d00Var : (List) obj) {
                    if (d00Var != null) {
                        arrayList2.add(d00Var);
                    }
                }
                return arrayList2;
            case 9:
                return Collections.singletonList(ii0.OooooOO((C1917oy) obj));
            case 10:
                ArrayList arrayList3 = (ArrayList) obj;
                return new v90(1, true != arrayList3.isEmpty() ? arrayList3 : null);
            case 11:
                AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                return new da0(appSetIdInfo.getId(), appSetIdInfo.getScope(), 0);
            case 12:
                return new r90((String) obj, 4);
            case 13:
                return new x90(4, (Bundle) obj);
            case 14:
                return new r90((String) obj, 5);
            case 15:
                return null;
            case 16:
                return (oc0) obj;
            case 17:
                String str = ((sd0) obj).f24065OooO00o;
                return TextUtils.isEmpty(str) ? "" : zzl.zzk() ? "fakeForAdDebugLog" : str;
            case 18:
                String str2 = ((sd0) obj).f24066OooO0O0;
                return TextUtils.isEmpty(str2) ? "" : zzl.zzk() ? "fakeForAdDebugLog" : str2;
            case 19:
                return new h61((k50) obj);
            case 20:
                o00000O o00000o = (o00000O) obj;
                o00000o.getClass();
                return o00000o.getClass().getSimpleName();
            case 21:
                return rm0.OooOOOO(ii0.OooOoo0(((g91) obj).zzh().f19675OooO0O0, new o0O0o00O(22)));
            case 22:
                ha1 ha1Var = ha1.f19673OooO0Oo;
                return Integer.valueOf(((C1421bg) obj).f17494OooO0OO);
            default:
                o0000O0O o0000o0o2 = (o0000O0O) obj;
                int i = o0OoOo0.f22209Oooo0OO;
                StringBuilder sbOooOo = OooO0oO.OooOo.OooOo(o0000o0o2.f21669OooO00o, ": ");
                sbOooOo.append(o0000o0o2.f21670OooO0O0);
                return sbOooOo.toString();
        }
    }
}
