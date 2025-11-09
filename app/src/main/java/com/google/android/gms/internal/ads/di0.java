package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class di0 extends ai0 {

    /* renamed from: OooO0OO */
    public final HashSet f18258OooO0OO;

    /* renamed from: OooO0Oo */
    public final JSONObject f18259OooO0Oo;

    /* renamed from: OooO0o */
    public final /* synthetic */ int f18260OooO0o;

    /* renamed from: OooO0o0 */
    public final long f18261OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di0(C1548ey c1548ey, HashSet hashSet, JSONObject jSONObject, long j, int i) {
        super(c1548ey);
        this.f18260OooO0o = i;
        this.f18258OooO0OO = new HashSet(hashSet);
        this.f18259OooO0Oo = jSONObject;
        this.f18261OooO0o0 = j;
    }

    @Override // com.google.android.gms.internal.ads.ai0
    /* renamed from: OooO00o */
    public final void onPostExecute(String str) {
        ih0 ih0Var;
        switch (this.f18260OooO0o) {
            case 0:
                OooO0O0(str);
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (ih0Var = ih0.f20045OooO0OO) != null) {
                    for (yg0 yg0Var : Collections.unmodifiableCollection(ih0Var.f20046OooO00o)) {
                        if (this.f18258OooO0OO.contains(yg0Var.f25912OooO0oO)) {
                            sh0 sh0Var = yg0Var.f25909OooO0Oo;
                            if (this.f18261OooO0o0 >= sh0Var.f24089OooO0OO) {
                                sh0Var.f24090OooO0Oo = 2;
                                ze0.OooOooo(sh0Var.OooO00o(), "setNativeViewHierarchy", str, sh0Var.f24087OooO00o);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    public void OooO0O0(String str) {
        ih0 ih0Var = ih0.f20045OooO0OO;
        if (ih0Var != null) {
            for (yg0 yg0Var : Collections.unmodifiableCollection(ih0Var.f20046OooO00o)) {
                if (this.f18258OooO0OO.contains(yg0Var.f25912OooO0oO)) {
                    sh0 sh0Var = yg0Var.f25909OooO0Oo;
                    if (this.f18261OooO0o0 >= sh0Var.f24089OooO0OO && sh0Var.f24090OooO0Oo != 3) {
                        sh0Var.f24090OooO0Oo = 3;
                        ze0.OooOooo(sh0Var.OooO00o(), "setNativeViewHierarchy", str, sh0Var.f24087OooO00o);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f18260OooO0o) {
            case 0:
                return this.f18259OooO0Oo.toString();
            default:
                C1548ey c1548ey = this.f17048OooO0O0;
                JSONObject jSONObject = (JSONObject) c1548ey.f18708OooOo0o;
                JSONObject jSONObject2 = this.f18259OooO0Oo;
                if (wh0.OooO0o0(jSONObject2, jSONObject)) {
                    return null;
                }
                c1548ey.f18708OooOo0o = jSONObject2;
                return jSONObject2.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.ai0, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f18260OooO0o) {
            case 0:
                String str = (String) obj;
                OooO0O0(str);
                super.onPostExecute(str);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}
