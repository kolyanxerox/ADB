package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* renamed from: com.ironsource.oh */
/* loaded from: classes2.dex */
public class C3489oh {

    /* renamed from: a */
    private HashMap<String, Object> f10656a = new HashMap<>();

    /* renamed from: a */
    public C3489oh m11155a(String str, Object obj) {
        if (obj != null) {
            this.f10656a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }

    /* renamed from: a */
    public HashMap<String, Object> m11156a() {
        return this.f10656a;
    }
}
