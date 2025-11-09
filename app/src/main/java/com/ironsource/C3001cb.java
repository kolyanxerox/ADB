package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.cb */
/* loaded from: classes2.dex */
public final class C3001cb {

    /* renamed from: a */
    public static final C3001cb f7731a = new C3001cb();

    private C3001cb() {
    }

    /* renamed from: a */
    public final boolean m8107a(IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            return false;
        }
        int errorCode = ironSourceError.getErrorCode();
        return errorCode == 524 || errorCode == 530;
    }
}
