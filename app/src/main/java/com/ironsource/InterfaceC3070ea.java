package com.ironsource;

import java.util.Map;

/* renamed from: com.ironsource.ea */
/* loaded from: classes2.dex */
public interface InterfaceC3070ea {
    /* renamed from: a */
    static /* synthetic */ String m8459a(InterfaceC3070ea interfaceC3070ea, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return interfaceC3070ea.getString(str, str2);
    }

    /* renamed from: a */
    void mo7897a(String str);

    /* renamed from: a */
    void mo7898a(String str, String str2);

    Map<String, ?> allData();

    String getString(String str, String str2);
}
