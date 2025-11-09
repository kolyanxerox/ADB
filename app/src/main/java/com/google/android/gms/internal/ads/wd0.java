package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class wd0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final JSONObject f25297OooO00o;

    public wd0(JSONObject jSONObject) {
        this.f25297OooO00o = jSONObject;
    }

    public final int OooO00o() {
        int iOptInt = this.f25297OooO00o.optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
